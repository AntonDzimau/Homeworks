package Homework_Lesson6;

public class Main {
    public static void main(String[] args) {
        Computer firstComputer = new Computer(800,"ASUS FX505DU");
        firstComputer.infoAboutComputer();
        Computer secondComputer = new Computer(1000, "Panasonic CF-31", new RAM("Kingston", 16), new HDD("Seagate", 512, "external"));
        secondComputer.infoAboutComputer();
    }
}
