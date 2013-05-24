package OOD;

import java.util.Date;
import java.util.Vector;

public class Surgery {
    private String surgeryType;
    public Vector surgeonSurgery = new Vector();
    private String guarantor;
    public Vector assistantSurgery = new Vector();
    private String attendingSurgeon;
    public Date date;
    private int diagnosisCode;
    private String procedure;
    private String attendingAssistant;
    public Vector surgeryNurse = new Vector();
    private int procedureCode;
    public OperatingRoom operatingRoom;
    private String description;

    /**
     *
     * @param surgeryType
     * @param guarantor
     * @param attendingSurgeon
     * @param date
     * @param diagnosisCode
     * @param procedure
     * @param attendingAssistant
     * @param procedureCode
     * @param description
     */
    public Surgery(String surgeryType, String guarantor, String attendingSurgeon,Date date, int diagnosisCode, String procedure, String attendingAssistant, 
                   int procedureCode, String description) {
        this.surgeryType = surgeryType;
        this.guarantor = guarantor;
        this.attendingSurgeon = attendingSurgeon;
        this.date = date;
        this.diagnosisCode = diagnosisCode;
        this.procedure = procedure;
        this.attendingAssistant = attendingAssistant;
        this.procedureCode = procedureCode;
        this.description = description;
    }
}
