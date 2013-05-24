package OOD;

import java.util.Vector;

public class ExaminationRoom {
    public Vector doctorExaminationRoom = new Vector();
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
