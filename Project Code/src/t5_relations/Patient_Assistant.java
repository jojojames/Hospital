package t5_relations;

import t5_domain_objects.Assistant;
import t5_domain_objects.Patient;

public class Patient_Assistant {
    public Assistant assistant;
    public Patient patient;

    /**
     *
      */
    public Patient_Assistant() {
        
    }

    public Assistant getAssistant() {
        return assistant;
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
