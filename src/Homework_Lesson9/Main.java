package Homework_Lesson9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Methods firstException = new Methods();
        Methods secondException = new Methods();
        Methods thirdException = new Methods();

        /** TRY-CATCH*/

        try {
            System.out.println(firstException.transformationStringToNumber("hello"));
        } catch (NumberFormatException e) {
            System.out.println("You inserted incorrect String. " + e);
        }

        /** TRY-CATCH-CATCH*/

        try {
            int[] array = new int[8];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(9);
            }
            System.out.println(secondException.division(array[8], array[2]));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error. " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bounds error. " + e);
        }

        /** TRY-CATCH-FINALLY*/

        try {
            Person workerOne = new Worker(25, "Alex");
            Doctor doctorOne = (Doctor) new Worker(56, "William");
            System.out.println(workerOne.getName() + " " + workerOne.getAge());
            System.out.println(doctorOne.getName());
        } catch (ClassCastException e) {
            System.out.println("You have a problem. " + e);
        } finally {
            Person workerOne = new Worker(25, "Alex");
            Worker doctorOne = new Doctor(56, "William");
            System.out.println(workerOne.getName() + " " + workerOne.getAge());
            System.out.println(doctorOne.getName());
        }

        /** TRY-MULTICATCH*/

        try {
            thirdException.createArray(0);
        } catch (IllegalArgumentException | NegativeArraySizeException e) {
            System.out.println("Hey man, you have a problem! " + e);
        }
    }
}
