package t5_domain_logic;
import t5_presentation_layer.AdminApplet;
import t5_domain_objects.*;
import t5_presentation_layer.LoginApplet;

import javax.swing.*;
import java.awt.*;

public class MainDomain extends PersonElement{

    private JPanel contentPane;
    private LoginApplet loginApplet;
    private AdminApplet adminApplet;

    public MainDomain(){
        Person admin = new Person("","","","","","","","Admin","",' ',"",0,0,0,0,0,0,"","",0);
    }

    private void displayGUI()
    {
        JFrame frame = new JFrame("T5 Hospital");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(
                BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new CardLayout());
        loginApplet = new LoginApplet(contentPane);
        adminApplet = new AdminApplet();
        contentPane.add(loginApplet, "LoginNOW");
        contentPane.add(adminApplet, "Admin");
        frame.setContentPane(contentPane);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainDomain().displayGUI();
            }
        });
    }
}