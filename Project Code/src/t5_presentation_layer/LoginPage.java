package t5_presentation_layer;

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
 * Time: 8:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class LoginPage {
    private JTextField userNameField;
    private JPanel MainPanel;
    private JPasswordField passwordField;
    private JButton logInButton;
    private JButton clearButton;
    private JButton newUserButton;

    JPanel contentPane;
    private JFrame frame;

    private HashMap<String, Person> usersInSystem;

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginPage();
            }
        });
    }

    private void init_frame() {
        // Initialize the userInSystem hashmap.
        usersInSystem = new HashMap<String, Person>();
        // TEST CASE, CREATE A USER AND ADD IT TO THE HASHMAP TO TEST LOGGING IN WITH A USER
        // ********************************************************************************
        Person user = new Person("1", "UserName", "1", "FirstName", "MiddleName", "LastName", "test@test.com",
                "90111", "323-100-100", "Address", "UserECContact", "UserECNumber", "Social", "Date", 20, 'm');
        usersInSystem.put(user.getUserId(), user);
        // ********************************************************************************

        contentPane = new JPanel();
        contentPane.setBorder(
                BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new CardLayout());

        // Default Page user sees, the Login Page.
        contentPane.add(MainPanel, "Login Page");

        // Page User sees after logging in.
        UserPage userPage = new UserPage(contentPane);
        contentPane.add(userPage.getUserPagePanel(), "User Page");

        // Page User sees if signing up.
        SignUpPage signUpPage = new SignUpPage(contentPane, usersInSystem);
        contentPane.add(signUpPage.getSignUpPagePanel(), "Sign Up Page");


        frame = new JFrame("LoginPage");
        frame.setContentPane(contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public LoginPage() {
        init_frame();

        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredUserId = userNameField.getText();

                String enteredPassword = passwordField.getText();

                if(usersInSystem.containsKey(enteredUserId)) {
                    String realPassword = usersInSystem.get(enteredUserId).getPassword();
                    if(realPassword.equals(enteredPassword)) {
                        // they entered the correct password
                        clearTextFields();
                        // They entered their information correctly, so switch the panel to something else.
                        // Switch to the next pane.
                        CardLayout cl = (CardLayout) contentPane.getLayout();
                        cl.show(contentPane, "User Page");
                    } else {
                        // they entered the wrong password
                        // TODO: WRITE A PROMPT TO DISPLAY
                        clearTextFields();
                    }
                } else {
                    // their userid was wrong, prompt them for it
                    // TODO: WRITE A PROMPT TO DISPLAY
                    clearTextFields();
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearTextFields();
            }
        });

        logInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) contentPane.getLayout();
                cl.show(contentPane, "Sign Up Page");
            }

        });
    }

    private void clearTextFields() {
        userNameField.setText("");
        passwordField.setText("");
    }

    // Getters and Setters
    // TODO: Remove some getters and setters. Some shouldn't be public.
    public JButton getLoginButton() {
        return logInButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.logInButton = loginButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public void setClearButton(JButton clearButton) {
        this.clearButton = clearButton;
    }

    public JTextField getUserIdTextField() {
        return userNameField;
    }

    public void setUserIdTextField(JTextField userIdTextField) {
        this.userNameField = userIdTextField;
    }

    public JPasswordField getPasswordPasswordField() {
        return passwordField;
    }

    public void setPasswordPasswordField(JPasswordField passwordPasswordField) {
        this.passwordField = passwordPasswordField;
    }

    public JPanel getMainPanel() {
        return MainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        MainPanel = mainPanel;
    }
}