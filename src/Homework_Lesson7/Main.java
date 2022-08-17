package Homework_Lesson7;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Director director = new Director();
        Accounter accounter = new Accounter();
        worker.PrintingTheTitleOfThePosition();
        director.PrintingTheTitleOfThePosition();
        accounter.PrintingTheTitleOfThePosition();
    }
}
