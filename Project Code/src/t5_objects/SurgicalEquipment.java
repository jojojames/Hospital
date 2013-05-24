package t5_objects;

public class SurgicalEquipment {
    public OperatingRoom operatingRoom;
    private int anesthesia;
    private int operatingTools;
    private int oxygen;
    private int operatingTable;

    /**
     *
     * @param anesthesia
     * @param operatingTools
     * @param oxygen
     * @param operatingTable
     */
    public SurgicalEquipment(int anesthesia, int operatingTools, int oxygen, int operatingTable) {
        this.anesthesia = anesthesia;
        this.operatingTools = operatingTools;
        this.oxygen = oxygen;
        this.operatingTable = operatingTable;
    }
}
