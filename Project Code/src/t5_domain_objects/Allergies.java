package t5_domain_objects;

import java.util.Vector;

public class Allergies {
    public Vector<Medicine> medicine = new Vector<Medicine>();
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
