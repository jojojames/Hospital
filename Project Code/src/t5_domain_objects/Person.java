package t5_domain_objects;

import t5_relations.*;


import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

public class Person extends PersonElement {
    private String userId;
    private String username;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String zip;
    private String phoneNumber;
    private String address;
    private String ECContact;
    private String ECNumber;
    protected String socialSecurity;
    private String dateOfBirth;
    private int age;
    private char sex;

    private String city;
    private int mobile;
    public Insurance insurace;
    protected int accountNumber;
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

    public Person(String userId, String username, String password, String firstName, String middleName, String lastName, String email, String zip, String phoneNumber, String address, String ECContact, String ECNumber, String socialSecurity, String dateOfBirth, int age, char sex) {

        this.userId = userId;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.ECContact = ECContact;
        this.ECNumber = ECNumber;
        this.socialSecurity = socialSecurity;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.sex = sex;

        // TODO: VERIFY THIS HASHMAP IS NEEDED.
        hashMap.put(username, this);
    }

    public String toString() {
        return "";
    }

}
