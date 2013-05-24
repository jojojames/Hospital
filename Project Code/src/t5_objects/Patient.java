package t5_objects;

import t5_relations.Patient_Nurse;
import t5_relations.Patient_Surgeon;
import t5_relations.Person_Patient;

import java.util.Vector;

public class Patient {
    public Vector<Patient_Nurse> patientNurse = new Vector<Patient_Nurse>();
    public Vector<Visit> visit = new Vector<Visit>();
    public Vector<Appointment> appointment = new Vector<Appointment>();
    public Vector<Patient_Surgeon> patientSurgeon = new Vector<Patient_Surgeon>();
    public InsurancePolicy insurancePolicy;
    public Vector<Diagnosis> diagnosis = new Vector<Diagnosis>();
    public Vector<BillingStatement> billingStatement = new Vector<BillingStatement>();
    public Vector<Prescription> prescription = new Vector<Prescription>();
    public Doctor doctor;
    public Vector<Person_Patient> personPatient = new Vector<Person_Patient>();

    /**
     *
     */
    public Patient() {
    }
}
