package Aufbau2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateFrame {

	private JFrame frame = new JFrame("Uhr");
	public JFrame getFrame() {
		return frame;
	}
	
	private Container contentPane = frame.getContentPane();	
	public Container getContentPane() {
		return contentPane;
	}

	private JButton b1 = new JButton("Swing");
	private JButton b2 = new JButton("Stop");
	private JButton b3 = new JButton("HintergrundsFarbe");
	private JButton b4 = new JButton("Textfarbe ");
	private JButton b5 = new JButton("ok");
	
	public JButton getB1() {
		return b1;
	}

	public JButton getB2() {
		return b2;
	}
	
	public JButton getB3() {
		return b3;
	}

	public JButton getB4() {
		return b4;
	}
	public JButton getB5() {
		return b5;
	}
	
	private JTextField te = new JTextField("Schriftgrösse");
	
	
	public JTextField getTe() {
		return te;
	}

	public void ecrit(){
		
		
		    
	   		frame.getContentPane().add(te,BorderLayout.NORTH);
	   	    te.setSize(200,40);
	        frame.getContentPane().add(b5,BorderLayout.NORTH);
	        b5.setSize(250,50);
			
	        JPanel panel3 = new JPanel();
			panel3.add(te);
			panel3.add(b5);
			frame.getContentPane().add(panel3,"North");
	}
	
	public void bouton(){	

		frame.getContentPane().add(b2,BorderLayout.SOUTH);
		frame.getContentPane().add(b1,BorderLayout.SOUTH);
        frame.getContentPane().add(b3, BorderLayout.EAST);
        frame.getContentPane().add(b4, BorderLayout.EAST);
       
		
        
		Insets insets = frame.getContentPane().getInsets();
		b1.resize(70, 30);
		b2.resize(70, 30);
		JPanel panel1 = new JPanel();
		panel1.add(b1);
		panel1.add(b2);
		frame.getContentPane().add(panel1,"South");
		JPanel panel2 = new JPanel();
		frame.getContentPane().add(panel2,"East");
		
		 panel2.setLayout(new GridBagLayout());
	     GridBagConstraints gbc3 = new GridBagConstraints();
	
		 gbc3.fill = GridBagConstraints.HORIZONTAL;
		 gbc3.weightx = 1;
		 gbc3.weighty = 3;		
		 panel2.add(b3, gbc3);
		 gbc3.gridy = 2;
		 panel2.add(b4, gbc3);
		 
		}
	
	public void fenster(){
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300); 
   		contentPane.setLayout(new BorderLayout());
   		
   		
   		
	
	}
	public void einlesenFrame() {	
							
	try {
		
		FileReader f = new FileReader ("src/frame.txt");
		char [] c = new char [1300];
		f.read(c);
		String sa = new String(c);
		String [] result = sa.split(";|\n|\\.");
		frame.setLocation(Integer.parseInt(result[0]), Integer.parseInt(result[1]));
		
	
		
	}catch(IOException e) {
		System.err.println("Fehler beim Einlesen der Datei");
		System.err.println(e.getMessage());
	}
		 frame.setVisible(true);
	
	}
	
	
}
