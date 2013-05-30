package t5_main;

import t5_objects.*;

import java.util.Vector;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: james
 * Date: 5/17/13
 * Time: 6:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class HospitalInit {
    public Vector<Bed> allBeds = new Vector<Bed>();
    //public Vector<Head> allHeads = new Vector<Head>();
    public Vector<ExaminationRoom> allExamRooms = new Vector<ExaminationRoom>();
    public Vector<Nurse> allNurses = new Vector<Nurse>();
    public Vector<Office> allOffices = new Vector<Office>();
    public Vector<OperatingRoom> allOperatingRooms = new Vector<OperatingRoom>();

    // new
    public Vector<Surgeon> allSurgeons = new Vector<Surgeon>();
    public Vector<Doctor> allDoctors = new Vector<Doctor>();
    public Vector<Department> allDepartments = new Vector<Department>();
    public Vector<Head> allHeads = new Vector<Head>();
    public Vector<Skills> allSkills = new Vector<Skills>();
    public Vector<Insurance> allInsurance = new Vector<Insurance>();
    public Vector<InsurancePolicy> allInsurancePolicy = new Vector<InsurancePolicy>();





    /*
    Things Accounted For So Far
    --------------------------
    Bed - No Relations
    TODO: Surgeon -> Doctor -> Department -> Head -> Skills  [DONE]
    TODO: Insurance and InsurancePolicy [DONE]
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

        // new
        hire_surgeon();
        hire_doctor();
        build_departments();
        hire_heads();
        hire_skills();
        build_insurance();
        build_insurance_policy();

    }

    private void build_insurance_policy() {
        int numInsurancePolicy = 3;
        for(int i=0; i<numInsurancePolicy; i++) {
            InsurancePolicy newInsurancePolicy = new InsurancePolicy(i, i, i, i, i); //i is auth code, dayapproved, gnum, pnum, anum
            allInsurancePolicy.add(newInsurancePolicy);
        }
    }

    private void build_insurance() {
        int numInsurance = 3;
        String[] contactName = {"name1", "name2", "name3"};
        String[] providerName = {"provider1", "provider2", "provider3"};
        for(int i=0; i<numInsurance; i++) {
            Insurance newInsurance = new Insurance(contactName[i], i, providerName[i]); // contact, contact#, provider
            allInsurance.add(newInsurance);
        }
    }


    private void hire_skills() {
        int numSkills = 10;
        for(int i=0; i<numSkills; i++) {
            Skills newSkills = new Skills(i, i); // i describe skill? (maybe string?), skillid
            allSkills.add(newSkills);
        }
    }

    private void build_departments() {
        int numDepartments = 3;
        String[] departmentName = {"Dep1", "Dep2", "Dep3""}
        for(int i=0; i<allHeads.size(); i++) {
            Department newDepartment = new Department(departmentName[i], i, i); //use i for dname, did, hid
            allDepartments.add(newDepartment);
        }
    }

    private void hire_heads() {
        int numHeads = 10;
        Date headDate = new Date();
        for(int i=0; i<numHeads; i++) {
            Head newHead = new Head(i, i, headDate); // use i for exp, skillid, hiredate
            allHeads.add(newHead);
        }
    }

    private void hire_surgeon() {
        int numSurgeons = 10;
        for(int i=0; i<numSurgeons; i++) {
            Surgeon newSurgeon = new Surgeon(i, i, i); // use i for yearsexp, id, skillid
            allSurgeons.add(newSurgeon);
        }
    }

    private void hire_doctor() {
        int numDoctors = 10;
        Date doctorDate = new Date();
        for(int i = 0; i<numDoctors; i++) {
            Doctor newDoctor = new Doctor(i, i, doctorDate, i); // use i for skillid, exp, hiredate, departmentid,
            allDoctors.add(newDoctor);
        }
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
}
