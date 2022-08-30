package Homework_Lesson9;

public class Methods {

    public int transformationStringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public int division(int a, int b) {
        int c = a / b;
        return c;
    }

    public void createArray(int size) {
        if (size == 0) {
            throw new IllegalArgumentException();
        }
        int[] array = new int[size];
    }

}
