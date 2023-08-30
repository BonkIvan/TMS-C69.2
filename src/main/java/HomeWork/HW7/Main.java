package HomeWork.HW7;

import HomeWork.HW7.hospital.*;

public class Main {
    public static void main(String[] args) {


        Therapist therapist = new Therapist("Тур Ирина", 52);
        Surgeon surgeon = new Surgeon("Васильев Эдуард", 29);
        Dentist dentist = new Dentist("Ермолов Игорь", 55);

        TreatmentPlan treatmentPlan  = new TreatmentPlan(therapist, surgeon , dentist);


        Patient patient = new Patient("Васин Петр", 29, AttendingDoctor.SURGERY);
        Patient patient2 = new Patient("Гурин Саша", 26);
        Patient patient3 = new Patient("Рокач Игорь", 35, AttendingDoctor.DENTISTRY);


//        AttendingDoctor plan = patient.getAttendingDoctor();
//        AttendingDoctor plan2 = patient2.getAttendingDoctor();
//        AttendingDoctor plan3 = patient3.getAttendingDoctor();

        treatmentPlan.assignDoctor(patient3);
        treatmentPlan.assignDoctor(patient2);
        treatmentPlan.assignDoctor(patient);


       /* surgeon.treatPatient(plan);
        therapist.treatPatient(plan2);
        dentist.treatPatient(plan3);*/


       // TreatmentPlan.assignDoctor(patient);





        /**
         * Задача 1*/
        /*Phone phone = new Phone(7775556,180,"Nokia");
        phone.receiveCall("Вася");
        System.out.println(phone.getNumber());

        phone.sendMessage(2553380,3378956,7748388);*/




    }
}
