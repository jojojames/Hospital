package t5_objects;

import java.util.Vector;

public class OperatingRoom {
    public Surgery surgery;
    public Vector<SurgicalEquipment> surgicalEquipment;
    public Ward ward;
    private int roomNumber;

    /**
     *
     * @param roomNumber
     */
    public OperatingRoom(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
