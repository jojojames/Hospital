package t5_presentation_layer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import t5_domain_logic.Hospital;
import t5_domain_objects.*;

/**
* Created with IntelliJ IDEA.
* User: james
* Date: 6/1/13
* Time: 7:00 PM
* To change this template use File | Settings | File Templates.
*/

public class AdminPage implements ActionListener {
    private JPanel panel1;
    private JTextField searchTextField;
    private JButton searchButton;
    private JButton logoutButton;
    private JTabbedPane adminPage_tabbedPane;
    private JTextField newPatient_lastName;
    private JTextField newPatient_firstName;
    private JTextField mITextField;
    private JComboBox newPatient_physicianComboBox;
    private JTextField newPatient_insuranceProvider;
    private JTextField newPatient_accountNumber;
    private JComboBox newPatient_sexComboBox;
    private JTextField newPatient_age;
    private JTextField newPatient_socialSecurity;
    private JTextField newPatient_ECmobileNumber;
    private JTextField newPatient_EChomeNumber;
    private JTextField relationshipTextField;
    private JTextField newPatient_ECfirstName;
    private JTextField newPatient_EClastName;
    private JTextField newPatient_emailAddress;
    private JTextField newPatient_mobilePhone;
    private JTextField newPatient_homePhone;
    private JTextField newPatient_zip;
    private JTextField newPatient_city;
    private JTextField newPatient_address;
    private JButton newPatient_createPatientButton;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JTextField admitPatient_admissionReason;
    private JTextField emergencyContactTextField;
    private JTextField admitPatient_ECaddress;
    private JTextField homePhoneTextField1;
    private JTextField mobilePhoneTextField1;
    private JTextField emailTextField1;
    private JButton admitPatient_admitButton;
    private JTextPane admitPatient_comments;
    private JTabbedPane adminPatientServices_tabbedPane;
    private JFormattedTextField roomChange_patientID;

    private JPanel adminPagePanel;
    private JTextField newPatient_DOB;
    private JTextField roomChange_firstName;
    private JTextField roomChange_lastName;
    private JComboBox roomChange_newRoomComboBox;
    private JTextField roomChange_roomNumber;
    private JTextArea roomChange_reason;
    private JTextField scheduleSurgery_patientName;
    private JTextField scheduleSurgery_patientAddress;
    private JTextField scheduleSurgery_dateOfBirth;
    private JTextField scheduleSurgery_homePhone;
    private JTextField scheduleSurgery_mobilePhone;
    private JTextField scheduleSurgery_procedureCode;
    private JTextField scheduleSurgery_diagnosisCode;
    private JTextField scheduleSurgery_surgeryDate;
    private JTextArea scheduleSurgery_comments;
    private JComboBox scheduleSurgery_attnPhysicianComboBox;
    private JComboBox scheduleSurgery_primPhysicianComboBox;
    private JComboBox scheduleSurgery_nurseComboBox;
    private JTextField scheduleSurgery_insProvider;
    private JTextField scheduleSurgery_policyNumber;
    private JTextField scheduleSurgery_groupNumber;
    private JTextField scheduleSurgery_subscriberName;
    private JTextField scheduleSurgery_insPhone;
    private JTextField scheduleSurgery_authorizationNum;
    private JTextField scheduleSurgery_daysApproved;
    private JTextField scheduleSurgery_insContact;
    private JButton scheduleSurgeryButton;
    private JButton clearButton;
    private JButton cancelButton;
    private JTextField scheduleSurgery_procedure;
    private JButton submitRoomChangeButton;
    private JTextField viewSurgeries_patientID;
    private JButton viewSurgery_scheduleSurgeryButton;
    private JTable viewSurgery_surgeryHistoryTable;
    private JTable viewSurgery_surgeryScheduleTable;
    private JComboBox emailPatient_patientComboBox;
    private JButton addPatientButton;
    private JTextField emailPatient_recipientEmail;
    private JTextField emailPatient_ccAddress;
    private JTextField emailPatient_bccAddress;
    private JTextField emailPatient_emailSubject;
    private JButton sendMessageButton;
    private JTree tree1;
    private JTextArea emailPatient_emailMessage;
    private JComboBox comboBox7;
    private JComboBox comboBox8;
    private JComboBox comboBox10;
    private JComboBox comboBox11;
    private JComboBox comboBox9;
    private JComboBox comboBox12;
    private JComboBox comboBox13;
    private JComboBox comboBox14;
    private JComboBox comboBox15;
    private JComboBox comboBox16;
    private JButton addToOrderButton;
    private JButton addToOrderButton1;
    private JButton addToOrderButton2;
    private JButton addToOrderButton3;
    private JButton addToOrderButton4;
    private JComboBox comboBox17;
    private JComboBox comboBox18;
    private JComboBox comboBox19;
    private JComboBox comboBox20;
    private JComboBox comboBox21;
    private JButton sendOrderRequestButton;
    private JTable table1;
    private JComboBox newPatient_stateComboBox;
    private JButton admitPatient_findButton;
    private JComboBox patientcomboBox2;
    private JTextField firstNameTextField2;
    private JTextField lastNameTextField2;
    private JTextField emailTextField;
    private JTextField phoneNumberTextField;
    private JTextField addressTextField2;
    private JTextField cityTextField1;
    private JTextField stateTextField;
    private JTextField patientCheck_patientUserName;
    private JTextField patientCheck_firstName;
    private JTextField patientCheck_lastName;
    private JTextField scheduleSurgery_guarantor;
    private JComboBox newPatient_ECrelationComboBox;

