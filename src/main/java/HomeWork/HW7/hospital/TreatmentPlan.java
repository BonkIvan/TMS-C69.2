package HomeWork.HW7.hospital;

public class TreatmentPlan {

  public static void assignDoctor(Patient patient, Doctor doctor){
        AttendingDoctor attendingDoctor = patient.getAttendingDoctor();
         if (attendingDoctor==AttendingDoctor.SURGERY) {
             System.out.println(patient.getName() + " необходим хирург ");
             doctor.treatPatient(patient.getAttendingDoctor());
         } if(attendingDoctor==AttendingDoctor.DENTISTRY){
            System.out.println(patient.getName() + " необходим дантист ");
            doctor.treatPatient(patient.getAttendingDoctor());
        } if(attendingDoctor==AttendingDoctor.THERAPY){
            System.out.println(patient.getName() + " необходим терапевтг ");
            doctor.treatPatient(patient.getAttendingDoctor());
        }




    }
}
