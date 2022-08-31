package Homework_Lesson11;

public class Main {
    public static void main(String[] args) {
        Fruits banana1 = new Banana("yellow");
        Fruits banana2 = new Banana("yellow-green");
        Fruits orange1 = new Orange("orange");
        Fruits orange2 = new Orange("red");
        Fruits apple1 = new Apple("red", "round");
        Fruits apple2 = new Apple("green", "oval");
        Fruits apple3 = new Apple("yellow", "round");
        Bucket bucket = new Bucket();
        //накладываем фрукты в ведро
        bucket.putFruit(banana1);
        bucket.putFruit(orange2);
        bucket.putFruit(apple1);
        bucket.putFruit(banana2);
        bucket.putFruit(orange1);
        bucket.putFruit(apple3);
        bucket.putFruit(orange2);
        bucket.putFruit(apple2);
        //показываем, что есть в ведре
        bucket.showBucket();
        //берем из ведра последний положенный фрукт
        bucket.takeFruit();
        //показываем, что есть в ведре
        bucket.showBucket();
        //кладем еще один фрукт
        bucket.putFruit(orange1);
        //пытаемся положить 9-ый фрукт
        bucket.putFruit(apple1);
        //брат забрал все фрукты из ведра
        bucket.takeAllFruits();
        //смотрим, что в ведре осталось
        bucket.showBucket();
        //сестричка не знала о коварности брата и захотела взять еще один фрукт, но
        bucket.takeFruit();
    }
}
