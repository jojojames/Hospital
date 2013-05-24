package t5_main;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
		Applet applet = new HospitalApplet();
		Frame frame = new HospitalFrame(applet);
    }
}