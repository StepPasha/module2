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
            int maxJump = 0;

            if (participant instanceof Cat) {
                nameParticipant = ((Cat) participant).getName();
                maxRun = ((Cat) participant).getRunDistance();
                maxJump = ((Cat) participant).getJumpHeight();
            }
            if (participant instanceof Human) {
                nameParticipant = ((Human) participant).getName();
                maxRun = ((Human) participant).getRunDistance();
                maxJump = ((Human) participant).getJumpHeight();
            }
            if (participant instanceof Robot) {
                nameParticipant = ((Robot) participant).getName();
                maxRun = ((Robot) participant).getRunDistance();
                maxJump = ((Robot) participant).getJumpHeight();
            }


            for (int y = 0; y < obstacles.length; y++) {
                int run = 0;
                int height = 0;
                if (obstacles[y] instanceof Treadmill) {
                    nameObstacle = ((Treadmill) (obstacles[y])).getName();
                    run = ((Treadmill) (obstacles[y])).getLength();
                    if(run <= maxRun) {
                        System.out.println(" Участник " + nameParticipant + " успешно преодолел препятсвие номер " +
                                (y + 1));
                        System.out.println(" ");
                    } else {
                        System.out.println(" Участник " + nameParticipant + " не смог преодолеть препятсвие номер " +
                                (y + 1));
                        System.out.println(" ");
                    }
                }
                if (obstacles[y] instanceof Wall) {
                    nameObstacle = String.valueOf(((Wall) (obstacles[y])).getHeight());
                    height = ((Wall) (obstacles[y])).getHeight();
                    if (height <= maxJump) {
                        System.out.println(" Участник " + nameParticipant + " успешно преодолел препятсвие номер " +
                                (y + 1));
                        System.out.println(" ");
                    }else{
                        System.out.println(" Участник " + nameParticipant + " не смог преодолеть препятсвие номер " +
                                (y + 1));
                        System.out.println(" ");
                    }
                }
            }
        }
    }
}
