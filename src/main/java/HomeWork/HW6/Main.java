package HomeWork.HW6;
import HomeWork.HW6.documentManagementSystem.DeliveryContracts;
import HomeWork.HW6.documentManagementSystem.EmployeeContract;
import HomeWork.HW6.documentManagementSystem.FinanceInvoice;
import HomeWork.HW6.documentManagementSystem.Register;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();

        EmployeeContract employeeContract = new EmployeeContract("Вася",5);
        DeliveryContracts deliveryContracts = new DeliveryContracts("Куклы", 50);
        FinanceInvoice financeInvoice = new FinanceInvoice(2598.75, 55);
        DeliveryContracts deliveryContracts2 = new DeliveryContracts("Розы", 500);
        DeliveryContracts deliveryContracts3 = new DeliveryContracts("Телефоны", 10);
        DeliveryContracts deliveryContracts4 = new DeliveryContracts("Кружки", 77);
        FinanceInvoice financeInvoice2 = new FinanceInvoice(22.77, 25);
        FinanceInvoice financeInvoice3 = new FinanceInvoice(3000, 511);
        EmployeeContract employeeContract2 = new EmployeeContract("Влад",1);
        EmployeeContract employeeContract3 = new EmployeeContract("Витя",1);
        EmployeeContract employeeContract4 = new EmployeeContract("Валера",3);

        /*employeeContract.showDateOfEmployment();
        employeeContract.showDate();
        employeeContract.showContractEndDate();
        employeeContract.showId();*/


        register.putDocumet(employeeContract);
        register.putDocumet(deliveryContracts);
        register.putDocumet(financeInvoice);
        register.putDocumet(financeInvoice2);
        register.putDocumet(financeInvoice3);
        register.putDocumet(deliveryContracts2);
        register.putDocumet(deliveryContracts3);
        register.putDocumet(deliveryContracts4);
        register.putDocumet(employeeContract2);
        register.putDocumet(employeeContract3);
        register.putDocumet(employeeContract4);

        register.showAllDocuments();
        register.showDocument(2);




       /* DeliveryContracts deliveryContracts = new DeliveryContracts("food", 50);
        DeliveryContracts deliveryContracts1 = new DeliveryContracts("foodы", 40);
        deliveryContracts.showId();
        deliveryContracts.showDate();
       Register register = new Register();
       // register.showDocement(0);
        System.out.println(register.toString());
        register.toString();*/




/**
 * Задача2
 * */
       /* Director director = new Director("Вася");
        director.getPositionInformation();
        Accountant accountant = new Accountant("Лера");
        accountant.getPositionInformation();
        Worker worker = new Worker("Егор");
        worker.getPositionInformation();
        Worker worker2 = new Worker("Иван");
        worker2.getPositionInformation();
        Accountant accountant2 = new Accountant("Марина");
        accountant2.getPositionInformation();*/






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
