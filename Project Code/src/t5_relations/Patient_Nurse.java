package t5_relations;

import t5_domain_objects.Nurse;
import t5_domain_objects.Patient;

public class Patient_Nurse {
    public Patient patient;
    public Nurse nurse;

    /**
     *
     */
    public Patient_Nurse() {

    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
}
