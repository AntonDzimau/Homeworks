package Homework_Lesson8;

public abstract class Doctor {
    private String Name;
    private String Surname;

    public String getName() {

        return Name;
    }

    public void setName(String name) {

        Name = name;
    }

    public String getSurname() {

        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;

    }

    abstract void toTreat();
}
