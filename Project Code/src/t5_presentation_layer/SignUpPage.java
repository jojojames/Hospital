package t5_presentation_layer;

import t5_domain_objects.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: james
 * Date: 5/31/13
 * Time: 8:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class SignUpPage {
    private JButton signUpButton;
    private JTextField firstNameTextField;
    private JTextField middleNameTextField;
    private JButton cancelButton;
    private JTextField lastNameTextField;
    private JTextField userNameTextField;
    private JPasswordField passwordPasswordField;
    private JTextField emailTextField;
    private JTextField phoneNumberTextField;
    private JTextField zipCodeTextField;
    private JTextField addressTextField;
    private JTextField emergencyContactTextField;
    private JTextField emergencyContactNumberTextField;
    private JComboBox ageComboBox;
    private JComboBox sexComboBox;
    private JTextField socialSecurityTextField;
    private JTextField dateOfBirthTextField;
    private JPanel signUpPagePanel;

    JPanel contentPane;

    public JPanel getSignUpPagePanel() {
        return signUpPagePanel;
    }

    public void setSignUpPagePanel(JPanel signUpPagePanel) {
        this.signUpPagePanel = signUpPagePanel;
    }

    public SignUpPage(JPanel _contentPage, HashMap<String, Person> usersInSystem) {
        this.contentPane = _contentPage;

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // They canceled the sign up so return them to the Login Page.
                CardLayout cl = (CardLayout) contentPane.getLayout();
                cl.show(contentPane, "Login Page");
            }
        });

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: REFACTOR usersInSystem FIRST BEFORE USING IT TO CHECK IF A USER IS ALREADY IN THE SYSTEM
            }
        });
    }
}
