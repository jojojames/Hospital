package t5_relations;

import t5_domain_objects.Patient;
import t5_domain_objects.Surgeon;

public class Patient_Surgeon {
    public Patient patient;
    public Surgeon surgeon;

    /**
     *
     */
    public Patient_Surgeon() {

    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Surgeon getSurgeon() {
        return surgeon;
    }

    public void setSurgeon(Surgeon surgeon) {
        this.surgeon = surgeon;
    }
}
