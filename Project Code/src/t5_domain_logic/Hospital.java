package t5_domain_logic;

import com.sun.deploy.config.VerboseDefaultConfig;
import t5_domain_objects.*;

import java.util.HashMap;
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
    private Vector<Bed> allBeds = new Vector<Bed>();
    private Vector<ExaminationRoom> allExamRooms = new Vector<ExaminationRoom>();
    private Vector<Office> allOffices = new Vector<Office>();
    private Vector<OperatingRoom> allOperatingRooms = new Vector<OperatingRoom>();
    private Vector<Department> allDepartments = new Vector<Department>();
    private Vector<Skills> allSkills = new Vector<Skills>();
    private Vector<Insurance> allInsurance = new Vector<Insurance>();
    private Vector<InsurancePolicy> allInsurancePolicy = new Vector<InsurancePolicy>();


    private Vector<Surgeon> allSurgeons = new Vector<Surgeon>();
    private Vector<Doctor> allDoctors = new Vector<Doctor>();
    private Vector<Head> allHeads = new Vector<Head>();
    private Vector<Nurse> allNurses = new Vector<Nurse>();

    private HashMap<String, Person> allUsers = new HashMap<String, Person>();


    private int NUM_SURGEONS = 10;
    private int NUM_DOCTORS = 10;
    private int NUM_HEADS = 10;
    private int NUM_NURSES = 10;
    private int NUM_INSURANCE_POLICY = 3;
    private int NUM_INSURANCE = 3;
    private int NUM_SKILLS = 10;
    private int NUM_DEPARTMENTS = 3;
    private int NUM_OPERATING_ROOMS = 3;
    private int NUM_OFFICES = 5;
    private int NUM_BEDS = 20;
    private int NUM_EXAM_ROOMS = 3;

    /*
    Staff Type will be as followed:
    Surgeon - 1
    Doctor  - 2
    Head    - 3
    Nurse   - 4
    */

    public Hospital() {
        build_beds();
        build_exam_rooms();
        build_offices();
        build_operating_rooms();
        hire_nurses();
        hire_surgeons();
        hire_doctors();
        hire_heads();
        build_departments();
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



    public String getUniqueUserID() {
        // Create a user id based on the count of all users. User ID is guaranteed to be unique this way.
        return String.valueOf(allUsers.size() + allSurgeons.size() +
                allDoctors.size() + allHeads.size() + allNurses.size());
    }


    private void hire_surgeons() {
        for(int i=0; i<NUM_SURGEONS; i++) {
            Surgeon newSurgeon = new Surgeon(getUniqueUserID(), i, i, i); //YearExp, DepID, SkillID
            allSurgeons.add(newSurgeon);
        }
    }

    private void hire_doctors() {
        Date doctorDate = new Date();
        for(int i = 0; i<NUM_DOCTORS; i++) {
            Doctor newDoctor = new Doctor(getUniqueUserID(), i, i, doctorDate, i); //SkillID, YearExp, HireDate, DepID
            allDoctors.add(newDoctor);
        }
    }

    private void hire_heads() {
        Date headDate = new Date();
        for(int i=0; i<NUM_HEADS; i++) {
            Head newHead = new Head(getUniqueUserID(), i, i, headDate); //YearExp, SkillID, HireDate
            allHeads.add(newHead);
        }
    }

    private void hire_nurses() {
        for(int i=0; i<NUM_NURSES; i++) {
            Nurse newNurse = new Nurse(getUniqueUserID()); //No Params
            allNurses.add(newNurse);
        }
    }

    private void build_insurance_policy() {
        for(int i=0; i<NUM_INSURANCE_POLICY; i++) {
            InsurancePolicy newInsurancePolicy = new InsurancePolicy(i, i, i, i, i); //AuthCode, DayApproved, Gnum, Pnum, Anum
            allInsurancePolicy.add(newInsurancePolicy);
        }
    }

    private void build_insurance() {
        String[] contactName = {"name1", "name2", "name3"};
        String[] providerName = {"provider1", "provider2", "provider3"};
        for(int i=0; i<NUM_INSURANCE; i++) {
            Insurance newInsurance = new Insurance(contactName[i], i, providerName[i]); //Contact, Contact#, Provider
            allInsurance.add(newInsurance);
        }
    }

    private void hire_skills() {
        for(int i=0; i<NUM_SKILLS; i++) {
            Skills newSkills = new Skills(i, i); //skill, skillID
            allSkills.add(newSkills);
        }
    }

    private void build_departments() {
        String[] departmentName = {"Dep1", "Dep2", "Dep3"};
        for(int i=0; i<NUM_DEPARTMENTS; i++) {
            Department newDepartment = new Department(departmentName[i], i, i); //Dname, DID, HID
            allDepartments.add(newDepartment);
        }
    }

    private void build_operating_rooms() {
        for(int i=0; i<NUM_OPERATING_ROOMS; i++) {
            OperatingRoom newOpRoom = new OperatingRoom(i+1); //Room Number
            allOperatingRooms.add(newOpRoom);
        }
    }

    private void build_offices() {
        for(int i=0; i<NUM_OFFICES; i++) {
            Office newOffice = new Office(i, "Placeholder", "Placeholder");
            allOffices.add(newOffice);
        }
    }

    private void build_beds() {
        for(int i=0; i<NUM_BEDS; i++) {
            Bed newBed = new Bed(i+1); // ids numbered from 1 to numBeds
            allBeds.add(newBed);
        }
    }

    private void build_exam_rooms() {
        for(int i=0; i<NUM_EXAM_ROOMS; i++) {
            ExaminationRoom newRoom = new ExaminationRoom(i, i); // use i for tools and table: placeholder
            allExamRooms.add(newRoom);
        }

    }

    public HashMap<String, Person> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(HashMap<String, Person> allUsers) {
        this.allUsers = allUsers;
    }

    public Vector<Bed> getAllBeds() {
        return allBeds;
    }

    public void setAllBeds(Vector<Bed> allBeds) {
        this.allBeds = allBeds;
    }

    public Vector<ExaminationRoom> getAllExamRooms() {
        return allExamRooms;
    }

    public void setAllExamRooms(Vector<ExaminationRoom> allExamRooms) {
        this.allExamRooms = allExamRooms;
    }

    public Vector<Office> getAllOffices() {
        return allOffices;
    }

    public void setAllOffices(Vector<Office> allOffices) {
        this.allOffices = allOffices;
    }

    public Vector<OperatingRoom> getAllOperatingRooms() {
        return allOperatingRooms;
    }

    public void setAllOperatingRooms(Vector<OperatingRoom> allOperatingRooms) {
        this.allOperatingRooms = allOperatingRooms;
    }

    public Vector<Department> getAllDepartments() {
        return allDepartments;
    }

    public void setAllDepartments(Vector<Department> allDepartments) {
        this.allDepartments = allDepartments;
    }

    public Vector<Skills> getAllSkills() {
        return allSkills;
    }

    public void setAllSkills(Vector<Skills> allSkills) {
        this.allSkills = allSkills;
    }

    public Vector<InsurancePolicy> getAllInsurancePolicy() {
        return allInsurancePolicy;
    }

    public void setAllInsurancePolicy(Vector<InsurancePolicy> allInsurancePolicy) {
        this.allInsurancePolicy = allInsurancePolicy;
    }

    public Vector<Insurance> getAllInsurance() {
        return allInsurance;
    }

    public void setAllInsurance(Vector<Insurance> allInsurance) {
        this.allInsurance = allInsurance;
    }

    public Vector<Surgeon> getAllSurgeons() {
        return allSurgeons;
    }

    public void setAllSurgeons(Vector<Surgeon> allSurgeons) {
        this.allSurgeons = allSurgeons;
    }

    public Vector<Doctor> getAllDoctors() {
        return allDoctors;
    }

    public void setAllDoctors(Vector<Doctor> allDoctors) {
        this.allDoctors = allDoctors;
    }

    public Vector<Head> getAllHeads() {
        return allHeads;
    }

    public void setAllHeads(Vector<Head> allHeads) {
        this.allHeads = allHeads;
    }

    public Vector<Nurse> getAllNurses() {
        return allNurses;
    }

    public void setAllNurses(Vector<Nurse> allNurses) {
        this.allNurses = allNurses;
    }
}
