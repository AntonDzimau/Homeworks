package Homework_Lesson8;

public class Patient {
    private String name;
    private int age;
    private Doctor doctor;
    private String treatmentPlan;

    public Patient(String name, int age, String treatmentPlan) {
        this.name = name;
        this.age = age;
        this.treatmentPlan = treatmentPlan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    void doctorsAppointment(String treatmentPlan) {
        if (treatmentPlan.equals("Toothache")) {
            doctor = new Dentist("Obi-Wan", "Kenobi");
            doctor.toTreat();
        } else if (treatmentPlan.equals("Stomachache")) {
            doctor = new Surgeon("Mace", "Windu");
            doctor.toTreat();
        } else {
            doctor = new Therapist("Yoda", "Unknown");
            doctor.toTreat();
        }
    }
}
