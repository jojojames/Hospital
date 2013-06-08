package t5_domain_objects;

import java.util.HashMap;

public class Room {
    public Ward ward;
    private String reasonForNewRoom;
    private int roomNum;
    private int newRoom;

    /**
     *
     * @param reasonForNewRoom
     * @param roomNum
     * @param newRoom
     */
    public Room(String reasonForNewRoom, int roomNum, int newRoom) {
        this.reasonForNewRoom = reasonForNewRoom;
        this.roomNum = roomNum;
        this.newRoom = newRoom;
    }

    public Room(int roomNum){
        this.roomNum = roomNum;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public int getNewRoom() {
        return newRoom;
    }

    public void setNewRoom(int newRoom) {
        this.newRoom = newRoom;
    }

    public String getReasonForNewRoom() {
        return reasonForNewRoom;
    }

    public void setReasonForNewRoom(String reasonForNewRoom) {
        this.reasonForNewRoom = reasonForNewRoom;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

}
