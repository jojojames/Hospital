package OOD;

import java.util.Vector;

public class Skills {
    public Head head;
    private int skillsDesc;
    public Nurse nurse;
    public Vector assistant = new Vector();
    private int skillsID;

    /**
     *
     * @param skillsDesc
     * @param skillsID
     */
    public Skills(int skillsDesc, int skillsID) {
        this.skillsDesc = skillsDesc;
        this.skillsID = skillsID;
    }
}
