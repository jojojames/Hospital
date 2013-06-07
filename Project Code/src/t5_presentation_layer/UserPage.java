package t5_presentation_layer;

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
    private JButton pageButton;
    private JButton logOutButton;
    private JPanel userPagePanel;
    private JTabbedPane tabbedPane1;
    private JButton scheduleAppointmentButton;
    private JTable table1;
    private JTable table2;
    private JButton goToPharmacyButton;
    private JComboBox comboBox2;
    private JTextField enterRecipientEmailAddressTextField;
    private JTextField enterCCAddressTextField;
    private JTextField enterBCCAddressTextField;
    private JTextField enterSubjectTextField;
    private JEditorPane editorPane1;
    private JTree tree1;
    private JComboBox comboBox3;
    private JTextField firstNameTextField;
    private JTextField lastNameTextField;
    private JTextField emailAddressTextField;
    private JTextField addressTextField;
    private JTextField cityTextField;
    private JComboBox comboBox4;
    private JTextField reasonForAppointmentTextField;
    private JComboBox comboBox5;
    private JButton selectDateButton;
    private JComboBox comboBox6;
    private JTextPane textPane1;
    private JTable table3;
    private JTextField cardNumberTextField;
    private JTextField expDateTextField;
    private JTextField patientIDTextField;
    private JTextField statementDateTextField;
    private JTextField dateDueTextField;
    private JTextField acctTextField;
    private JTextField amtOwedTextField;
    private JTextField amtPaidTextField;
    private JTextField patientAddressTextField;
    private JTextField patientNameTextField;
    private JTable table4;
    private JTable table5;
    private JTextField patientIDTextField2;
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

    private JButton surgeriesButton;
    private JButton viewAppointmentsButton;
    private JButton viewBillingReportButton;

    JPanel contentPane;

    public UserPage(JPanel _contentPane) {
        this.contentPane = _contentPane;
        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) contentPane.getLayout();
                cl.show(contentPane, "Login Page");
            }
        });
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

    public JButton getPageButton() {
        return pageButton;
    }

    public void setPageButton(JButton pageButton) {
        this.pageButton = pageButton;
    }


}
