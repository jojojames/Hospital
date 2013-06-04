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
    private JTextArea firstNameTextArea;
    private JTextArea lastNameTextArea;
    private JTextArea emailAddressTextArea;
    private JTextArea phoneNumberTextArea;
    private JTextArea addressTextArea;
    private JTextArea cityTextArea;
    private JTextArea stateTextArea;
    private JComboBox patientcomboBox2;

    JPanel contentPane;
    Patient p;
    private Hospital hospital = new Hospital();


    public AdminPage(JPanel _contentPane) {
        this.contentPane = _contentPane;


        //populate patient combobox
        for(Object o: Person.hashMap.keySet())
            patientcomboBox2.addItem(o);

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
            Person newPatient = new Person(userID,newPatientFirstName,newPatientLastName,newPatientDOB,newPatientSSN,
                    newPatientAddress,newPatientCity,newPatientHomePhone,newPatientMobilePhone,newPatientEmail,
                    newPatientECFirstName,newPatientECLastName,newPatientECHomePhone,newPatientECMobilePhone,
                    newPatientInsuranceProvider,newPatientInsuranceAccountNum,"UserName",sexcomboBox2.getSelectedItem().toString(),
                    statecomboBox2.getSelectedItem().toString(),newPatientAge,"123",newPatientMiddleName,newPatientECRelationship,
                    newPatientZip);
            patientcomboBox2.addItem(newPatientFirstName);
        }

        if(cmd.equals("Find")){
           for(Iterator<Map.Entry<String,Person>> it = Person.hashMap.entrySet().iterator();it.hasNext();){
               Map.Entry<String,Person> entry = it.next();
               if(entry.getKey().equals(patientcomboBox2.getSelectedItem())){

                   //clear text area before populating
                   firstNameTextArea.setText("");
                   lastNameTextArea.setText("");
                   emailAddressTextArea.setText("");
                   phoneNumberTextArea.setText("");
                   addressTextArea.setText("");
                   cityTextArea.setText("");
                   stateTextArea.setText("");

                   firstNameTextArea.append(entry.getValue().getFirstName());
                   lastNameTextArea.append(entry.getValue().getLastName());
                   emailAddressTextArea.append(entry.getValue().getEmailAddress());
                   phoneNumberTextArea.append(entry.getValue().getHomePhone());
                   addressTextArea.append(entry.getValue().getAddress());
                   cityTextArea.append(entry.getValue().getCity());
                   stateTextArea.append(entry.getValue().getState());

               }
           }

        }

    }
}
