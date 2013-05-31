package t5_presentation_layer;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;
import java.util.Map;

import t5_domain_objects.*;

public class LoginApplet extends JPanel implements ActionListener {

    //private JTextField How;
    private JTextField username = new JTextField(10);
    private JTextField password = new JTextField(10);
    private JButton login;
    private JPanel contentPane;

    public LoginApplet(JPanel panel) {
        contentPane = panel;
        //construct components

        login = new JButton ("Login");

        //adjust size and set layout
        setPreferredSize (new Dimension(1500, 800));
        setLayout (null);

        GhostText gUN = new GhostText(username, "Enter User Name");
        GhostText gPW = new GhostText(password, "Enter Password");

        //set component bounds (only needed by Absolute Positioning)
        username.setBounds(700, 550, 200, 25);
        password.setBounds(700, 600, 200, 25);
        login.setLocation(740,650);
        login.setSize(100, 25);

        login.addActionListener(this);
        //Button Action


        //add components
        add (password);
        add (username);
        add (login);
    }
    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        if(cmd.equals("Login"))
        {
            for(Iterator<Map.Entry<String, Person>> it = Person.hashMap.entrySet().iterator();it.hasNext();)
            {
                Map.Entry<String, Person> entry = it.next();
                if(entry.getKey().equals(username.getText()))
                {
                    CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                    cardLayout.next(contentPane);
                }
            }
            //CardLayout cardLayout = (CardLayout) contentPane.getLayout();
            //cardLayout.next(contentPane);

        }

    }

    public static class GhostText implements FocusListener, DocumentListener, PropertyChangeListener {
        private final JTextField textfield;
        private boolean isEmpty;
        private Color ghostColor;
        private Color foregroundColor;
        private final String ghostText;

        protected GhostText(final JTextField textfield, String ghostText) {
            super();
            this.textfield = textfield;
            this.ghostText = ghostText;
            this.ghostColor = Color.LIGHT_GRAY;
            textfield.addFocusListener(this);
            registerListeners();
            updateState();
            if (!this.textfield.hasFocus()) {
                focusLost(null);
            }
        }

        public void delete() {
            unregisterListeners();
            textfield.removeFocusListener(this);
        }

        private void registerListeners() {
            textfield.getDocument().addDocumentListener(this);
            textfield.addPropertyChangeListener("foreground", this);
        }

        private void unregisterListeners() {
            textfield.getDocument().removeDocumentListener(this);
            textfield.removePropertyChangeListener("foreground", this);
        }

        public Color getGhostColor() {
            return ghostColor;
        }

        public void setGhostColor(Color ghostColor) {
            this.ghostColor = ghostColor;
        }

        private void updateState() {
            isEmpty = textfield.getText().length() == 0;
            foregroundColor = textfield.getForeground();
        }

        @Override
        public void focusGained(FocusEvent e) {
            if (isEmpty) {
                unregisterListeners();
                try {
                    textfield.setText("");
                    textfield.setForeground(foregroundColor);
                } finally {
                    registerListeners();
                }
            }

        }

        @Override
        public void focusLost(FocusEvent e) {
            if (isEmpty) {
                unregisterListeners();
                try {
                    textfield.setText(ghostText);
                    textfield.setForeground(ghostColor);
                } finally {
                    registerListeners();
                }
            }
        }

        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            updateState();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateState();
        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            updateState();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateState();
        }
    }
}
