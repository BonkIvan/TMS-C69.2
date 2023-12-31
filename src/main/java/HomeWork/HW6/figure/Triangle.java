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
    public double calculatePerimeter() {

        return sideA+sideB+sideC;
    }
    @Override
    public double calculateArea() {
        double semiPerimeter = calculatePerimeter()/2;
        return  Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC));
    }
}
