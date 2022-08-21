package Homework_Lesson8;

public class Therapist extends Doctor {
    public Therapist(String name, String surname) {
        this.setName(name);
        this.setSurname(surname);
    }

    @Override
    public void toTreat() {
        System.out.println("May the force be with you, young padawan.");
    }
}
