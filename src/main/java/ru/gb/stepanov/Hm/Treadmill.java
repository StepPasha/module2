package ru.gb.stepanov.Hm;

public class Treadmill {
    private String name;
    private int length;

    public Treadmill(String name, int length) {
        this.name = name;
        this.length = length;

    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }
}

