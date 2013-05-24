package t5_objects;

public class Ward {
    private int WardID;
    public Nurse nurse;
    public Room room;
    public OperatingRoom operatingRoom;
    private String WardDesc;

    /**
     *
     * @param WardID
     * @param WardDesc
     */
    public Ward(int WardID, String WardDesc) {
        this.WardDesc = WardDesc;
        this.WardID = WardID;
    }
}
