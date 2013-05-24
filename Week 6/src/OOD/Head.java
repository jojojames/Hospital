package OOD;

import java.util.Date;
import java.util.Vector;

public class Head {
    private int yearsOfExperiance;
    public Vector skills = new Vector();
    private Date hiredDate;
    public Department department;
    public Vector personHead = new Vector();
    private int skillID;

    /**
     *
     * @param yearsOfExperiance
     * @param skillID
     * @param hiredDate
     */
    public Head(int yearsOfExperiance, int skillID, Date hiredDate) {
        this.yearsOfExperiance = yearsOfExperiance;
        this.skillID = skillID;
        this.hiredDate = hiredDate;
    }
}
