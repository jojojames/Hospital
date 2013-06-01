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
 * User: james
 * Date: 5/31/13
 * Time: 4:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainForm {
    private JButton loginButton;
    private JButton clearButton;
    private JTextField userIdTextField;
    private JPasswordField passwordPasswordField;
    private JPanel MainPanel;
    private JButton signUpButton;

    JPanel contentPane;
    private JFrame frame;

    // Holds all the predefined domain objects to be used with other pages.
    // Send specific data structures to other pages in order to use.
    private Hospital hospital = new Hospital();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainForm();
            }
        });
    }

    private void init_frame() {
        contentPane = new JPanel();
        contentPane.setBorder(
                BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new CardLayout());

        // Default Page user sees, the Login Page.
        contentPane.add(MainPanel, "Login Page");

        // Page User sees after logging in.
        UserPage userPage = new UserPage(contentPane);
        contentPane.add(userPage.getUserPagePanel(), "User Page");

        // Page User sees when signing up.
        NewUserPage newUserPage = new NewUserPage(contentPane, hospital);
        contentPane.add(newUserPage.getPanel1(), "New User Page");

        frame = new JFrame("MainForm");
        frame.setContentPane(contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public MainForm() {
        init_frame();

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredUserId = userIdTextField.getText();

                // TODO: getText() is a deprecated function. Figure out how to use getPassword() instead.
                String enteredPassword = passwordPasswordField.getText();

                if(hospital.getAllUsers().containsKey(enteredUserId)) {
                    String realPassword = hospital.getAllUsers().get(enteredUserId).getPassword();
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

        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) contentPane.getLayout();
                cl.show(contentPane, "New User Page");
            }

        });
    }

    private void clearTextFields() {
        userIdTextField.setText("");
        passwordPasswordField.setText("");
    }

    // Getters and Setters
    // TODO: Remove some getters and setters. Some shouldn't be public.
    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public void setClearButton(JButton clearButton) {
        this.clearButton = clearButton;
    }

    public JTextField getUserIdTextField() {
        return userIdTextField;
    }

    public void setUserIdTextField(JTextField userIdTextField) {
        this.userIdTextField = userIdTextField;
    }

    public JPasswordField getPasswordPasswordField() {
        return passwordPasswordField;
    }

    public void setPasswordPasswordField(JPasswordField passwordPasswordField) {
        this.passwordPasswordField = passwordPasswordField;
    }

    public JPanel getMainPanel() {
        return MainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        MainPanel = mainPanel;
    }
}
