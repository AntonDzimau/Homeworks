package Homework_Lesson7;

public class Director extends Human implements PrintingTheTitleOfThePosition {
    Director() {
        setPosition("Director");
    }

    @Override
    public void PrintingTheTitleOfThePosition() {
        System.out.println("My position is " + this.getPosition());
    }
}
