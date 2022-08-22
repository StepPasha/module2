package ru.gb.stepanov.hm6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Ждем подключения клиента...");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился!");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            while (true) {
                serverMessage(out);
                String message = in.readUTF();
                if ("/end".equalsIgnoreCase(message)) {
                    out.writeUTF("/end");
                    break;
                }
                System.out.println("Сообщение от клиента: " + message);
                out.writeUTF(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void serverMessage(DataOutputStream out) {
        new Thread(() -> {
            try {
                while (true) {
                    String message = scanner.nextLine();
                    out.writeUTF(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

