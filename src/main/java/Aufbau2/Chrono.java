package Aufbau2;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.Calendar;

public class Chrono {
	
	Calendar cal = Calendar.getInstance();
	
	private int h = cal.get(Calendar.HOUR_OF_DAY);
    private int m = cal.get(Calendar.MINUTE);
    private int s = cal.get(Calendar.SECOND);

	private int delay=1000;
	
	
    private JLabel label1 = new JLabel(h+":"+m+":"+s);
	public JLabel getLabel1() {
		return label1;
	}

			
	
   	private ActionListener timer= new ActionListener()
	{
		public void actionPerformed(ActionEvent e1)
		{
			s++;
			if(s==60)
			{
				s=0;
				m++;
			}
			if(m==60)
			{
				m=0;
				h++;
			}
			label1.setText(h+":"+m+":"+s);	
			 
		}
	};
	private Timer timer1= new Timer(delay,timer);
    public Timer getTimer1() {
		return timer1;
	}
    
}
