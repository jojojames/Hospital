package t5_objects;

import java.util.Date;
import java.util.Vector;

public class Prescription {
    public Vector<Medicine> medicine = new Vector<Medicine>();
    private Date date;
    public Patient patient;
    private float amount;
    public Vector<Allergies> allergies = new Vector<Allergies>();
    private int prescripID;
    private String notes;
    private String medicineName;
    private String prescribingPhysician;

    /**
     *
     * @param amount
     * @param prescripID
     * @param notes
     * @param medicineName
     * @param prescribingPhysician
     */
    public Prescription(float amount, int prescripID, String notes, String medicineName, String prescribingPhysician) {
        this.amount = amount;
        this.prescripID = prescripID;
        this.notes = notes;
        this.medicineName = medicineName;
        this.prescribingPhysician = prescribingPhysician;
    }
}
