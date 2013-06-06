package t5_domain_objects;

import t5_relations.Patient_Surgeon;
import t5_relations.Surgeon_Surgery;

import java.util.Date;
import java.util.Vector;

public class Surgeon extends RPerson {

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

    private Vector<Patient_Surgeon> patientSurgeon = new Vector<Patient_Surgeon>();
    private Office office;
    private int yearsOfExperiance;
    private Date hiredDate;
    private Vector<Surgeon_Surgery> surgeonSurgery = new Vector<Surgeon_Surgery>();
    private int departmentID;
    private Vector<Nurse> nurse = new Vector<Nurse>();

    /**
     *
     * @param yearsOfExperiance
     * @param departmentID
     */
    public Surgeon(String userName, String password, String firstName, String lastName, String middleName,
                   String dateOfBirth, String sex, String socialSecurity, String emailAddress, String mobilePhone,
                    int yearsOfExperiance, int departmentID, int type) {

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

        this.yearsOfExperiance = yearsOfExperiance;
        this.departmentID = departmentID;
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

    public Vector<Nurse> getNurse() {
        return nurse;
    }

    public void setNurse(Vector<Nurse> nurse) {
        this.nurse = nurse;
    }

}
