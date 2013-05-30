package t5_domain_objects;

import java.util.Date;

public class Appointment {
    public Date time;
    private String notesDescription;
    public String physician;
    public Patient patient;
    public Doctor doctor;
    public Date appointmentDate;
    private int appointmentID;

    /**
     *
     * @param physician
     * @param appointmentID
     */
    public Appointment(String physician, int appointmentID) {
        this.physician = physician;
        this.appointmentID = appointmentID;
    }
}
