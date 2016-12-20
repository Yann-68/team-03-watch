package Aufbau1;
import javax.swing.*;
import java.awt.event.*;

public class Chrono {
	private int h=0;
	private int m=0;
	private int s=0;
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
