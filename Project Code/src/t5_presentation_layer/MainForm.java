package t5_presentation_layer;

import t5_domain_logic.Hospital;
import t5_domain_objects.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        // TODO: POSSBILITY OF REFACTORING ALL OF THIS TO RELEVANT PAGES
        // TODO: INSTEAD OF STICKING THEM ALL IN MAIN.

        // Default Page user sees, the Login Page.
        contentPane.add(MainPanel, "Login Page");

        // Page User sees after logging in.
        UserPage userPage = new UserPage(contentPane);
        contentPane.add(userPage.getUserPagePanel(), "User Page");

        // Page User sees if they are Staff after logging in.
        AdminPage adminPage = new AdminPage(contentPane);
        contentPane.add(adminPage.getAdminPagePanel(), "Admin Page");

        // Page User sees when signing up.
        NewUserPage newUserPage = new NewUserPage(contentPane, hospital);
        JScrollPane scrollNewUserPage = new JScrollPane(newUserPage.getNewUserPagePanel()); // NewUserPage requires scrolling.
        contentPane.add(scrollNewUserPage, "New User Page");

        // Page User sees when clicking on the Surgery button in the User Page.
        SurgeryPage surgeryPage = new SurgeryPage(contentPane, hospital);
        JScrollPane scrollSurgery = new JScrollPane(surgeryPage.getSurgeryPagePanel());
        contentPane.add(scrollSurgery, "Surgery Page");

        // Page User sees when clicking on the View Surgery button in the Surgery Page.
        ScheduleSurgery scheduleSurgery = new ScheduleSurgery(contentPane, hospital);
        JScrollPane scrollScheduleSurgery = new JScrollPane(scheduleSurgery.getScheduleSurgeryPanel());
        contentPane.add(scrollScheduleSurgery, "Schedule Surgery Page");

        // Page User sees when clicking on the Schedule Appointment button in the User Page.
        ScheduleAppointment scheduleAppointment = new ScheduleAppointment(contentPane, hospital);
        JScrollPane scrollScheduleAppointment = new JScrollPane(scheduleAppointment.getScheduleAppointmentPanel());
        contentPane.add(scrollScheduleAppointment, "Schedule Appointment Page");

        // Page User sees when clicking on the View Appointments button in the User Page.
        ViewAppointments viewAppointments = new ViewAppointments(contentPane, hospital);
        JScrollPane scrollViewAppointments = new JScrollPane((viewAppointments.getViewAppointmentsPanel()));
        contentPane.add(scrollViewAppointments, "View Appointments Page");

        // Page User sees when clicking on the View Billing Reports button in the User Page.
        ViewBillingReport viewBillingReport = new ViewBillingReport(contentPane, hospital);
        JScrollPane scrollViewBillingReport = new JScrollPane(viewBillingReport.getViewBillingReportPanel());
        contentPane.add(scrollViewBillingReport, "View Billing Report Page");

        frame = new JFrame("MainForm");
        frame.setContentPane(contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public MainForm() {
        init_frame();

        // Make a user to test functionality. Userid = 100, Password = 100.
        Person testPerson = new Person("100", "James", "Test", "9/8/93", "88211-924-123", "Address", "City", "198-123-123",
                "326-822-8823", "jamesemail.com", "eEC", "EEC", "123-853-8228", "3923-124-138", "InsuranceProvider",
                "InsuranceAccount", "Contact", "m", "CA", "20", "100");
        hospital.getAllUsers().put(testPerson.getUserId(), testPerson);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredUserId = userIdTextField.getText();
                char[] pass = passwordPasswordField.getPassword();
                String enteredPassword = new String (pass);

                // TODO: This login section can only go to a user page currently.
                // TODO: Rewrite it so that if the user logging in is an admin,
                // TODO: change to the admin page instead.
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
                        System.out.println("Wrong Password");
                        clearTextFields();
                    }
                } else {
                    // their userid was wrong, prompt them for it
                    // TODO: WRITE A PROMPT TO DISPLAY
                    System.out.println("Wrong User ID");
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
