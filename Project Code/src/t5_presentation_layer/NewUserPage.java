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
    Hospital hospital;

    public NewUserPage(JPanel _contentPage, Hospital _hospital) {

        this.contentPane = _contentPage;
        this.hospital = _hospital;

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

                // Get all the input fields.
                String firstName = firstNameTextField.getText();
                String lastName = lastNameTextField.getText();
                String dateOfBirth = dateOfBirthTextField.getText();
                String socialSecurity = socialSecurityTextField.getText();
                String addressField = addressTextField.getText();
                String city = cityTextField.getText();
                String homePhone = homePhoneTextField.getText();
                String mobilePhone = mobilePhoneTextField.getText();
                String emailAddress = emailAddressTextField.getText();
                String ECfirstName = ECfirstNameTextField.getText();
                String EClastName = EClastNameTextField.getText();
                String EChomePhone= EChomePhoneTextField.getText();
                String ECmobilePhone = ECmobilePhoneTextField.getText();
                String insuranceProvider = insuranceProviderTextField.getText();
                String insuranceAccount = insuranceAccountTextField.getText();
                String userName = userNameTextField.getText();
                String sex = (String) sexComboBox.getSelectedItem();
                String state = (String) stateComboBox.getSelectedItem();
                String age = (String) ageComboBox.getSelectedItem();
                // TODO: getText() is deprecated, figure out how to use getPassword() instead.
                String password = passwordPasswordField.getText();

                // Check against user hash map.
                HashMap<String, Person> allUsers = hospital.getAllUsers();
                for(Person person : allUsers.values()) {
                    System.out.println("Value - " + person.getUserId());
                }


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
