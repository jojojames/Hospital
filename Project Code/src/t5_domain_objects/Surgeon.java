package t5_domain_objects;

import t5_relations.Patient_Surgeon;
import t5_relations.Person_Surgeon;
import t5_relations.Surgeon_Surgery;

import java.util.Date;
import java.util.Vector;

public class Surgeon {

    private String userId;
    private Vector<Patient_Surgeon> patientSurgeon = new Vector<Patient_Surgeon>();
    private Office office;
    private int yearsOfExperiance;
    private Date hiredDate;
    private Vector<Surgeon_Surgery> surgeonSurgery = new Vector<Surgeon_Surgery>();
    private int departmentID;
    private int skillID;
    private Vector<Person_Surgeon> personSurgeon = new Vector<Person_Surgeon>();
    private Vector<Nurse> nurse = new Vector<Nurse>();
    private Vector<Assistant> assistant = new Vector<Assistant>();

    /**
     *
     * @param yearsOfExperiance
     * @param departmentID
     * @param skillID
     */
    public Surgeon(String userId, int yearsOfExperiance, int departmentID, int skillID) {
        this.userId = userId;
        this.yearsOfExperiance = yearsOfExperiance;
        this.departmentID = departmentID;
        this.skillID = skillID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Vector<Patient_Surgeon> getPatientSurgeon() {
        return patientSurgeon;
    }

    public void setPatientSurgeon(Vector<Patient_Surgeon> patientSurgeon) {
        this.patientSurgeon = patientSurgeon;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public int getYearsOfExperiance() {
        return yearsOfExperiance;
    }

    public void setYearsOfExperiance(int yearsOfExperiance) {
        this.yearsOfExperiance = yearsOfExperiance;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public Vector<Surgeon_Surgery> getSurgeonSurgery() {
        return surgeonSurgery;
    }

    public void setSurgeonSurgery(Vector<Surgeon_Surgery> surgeonSurgery) {
        this.surgeonSurgery = surgeonSurgery;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public int getSkillID() {
        return skillID;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

    public Vector<Person_Surgeon> getPersonSurgeon() {
        return personSurgeon;
    }

    public void setPersonSurgeon(Vector<Person_Surgeon> personSurgeon) {
        this.personSurgeon = personSurgeon;
    }

    public Vector<Nurse> getNurse() {
        return nurse;
    }

    public void setNurse(Vector<Nurse> nurse) {
        this.nurse = nurse;
    }

    public Vector<Assistant> getAssistant() {
        return assistant;
    }

    public void setAssistant(Vector<Assistant> assistant) {
        this.assistant = assistant;
    }


}
