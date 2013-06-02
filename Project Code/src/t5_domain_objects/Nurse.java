package t5_domain_objects;

import t5_relations.Patient_Nurse;
import t5_relations.Person_Nurse;
import t5_relations.Surgery_Nurse;

import java.util.Vector;

public class Nurse {
    private String userId;
    private Surgeon surgeon;
    private Department department;
    private Vector<Patient_Nurse> patientNurse = new Vector<Patient_Nurse>();
    private Vector<Surgery_Nurse> surgeryNurse = new Vector<Surgery_Nurse>();
    private Vector<Person_Nurse> personNurse = new Vector<Person_Nurse>();
    private Doctor doctor;
    private Skills skills;
    private Ward ward;

    /**
     *
     */
    public Nurse(String userId) {
        this.userId = userId;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Surgeon getSurgeon() {
        return surgeon;
    }

    public void setSurgeon(Surgeon surgeon) {
        this.surgeon = surgeon;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Vector<Patient_Nurse> getPatientNurse() {
        return patientNurse;
    }

    public void setPatientNurse(Vector<Patient_Nurse> patientNurse) {
        this.patientNurse = patientNurse;
    }

    public Vector<Surgery_Nurse> getSurgeryNurse() {
        return surgeryNurse;
    }

    public void setSurgeryNurse(Vector<Surgery_Nurse> surgeryNurse) {
        this.surgeryNurse = surgeryNurse;
    }

    public Vector<Person_Nurse> getPersonNurse() {
        return personNurse;
    }

    public void setPersonNurse(Vector<Person_Nurse> personNurse) {
        this.personNurse = personNurse;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }


}
