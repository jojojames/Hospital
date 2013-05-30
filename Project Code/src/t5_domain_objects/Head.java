package t5_domain_objects;

import t5_relations.Person_Head;

import java.util.Date;
import java.util.Vector;

public class Head {
    private int yearsOfExperience;
    public Vector<Skills> skills = new Vector<Skills>();
    private Date hiredDate;
    public Department department;
    public Vector<Person_Head> personHead = new Vector<Person_Head>();
    private int skillID;

    /**
     *
     * @param yearsOfExperience
     * @param skillID
     * @param hiredDate
     */
    public Head(int yearsOfExperience, int skillID, Date hiredDate) {
        this.yearsOfExperience = yearsOfExperience;
        this.skillID = skillID;
        this.hiredDate = hiredDate;
    }
}
