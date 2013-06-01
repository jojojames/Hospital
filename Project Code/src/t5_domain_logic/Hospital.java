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

    private HashMap<String, Person> allUsers = new HashMap<String, Person>();

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

        generate_users();

    }

    private void generate_users() {
        Person a = new Person(getUniqueUserID(), "a", "A", "1/1/92", "123-123-123", "Address", "City", "310-123-123",
                "323-123-123", "email.com", "aEC", "AEC", "123-123-123", "323-123-122", "InsuranceProvider",
                "InsuranceAccount", "aUserName", "m", "CA", "20", "Password");
        allUsers.put(a.getUserId(), a);


        Person b = new Person(getUniqueUserID(), "b", "B", "1/1/91", "223-124-123", "Address", "City", "311-123-123",
                "323-125-123", "email.com", "bEC", "BEC", "123-153-123", "323-124-122", "InsuranceProvider",
                "InsuranceAccount", "bUserName", "m", "CA", "21", "Password");
        allUsers.put(b.getUserId(), b);


        Person c = new Person(getUniqueUserID(), "c", "C", "1/1/93", "253-124-123", "Address", "City", "111-123-123",
                "326-122-123", "email.com", "cEC", "CEC", "123-753-523", "323-124-132", "InsuranceProvider",
                "InsuranceAccount", "cUserName", "m", "CA", "26", "Password");
        allUsers.put(c.getUserId(), c);

        Person d = new Person(getUniqueUserID(), "d", "D", "9/1/93", "953-924-123", "Address", "City", "191-123-123",
                "326-822-193", "email.com", "dEC", "DEC", "123-853-528", "393-124-130", "InsuranceProvider",
                "InsuranceAccount", "dUserName", "f", "CA", "29", "Password");
        allUsers.put(d.getUserId(), d);

        Person e = new Person(getUniqueUserID(), "e", "E", "9/8/93", "883-924-123", "Address", "City", "198-123-123",
                "326-822-883", "email.com", "eEC", "EEC", "123-853-828", "393-124-138", "InsuranceProvider",
                "InsuranceAccount", "eUserName", "f", "CA", "27", "Password");
        allUsers.put(e.getUserId(), e);
    }

    public HashMap<String, Person> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(HashMap<String, Person> allUsers) {
        this.allUsers = allUsers;
    }

    private String getUniqueUserID() {
        // Create a user id based on the count of all users. User ID is guaranteed to be unique this way.
        // TODO: The method isn't very good, it forces a User to be immediately added to whatever data structure before
        // TODO: creating another user. If the user isn't added after being created. On creation, the next user will
        // TODO: have the same userid as the previous user. Rewrite this so that that userid value will always be unique.
        return String.valueOf(allUsers.size() + staff.size() + 1);
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
