package t5_domain_objects;

import t5_relations.Doctor_Assistant;
import t5_relations.Doctor_ExaminationRoom;
import t5_relations.Person_Doctor;

import java.util.Date;
import java.util.Vector;

public class Doctor {
    private int skillID;
    public Vector<Appointment> appointment = new Vector<Appointment>();
    public Vector<Doctor_ExaminationRoom> doctorExaminationRoom = new Vector<Doctor_ExaminationRoom>();
    public Office office;
    public Vector<Patient> patient = new Vector<Patient>();
    private int yearsOfExperience;
    public Vector<Doctor_Assistant> doctorAssistant = new Vector<Doctor_Assistant>();
    private Date hiredDate;
    public Vector<Diagnosis> diagnosis = new Vector<Diagnosis>();
    private int departmentID;
    public Vector<Person_Doctor> personDoctor = new Vector<Person_Doctor>();
    public Vector<Nurse> nurse = new Vector<Nurse>();
    public Department department;

    /**
     *
     * @param skillId
     * @param yearsOfExperience
     * @param hiredDate
     * @param departmentID
     */
    public Doctor(int skillId, int yearsOfExperience, Date hiredDate, int departmentID) {
        this.skillID = skillId;
        this.yearsOfExperience = yearsOfExperience;
        this.hiredDate = hiredDate;
        this.departmentID = departmentID;
    }
}
