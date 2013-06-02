package t5_presentation_layer;

import t5_domain_logic.Hospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: james
 * Date: 6/1/13
 * Time: 7:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class ViewBillingReport {
    private JButton backButton;
    private JPanel viewBillingReportPanel;
    JPanel contentPane;
    Hospital hospital;

    public ViewBillingReport(JPanel _contentPane, Hospital _hospital) {
        this.contentPane = _contentPane;
        this.hospital = _hospital;
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) contentPane.getLayout();
                cl.show(contentPane, "User Page");
            }
        });
    }

    public JPanel getViewBillingReportPanel() {
        return viewBillingReportPanel;
    }

    public void setViewBillingReportPanel(JPanel viewBillingReportPanel) {
        this.viewBillingReportPanel = viewBillingReportPanel;
    }

}
