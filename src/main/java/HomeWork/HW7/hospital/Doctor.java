package HomeWork.HW7.hospital;

public abstract class Doctor extends Person{

    public Doctor(String name, int age) {
        super(name, age);
    }
    public  abstract void treatPatient();

}
