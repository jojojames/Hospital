package t5_domain_objects;

import java.util.Date;

public class Visit {
    private int visitID;
    private int personID;
    public Patient patient;
    private String description;
    private Date visitDate;

    /**
     *
     * @param visitID
     * @param personID
     * @param description
     * @param visitDate
     */
    public Visit(int visitID, int personID, String description, Date visitDate) {
        this.visitDate = visitDate;
        this.personID = personID;
        this.description = description;
        this.visitDate = visitDate;
    }
}
