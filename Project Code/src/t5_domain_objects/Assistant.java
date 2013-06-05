package t5_domain_objects;

import t5_relations.Doctor_Assistant;
import t5_relations.Patient_Assistant;
import t5_relations.Surgery_Assistant;

import java.util.Vector;

public class Assistant extends RPerson {

    /*
    INHERITED FROM RPerson
    ----------------------
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
    public Vector<Patient_Assistant> personAssistant = new Vector<Patient_Assistant>();
    public Skills skills;
    public Vector<Doctor_Assistant> doctorAssistant = new Vector<Doctor_Assistant>();
    public Vector<Surgery_Assistant> surgeryAssistant = new Vector<Surgery_Assistant>();
    public Surgeon surgeon;

    /**
     *
     */
    public Assistant(String userName, String password, String firstName, String lastName, String middleName,
                     String dateOfBirth, String sex, String socialSecurity,  String emailAddress, String mobilePhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.socialSecurity = socialSecurity;
        this.emailAddress = emailAddress;
        this.password = password;
        this.userName = userName;
        this.mobilePhone = mobilePhone;
    }
}
