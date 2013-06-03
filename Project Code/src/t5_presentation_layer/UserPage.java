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
    private JButton userButton;
    private JPanel userPagePanel;
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JComboBox comboBox1;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
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

    JPanel contentPane;

    public UserPage(JPanel _contentPane) {
        this.contentPane = _contentPane;
        userButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) contentPane.getLayout();
                cl.previous(contentPane);
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

    public JButton getUserButton() {
        return userButton;
    }

    public void setUserButton(JButton userButton) {
        this.userButton = userButton;
    }

    public JButton getPageButton() {
        return pageButton;
    }

    public void setPageButton(JButton pageButton) {
        this.pageButton = pageButton;
    }


}
