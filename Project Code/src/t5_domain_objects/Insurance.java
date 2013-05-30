package t5_domain_objects;

import java.util.Vector;

public class Insurance {
    public Vector<Person> person = new Vector<Person>();
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
