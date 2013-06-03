package t5_presentation_layer;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: james
 * Date: 6/1/13
 * Time: 7:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class AdminPage {
    private JPanel adminPagePanel;

    JPanel contentPane;

    public AdminPage(JPanel _contentPane) {
        this.contentPane = _contentPane;
    }

    public JPanel getAdminPagePanel() {
        return adminPagePanel;
    }

    public void setAdminPagePanel(JPanel adminPagePanel) {
        this.adminPagePanel = adminPagePanel;
    }

}
