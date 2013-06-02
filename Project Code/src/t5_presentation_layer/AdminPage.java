package t5_presentation_layer;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: james
 * Date: 6/1/13
 * Time: 7:00 PM
 * To change this template use File | Settings | File Templates.
 */

public class AdminPage {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JTextField piFirstName;
    private JTextField piLastName;
    private JTextField piDOB;
    private JTextField piAge;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField piCity;
    private JTextField piGender;
    private JTextField piZip;
    private JTextField piHomePhone;
    private JTextField piMobileNumber;
    private JTextField piEmail;
    private JTextField piECFirstName;
    private JTextField piECLastName;
    private JTextField piECHomePhone;
    private JTextField textField16;
    private JTextField piECRelationship;
    private JTextField piInsuranceProvider;
    private JTextField piInsuranceAccount;
    private JButton scheduleAppointmentButton;
    private JTable emergencyContactInformationTable;
    private JButton goToPharmacyButton;
    private JTable table2;
    private JComboBox comboBox1;
    private JTextField enterRecipientEmailAddressTextField;
    private JTextField enterCCAddressTextField;
    private JTextField enterBCCAddressTextField;
    private JTextField enterSubjectTextField;
    private JTextPane enterBodyHereTextPane;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JTree tree1;
    private JTextField dateTextField;
    private JComboBox comboBox4;
    private JTextField firstNameTextField;
    private JTextField lastNameTextField;
    private JTextField emailAddressTextField;
    private JTextField phoneNumberTextField;
    private JTextField addressTextField;
    private JTextField cityTextField;
    private JComboBox stateComboBox;
    private JTextField reasonForAppointmentTextField;
    private JTextPane optionalCommentsQuestionsAndTextPane;
    private JTable table1;
    private JTextField cardNumberTextField;
    private JTextField expDateTextField;
    private JTextField patientIDTextField;
    private JTextField statementDateTextField;
    private JTextField dateDueTextField;
    private JTextField accountTextField;
    private JTextField amtOwedTextField;
    private JTextField amtPaidTextField;
    private JTextField patientNameTextField;
    private JTextField patientAddressTextField;
    private JTable table3;
    private JTable table4;

    private JPanel adminPagePanel;

    JPanel contentPane;

    public AdminPage(JPanel _contentPane) {
        this.contentPane = _contentPane;
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
}
