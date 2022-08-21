package Homework_Lesson6;

public class Computer {
    private final double cost;
    private final String model;
    private final RAM RAM;
    private final HDD HDD;

    public Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
        this.RAM = new RAM();
        this.HDD = new HDD();
    }

    public Computer(double cost, String model, Homework_Lesson6.RAM RAM, Homework_Lesson6.HDD HDD) {
        this.cost = cost;
        this.model = model;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    void infoAboutComputer() {
        System.out.println("The cost of the computer is " + cost + "$" + "; the model is '" + model + "'; RAM is '" + RAM.nameRAM + "', " + RAM.amountRAM + " Gb\nHDD type is " + HDD.typeHDD + "; name is '" + HDD.nameHDD + "' and amount of HDD is " + HDD.amountHDD + " Gb");
    }
}
