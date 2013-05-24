package OOD;

import java.util.Vector;

public class Insurance {
    public Vector person = new Vector();
    private String insuranceContact;
    private int contactNumber;
    private String provider;
    public InsurancePolicy insurancePolicy;

    /**
     *
     * @param insuranceContact
     * @param contactNumber
     * @param provider
     */
    public Insurance(String insuranceContact, int contactNumber, String provider) {
        this.insuranceContact = insuranceContact;
        this.contactNumber = contactNumber;
        this.provider = provider;
    }
}
