package Homework_Lesson7;

public class Worker extends Human implements PrintingTheTitleOfThePosition {
    Worker() {
        setPosition("Worker");
    }

    @Override
    public void PrintingTheTitleOfThePosition() {
        System.out.println("My position is " + this.getPosition());
    }
}
