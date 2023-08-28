package HomeWork.HW7.hospital;

public class Surgeon extends Doctor {

    public Surgeon(String name, int age) {
        super(name, age);
    }

    @Override
    public void treatPatient(AttendingDoctor plan) {
        System.out.println("Хирург "+name + " говорит: Режем  ");

    }
}
