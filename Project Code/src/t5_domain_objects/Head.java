package t5_domain_objects;

import t5_relations.Patient_Head;

import java.util.Date;
import java.util.Vector;

public class Head extends RPerson {
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
     */

    private int yearsOfExperience;
    private Vector<Skills> skills = new Vector<Skills>();
    private String hiredDate;
    private Department department;
    private Vector<Patient_Head> personHead = new Vector<Patient_Head>();
    private int skillID;

    /**
     *
     * @param yearsOfExperience
     * @param skillID
     * @param hiredDate
     */
    public Head(String userName, String password, String firstName, String lastName, String middleName,
                String dateOfBirth, String sex, String socialSecurity,  String emailAddress, String mobilePhone,
                int yearsOfExperience, int skillID, String hiredDate) {

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

        this.yearsOfExperience = yearsOfExperience;
        this.skillID = skillID;
        this.hiredDate = hiredDate;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Vector<Skills> getSkills() {
        return skills;
    }

    public void setSkills(Vector<Skills> skills) {
        this.skills = skills;
    }

    public String getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Vector<Patient_Head> getPersonHead() {
        return personHead;
    }

    public void setPersonHead(Vector<Patient_Head> personHead) {
        this.personHead = personHead;
    }

    public int getSkillID() {
        return skillID;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }
}
