package t5_domain_objects;

import t5_relations.Surgeon_Surgery;
import t5_relations.Surgery_Nurse;

import java.util.Date;
import java.util.Vector;

public class Surgery {
    private String surgeryType;
    public Vector<Surgeon_Surgery> surgeonSurgery = new Vector<Surgeon_Surgery>();
    private String guarantor;
    public String date;
    private int diagnosisCode;
    private String procedure;
    private int procedureCode;
    public OperatingRoom operatingRoom;
    private String description;
    public Doctor doctor;
    public Surgeon surgeon;
    public Vector<Surgery_Nurse> surgeryNurse = new Vector<Surgery_Nurse>();

    public Surgery(String surgeryType, String guarantor, String date, int diagnosisCode, String procedure,
                   int procedureCode, String description) {
        this.surgeryType = surgeryType;
        this.guarantor = guarantor;
        this.date = date;
        this.diagnosisCode = diagnosisCode;
        this.procedure = procedure;
        this.procedureCode = procedureCode;
        this.description = description;
    }

    public String getSurgeryType() {
        return surgeryType;
    }

    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }

    public Vector<Surgeon_Surgery> getSurgeonSurgery() {
        return surgeonSurgery;
    }

    public void setSurgeonSurgery(Vector<Surgeon_Surgery> surgeonSurgery) {
        this.surgeonSurgery = surgeonSurgery;
    }

    public String getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(String guarantor) {
        this.guarantor = guarantor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(int diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public int getProcedureCode() {
        return procedureCode;
    }

    public void setProcedureCode(int procedureCode) {
        this.procedureCode = procedureCode;
    }

    public OperatingRoom getOperatingRoom() {
        return operatingRoom;
    }

    public void setOperatingRoom(OperatingRoom operatingRoom) {
        this.operatingRoom = operatingRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Surgeon getSurgeon() {
        return surgeon;
    }

    public void setSurgeon(Surgeon surgeon) {
        this.surgeon = surgeon;
    }

    public Vector<Surgery_Nurse> getSurgeryNurse() {
        return surgeryNurse;
    }

    public void setSurgeryNurse(Vector<Surgery_Nurse> surgeryNurse) {
        this.surgeryNurse = surgeryNurse;
    }
}
