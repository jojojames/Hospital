package t5_objects;

public class Office {
    private int roomNumber;
    public Doctor doctor;
    private String referenceFiles;
    private String patientFiles;
    public Surgeon surgeon;

    /**
     *
     * @param roomNumber
     * @param referenceFiles
     * @param patientFiles
     */
    public Office(int roomNumber, String referenceFiles, String patientFiles) {
        this.roomNumber = roomNumber;
        this.referenceFiles = referenceFiles;
        this.patientFiles = patientFiles;
    }
}
