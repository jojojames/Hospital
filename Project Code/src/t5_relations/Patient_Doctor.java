package t5_relations;

import t5_domain_objects.Doctor;
import t5_domain_objects.Patient;

public class Patient_Doctor {
    public Patient patient;
    public Doctor doctor;

    public Patient_Doctor() {

    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     *
     */
}
