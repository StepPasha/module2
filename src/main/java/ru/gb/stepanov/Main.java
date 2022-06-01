package ru.gb.stepanov;

public class Main {
    public static void main(String[] args) {
        String nameParticipant = "";
        String nameObstacle;
        Object[] participants = new Object[6];
        participants[0] = new Cat("Barsik", 10, 5);
        participants[1] = new Cat("Murzik", 15, 6);
        participants[2] = new Human("Igor", 15, 1);
        participants[3] = new Human("Valera", 20, 2);
        participants[4] = new Robot("R2d2", 50, 5);
        participants[5] = new Robot("Xz21", 60, 5);

        Object[] obstacles = new Object[4];
        obstacles[0] = new Treadmill("Road", 10);
        obstacles[1] = new Treadmill("Fast", 15);
        obstacles[2] = new Wall("Brick", 3);
        obstacles[3] = new Wall("Wooden", 2);


        for (Object participant : participants) {
            int maxRun = 0;
        }
    }
}





              
            