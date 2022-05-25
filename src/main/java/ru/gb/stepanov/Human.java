package ru.gb.stepanov;

public class Human implements Interactions{
    private String name;

    private int runDistance;
    private int jumpHeight;

    public String getName() {
        return name;
    }

    public Human(String name, int runDistance, int jumpHeight) {
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
        System.out.println("Human "  + this.name + " running " + this.getRunDistance());

    }
    @Override
    public void jump() {
        System.out.println("Human " + this.name + " jumping " + this.getJumpHeight());

    }
}
