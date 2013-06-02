package t5_presentation_layer;

import t5_domain_logic.Hospital;

import javax.smartcardio.Card;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: james
 * Date: 6/1/13
 * Time: 6:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class SurgeryPage {
    private JPanel surgeryPagePanel;
    private JButton scheduleSurgeryButton;

    JPanel contentPane;
    Hospital hospital;

    public SurgeryPage(JPanel _contentPane, Hospital _hospital) {
        this.contentPane = _contentPane;
        this.hospital = _hospital;

        scheduleSurgeryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) contentPane.getLayout();
                cl.show(contentPane, "Schedule Surgery Page");
            }
        });
    }

    public JPanel getSurgeryPagePanel() {
        return surgeryPagePanel;
    }

    public void setSurgeryPagePanel(JPanel surgeryPagePanel) {
        this.surgeryPagePanel = surgeryPagePanel;
    }

}
