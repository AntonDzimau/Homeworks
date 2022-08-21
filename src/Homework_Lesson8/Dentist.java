package Homework_Lesson8;

public class Dentist extends Doctor {

    public Dentist(String name, String surname) {
        this.setName(name);
        this.setSurname(surname);
    }

    @Override
    public void toTreat() {

        System.out.println("I will drill some holes in your teeth:)");
    }
}
