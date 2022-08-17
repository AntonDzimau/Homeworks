package Homework_Lesson7;

public class Main {
    public static void main(String[] args) {
        Figures[] arrayOfFigures = new Figures[5];
        arrayOfFigures[0] = new Triangle();
        arrayOfFigures[1] = new Rectangle();
        arrayOfFigures[2] = new Circle();
        arrayOfFigures[3] = new Circle();
        arrayOfFigures[4] = new Rectangle();
        double sumOfPerimeters = 0;
        for (int i = 0, j = 1; i < arrayOfFigures.length; i++, j++) {
            sumOfPerimeters += arrayOfFigures[i].perimeterCalculation();
            System.out.println("\nPerimeter of the " + j + " figure is " + arrayOfFigures[i].perimeterCalculation());
            System.out.print("Area of the " + j + " figure is ");
            System.out.printf("%.2f", arrayOfFigures[i].areaCalculation());
        }
        System.out.print("\nSum of the all figures perimeters is ");
        System.out.printf("%.2f", sumOfPerimeters);
    }
}
