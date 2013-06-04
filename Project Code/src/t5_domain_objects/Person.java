package t5_domain_objects;

import t5_relations.*;


import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

public class Person extends PersonElement {
    private String userId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String dateOfBirth;
    private String socialSecurity;
    private String address;
    private String city;
    private String homePhone;
    private String mobilePhone;
    private String emailAddress;
    private String ECfirstName;
    private String EClastName;
    private String EChomePhone;
    private String ECmobilePhone;
    private String ECRelationship;
    private String insuranceProvider;
    private String insuranceAccount;
    private String userName;
    private String sex;
    private String state;
    private String age;
    private String password;
    private String zip;

    public Vector<Person_Assistant> personAssistant = new Vector<Person_Assistant>();
    public Vector<Person_Nurse> personNurse = new Vector<Person_Nurse>();
    public Vector<Person_Doctor> personDoctor = new Vector<Person_Doctor>();
    public Vector<Person_Surgeon> personSurgeon = new Vector<Person_Surgeon>();
    public Vector<Person_Head> personHead = new Vector<Person_Head>();
    public Vector<Person_Patient> personPatient = new Vector<Person_Patient>();

    public static HashMap<String, Person> hashMap = new HashMap<String, Person>();

    public Person() {

    }



    // TODO: @param VALUES ARE OUTDATED, UPDATE THEM

    /**
     * @param userid            Person's created userid
     * @param password          Person's created password
     * @param middleName        person's middle name
     * @param firstName         person's first name
     * @param city              person's city
     * @param lastName          person's last name
     * @param ECfirstName       person's emergency contact first name
     * @param username          person's username
     * @param email             person's email
     * @param sex               person's sex
     * @param zip               person's zip code
     * @param mobile            person's mobile number
     * @param home              person's home number
     * @param phone             person's phone number
     * @param address           person's address
     * @param age               person's age
     */

    public Person(String userId, String firstName, String lastName, 
            String dateOfBirth, String socialSecurity, String address, 
            String city, String homePhone, String mobilePhone, 
            String emailAddress, String ECfirstName, String EClastName, 
            String EChomePhone, String ECmobilePhone, 
            String insuranceProvider, String insuranceAccount, String userName, 
            String sex, String state, String age, String password,String middleName,
            String ECRelationship, String zip) {

        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.socialSecurity = socialSecurity;
        this.address = address;
        this.city = city;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.emailAddress = emailAddress;
        this.ECfirstName = ECfirstName;
        this.EClastName = EClastName;
        this.EChomePhone = EChomePhone;
        this.ECmobilePhone = ECmobilePhone;
        this.insuranceProvider = insuranceProvider;
        this.insuranceAccount = insuranceAccount;
        this.userName = userName;
        this.sex = sex;
        this.state = state;
        this.age = age;
        this.password = password;
        this.middleName = middleName;
        this.ECRelationship = ECRelationship;
        this.zip = zip;

        // TODO: VERIFY THIS HASHMAP IS NEEDED.
        hashMap.put(firstName, this);
    }

    public String toString() {
        return "";
    }

    // Getters and Setters
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {

        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getECfirstName() {
        return ECfirstName;
    }

    public void setECfirstName(String ECfirstName) {
        this.ECfirstName = ECfirstName;
    }

    public String getEClastName() {
        return EClastName;
    }

    public void setEClastName(String EClastName) {
        this.EClastName = EClastName;
    }

    public String getECmobilePhone() {
        return ECmobilePhone;
    }

    public void setECmobilePhone(String ECmobilePhone) {
        this.ECmobilePhone = ECmobilePhone;
    }

    public String getEChomePhone() {
        return EChomePhone;
    }

    public void setEChomePhone(String EChomePhone) {
        this.EChomePhone = EChomePhone;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
