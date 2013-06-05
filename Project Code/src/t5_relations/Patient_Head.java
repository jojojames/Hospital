package t5_relations;

import t5_domain_objects.Head;
import t5_domain_objects.Patient;

public class Patient_Head {
    public Patient patient;
    public Head head;

    /**
     *
     */
    public Patient_Head() {

    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }
}
