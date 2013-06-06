package t5_domain_objects;

import t5_relations.Doctor_ExaminationRoom;
import t5_relations.Patient_Doctor;

import java.util.HashMap;
import java.util.Vector;

public class Doctor extends RPerson {

    /*
    INHERITED FROM RPerson
    -----------------------
    public String firstName;
    public String lastName;
    public String middleName;
    public String dateOfBirth;
    public String sex;
    public String socialSecurity;
    public String emailAddress;
    public String password;
    public String userName;
    public String homePhone;
    public String mobilePhone;
    public int type;
     */

    private Vector<Appointment> appointment = new Vector<Appointment>();
    private Vector<Doctor_ExaminationRoom> doctorExaminationRoom = new Vector<Doctor_ExaminationRoom>();
    private Office office;
    private Vector<Patient> patient = new Vector<Patient>();
    private int yearsOfExperience;
    private String hiredDate;
    private Vector<Diagnosis> diagnosis = new Vector<Diagnosis>();
    private int departmentID;
    private Vector<Patient_Doctor> personDoctor = new Vector<Patient_Doctor>();
    private Vector<Nurse> nurse = new Vector<Nurse>();
    private Department department;

    public static HashMap<String, Doctor> hashMap = new HashMap<String, Doctor>();

    /**
     *
     * @param skillId
     * @param yearsOfExperience
     * @param hiredDate
     * @param departmentID
     */
    public Doctor(String userName, String password, String firstName, String lastName, String middleName,
                  String dateOfBirth, String sex, String socialSecurity,  String emailAddress, String mobilePhone,
                  int skillId, int yearsOfExperience, String hiredDate, int departmentID, int type) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.socialSecurity = socialSecurity;
        this.emailAddress = emailAddress;
        this.password = password;
        this.userName = userName;
        this.mobilePhone = mobilePhone;
        this.type = type;

        this.yearsOfExperience = yearsOfExperience;
        this.hiredDate = hiredDate;
        this.departmentID = departmentID;

        hashMap.put(lastName + ", " + firstName, this);
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

    public String getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(String hiredDate) {
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

    public Vector<Patient_Doctor> getPersonDoctor() {
        return personDoctor;
    }

    public void setPersonDoctor(Vector<Patient_Doctor> personDoctor) {
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
