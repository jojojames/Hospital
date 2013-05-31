package t5_domain_objects;

import t5_relations.*;


import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

public class Person extends PersonElement {
    private String password;
    private String middleName;
    protected int socialSecurity;
    private Date dateOfBirth;
    private String ECrelationship;
    private String firstName;
    private String city;
    private String lastName;
    private String ECfirstName;
    private String username;
    private String email;
    private char sex;
    private String zip;
    private int mobile;
    private int home;
    public Insurance insurace;
    private int phone;
    private int address;
    protected int accountNumber;
    private int age;
    private int ECmobileNumber;
    protected int idNumber;
    private String EClastName;
    private String ECmiddleName;
    private int EChomeNumber;
    public Vector<Person_Assistant> personAssistant = new Vector<Person_Assistant>();
    public Vector<Person_Nurse> personNurse = new Vector<Person_Nurse>();
    public Vector<Person_Doctor> personDoctor = new Vector<Person_Doctor>();
    public Vector<Person_Surgeon> personSurgeon = new Vector<Person_Surgeon>();
    public Vector<Person_Head> personHead = new Vector<Person_Head>();
    public Vector<Person_Patient> personPatient = new Vector<Person_Patient>();

    public static HashMap<String, Person> hashMap = new HashMap<String, Person>();

    public Person(){

    }
    /**
     *
     * @param password          Person's created password
     * @param middleName        person's middle name
     * @param ECrelationship    person's emergency contact relationship
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
     * @param ECmobileNumber    person's emergency contact mobile number
     * @param EClastName        person's emergency contact last name
     * @param ECmiddleName      person's emergency contact middle name
     * @param EChomeNumber      person's emergency contact home number
     */
    public Person(String password, String middleName, String ECrelationship, String firstName, String city, String lastName, String ECfirstName, String username, String email, char sex, String zip, int mobile, int home, 
                  int phone, int address, int age, int ECmobileNumber, String EClastName, String ECmiddleName, int EChomeNumber) {
        this.password = password;
        this.middleName = middleName;
        this.firstName = firstName;
        this.city = city;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.sex = sex;
        this.zip = zip;
        this.mobile = mobile;
        this.home = home;
        this.phone = phone;
        this.address = address;
        this.age = age;
        this.ECrelationship = ECrelationship;
        this.ECfirstName = ECfirstName;
        this.ECmobileNumber = ECmobileNumber;
        this.EClastName = EClastName;
        this.ECmiddleName = ECmiddleName;
        this.EChomeNumber = EChomeNumber;

        hashMap.put(username, this);
    }

    public String toString(){
        return "";
    }

}
