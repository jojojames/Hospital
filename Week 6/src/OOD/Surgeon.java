package OOD;

import java.util.Date;
import java.util.Vector;

public class Surgeon {
    public Vector patientSurgeon = new Vector();
    public Office office;
    public int yearsOfExperiance;
    private Date hiredDate;
    public Vector surgeonSurgery = new Vector();
    private int departmentID;
    private int skillID;
    public Vector personSurgeon = new Vector();
    public Vector nurse = new Vector();
    public Vector assistant = new Vector();

    /**
     *
     * @param yearsOfExperiance
     * @param departmentID
     * @param skillID
     */
    public Surgeon(int yearsOfExperiance, int departmentID, int skillID) {
        this.yearsOfExperiance = yearsOfExperiance;
        this.departmentID = departmentID;
        this.skillID = skillID;
    }
}
