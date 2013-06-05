package t5_domain_logic;

import com.sun.deploy.config.VerboseDefaultConfig;
import t5_domain_objects.*;

import java.util.HashMap;
import java.util.Vector;
import java.util.Date;


// test

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


    // TODO: REMOVE ANY CODE THAT USES THESE VECTORS AND REPLACE THEM WITH THE ALLUSER HASHMAP
    private Vector<Surgeon> allSurgeons = new Vector<Surgeon>();
    private Vector<Doctor> allDoctors = new Vector<Doctor>();
    private Vector<Head> allHeads = new Vector<Head>();
    private Vector<Nurse> allNurses = new Vector<Nurse>();

    private HashMap<String, Person> allUsers = new HashMap<String, Person>();
    private HashMap<String, Person> allStaff = new HashMap<String, Person>();


    private int NUM_INSURANCE_POLICY = 3;
    private int NUM_INSURANCE = 3;
    private int NUM_SKILLS = 10;
    private int NUM_DEPARTMENTS = 3;
    private int NUM_OPERATING_ROOMS = 3;
    private int NUM_OFFICES = 5;
    private int NUM_BEDS = 20;
    private int NUM_EXAM_ROOMS = 3;
    private int NUM_ROOMS = 30;

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
        build_rooms();

        generate_users();

    }

    private void generate_users() {
        Person a = new Patient("a", "password", "a", "A", "1/1/92", "123-123-123", "Address", "City", "310-123-123",
                "323-123-123", "email.com", "aEC", "AEC", "123-123-123", "323-123-122", "InsuranceProvider",
                "InsuranceAccount", "m", "CA", "20", "middle","spouse","95112");
        allUsers.put(a.getUserName(), a);

        Person b = new Patient("b", "password", "b", "B", "1/1/91", "223-124-123", "Address", "City", "311-123-123",
                "323-125-123", "email.com", "bEC", "BEC", "123-153-123", "323-124-122", "InsuranceProvider",
                "InsuranceAccount", "m", "CA", "21", "middle","spouse","95112");
        allUsers.put(b.getUserName(), b);

        Person c = new Patient("c", "password", "c", "C", "1/1/93", "253-124-123", "Address", "City", "111-123-123",
                "326-122-123", "email.com", "cEC", "CEC", "123-753-523", "323-124-132", "InsuranceProvider",
                "InsuranceAccount", "m", "CA", "26", "middle","spouse","95112");
        allUsers.put(c.getUserName(), c);

        Person d = new Patient("d", "password", "d", "D", "9/1/93", "953-924-123", "Address", "City", "191-123-123",
                "326-822-193", "email.com", "dEC", "DEC", "123-853-528", "393-124-130", "InsuranceProvider",
                "InsuranceAccount", "f", "CA", "29", "middle","spouse","95112");
        allUsers.put(d.getUserName(), d);

        Person e = new Patient("e", "password", "e", "E", "9/8/93", "883-924-123", "Address", "City", "198-123-123",
                "326-822-883", "email.com", "eEC", "EEC", "123-853-828", "393-124-138", "InsuranceProvider",
                "InsuranceAccount", "f", "CA", "27", "middle","spouse","95112");
        allUsers.put(e.getUserName(), e);
    }

    public String getUniqueUserID() {
        // Create a user id based on the count of all users. User ID is guaranteed to be unique this way.
        return String.valueOf(allUsers.size() + allSurgeons.size() +
                allDoctors.size() + allHeads.size() + allNurses.size());
    }

    private void hire_surgeons() {

        /*
        public Surgeon(String userName, String password, String firstName, String lastName, String middleName,
                String dateOfBirth, String sex, String socialSecurity,  String emailAddress, String mobilePhone,
        int yearsOfExperiance, int departmentID, int skillID);
                */
        Person aSurgeon = new Surgeon("aSurgUser", "aSurPW", "surgFirstName", "surgLastName", "surgMiddleName",
                "surgDateOfBirth", "m", "social102323", "surg@email.com", "102302", 5, 3, 1);
        Person bSurgeon = new Surgeon("bSurgUser", "bSurPW", "surgFirstNbme", "surgLbstNbme", "surgMiddleNbme",
                "surgDbteOfBirth", "m", "socibl102323", "surg@embil.com", "102302", 5, 3, 1);
        Person cSurgeon = new Surgeon("cSurgUser", "cSurPW", "surgFirstNcme", "surgLcstNcme", "surgMiddleNcme",
                "surgDcteOfBirth", "m", "socicl102323", "surg@emcil.com", "102302", 5, 3, 1);
        Person dSurgeon = new Surgeon("dSurgUser", "dSurPW", "surgFirstNdme", "surgLdstNdme", "surgMiddleNdme",
                "surgDdteOfBirth", "m", "sodidl102323", "surg@emdil.dom", "102302", 5, 3, 1);
        Person eSurgeon = new Surgeon("eSurgUser", "eSurPW", "surgFirstNeme", "surgLestNeme", "surgMieeleNeme",
                "surgDeteOfBirth", "m", "soeiel102323", "surg@emeil.eom", "102302", 5, 3, 1);
        Person fSurgfon = new Surgeon("fSurgUsfr", "fSurPW", "surgFirstNfmf", "surgLfstNfmf", "surgMifflfNfmf",
                "surgDftfOfBirth", "m", "sofifl102323", "surg@fmfil.fom", "102302", 5, 3, 1);

        allStaff.put(aSurgeon.getUserName(), aSurgeon);
        allStaff.put(bSurgeon.getUserName(), bSurgeon);
        allStaff.put(cSurgeon.getUserName(), cSurgeon);
        allStaff.put(dSurgeon.getUserName(), dSurgeon);
        allStaff.put(eSurgeon.getUserName(), eSurgeon);
        allStaff.put(fSurgfon.getUserName(), fSurgfon);

    }

    private void hire_doctors() {
        /*
        public Doctor(String userName, String password, String firstName, String lastName, String middleName,
                String dateOfBirth, String sex, String socialSecurity,  String emailAddress, String mobilePhone,
        int skillId, int yearsOfExperience, Date hiredDate, int departmentID) {
        */

        Person aDoc = new Doctor("aDoc", "aDocPass", "adoc", "doclast", "docmiddle",
                "dateof", "m", "social", "doc@email", "mobile1232", 2, 1, "3", 3);
        Person bDoc = new Doctor("bDoc", "bDocPbss", "bdoc", "doclbst", "docmiddle",
                "dbteof", "m", "socibl", "doc@embil", "mobile1232", 2, 1, "3", 3);
        Person cDoc = new Doctor("cDoc", "cDocPcss", "cdoc", "doclcst", "docmiddle",
                "dcteof", "m", "socicl", "doc@emcil", "mobile1232", 2, 1, "3", 3);
        Person dDoc = new Doctor("dDoc", "dDocPdss", "ddoc", "docldst", "docmiddle",
                "ddteof", "m", "socidl", "doc@emdil", "mobile1232", 2, 1, "3", 3);
        Person eDoc = new Doctor("eDoc", "eDocPess", "edoc", "doclest", "docmiddle",
                "deteof", "m", "sociel", "doc@emeil", "mobile1232", 2, 1, "3", 3);
        Person fDoc = new Doctor("fDoc", "fDocPfss", "fdoc", "doclfst", "docmiddle",
                "dfteof", "m", "socifl", "doc@emfil", "mobile1232", 2, 1, "3", 3);
        Person zDoc = new Doctor("zDoc", "zDocPzss", "zdoc", "doclzst", "docmiddle",
                "dzteof", "m", "socizl", "doc@emzil", "mobile1232", 2, 1, "3", 3);
        allStaff.put(aDoc.getUserName(), aDoc);
        allStaff.put(bDoc.getUserName(), bDoc);
        allStaff.put(cDoc.getUserName(), cDoc);
        allStaff.put(dDoc.getUserName(), dDoc);
        allStaff.put(eDoc.getUserName(), eDoc);
        allStaff.put(fDoc.getUserName(), fDoc);
        allStaff.put(zDoc.getUserName(), zDoc);
    }

    private void hire_heads() {
        /*
        public Head(String userName, String password, String firstName, String lastName, String middleName,
                String dateOfBirth, String sex, String socialSecurity,  String emailAddress, String mobilePhone,
        int yearsOfExperience, int skillID, String hiredDate) {
                */

        Person aHead = new Head("aHeadusername", "aHeadpassword", "aHeadname", "aHeadLast", "aHeadMid",
                "dateofbirth", "m", "social", "email@email", "mobile", 3, 3, "1");
        Person bHebd = new Head("bHebdusernbme", "bHebdpbssword", "bHebdnbme", "bHebdLbst", "bHebdMid",
                "dbteofbirth", "m", "socibl", "embil@embil", "mobile", 3, 3, "1");
        Person cHecd = new Head("cHecduserncme", "cHecdpcssword", "cHecdncme", "cHecdLcst", "cHecdMid",
                "dcteofbirth", "m", "socicl", "emcil@emcil", "mobile", 3, 3, "1");
        Person dHedd = new Head("dHedduserndme", "dHeddpdssword", "dHeddndme", "dHeddLdst", "dHeddMid",
                "ddteofbirth", "m", "socidl", "emdil@emdil", "mobile", 3, 3, "1");
        Person eHeed = new Head("eHeeduserneme", "eHeedpessword", "eHeedneme", "eHeedLest", "eHeedMid",
                "deteofbirth", "m", "sociel", "emeil@emeil", "mobile", 3, 3, "1");
        Person fHefd = new Head("fHefdusernfme", "fHefdpfssword", "fHefdnfme", "fHefdLfst", "fHefdMid",
                "dfteofbirth", "m", "socifl", "emfil@emfil", "mobile", 3, 3, "1");

        allStaff.put(aHead.getUserName(), aHead);
        allStaff.put(bHebd.getUserName(), bHebd);
        allStaff.put(cHecd.getUserName(), cHecd);
        allStaff.put(dHedd.getUserName(), dHedd);
        allStaff.put(eHeed.getUserName(), eHeed);
        allStaff.put(fHefd.getUserName(), fHefd);
    }

    private void hire_nurses() {
        /*
        public Nurse(String userName, String password, String firstName, String lastName, String middleName,
                 String dateOfBirth, String sex, String socialSecurity,  String emailAddress, String mobilePhone
         */

        Person aNurse = new Nurse("nurseUserName", "nusrePass", "nusrename", "nurselast", "nursemiddle",
                "dateofb", "f", "asdfadfsocial", "email", "1212");
        Person bNurse = new Nurse("nurseUserNbme", "nusrePbss", "nusrenbme", "nurselbst", "nursemiddle",
                "dbteofb", "f", "bsdfbdfsocibl", "embil", "1212");
        Person cNurse = new Nurse("nurseUserNcme", "nusrePcss", "nusrencme", "nurselcst", "nursemiddle",
                "dcteofb", "f", "csdfcdfsocicl", "emcil", "1212");
        Person dNurse = new Nurse("nurseUserNdme", "nusrePdss", "nusrendme", "nurseldst", "nursemiddle",
                "ddteofb", "f", "dsdfddfsocidl", "emdil", "1212");
        Person eNurse = new Nurse("nurseUserNeme", "nusrePess", "nusreneme", "nurselest", "nursemiddle",
                "deteofb", "f", "esdfedfsociel", "emeil", "1212");
        Person fNurse = new Nurse("nurseUserNfme", "nusrePfss", "nusrenfme", "nurselfst", "nursemiddle",
                "dfteofb", "f", "fsdffdfsocifl", "emfil", "1212");

        allStaff.put(aNurse.getUserName(), aNurse);
        allStaff.put(bNurse.getUserName(), bNurse);
        allStaff.put(cNurse.getUserName(), cNurse);
        allStaff.put(dNurse.getUserName(), dNurse);
        allStaff.put(eNurse.getUserName(), eNurse);
        allStaff.put(fNurse.getUserName(), fNurse);
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

    private void build_rooms(){
        int[] roomNum = {101,102,103,104,105,106,107,108,109,110,
        201,202,203,204,205,206,207,208,209,210,
        301,302,303,304,305,306,307,308,309,310};
        for(int i=0; i<NUM_ROOMS;i++){
            Room room = new Room(roomNum[i]);
        }
    }

    private void build_departments() {
        String[] departmentName = {"Accident and Emergency", "Anaesthetics", "Breast screening","Cardiology","Chaplaincy",
                "Critical care","Diagnostic imaging","Discharge lounge","Ear nose and throat (ENT)","Elderly services department",
                "Gastroenterology","General surgery","Gynaecology","Haematology","Maternity departments","Microbiology","Neonatal unit",
                "Nephrology","Neurology","Nutrition and dietetics","Obstetrics and gynaecology units","Occupational therapy",
                "Oncology","Ophthalmology","Orthopaedics","Pain management clinics","Pharmacy","Physiotherapy","Radiotherapy",
                "Renal unit","Rheumatology","Sexual health (genitourinary medicine)","Urology"};
        for(int i=0; i<departmentName.length; i++) {
            Department newDepartment = new Department(departmentName[i]); //Dname
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
