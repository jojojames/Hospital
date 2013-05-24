package t5_objects;

import t5_relations.Doctor_ExaminationRoom;

import java.util.Vector;

public class ExaminationRoom {
    public Vector<Doctor_ExaminationRoom> doctorExaminationRoom = new Vector<Doctor_ExaminationRoom>();
    private int examinationTable;
    private int examinationTools;

    /**
     *
     * @param examinationTable
     * @param examinationTools
     */
    public ExaminationRoom(int examinationTable, int examinationTools) {
        this.examinationTable = examinationTable;
        this.examinationTools = examinationTools;
    }
}
