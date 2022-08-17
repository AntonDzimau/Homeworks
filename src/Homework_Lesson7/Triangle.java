package Homework_Lesson7;

public class Triangle extends Figures {
    private final double baseOfATriangle;
    private double height;

    protected Triangle() {
        System.out.println("Enter the length of the first side of the triangle (cm):");
        this.firstSide = scanner.nextInt();
        System.out.println("Enter the length of the second side of the triangle (cm):");
        this.secondSide = scanner.nextInt();
        System.out.println("Enter the length of the base of the triangle (cm):");
        baseOfATriangle = scanner.nextInt();
    }

    @Override
    double perimeterCalculation() {
        return this.perimeter = (this.firstSide + this.secondSide + this.baseOfATriangle) / 2;
    }

    @Override
    double areaCalculation() {
        height = 2 * Math.sqrt(this.perimeter * (this.perimeter - baseOfATriangle) * (this.perimeter - this.firstSide) * (this.perimeter - this.secondSide)) / baseOfATriangle;
        return this.area = (this.height * this.baseOfATriangle) / 2;
    }


}
