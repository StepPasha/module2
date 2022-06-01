package ru.gb.stepanov.hm2;

import static java.lang.Integer.valueOf;

public class Main {
    public static void main(String[] args) {
        String[][] a = new String[][]{{"1", "2", "Тридцать", "4"}, {"2", "2", "2", "3"}, {"2", "2", "2", "2"}, {"2", "2", "3", "2"}};
        try {
            int massive = massive(a);
            System.out.println("Массив задан верно!");
        } catch (MyArraySizeException e) {
            System.out.println("Массив задан неверно!");
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }


    public static int massive(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += valueOf(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(e);
                }
            }

        }
        return sum;
    }

}






