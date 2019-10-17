import java.util.Date;
import javax.swing.*;

import java.util.Calendar;




public class Run {

	public static void main(String[] args) {
	
		
		String msg = "";
		int hr;
		int mn;
		int sec;
		
		MainFrame app = new MainFrame();
		while(true)
		{
			Date date = new Date();
			
			hr = date.getHours();
			
			mn = date.getMinutes();
			
			sec = date.getSeconds();

			
	
			
			msg = hr+ ":" + mn + ":" + sec;  
			app.updateTime(msg);

		}
		
	}

}
