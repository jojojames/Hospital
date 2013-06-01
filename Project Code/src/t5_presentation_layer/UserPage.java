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
