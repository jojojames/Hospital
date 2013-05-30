package t5_domain_logic;

import java.applet.Applet;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class HospitalFrame extends Frame implements ActionListener {
	public HospitalFrame(Applet applet) {
		super("T5 Hospital Applet");
		MenuBar menubar = new MenuBar();
		Menu file = new Menu("File",true);
		menubar.add(file);
		file.add("Scheduler");
		file.add("Quit");
		setMenuBar(menubar);
		file.addActionListener(this);
		add("Center",applet);
		setSize(620,680);
		applet.init();
		this.show();
	}
	public void actionPerformed(ActionEvent evt) {
		String arg = evt.getActionCommand();
		if (arg.equals("Quit")){
			System.exit(0);
		}
		if (arg.equals("Scheduler")){
			Applet applet = new ScheduleApplet();
			Frame frame = new HospitalFrame(applet);
			applet.init();
			this.show();
		}
	}
}