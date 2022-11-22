package cookieClicker;

import javax.swing.*;
import java.awt.event.*;

public class cookie extends JButton implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	// Variable for click count
	private int clicks = 0;
	
	// Basic constructor
	public cookie(String str){
		this.setText(str);
	}
	
	// Getter and setter for click count, so that they can be accessed from other classes.
	public int getClicks(){
		return clicks;
	}
	public int setClicks(int n){
		clicks = n;
		return clicks;
	}
	
	// This will occur upon being clicked
	public void actionPerformed(ActionEvent e) {
		clicks++;
		main.updateClicks();
	}
}
