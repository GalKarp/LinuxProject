package BL;

import java.io.IOException;

import javax.swing.UIManager;

public class Program {

	public static void main(String[] args) throws IOException, InterruptedException {
	    try {
	        UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
		new GUI();
//	    new CopyOfGUI();

	}

}
