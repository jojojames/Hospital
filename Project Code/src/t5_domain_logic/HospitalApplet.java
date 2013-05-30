package t5_domain_logic;

import java.applet.Applet;
import java.awt.Graphics;

public class HospitalApplet extends Applet {
	HospitalInit hospitalinit = new HospitalInit();
	public void paint(Graphics g) {
		g.drawString("This is the Hospital Applet", 10, 15);
		g.drawString(String.valueOf(hospitalinit.allBeds), 20, 25);
	}
}
