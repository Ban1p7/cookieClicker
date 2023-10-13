package cookieClicker;

import java.util.*;

public class autoClicker{
	
	private static int clickers = 0;
	private static Timer timer = new Timer();
	private static TimerTask task = new clickerBoi();
	
	// Getters and setters for various variables
	public static int getClickers(){
		return clickers;
	}
	
	public static int setClickers(int n){
		clickers = n;
		return clickers;
	}
	
	public static Timer getTimer(){
		return timer;
	}
	
	public static TimerTask getClickerBoi(){
		return task;
	}
	
	// Click
	public static void autoClick(){
		int clicks = main.Main.getCookieBoi().getClicks();
		main.Main.getCookieBoi().setClicks(clicks + clickers);
		main.updateClicks();
		return;
	}
}

// Extra class for the actual click function to the button.
class clickerBoi extends TimerTask{
	public void run(){
		autoClicker.autoClick();
	}
}
