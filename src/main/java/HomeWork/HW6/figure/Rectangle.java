package HomeWork.HW6.figure;

public class Rectangle extends Figure{
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public double calculateArea() {
        return sideA*sideB;
    }

    @Override
    public double calculatePerimeter() {
        return (sideA+sideB)*2;
    }
}
