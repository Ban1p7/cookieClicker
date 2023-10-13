package cookieClicker;

import javax.swing.*;
import java.awt.event.*;

public class addClicker extends JButton implements ActionListener{
	private static final long serialVersionUID = -8764935842367595770L;
	
	// Constructor
	public addClicker(String str){
		this.setText(str);
	}
	
	// This will happen upon being clicked
	public void actionPerformed(ActionEvent e) {
		
		// If they cannot afford an autoclicker, return without adding one
		if (main.Main.getCookieBoi().getClicks() < 20){
			System.out.println("Poor dude");
			return;
		}
		
		// Otherwise, continue
		System.out.println("Clicker added!");
		
		// Get the amount of clicks, and subtract price of an autoclicker from it
		int clicks = main.Main.getCookieBoi().getClicks();
		int price = 20;
		main.Main.getCookieBoi().setClicks(clicks - price);
		
		// Do the same for the autoclicker, but instead, add one
		int clickers = autoClicker.getClickers();
		autoClicker.setClickers(clickers + 1);
		
		// Update GUI display
		main.updateClicks();
	}
}
