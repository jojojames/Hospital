package t5_domain_objects;

import t5_relations.Person_Head;

import java.util.Date;
import java.util.Vector;

public class Head {
    private String userId;
    private int yearsOfExperience;
    private Vector<Skills> skills = new Vector<Skills>();
    private Date hiredDate;
    private Department department;
    private Vector<Person_Head> personHead = new Vector<Person_Head>();
    private int skillID;

    /**
     *
     * @param yearsOfExperience
     * @param skillID
     * @param hiredDate
     */
    public Head(String userId, int yearsOfExperience, int skillID, Date hiredDate) {
        this.userId = userId;
        this.yearsOfExperience = yearsOfExperience;
        this.skillID = skillID;
        this.hiredDate = hiredDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Vector<Person_Head> getPersonHead() {
        return personHead;
    }

    public void setPersonHead(Vector<Person_Head> personHead) {
        this.personHead = personHead;
    }

    public int getSkillID() {
        return skillID;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }
}
