package Homework_Lesson7;

public class Accounter extends Human implements PrintingTheTitleOfThePosition {
    Accounter() {
        setPosition("Accounter");
    }

    @Override
    public void PrintingTheTitleOfThePosition() {
        System.out.println("My position is " + this.getPosition());
    }
}
