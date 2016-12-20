package Aufbau2;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.DocumentListener;

public class Schrift {
	
	private CreateFrame c = new CreateFrame();
	Chrono ch = new Chrono();
	
	public Schrift(CreateFrame r,Chrono ch) {
			this.c = r;
			this.ch = ch;
		}
	
	public void ok(){
				
		c.getB5().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{   	
				  String g = c.getTe().getText();
				  int g1 = Integer.parseInt(g);
				  ch.getLabel1().setFont(new Font("Arial",Font.BOLD,g1));
	         }
		});
	}
}
