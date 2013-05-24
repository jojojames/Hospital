package OOD;

import java.util.Vector;

public class Department {
    public Vector doctor = new Vector();
    private String departmentName;
    private int departmentID;
    private int headID;
    public Vector nurse = new Vector();
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
