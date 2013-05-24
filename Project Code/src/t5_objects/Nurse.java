package t5_objects;

import t5_relations.Patient_Nurse;
import t5_relations.Person_Nurse;
import t5_relations.Surgery_Nurse;

import java.util.Vector;

public class Nurse {
    public Surgeon surgeon;
    public Department department;
    public Vector<Patient_Nurse> patientNurse = new Vector<Patient_Nurse>();
    public Vector<Surgery_Nurse> surgeryNurse = new Vector<Surgery_Nurse>();
    public Vector<Person_Nurse> personNurse = new Vector<Person_Nurse>();
    public Doctor doctor;
    public Skills skills;
    public Ward ward;

    /**
     *
     */
    public Nurse() {

    }
}
