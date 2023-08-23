package HomeWork.HW6.figure;

public class Triangle extends Figure {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double semiPerimeter = (sideA+sideB+sideC)/2;
        double area = Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC));
        return area;
    }

    @Override
    public double calculatePerimeter() {

        return sideA+sideB+sideC;
    }
}
