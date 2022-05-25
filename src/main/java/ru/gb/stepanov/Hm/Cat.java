package ru.gb.stepanov.Hm;

import ru.gb.stepanov.Interactions;

public class Cat implements Interactions {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public String getName() {
        return name;
    }

    public Cat(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;

    }
    @Override
    public int getRunDistance() {
        return this.runDistance;
    }
    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
    @Override
    public void run() {
        System.out.println("Cat " + this.name + " runnig" + this.getRunDistance());

    }
    @Override
    public void jump() {
        System.out.println("Cat " + this.name + " jumping" + this.getJumpHeight());

    }
}

