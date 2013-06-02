package t5_domain_objects;

import t5_relations.Doctor_Assistant;
import t5_relations.Doctor_ExaminationRoom;
import t5_relations.Person_Doctor;

import java.util.Date;
import java.util.Vector;

public class Doctor {
    private String userId;
    private int skillID;
    private Vector<Appointment> appointment = new Vector<Appointment>();
    private Vector<Doctor_ExaminationRoom> doctorExaminationRoom = new Vector<Doctor_ExaminationRoom>();
    private Office office;
    private Vector<Patient> patient = new Vector<Patient>();
    private int yearsOfExperience;
    private Vector<Doctor_Assistant> doctorAssistant = new Vector<Doctor_Assistant>();
    private Date hiredDate;
    private Vector<Diagnosis> diagnosis = new Vector<Diagnosis>();
    private int departmentID;
    private Vector<Person_Doctor> personDoctor = new Vector<Person_Doctor>();
    private Vector<Nurse> nurse = new Vector<Nurse>();
    private Department department;

    /**
     *
     * @param skillId
     * @param yearsOfExperience
     * @param hiredDate
     * @param departmentID
     */
    public Doctor(String userId, int skillId, int yearsOfExperience, Date hiredDate, int departmentID) {
        this.userId = userId;
        this.skillID = skillId;
        this.yearsOfExperience = yearsOfExperience;
        this.hiredDate = hiredDate;
        this.departmentID = departmentID;
    }

    public int getSkillID() {
        return skillID;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Vector<Appointment> getAppointment() {
        return appointment;
    }

    public void setAppointment(Vector<Appointment> appointment) {
        this.appointment = appointment;
    }

    public Vector<Doctor_ExaminationRoom> getDoctorExaminationRoom() {
        return doctorExaminationRoom;
    }

    public void setDoctorExaminationRoom(Vector<Doctor_ExaminationRoom> doctorExaminationRoom) {
        this.doctorExaminationRoom = doctorExaminationRoom;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public Vector<Patient> getPatient() {
        return patient;
    }

    public void setPatient(Vector<Patient> patient) {
        this.patient = patient;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Vector<Doctor_Assistant> getDoctorAssistant() {
        return doctorAssistant;
    }

    public void setDoctorAssistant(Vector<Doctor_Assistant> doctorAssistant) {
        this.doctorAssistant = doctorAssistant;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public Vector<Diagnosis> getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Vector<Diagnosis> diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public Vector<Person_Doctor> getPersonDoctor() {
        return personDoctor;
    }

    public void setPersonDoctor(Vector<Person_Doctor> personDoctor) {
        this.personDoctor = personDoctor;
    }

    public Vector<Nurse> getNurse() {
        return nurse;
    }

    public void setNurse(Vector<Nurse> nurse) {
        this.nurse = nurse;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
