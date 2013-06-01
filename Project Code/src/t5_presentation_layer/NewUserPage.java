package t5_presentation_layer;

import t5_domain_logic.Hospital;
import t5_domain_objects.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Joel
 * Date: 6/1/13
 * Time: 9:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class NewUserPage {
    private JTextField firstNameTextField;
    private JPanel panel1;
    private JTextField lastNameTextField;
    private JTextField dateOfBirthTextField;
    private JTextField socialSecurityTextField;
    private JTextField addressTextField;
    private JTextField cityTextField;
    private JTextField homePhoneTextField;
    private JTextField mobilePhoneTextField;
    private JTextField emailAddressTextField;
    private JTextField ECfirstNameTextField;
    private JTextField EClastNameTextField;
    private JTextField EChomePhoneTextField;
    private JTextField ECmobilePhoneTextField;
    private JTextField insuranceProviderTextField;
    private JTextField insuranceAccountTextField;
    private JButton clearButton;
    private JButton registerButton;
    private JButton cancelButton;
    private JTextField userNameTextField;
    private JComboBox sexComboBox;
    private JComboBox stateComboBox;
    private JComboBox ageComboBox;
    private JPasswordField passwordPasswordField;

    JPanel contentPane;

    public NewUserPage(JPanel contentPage, Hospital hospital) {

        this.contentPane = contentPage;

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearTextFields();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // They canceled the sign up so go back to the login page.
                CardLayout cl = (CardLayout) contentPane.getLayout();
                cl.show(contentPane, "Login Page");
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    private void clearTextFields() {
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        dateOfBirthTextField.setText("");
        socialSecurityTextField.setText("");
        addressTextField.setText("");
        cityTextField.setText("");
        homePhoneTextField.setText("");
        mobilePhoneTextField.setText("");
        emailAddressTextField.setText("");
        ECfirstNameTextField.setText("");
        EClastNameTextField.setText("");
        EChomePhoneTextField.setText("");
        ECmobilePhoneTextField.setText("");
        insuranceProviderTextField.setText("");
        insuranceAccountTextField.setText("");
        userNameTextField.setText("");
        passwordPasswordField.setText("");

    }

}
