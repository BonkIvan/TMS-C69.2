package HomeWork.HW7.hospital;

public class Dentist extends Doctor{

    public Dentist(String name, int age) {
        super(name, age);
    }

    @Override
    public void treatPatient() {
        System.out.println("Открываем рот шире ");

    }
}
