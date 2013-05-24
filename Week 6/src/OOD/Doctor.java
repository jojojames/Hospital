package OOD;

import java.util.Date;
import java.util.Vector;

public class Doctor {
    private int skillID;
    public Vector appointment = new Vector();
    public Vector doctorExaminationRoom = new Vector();
    public Office office;
    public Vector patient = new Vector();
    private int yearsOfExperiance;
    public Vector doctorAssistant = new Vector();
    private Date hiredDate;
    public Vector diagnosis = new Vector();
    private int departmentID;
    public Vector personDoctor = new Vector();
    public Vector nurse = new Vector();
    public Department department;

    /**
     *
     * @param skillId
     * @param yearsOfExperiance
     * @param hiredDate
     * @param departmentID
     */
    public Doctor(int skillId, int yearsOfExperiance, Date hiredDate, int departmentID) {
        this.skillID = skillId;
        this.yearsOfExperiance = yearsOfExperiance;
        this.hiredDate = hiredDate;
        this.departmentID = departmentID;
    }
}
