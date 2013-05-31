package t5_presentation_layer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login
{
    private JPanel contentPane;
    private LoginApplet loginApplet;
    private AdminApplet adminApplet;

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
        contentPane.add(loginApplet, "Login");
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
                new Login().displayGUI();
            }
        });
    }
}

