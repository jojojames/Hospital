package t5_domain_objects;

import t5_relations.Patient_Nurse;
import t5_relations.Surgery_Nurse;

import java.util.Vector;

public class Nurse extends RPerson {

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

    private Surgeon surgeon;
    private Department department;
    private Vector<Patient_Nurse> patientNurse = new Vector<Patient_Nurse>();
    private Vector<Surgery_Nurse> surgeryNurse = new Vector<Surgery_Nurse>();
    private Doctor doctor;
    private Ward ward;

    /**
     *
     */
    public Nurse(String userName, String password, String firstName, String lastName, String middleName,
                 String dateOfBirth, String sex, String socialSecurity,  String emailAddress, String mobilePhone, int type) {
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
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
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

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }



}
