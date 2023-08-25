package HomeWork.HW7.hospital;

public class Surgeon extends Doctor {

    public Surgeon(String name, int age, int treatmentPlan) {
        super(name, age);
    }

    @Override
    public void treatPatient() {
        System.out.println("Режем  ");

    }
}
