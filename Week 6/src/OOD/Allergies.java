package OOD;

import java.util.Vector;

public class Allergies {
    public Vector medicine = new Vector();
    private String allergies;
    public Prescription prescription;

    /**
     *
     * @param allergies
     */
    public Allergies(String allergies) {
        this.allergies = allergies;
    }
}
