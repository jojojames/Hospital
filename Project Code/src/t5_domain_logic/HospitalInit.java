package t5_domain_logic;

import t5_domain_objects.*;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: james
 * Date: 5/17/13
 * Time: 6:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class HospitalInit {
    public Vector<Bed> allBeds = new Vector<Bed>();
    public Vector<Head> allHeads = new Vector<Head>();
    public Vector<ExaminationRoom> allExamRooms = new Vector<ExaminationRoom>();
    public Vector<Nurse> allNurses = new Vector<Nurse>();
    public Vector<Office> allOffices = new Vector<Office>();
    public Vector<OperatingRoom> allOperatingRooms = new Vector<OperatingRoom>();


    /*
    Things Accounted For So Far
    --------------------------
    Bed - No Relations
    TODO: Surgeon -> Doctor -> Department -> Head -> Skills [Fix]
    TODO: Insurance and InsurancePolicy
    ExaminationRoom: Need Relation: Doctor_ExaminationRoom
    Nurse: Need Surgeon, Department, Doctor + Relations: Patient_Nurse, Surgery_Nurse, Person_Nurse
    Office: Need Surgeon and Doctor
    Operating Rooms: Need Surgical Equipments

     */

    public HospitalInit() {
        build_beds();
        build_exam_rooms();
        build_offices();
        build_operating_rooms();
        hire_nurses();
    }

    private void build_operating_rooms() {
        int numOpRooms = 3;
        for(int i=0; i<numOpRooms; i++) {
            OperatingRoom newOpRoom = new OperatingRoom(i+1); // use i as the room number
            allOperatingRooms.add(newOpRoom);
        }
    }

    private void hire_nurses() {
        int numNurses = 10;
        for(int i=0; i<numNurses; i++) {
            Nurse newNurse = new Nurse(); // Nurse has an empty constructor? FIX?
            allNurses.add(newNurse);
        }
    }

    private void hire_heads() {
        int numHeads = 3;
        for(int i=0; i<numHeads; i++) {
            // CAN'T MAKE HEAD WITHOUT SKILL ID
            //Head newHead = new Head(i+1, ,);

            //public Head(int yearsOfExperience, int skillID, Date hiredDate) {
        }
    }

    private void build_offices() {
        int numOffice = 5;
        for(int i=0; i<numOffice; i++) {
            Office newOffice = new Office(i, "Placeholder", "Placeholder");
            allOffices.add(newOffice);
        }
    }

    private void build_beds() {
        int numBeds = 20;
        for(int i=0; i<numBeds; i++) {
            Bed newBed = new Bed(i+1); // ids numbered from 1 to numBeds
            allBeds.add(newBed);
        }
    }

    private void build_exam_rooms() {
        int numExamRooms = 3;
        for(int i=0; i<numExamRooms; i++) {
            ExaminationRoom newRoom = new ExaminationRoom(i, i); // use i for tools and table: placeholder
            allExamRooms.add(newRoom);
        }

    }

    private void build_departments() {
        int numDepartments = 3; // not used for now
        // CANT MAKE DEPARTMENT WITHOUT HEAD
        for(int i=0; i<allHeads.size(); i++) {

        }
    }

}
