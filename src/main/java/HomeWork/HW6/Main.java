package HomeWork.HW6;
import HomeWork.HW6.company.Accountant;
import HomeWork.HW6.company.Director;
import HomeWork.HW6.company.Worker;
import HomeWork.HW6.figure.Circle;
import HomeWork.HW6.figure.Figure;
import HomeWork.HW6.figure.Rectangle;
import HomeWork.HW6.figure.Triangle;

public class Main {
    public static void main(String[] args) {

        Director director = new Director("Вася");
        director.getPositionInformation();
        Accountant accountant = new Accountant("Лера");
        accountant.getPositionInformation();
        Worker worker = new Worker("Егор");
        worker.getPositionInformation();
        Worker worker2 = new Worker("Иван");
        worker2.getPositionInformation();
        Accountant accountant2 = new Accountant("Марина");
        accountant2.getPositionInformation();






/**
 * Задача1*/
      /*  System.out.println("Треугольник");
        Triangle triangle = new Triangle(5,5,5);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());

        System.out.println("Прямоугольник");
        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        System.out.println("Круг");
        Circle circle = new Circle(5);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        Figure[] figures = {
                new Circle(4),
                new Triangle(2,3,4),
                new Triangle(9,5,3),
                new Rectangle(7,2),
                new Rectangle(2, 5)

        };
        double sumPerimeterFigure = 0;
        for (Figure figure: figures) {
            sumPerimeterFigure = sumPerimeterFigure + figure.calculatePerimeter();
        }
        System.out.println("Сумма периметров фигур: "+sumPerimeterFigure);*/

    }
}
