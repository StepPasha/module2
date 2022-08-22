package ru.gb.stepanov.hm1;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Swap(arr1, 2, 4);
        System.out.println(Arrays.toString(arr1));
        String arr2[] = {"a", "b", "c", "d", "e"};
        Swap(arr2, 1, 2);
        System.out.println(Arrays.toString(arr2));


        Box<Orange> o = new Box<>();
        Box<Orange> or = new Box<>();
        Box<Apple> a = new Box<>();
        Box<Apple> ap = new Box<>();
        or.addFruit(new Orange());
        o.addFruit(new Orange());
        a.addFruit(new Apple());
        ap.addFruit(new Apple());
        System.out.println("Box1 = " + o.getWeight());
        System.out.println("Box2 = " + or.getWeight());
        System.out.println("Box3 = " + a.getWeight());
        System.out.println("Box4 = " + ap.getWeight());
        or.move(o);
        ap.move(a);

    }

    public static <T> void Swap(T[] arr, int firstIndex, int secondIndex) {
        T tmp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = arr[firstIndex];

    }

    public static <T> void arrayToArraysList(ArrayList<T> listArray, T[] transformationArray) {
        for (T elem : transformationArray) {
            listArray.add(elem);
        }
    }
}








