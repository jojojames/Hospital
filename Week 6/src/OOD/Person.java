package OOD;

import java.util.Date;
import java.util.Vector;

public class Person {
    private String password;
    private String middleName;
    protected int socialSecurity;
    private Date dateOfBirth;
    public Vector personPatient = new Vector();
    private String ECrelationship;
    private String firstName;
    private String city;
    public Vector personHead = new Vector();
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
    public Vector personAssistant = new Vector();
    private String EClastName;
    private String ECmiddleName;
    public Vector personNurse = new Vector();
    public Vector personDoctor = new Vector();
    public Vector personSurgeon = new Vector();
    private int EChomeNumber;

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
    }

    /**
     *
      * @param args
     */
    public static void main(String[] args){
    	System.out.println("Compiled Successfully");
    }
}
