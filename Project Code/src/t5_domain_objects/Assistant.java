package t5_domain_objects;

import t5_relations.Doctor_Assistant;
import t5_relations.Person_Assistant;
import t5_relations.Surgery_Assistant;

import java.util.Vector;

public class Assistant {
    public Vector<Person_Assistant> personAssistant = new Vector<Person_Assistant>();
    public Skills skills;
    public Vector<Doctor_Assistant> doctorAssistant = new Vector<Doctor_Assistant>();
    public Vector<Surgery_Assistant> surgeryAssistant = new Vector<Surgery_Assistant>();
    public Surgeon surgeon;

    /**
     *
     */
    public Assistant() {
    }
}
