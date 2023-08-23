package HomeWork.HW6.company;

public class Accountant extends Employee implements PositionInformation{

    public Accountant(String name) {
        super(name);
    }

    @Override
    public void getPositionInformation() {
        System.out.println("Бухгалтер " + name+ " id-"+id);

    }
}
