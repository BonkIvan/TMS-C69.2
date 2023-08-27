package HomeWork.HW7.hospital;

public class Therapist extends Doctor{
    public Therapist(String name, int age) {
        super(name, age);
    }

    @Override
    public void treatPatient(AttendingDoctor plan) {
        System.out.println(getName()+ " Говорит: Дополнительный осмотр!  ");

    }
}
