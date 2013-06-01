package t5_domain_logic;

import t5_domain_objects.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: james
 * Date: 5/17/13
 * Time: 6:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Hospital {
    public Vector<Bed> allBeds = new Vector<Bed>();
    public Vector<ExaminationRoom> allExamRooms = new Vector<ExaminationRoom>();
    public Vector<Office> allOffices = new Vector<Office>();
    public Vector<OperatingRoom> allOperatingRooms = new Vector<OperatingRoom>();
    public Vector<Department> allDepartments = new Vector<Department>();
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

    Staff Type will be as followed:
    Surgeon - 1
    Doctor  - 2
    Head    - 3
    Nurse   - 4
    */

    HashMap<Integer, Object> staff = new HashMap<Integer, Object>();

    public Hospital() {
        build_beds();
        build_exam_rooms();
        build_offices();
        build_operating_rooms();
        hire_nurses();
        hire_surgeon();
        hire_doctor();
        build_departments();
        hire_heads();
        hire_skills();
        build_insurance();
        build_insurance_policy();

    }

    private void hire_surgeon() {
        int numSurgeons = 10;
        for(int i=0; i<numSurgeons; i++) {
            Surgeon newSurgeon = new Surgeon(i, i, i); //YearExp, DepID, SkillID
            staff.put(1,newSurgeon);
        }
    }

    private void hire_doctor() {
        int numDoctors = 10;
        Date doctorDate = new Date();
        for(int i = 0; i<numDoctors; i++) {
            Doctor newDoctor = new Doctor(i, i, doctorDate, i); //SkillID, YearExp, HireDate, DepID
            staff.put(2,newDoctor);
        }
    }

    private void hire_heads() {
        int numHeads = 10;
        Date headDate = new Date();
        for(int i=0; i<numHeads; i++) {
            Head newHead = new Head(i, i, headDate); //YearExp, SkillID, HireDate
            staff.put(3,newHead);
        }
    }

    private void hire_nurses() {
        int numNurses = 10;
        for(int i=0; i<numNurses; i++) {
            Nurse newNurse = new Nurse(); //No Params
            staff.put(4,newNurse);
        }
    }

    private void build_insurance_policy() {
        int numInsurancePolicy = 3;
        for(int i=0; i<numInsurancePolicy; i++) {
            InsurancePolicy newInsurancePolicy = new InsurancePolicy(i, i, i, i, i); //AuthCode, DayApproved, Gnum, Pnum, Anum
            allInsurancePolicy.add(newInsurancePolicy);
        }
    }

    private void build_insurance() {
        int numInsurance = 3;
        String[] contactName = {"name1", "name2", "name3"};
        String[] providerName = {"provider1", "provider2", "provider3"};
        for(int i=0; i<numInsurance; i++) {
            Insurance newInsurance = new Insurance(contactName[i], i, providerName[i]); //Contact, Contact#, Provider
            allInsurance.add(newInsurance);
        }
    }

    private void hire_skills() {
        int numSkills = 10;
        for(int i=0; i<numSkills; i++) {
            Skills newSkills = new Skills(i, i); //skill, skillID
            allSkills.add(newSkills);
        }
    }

    private void build_departments() {
        int numDepartments = 3;
        String[] departmentName = {"Dep1", "Dep2", "Dep3"};
        for(int i=0; i<staff.size(); i++) {
            Department newDepartment = new Department(departmentName[i], i, i); //Dname, DID, HID
            allDepartments.add(newDepartment);
        }
    }

    private void build_operating_rooms() {
        int numOpRooms = 3;
        for(int i=0; i<numOpRooms; i++) {
            OperatingRoom newOpRoom = new OperatingRoom(i+1); //Room Number
            allOperatingRooms.add(newOpRoom);
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
