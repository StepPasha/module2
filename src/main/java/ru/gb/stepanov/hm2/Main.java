package ru.gb.stepanov.hm2;

public class Main {
    public static void main(String[] args) {
        String[][] a = new String[][]{{"1", "2", "3", "4"}, {"3", "3", "1", "3"}, {"2", "2", "2", "2"}, {"3", "Два", "1", "2"}, {"2", "3"}};
        try {
            int massive = massive(a);
            System.out.println("Массив задан верно!");
        } catch (MyArraySizeException e) {
            System.out.println("Массив задан неверно!");
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println(" ");
    }

    public static int massive(String[][] a) throws MyArraySizeException, MyArrayDataException {
        int sum = 1;
        if (a.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < a[i].length; i++) {
            if (a[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + Integer.parseInt(a[i][j]);
            }

        }
        return sum;
    }
}





