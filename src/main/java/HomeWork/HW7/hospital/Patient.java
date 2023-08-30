package HomeWork.HW7.hospital;

public class Patient extends Person{
    AttendingDoctor attendingDoctor;
    public Patient(String name, int age, AttendingDoctor attendingDoctor) {
        super(name, age);
        this.attendingDoctor = attendingDoctor;
    }

    public Patient(String name, int age) {
        super(name, age);
        this.attendingDoctor = AttendingDoctor.THERAPY;

    }

    public AttendingDoctor getAttendingDoctor(){
        return attendingDoctor;
    }


}
