package t5_domain_objects;

import t5_relations.*;

import java.util.Vector;

public class Patient extends RPerson {

    /*
    INHERITS THESE VARIABLES FROM RPerson
    -------------------------------------
    public String firstName;
    public String lastName;
    public String middleName;
    public String dateOfBirth;
    public String sex;
    public String socialSecurity;
    public String emailAddress;
    public String password;
    public String userName;
    public String homePhone;
    public String mobilePhone;
     */

    private String ECfirstName;
    private String EClastName;
    private String EChomePhone;
    private String ECmobilePhone;
    private String ECRelationship;
    private String insuranceProvider;
    private String insuranceAccount;
    private String state;
    private String age;
    private String zip;
    private String address;
    private String city;

    public Vector<Patient_Assistant> personAssistant = new Vector<Patient_Assistant>();
    public Vector<Patient_Doctor> personDoctor = new Vector<Patient_Doctor>();
    public Vector<Patient_Head> personHead = new Vector<Patient_Head>();
    public Vector<Patient_Nurse> patientNurse = new Vector<Patient_Nurse>();

    public Vector<Visit> visit = new Vector<Visit>();
    public Vector<Appointment> appointment = new Vector<Appointment>();
    public Vector<Patient_Surgeon> patientSurgeon = new Vector<Patient_Surgeon>();
    public Vector<Diagnosis> diagnosis = new Vector<Diagnosis>();
    public Vector<BillingStatement> billingStatement = new Vector<BillingStatement>();
    public Vector<Prescription> prescription = new Vector<Prescription>();
    public InsurancePolicy insurancePolicy;

    public Patient(String userName, String password, String firstName, String lastName,
                   String dateOfBirth, String socialSecurity, String address,
                   String city, String homePhone, String mobilePhone,
                   String emailAddress, String ECfirstName, String EClastName,
                   String EChomePhone, String ECmobilePhone,
                   String insuranceProvider, String insuranceAccount,
                   String sex, String state, String age, String middleName,
                   String ECRelationship, String zip) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.socialSecurity = socialSecurity;
        this.emailAddress = emailAddress;
        this.password = password;
        this.userName = userName;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.ECfirstName = ECfirstName;
        this.EClastName = EClastName;
        this.EChomePhone = EChomePhone;
        this.ECmobilePhone = ECmobilePhone;
        this.ECRelationship = ECRelationship;
        this.insuranceProvider = insuranceProvider;
        this.insuranceAccount = insuranceAccount;
        this.state = state;
        this.zip = zip;
        this.address = address;
        this.city = city;
    }

    public String getECfirstName() {
        return ECfirstName;
    }

    public void setECfirstName(String ECfirstName) {
        this.ECfirstName = ECfirstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEClastName() {
        return EClastName;
    }

    public void setEClastName(String EClastName) {
        this.EClastName = EClastName;
    }

    public String getEChomePhone() {
        return EChomePhone;
    }

    public void setEChomePhone(String EChomePhone) {
        this.EChomePhone = EChomePhone;
    }

    public String getECmobilePhone() {
        return ECmobilePhone;
    }

    public void setECmobilePhone(String ECmobilePhone) {
        this.ECmobilePhone = ECmobilePhone;
    }

    public String getECRelationship() {
        return ECRelationship;
    }

    public void setECRelationship(String ECRelationship) {
        this.ECRelationship = ECRelationship;
    }

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setInsuranceProvider(String insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }

    public String getInsuranceAccount() {
        return insuranceAccount;
    }

    public void setInsuranceAccount(String insuranceAccount) {
        this.insuranceAccount = insuranceAccount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
