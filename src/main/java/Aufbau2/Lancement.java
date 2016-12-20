package Aufbau2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lancement{
	
	Chrono cho = new Chrono();
	CreateFrame c = new CreateFrame();
	
	public Lancement(Chrono cho, CreateFrame c) {
		this.cho = cho;
		this.c = c;
	}

	public void swing(){
	c.getB1().addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{   	
			cho.getTimer1().start();
         }
	});
	}
	
	public void stop(){
	c.getB2().addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			cho.getTimer1().stop();
             

		}
	});
	}
}
