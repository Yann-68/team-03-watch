package Aufbau2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JColorChooser;

	

public class Farbe{
	
	CreateFrame r = new CreateFrame();
	Chrono ch = new Chrono();
	
public Farbe(CreateFrame r,Chrono ch) {
		this.r = r;
		this.ch = ch;
	}

 public void  hinter() {


try {
	
	FileReader f = new FileReader ("src/saveFarbe.txt");
	char [] c = new char [1300];
	f.read(c);
	String sa = new String(c);
	String [] result = sa.split(";|\n|\\.");
	int rot = Integer.parseInt(result[0]);
	int grun = Integer.parseInt(result[1]);
	int blau = Integer.parseInt(result[2]);
	Color nvl = new Color(rot,grun,blau);
    r.getContentPane().setBackground(nvl);
	
}catch(IOException e) {
	System.err.println("Fehler beim Einlesen der Datei");
	System.err.println(e.getMessage());
}

			
	r.getB3().addActionListener(new ActionListener()
	{		
       public void actionPerformed(ActionEvent e) {
	     
    	   Color couleur = JColorChooser.showDialog
            (null, "couleur du fond", Color.BLUE);
           r.getContentPane().setBackground(couleur);
    
       }
});
	
	}
 
	public void schrift(){
		try {
			
			FileReader f = new FileReader ("src/saveFarbe.txt");
			char [] c = new char [1300];
			f.read(c);
			String sa = new String(c);
			String [] result = sa.split(";|\n|\\.");
			int rot = Integer.parseInt(result[3]);
			int grun = Integer.parseInt(result[4]);
			int blau = Integer.parseInt(result[5]);
			Color nvl = new Color(rot,grun,blau);
		    ch.getLabel1().setForeground(nvl);
			
		}catch(IOException e) {
			System.err.println("Fehler beim Einlesen der Datei");
			System.err.println(e.getMessage());
		}

					
			r.getB4().addActionListener(new ActionListener()
			{		
		       public void actionPerformed(ActionEvent e) {
			     
		    	   Color couleur = JColorChooser.showDialog
		            (null, "couleur du text", Color.BLUE);
		          ch.getLabel1().setForeground(couleur);
		       }
		});
	}
	
	
}
