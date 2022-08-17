package Homework_Lesson7;

import java.util.Scanner;

public abstract class Figures {
    Scanner scanner = new Scanner(System.in);
    final double pi = 3.1415;
    protected double firstSide;
    protected double secondSide;
    protected double area;
    protected double perimeter;
    protected double radius;

    abstract double areaCalculation();

    abstract double perimeterCalculation();

}
