package OOD;

import java.util.Vector;

public class Patient {
    public Vector patientNurse = new Vector();
    public Vector visit = new Vector();
    public Vector appointment = new Vector();
    public Vector patientSurgeon = new Vector();
    public InsurancePolicy insurancePolicy;
    public Vector diagnosis = new Vector();
    public Vector billingStatement = new Vector();
    public Vector prescription = new Vector();
    public Doctor doctor;
    public Vector personPatient = new Vector();

    /**
     *
     */
    public Patient() {
    }
}
