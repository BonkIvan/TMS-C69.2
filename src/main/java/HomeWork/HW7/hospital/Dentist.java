package HomeWork.HW7.hospital;

public class Dentist extends Doctor {

    public Dentist(String name, int age) {
        super(name, age);
    }

    @Override
    public void treatPatient(AttendingDoctor plan) {
        System.out.println("Дантист " + getName() + " говорит: Открываем рот шире! ");

    }
}
