package Homework_Lesson9;

public class Worker extends Person{

    public Worker(int age, String name) {
        this.setAge(age);
        this.setName(name);
    }

    @Override
    public void whatIDo() {
        System.out.println("I work in factory");
    }
}
