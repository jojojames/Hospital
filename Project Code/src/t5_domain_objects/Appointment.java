package t5_domain_objects;

import java.util.Date;

public class Appointment {
    private String date;
    private String notesDescription;
    private Patient patient;
    private Doctor doctor;
    private String appointmentDate;
    private String basicReason;
    private String fullReason;
    private String time;

    public Appointment(Doctor doc, Patient patient, String time, String basicReason, String fullReason) {
        this.doctor = doc;
        this.patient = patient;
        this.time = time;
        this.basicReason = basicReason;
        this.fullReason = fullReason;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotesDescription() {
        return notesDescription;
    }

    public void setNotesDescription(String notesDescription) {
        this.notesDescription = notesDescription;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getBasicReason() {
        return basicReason;
    }

    public void setBasicReason(String basicReason) {
        this.basicReason = basicReason;
    }

    public String getFullReason() {
        return fullReason;
    }

    public void setFullReason(String fullReason) {
        this.fullReason = fullReason;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}
