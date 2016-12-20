package Aufbau2;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFarbe {

	private CreateFrame c = new CreateFrame();
	Chrono ch = new Chrono();
	
	public SaveFarbe(CreateFrame c,Chrono ch) {
			this.c = c;
			this.ch = ch;
		}

	public void hinterfarbe(){
 
		c.getFrame().addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent evt){
                	
     int r1 = c.getContentPane().getBackground().getRed();      	
     int v1 = c.getContentPane().getBackground().getGreen();  
     int b1 = c.getContentPane().getBackground().getBlue();  
         
     
	String r = Integer.toString(r1);
	String v = Integer.toString(v1);
	String b = Integer.toString(b1);
	
	
int r2 = ch.getLabel1().getForeground().getRed();      	
int v2 = ch.getLabel1().getForeground().getGreen();  
int b2 = ch.getLabel1().getForeground().getBlue();  



String r3 = Integer.toString(r2);
String v3 = Integer.toString(v2);
String b3 = Integer.toString(b2);

	
	
	File file = new File("src/saveFarbe.txt");
	String path = "src/saveFarbe.txt";
	
	try (BufferedWriter buffer = new BufferedWriter(new FileWriter(new File(path)))){
	buffer.write(r + ";"+ v + ";" + b + "\n" + r3 + ";" + v3 + ";" + b3 + "\n");
	} catch (IOException e) {
	e.printStackTrace();
	}
   

	}
	});
	}
	

	
}
