package cookieClicker;

import javax.swing.*;
import java.awt.*;

public class main{

	// define variables for the parts of the GUI
	private JLabel label = new JLabel("No. of clicks:  0");
	private JLabel autoCounter = new JLabel("No. of autoclickers:  0");
	private JFrame frame = new JFrame();
	private cookie cookieBoi = new cookie("Click me for points!");
	private addClicker autoAdder = new addClicker("Click me for auto!");
	public static main Main;

	public cookie getCookieBoi(){
		return cookieBoi;
	}
		
	public main() {
	
		// The buttons
		cookieBoi.addActionListener(cookieBoi);
		autoAdder.addActionListener(autoAdder);
		
		// The panel with the buttons and text
		JPanel panel = new JPanel();
		
		// offsetY, offsetX, spaceY, spaceX
		panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 200, 200));
		panel.setLayout(new GridLayout(2, 3, 1, 2));
		panel.add(cookieBoi);
		panel.add(autoAdder);
		panel.add(label);
		panel.add(autoCounter);
		
		// Display the fancy-dancy GUI
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Cookie clicker");
		frame.pack();
		frame.setVisible(true);
	}

	// To be called to update the GUI for the variables
	public static void updateClicks(){
		int clicks = main.Main.cookieBoi.getClicks();
		main.Main.label.setText("No. of clicks:  " + clicks);
		int clickers = autoClicker.getClickers();
		main.Main.autoCounter.setText("No. of autoclickers:  " + clickers);
	}

	// Ignore where it says method has constructor name,
	// it will not break. If you change it then it will.
	public static void main(String[] args) {
		main.Main = new main();
		autoClicker.getTimer().schedule(autoClicker.getClickerBoi(), 2000, 5000);
	}
}
