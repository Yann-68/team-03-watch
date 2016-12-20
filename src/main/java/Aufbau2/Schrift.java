package Aufbau2;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentListener;

public class Schrift {
	private CreateFrame c = new CreateFrame();
	public Schrift(CreateFrame cr) {
		this.c = cr;
	}
	
	
	public void a(){
		
		 DocumentListener myListener = null;
	      JTextField text = new JTextField(5);
	     text.getDocument().addDocumentListener(myListener);
	 		
		 c.getContentPane().add(text,BorderLayout.NORTH);
		

	}		
}
