package HomeWork.HW6.company;

public class Director extends Employee implements PositionInformation {
    public Director(String name) {
        super(name);
    }

    @Override
    public void getPositionInformation() {
        System.out.println("Директор "+name + " id-"+id);

    }
}