    JPanel contentPane;
    Patient p;
    Hospital hospital = new Hospital();


    public AdminPage(JPanel _contentPane) {
        this.contentPane = _contentPane;

        /*

        // TODO: CAN PULL INFO FROM STAFF HASHMAP NOW
        //populate patient combobox
        for(Object o: hospital.getAllUsers().keySet())
            patientcomboBox2.addItem(o);

        //location/department combobox
        for(Object o: Department.hashMap.keySet())
            comboBox3.addItem(o);

        //Room number combobox
        for(Object o: Room.hashMap.keySet())
            comboBox4.addItem(o);

        //Doctor combobox
        for(Object o: Doctor.hashMap.keySet())
            comboBox5.addItem(o);

        */



        viewSurgery_scheduleSurgeryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminPatientServices_tabbedPane.setSelectedIndex(1);
            }
        });

        //button listener
        logoutButton.addActionListener(this);
        newPatient_createPatientButton.addActionListener(this);
        admitPatient_findButton.addActionListener(this);
    }

    public JPanel getAdminPagePanel() {
        return adminPagePanel;
    }

    public void setAdminPagePanel(JPanel adminPagePanel) {
        this.adminPagePanel = adminPagePanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        String nFirstName = newPatient_firstName.getText();
        String nLastName = newPatient_lastName.getText();
        String nMiddleName = mITextField.getText();
        String nDOB = newPatient_DOB.getText();
        String nAge = newPatient_age.getText();
        String nSSN = newPatient_socialSecurity.getText();
        String nAddress = newPatient_address.getText();
        String nCity = newPatient_city.getText();
        String nZip = newPatient_zip.getText();
        String nHomePhone = newPatient_homePhone.getText();
        String nMobilePhone = newPatient_mobilePhone.getText();
        String nEmail = newPatient_emailAddress.getText();
        String nECFirstName = newPatient_ECfirstName.getText();
        String nECLastName = newPatient_EClastName.getText();
        String nECRelationship = relationshipTextField.getText();
        String nECHomePhone = newPatient_EChomeNumber.getText();
        String nECMobilePhone = newPatient_ECmobileNumber.getText();
        String nInsuranceProvider = newPatient_insuranceProvider.getText();
        String nInsuranceAccountNum = newPatient_accountNumber.getText();
        String nBody = admitPatient_comments.getText();

        if(cmd.equals("Logout")){
            CardLayout c1 = (CardLayout) contentPane.getLayout();
            c1.show(contentPane,"Login Page");
        }

        if(cmd.equals("Create Patient")){
            //add new patient
            Person g = new Patient("PLACEHOLDER_USERNAME", "PLACHOLDER_PASSWORD", nFirstName, nLastName, nDOB,
                    nSSN, nAddress, nCity, nHomePhone, nMobilePhone, nEmail, nECFirstName, nECLastName, nECHomePhone,
                    nECMobilePhone, nInsuranceProvider, nInsuranceAccountNum, newPatient_sexComboBox.getSelectedItem().toString(),
                    newPatient_stateComboBox.getSelectedItem().toString(), nAge, nMiddleName, nECRelationship, nZip, 5);
            hospital.getAllUsers().put(nFirstName, g);

            newPatient_firstName.setText("");
            newPatient_lastName.setText("");
            mITextField.setText("");
            newPatient_DOB.setText("");
            newPatient_age.setText("");
            newPatient_socialSecurity.setText("");
            newPatient_address.setText("");
            newPatient_city.setText("");
            newPatient_zip.setText("");
            newPatient_homePhone.setText("");
            newPatient_mobilePhone.setText("");
            newPatient_emailAddress.setText("");
            newPatient_ECfirstName.setText("");
            newPatient_EClastName.setText("");
            relationshipTextField.setText("");
            newPatient_EChomeNumber.setText("");
            newPatient_ECmobileNumber.setText("");
            newPatient_insuranceProvider.setText("");
            newPatient_accountNumber.setText("");

            patientcomboBox2.addItem(nFirstName);


        }

        /*

        // TODO: FIX THIS, YOU'RE USING A CLASS NOT THE OBJECT.
        // USE THIS INSTEAD.     Hospital hospital = new Hospital();
        // hospital <------------------------- variable you want, NOT Hospital

        if(cmd.equals("Find")) {
            // TODO: USE KEY LOOKUP INSTEAD OF ITERATION WHEN POSSIBLE

            for(Person person: Hospital.allUsers.values()){
                Patient patient = (Patient) person;
                if(patient.getFirstName() == patientcomboBox2.getSelectedItem()){
                    firstNameTextField2.setText(patient.getFirstName());
                    lastNameTextField2.setText(patient.getLastName());
                    emailTextField.setText(patient.getEmailAddress());
                    phoneNumberTextField.setText(patient.getHomePhone());
                    addressTextField2.setText(patient.getAddress());
                    cityTextField1.setText(patient.getCity());
                    stateTextField.setText(patient.getState());
                    emergencyContactTextField.setText(patient.getECfirstName() + " " + patient.getEClastName());
                    homePhoneTextField1.setText(patient.getEChomePhone());
                    mobilePhoneTextField1.setText(patient.getECmobilePhone());
                    emailTextField1.setText(patient.getEmailAddress());
                }
            }
        }
        */

        if(cmd.equals("Search Patient")) {

        }

    }
}
