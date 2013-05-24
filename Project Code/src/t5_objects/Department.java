package t5_objects;

import java.util.Vector;

public class Department {
    public Vector<Doctor> doctor = new Vector<Doctor>();
    private String departmentName;
    private int departmentID;
    private int headID;
    public Vector<Nurse> nurse = new Vector<Nurse>();
    public Head head;

    /**
     *
     * @param departmentName
     * @param departmentID
     * @param headID
     */
    public Department(String departmentName, int departmentID, int headID) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.headID = headID;
    }
}
