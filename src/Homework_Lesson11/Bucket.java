package Homework_Lesson11;

import java.util.LinkedList;

/**
 * Создать класс Bucket, который будет хранить в себе private коллекцию с фруктами.
 * * Реализовать методы putFruit(добавить фрукт), takeFruit(забрать фрукт), showBucket(посмотреть какие фрукты есть в корзине).
 * * Добавление фруктов должно происходить всегда в конец коллекции, а удаление всегда из начала.
 * * Создать классы апельсина, банана, яблоко. Показать работу объекта класса Bucket(добавление, удаление фруктов)
 * * в main методе. ВАЖНО: корзина может хранить в себе только объекты фруктов(апельсин, яблоко, банан), но не других классов.
 * * Это значит что методы bucket не должны принимать объекты других классов, кроме фруктов. Добавить логику, при которой корзина
 * * может хранить до 8 объектов включительно. При попытке положить больше, сообщить что в корзине нет места.
 */

public class Bucket {
    private final LinkedList<Fruits> bucketOfFruits = new LinkedList<>();

    public void putFruit(Fruits fruit) {
        if (bucketOfFruits.size() < 8) {
            bucketOfFruits.addLast(fruit);
            if (bucketOfFruits.getLast().getName().startsWith("B")) {
                System.out.println("You put a " + fruit.getName().toLowerCase() + ".");
            } else {
                System.out.println("You put an " + fruit.getName().toLowerCase() + ".");
            }
        } else {
            if (fruit.getName().startsWith("B")) {
                System.out.println("You want to put a " + fruit.getName().toLowerCase() + ", but there is no place in the bucket.");
            } else {
                System.out.println("You want to put an " + fruit.getName().toLowerCase() + ", but there is no place in the bucket.");
            }
        }
    }

    public void takeFruit() {
        if (bucketOfFruits.size() > 0) {
            System.out.println("You took the first " + bucketOfFruits.get(0).getName().toLowerCase() + ".");
            bucketOfFruits.removeFirst();
        } else {
            System.out.println("There are no fruits in the bucket. :(");
        }
    }

    public void takeAllFruits() {
        if (bucketOfFruits.size() > 0) {
            System.out.println("You have taken all the fruits.");
            bucketOfFruits.clear();
        } else {
            System.out.println("There are no fruits in the bucket. :(");
        }
    }

    public void showBucket() {
        if (bucketOfFruits.size() > 0) {
            System.out.println("There are " + bucketOfFruits.size() + " fruits in the bucket:");
            for (int i = 0; i <= bucketOfFruits.size() - 1; i++) {
                System.out.println(i + 1 + ". " + bucketOfFruits.get(i).getName() + ", form is " + bucketOfFruits.get(i).getForm() + ", color is " + bucketOfFruits.get(i).getColor() + ".");
            }
        } else {
            System.out.println("There are no fruits in the bucket.");
        }
    }
}
