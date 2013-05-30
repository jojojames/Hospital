package t5_domain_objects;

import t5_relations.Patient_Surgeon;
import t5_relations.Person_Surgeon;
import t5_relations.Surgeon_Surgery;

import java.util.Date;
import java.util.Vector;

public class Surgeon {
    public Vector<Patient_Surgeon> patientSurgeon = new Vector<Patient_Surgeon>();
    public Office office;
    public int yearsOfExperiance;
    private Date hiredDate;
    public Vector<Surgeon_Surgery> surgeonSurgery = new Vector<Surgeon_Surgery>();
    private int departmentID;
    private int skillID;
    public Vector<Person_Surgeon> personSurgeon = new Vector<Person_Surgeon>();
    public Vector<Nurse> nurse = new Vector<Nurse>();
    public Vector<Assistant> assistant = new Vector<Assistant>();

    /**
     *
     * @param yearsOfExperiance
     * @param departmentID
     * @param skillID
     */
    public Surgeon(int yearsOfExperiance, int departmentID, int skillID) {
        this.yearsOfExperiance = yearsOfExperiance;
        this.departmentID = departmentID;
        this.skillID = skillID;
    }
}
