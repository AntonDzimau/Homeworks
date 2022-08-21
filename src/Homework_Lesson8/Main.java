package Homework_Lesson8;

public class Main {
    public static void main(String[] args) {
        Patient patientOne = new Patient("Nicolas Cage", 58, "Toothache");
        Patient patientTwo = new Patient("Producer-who-must-not-be-named", 70, "Stomachache");
        Patient patientThree = new Patient("Steven (Talent doesn't fit into the screen) Seagal", 70, "Dizziness");
        patientOne.doctorsAppointment(patientOne.getTreatmentPlan());
        patientTwo.doctorsAppointment(patientTwo.getTreatmentPlan());
        patientThree.doctorsAppointment(patientThree.getTreatmentPlan());
    }
}
