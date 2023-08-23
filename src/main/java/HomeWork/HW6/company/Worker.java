package HomeWork.HW6.company;

public class Worker extends Employee implements PositionInformation {
    public Worker(String name) {
        super(name);
    }

    @Override
    public void getPositionInformation() {
        System.out.println("Рабочий "+name + " id-"+id);
    }
}
