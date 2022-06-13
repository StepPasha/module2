package ru.gb.stepanov.hm5;

public class Homework5 {
    private static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;


    public static void main(String[] args) {
        oneThreadMethod();
        twoThreadMetod();
    }

    public static void oneThreadMethod() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime)
                + " ms.");
    }

    public static void twoThreadMetod() {
        int SIZE = 10000000;
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);


        Thread thread = new Thread(String.valueOf(a1));
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        Thread thread1 = new Thread(String.valueOf(a2));
        for (int i = 0; i < a2.length; i++) {
            a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

            thread.start();
            thread1.start();

            try {
                thread.join();
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.arraycopy(a1, 0, arr, 0, HALF);
            System.arraycopy(a2, 0, arr, HALF, HALF);


            System.out.println(("Two thread time: " + (System.currentTimeMillis() -
                    startTime) + " ms."));


        }
    }
}






