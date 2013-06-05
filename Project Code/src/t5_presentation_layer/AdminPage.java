package t5_presentation_layer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Map;

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
    private JTabbedPane tabbedPane1;
    private JTextField lastNameTextField;
    private JTextField firstNameTextField;
    private JTextField mITextField;
    private JComboBox comboBox1;
    private JTextField insuranceProviderTextField;
    private JTextField accountNumberTextField;
    private JComboBox sexcomboBox2;
    private JTextField ageTextField;
    private JTextField socialSecurityTextField;
    private JTextField mobileNumberTextField;
    private JTextField homeNumberTextField;
    private JTextField relationshipTextField;
    private JTextField firstNameTextField1;
    private JTextField lastNameTextField1;
    private JTextField emailAddressTextField1;
    private JTextField mobilePhoneTextField;
    private JTextField homePhoneTextField;
    private JTextField zipTextField;
    private JTextField cityTextField;
    private JTextField addressTextField;
    private JButton createPatientButton;
    private JTextField enterPatientIDTextField;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JTextField reasonForAdmissionTextField;
    private JTextField emergencyContactTextField;
    private JTextField addressTextField1;
    private JTextField homePhoneTextField1;
    private JTextField mobilePhoneTextField1;
    private JTextField emailTextField1;
    private JButton admitButton;
    private JTextPane textPane1;
    private JTextField emailAddressTextField;
    private JTabbedPane tabbedPane2;
    private JFormattedTextField RMpatientIDFormattedTextField;

    private JPanel adminPagePanel;
    private JTextField DOBtextField;
    private JTextField RMfirstNameTextField;
    private JTextField RMlastNameTextField;
    private JComboBox newRoomcomboBox;
    private JTextField rmTextField;
    private JTextArea reasonForMoveTextArea;
    private JTextField enterPatientsNameTextField;
    private JTextField enterPatientsAddressTextField;
    private JTextField enterPatientsDateOfTextField;
    private JTextField enterPatientsHomePhoneTextField;
    private JTextField enterPatientsMobilePhoneTextField;
    private JTextField enterPatientsGuarantorTextField;
    private JTextField procCodeTextField;
    private JTextField diagCodeTextField;
    private JTextField sugeryDateTextField;
    private JTextArea commentsTextArea;
    private JComboBox attnPhyscomboBox;
    private JComboBox primPhyscomboBox;
    private JComboBox asstcomboBox;
    private JTextField insuranceProviderTextField1;
    private JTextField policyTextField;
    private JTextField groupTextField;
    private JTextField subsciberNameTextField;
    private JTextField insurancePhoneTextField;
    private JTextField authorizationTextField;
    private JTextField ofDaysApprovedTextField;
    private JTextField insuranceContactTextField;
    private JButton scheduleSurgeryButton;
    private JButton clearButton;
    private JButton cancelButton;
    private JTextField enterProcedureTextField;
    private JButton submitRoomChangeButton;
    private JTextField patientIDTextField;
    private JButton scheduleASurgeryButton;
    private JTable surgHisttable;
    private JTable surgSchedtable;
    private JComboBox comboBox6;
    private JButton addPatientButton;
    private JTextField enterRecipientEmailTextField;
    private JTextField enterCCAddressTextField;
    private JTextField enterBCCAddressTextField;
    private JTextField enterSubjectTextField;
    private JButton sendMessageButton;
    private JTree tree1;
    private JTextArea enterMessageTextArea;
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
    private JComboBox statecomboBox2;
    private JButton findPatientButton1;
    private JComboBox patientcomboBox2;
    private JTextField firstNameTextField2;
    private JTextField lastNameTextField2;
    private JTextField emailTextField;
    private JTextField phoneNumberTextField;
    private JTextField addressTextField2;
    private JTextField cityTextField1;
    private JTextField stateTextField;

    JPanel contentPane;
    Patient p;
    private Hospital hospital = new Hospital();


    public AdminPage(JPanel _contentPane) {
        this.contentPane = _contentPane;


        //populate patient combobox
        for(Object o: Patient.hashMap.keySet())
            patientcomboBox2.addItem(o);

        //location/department combobox
        for(Object o: Department.hashMap.keySet())
            comboBox3.addItem(o);

        //Room number combobox
        for(Object o: Room.hashMap.keySet())
            comboBox4.addItem(o);


        //button listener
        logoutButton.addActionListener(this);
        createPatientButton.addActionListener(this);
        findPatientButton1.addActionListener(this);
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

        String newPatientFirstName = firstNameTextField.getText();
        String newPatientLastName = lastNameTextField.getText();
        String newPatientMiddleName = mITextField.getText();
        String newPatientDOB = DOBtextField.getText();
        String newPatientAge = ageTextField.getText();
        String newPatientSSN = socialSecurityTextField.getText();
        String newPatientAddress = addressTextField.getText();
        String newPatientCity = cityTextField.getText();
        String newPatientZip = zipTextField.getText();
        String newPatientHomePhone = homePhoneTextField.getText();
        String newPatientMobilePhone = mobilePhoneTextField.getText();
        String newPatientEmail = emailAddressTextField1.getText();
        String newPatientECFirstName = firstNameTextField1.getText();
        String newPatientECLastName = lastNameTextField1.getText();
        String newPatientECRelationship = relationshipTextField.getText();
        String newPatientECHomePhone = homeNumberTextField.getText();
        String newPatientECMobilePhone = mobileNumberTextField.getText();
        String newPatientInsuranceProvider = insuranceProviderTextField.getText();
        String newPatientInsuranceAccountNum = accountNumberTextField.getText();
        String userID = "100";

        if(cmd.equals("Logout")){
            CardLayout c1 = (CardLayout) contentPane.getLayout();
            c1.show(contentPane,"Login Page");
        }

        if(cmd.equals("Create Patient")){
            //add new patient
            hospital.add(new Patient(new Person(userID,newPatientFirstName,newPatientLastName,newPatientDOB,newPatientSSN,
                    newPatientAddress,newPatientCity,newPatientHomePhone,newPatientMobilePhone,newPatientEmail,
                    newPatientECFirstName,newPatientECLastName,newPatientECHomePhone,newPatientECMobilePhone,
                    newPatientInsuranceProvider,newPatientInsuranceAccountNum,"UserName",sexcomboBox2.getSelectedItem().toString(),
                    statecomboBox2.getSelectedItem().toString(),newPatientAge,"123",newPatientMiddleName,newPatientECRelationship,
                    newPatientZip)));

            firstNameTextField.setText("");
            lastNameTextField.setText("");
            mITextField.setText("");
            DOBtextField.setText("");
            ageTextField.setText("");
            socialSecurityTextField.setText("");
            addressTextField.setText("");
            cityTextField.setText("");
            zipTextField.setText("");
            homePhoneTextField.setText("");
            mobilePhoneTextField.setText("");
            emailAddressTextField1.setText("");
            firstNameTextField1.setText("");
            lastNameTextField1.setText("");
            relationshipTextField.setText("");
            homeNumberTextField.setText("");
            mobileNumberTextField.setText("");
            insuranceProviderTextField.setText("");
            accountNumberTextField.setText("");

            patientcomboBox2.addItem(newPatientFirstName);
        }

        if(cmd.equals("Find")){
           for(Iterator<Map.Entry<String,Person>> it = Person.hashMap.entrySet().iterator();it.hasNext();){
               Map.Entry<String,Person> entry = it.next();
               if(entry.getKey().equals(patientcomboBox2.getSelectedItem())){

                   firstNameTextField2.setText(entry.getValue().getFirstName());
                   lastNameTextField2.setText(entry.getValue().getLastName());
                   emailTextField.setText(entry.getValue().getEmailAddress());
                   phoneNumberTextField.setText(entry.getValue().getHomePhone());
                   addressTextField2.setText(entry.getValue().getAddress());
                   cityTextField1.setText(entry.getValue().getCity());
                   stateTextField.setText(entry.getValue().getState());
                   emergencyContactTextField.setText(entry.getValue().getECfirstName() + " " + entry.getValue().getEClastName());
                   homePhoneTextField1.setText(entry.getValue().getEChomePhone());
                   mobilePhoneTextField1.setText(entry.getValue().getECmobilePhone());
                   emailTextField1.setText(entry.getValue().getEmailAddress());

               }
           }

        }

    }
}
