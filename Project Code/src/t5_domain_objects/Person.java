package t5_domain_objects;

import t5_relations.*;


import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

public class Person extends PersonElement {
    private String userId;
    private String firstName;
    private String lastName;
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
    private String insuranceProvider;
    private String insuranceAccount;
    private String userName;
    private String sex;
    private String state;
    private String age;
    private String password;

    public Vector<Person_Assistant> personAssistant = new Vector<Person_Assistant>();
    public Vector<Person_Nurse> personNurse = new Vector<Person_Nurse>();
    public Vector<Person_Doctor> personDoctor = new Vector<Person_Doctor>();
    public Vector<Person_Surgeon> personSurgeon = new Vector<Person_Surgeon>();
    public Vector<Person_Head> personHead = new Vector<Person_Head>();
    public Vector<Person_Patient> personPatient = new Vector<Person_Patient>();

    public static HashMap<String, Person> hashMap = new HashMap<String, Person>();

    public Person() {

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

    public void setUserId(String userId) {
        this.userId = userId;
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
            String sex, String state, String age, String password) {

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

        // TODO: VERIFY THIS HASHMAP IS NEEDED.
        hashMap.put(userName, this);
    }

    public String toString() {
        return "";
    }

}
