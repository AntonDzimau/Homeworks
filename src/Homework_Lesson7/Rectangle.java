package Homework_Lesson7;

public class Rectangle extends Figures {
    protected Rectangle() {
        System.out.println("Enter the length of the first side of the rectangle (cm):");
        this.firstSide = scanner.nextInt();
        System.out.println("Enter the length of the second side of the rectangle (cm):");
        this.secondSide = scanner.nextInt();
    }

    @Override
    double areaCalculation() {
        return this.area = this.firstSide * this.secondSide;
    }

    double perimeterCalculation() {
        return this.perimeter = 2 * (firstSide + secondSide);
    }
}
