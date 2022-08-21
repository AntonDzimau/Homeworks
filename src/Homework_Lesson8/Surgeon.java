package Homework_Lesson8;

public class Surgeon extends Doctor{

    public Surgeon(String name, String surname) {
      this.setName(name);
      this.setSurname(surname);
    }

    @Override
    public void toTreat() {
        System.out.println("I will cut you. After I will sew you up, but in begin I will cut you:)");
    }
}
