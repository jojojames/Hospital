package OOD;

import java.util.Vector;

public class OperatingRoom {
    public Surgery surgery;
    public Vector surgicalEquipment;
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
