package ru.gb.stepanov;

public class Robot implements Interactions{
    private String name;
    private int runDistance;
    private int jumpHeight;


    public String getName() {
        return name;
    }

    public Robot(String name, int runDistance, int jumpHeight) {
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
        System.out.println("Robot " + this.name + " running" + this.getRunDistance());

    }
    @Override
    public void jump() {
        System.out.println("Robot " + this.name + " jumping" + this.getJumpHeight());

    }
}
