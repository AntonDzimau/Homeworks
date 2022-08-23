package Homework_Lesson6;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nTHE FIRST ADDITIONAL TASK.\n");

        Computer firstComputer = new Computer(800, "ASUS FX505DU");
        firstComputer.infoAboutComputer();
        Computer secondComputer = new Computer(1000, "Panasonic CF-31", new RAM("Kingston", 16), new HDD("Seagate", 512, "external"));
        secondComputer.infoAboutComputer();

        System.out.println("\nSECOND ADDITIONAL TASK.\n");

        ATM atm = new ATM(0, 0, 0);
        atm.addCashToATM(100, 5);
        atm.addCashToATM(50, 1);
        atm.addCashToATM(10, 1);
        atm.infoAboutATM();
        atm.withdrawCash(492);
        atm.infoAboutATM();

    }
}
