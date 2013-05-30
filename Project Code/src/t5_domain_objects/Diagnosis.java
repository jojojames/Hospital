package t5_domain_objects;

public class Diagnosis {
    private String result;
    public Doctor doctor;
    private String notes;
    public Patient patient;
    private String test;

    /**
     *
     * @param result
     * @param notes
     * @param test
     */
    public Diagnosis(String result, String notes, String test) {
        this.result = result;
        this.notes = notes;
        this.test = test;
    }
}
