package HomeWork.HW7.hospital;

public class TreatmentPlan {
    Therapist therapist;
    Surgeon surgeon;
    Dentist dentist;

    public TreatmentPlan(Therapist therapist, Surgeon surgeon, Dentist dentist) {
        this.therapist = therapist;
        this.surgeon = surgeon;
        this.dentist = dentist;
    }

    public  void assignDoctor(Patient patient){
        AttendingDoctor attendingDoctor = patient.getAttendingDoctor();
         if (attendingDoctor==AttendingDoctor.SURGERY) {
             System.out.println(patient.getName() + " необходим хирург ");
             surgeon.treatPatient(patient.getAttendingDoctor());
         } if(attendingDoctor==AttendingDoctor.DENTISTRY){
            System.out.println(patient.getName() + " необходим дантист ");
            dentist.treatPatient(patient.getAttendingDoctor());
        } if(attendingDoctor==AttendingDoctor.THERAPY){
            System.out.println(patient.getName() + " необходим терапевт ");
             therapist.treatPatient(patient.getAttendingDoctor());
        }




    }
}
