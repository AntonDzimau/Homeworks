package Homework_Lesson7;

public class Circle extends Figures {

    protected Circle() {
        System.out.println("Enter the radius of the circle (cm):");
        this.radius = scanner.nextInt();
    }

    @Override
    double areaCalculation() {
        return this.area = this.radius * super.pi;
    }

    @Override
    double perimeterCalculation() {
        return this.perimeter = 2 * super.pi * this.radius;
    }
}
