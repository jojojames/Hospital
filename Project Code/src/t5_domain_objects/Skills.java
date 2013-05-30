package t5_domain_objects;

import java.util.Vector;

public class Skills {
    public Head head;
    private int skillsDesc;
    public Nurse nurse;
    public Vector<Assistant> assistant = new Vector<Assistant>();
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
