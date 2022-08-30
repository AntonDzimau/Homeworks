package Homework_Lesson9;

public class Doctor extends Worker{


    public Doctor(int age, String name) {
        super(age, name);
    }

    @Override
    public void whatIDo() {
        System.out.println("I work in hospital");
    }
}
