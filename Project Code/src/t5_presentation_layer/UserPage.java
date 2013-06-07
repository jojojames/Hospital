package t5_presentation_layer;

import t5_domain_logic.Hospital;
import t5_domain_objects.Patient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: james
 * Date: 5/31/13
 * Time: 5:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserPage {
    private JButton editButton;
    private JButton logOutButton;
    private JPanel userPagePanel;
    private JTabbedPane tabbedPane1;
    private JButton scheduleAppointmentButton;
    private JTable table1;
    private JTable table2;
    private JButton goToPharmacyButton;
    private JComboBox emailDoctor_doctorComboBox;
    private JTextField emailDoctor_recipientEmail;
    private JTextField emailDoctor_ccAddress;
    private JTextField enterSubjectTextField;
    private JEditorPane emailDoctor_message;
    private JTree tree1;
    private JComboBox scheduleAppointment_locationComboBox;
    private JTextField scheduleAppointment_firstName;
    private JTextField scheduleAppointment_lastName;
    private JTextField scheduleAppointment_emailAddress;
    private JTextField scheduleAppointment_address;
    private JTextField scheduleAppointment_city;
    private JComboBox scheduleAppointment_stateComboBox;
    private JTextField scheduleAppointment_reason;
    private JComboBox scheduleAppointment_doctorComboBox;
    private JButton selectDateButton;
    private JComboBox scheduleAppointment_timeComboBox;
    private JTextPane scheduleAppointment_reasonMessage;
    private JTable table3;
    private JTextField billingReport_cardNumber;
    private JTextField billingReport_expDate;
    private JTextField billingReport_patientID;
    private JTextField billingReport_statementDate;
    private JTextField billingReport_dateDue;
    private JTextField billingReport_acctNumber;
    private JTextField billingReport_amtOwed;
    private JTextField billingReport_amtPaid;
    private JTextField billingReport_patientAddress;
    private JTextField billingReport_patientName;
    private JTable table4;
    private JTable table5;
    private JTextField viewSurgeries_patientID;
    private JButton scheduleAppointmentButton1;
    private JTable table6;
    private JTable table7;
    private JButton sendEmailButton;
    private JButton scheduleAppointmentButton2;
    private JTextField patientInformation_firstName;
    private JTextField patientInformation_dateOfBirth;
    private JTextField patientInformation_age;
    private JTextField patientInformation_gender;
    private JTextField patientInformation_socialSecurity;
    private JTextField patientInformation_address;
    private JTextField patientInformation_city;
    private JTextField patientInformation_zipCode;
    private JTextField patientInformation_lastName;
    private JTextField patientInformation_homePhone;
    private JTextField patientInformation_mobilePhone;
    private JTextField patientInformation_emailAddress;
    private JTextField patientInformation_ECfirstName;
    private JTextField patientInformation_EClastName;
    private JTextField patientInformation_EChomePhone;
    private JTextField patientInformation_ECmobilePhone;
    private JTextField patientInformation_insuranceProvider;
    private JTextField patientInformation_insuranceAccount;
    private JComboBox patientInformation_stateComboBox;
    private JTextField emailDoctor_bccAddress;

    private JButton surgeriesButton;
    private JButton viewAppointmentsButton;
    private JButton viewBillingReportButton;

    JPanel contentPane;
    Hospital hospital;


    private String userNameOfCurrentUser; // user name of user who is currently logged in

    public UserPage(JPanel _contentPane, Hospital _hospital) {
        this.hospital = _hospital;
        this.contentPane = _contentPane;
        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) contentPane.getLayout();
                cl.show(contentPane, "Login Page");
            }
        });

        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateUserInfoInPatientInformationTab();
                updateViewWithNewUserInfoInPatientInformationTab();
            }
        });
    }


    public void updateUserInfoInPatientInformationTab() {
        Patient currentUser = (Patient) hospital.getAllUsers().get(userNameOfCurrentUser);
        currentUser.setFirstName(patientInformation_firstName.getText());
        currentUser.setDateOfBirth(patientInformation_dateOfBirth.getText());
        currentUser.setAge(patientInformation_age.getText());
        currentUser.setSex(patientInformation_gender.getText());
        currentUser.setAddress(patientInformation_address.getText());
        currentUser.setCity(patientInformation_city.getText());
        currentUser.setZip(patientInformation_zipCode.getText());
        currentUser.setLastName(patientInformation_lastName.getText());
        currentUser.setHomePhone(patientInformation_homePhone.getText());
        currentUser.setMobilePhone(patientInformation_mobilePhone.getText());
        currentUser.setEmailAddress(patientInformation_emailAddress.getText());
        currentUser.setECfirstName(patientInformation_ECfirstName.getText());
        currentUser.setEClastName(patientInformation_EClastName.getText());
        currentUser.setEChomePhone(patientInformation_EChomePhone.getText());
        currentUser.setECmobilePhone(patientInformation_ECmobilePhone.getText());
        currentUser.setInsuranceProvider(patientInformation_insuranceProvider.getText());
        currentUser.setInsuranceAccount(patientInformation_insuranceAccount.getText());
        currentUser.setState((String) patientInformation_stateComboBox.getSelectedItem());
    }

    public void updateViewWithNewUserInfoInPatientInformationTab() {
        Patient currentUser = (Patient) hospital.getAllUsers().get(userNameOfCurrentUser);
        patientInformation_firstName.setText(currentUser.getFirstName());
        patientInformation_dateOfBirth.setText(currentUser.getDateOfBirth());
        patientInformation_age.setText(currentUser.getAge());
        patientInformation_gender.setText(currentUser.getSex());
        patientInformation_socialSecurity.setText(currentUser.getSocialSecurity()); // social won't change
        patientInformation_address.setText(currentUser.getAddress());
        patientInformation_city.setText(currentUser.getCity());
        patientInformation_zipCode.setText(currentUser.getZip());
        patientInformation_lastName.setText(currentUser.getLastName());
        patientInformation_homePhone.setText(currentUser.getHomePhone());
        patientInformation_mobilePhone.setText(currentUser.getMobilePhone());
        patientInformation_emailAddress.setText(currentUser.getEmailAddress());
        patientInformation_ECfirstName.setText(currentUser.getECfirstName());
        patientInformation_EClastName.setText(currentUser.getEClastName());
        patientInformation_EChomePhone.setText(currentUser.getEChomePhone());
        patientInformation_ECmobilePhone.setText(currentUser.getECmobilePhone());
        patientInformation_insuranceProvider.setText(currentUser.getInsuranceProvider());
        patientInformation_insuranceAccount.setText(currentUser.getInsuranceAccount());
    }

    public JPanel getUserPagePanel() {
        return userPagePanel;
    }

    public void setUserPagePanel(JPanel userPagePanel) {
        this.userPagePanel = userPagePanel;
    }

    public JButton getLogOutButton() {
        return logOutButton;
    }

    public void setLogOutButton(JButton logOutButton) {
        this.logOutButton = logOutButton;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public void setEditButton(JButton editButton) {
        this.editButton = editButton;
    }

    public String getUserNameOfCurrentUser() {
        return userNameOfCurrentUser;
    }

    public void setUserNameOfCurrentUser(String userNameOfCurrentUser) {
        this.userNameOfCurrentUser = userNameOfCurrentUser;
    }


}
