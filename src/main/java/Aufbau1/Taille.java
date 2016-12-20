package Aufbau1;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Taille{
	
	private CreateFrame c = new CreateFrame();
	public Taille(CreateFrame cr) {
		this.c = cr;
	}


	public void save(){
		
		c.getFrame().addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent evt){
        
	 int a2=c.getFrame().getX();
	 int a3=c.getFrame().getY();
			
	String a = Integer.toString(a2);
	String b = Integer.toString(a3);
	
	File file = new File("src/frame.txt");
	String path = "src/frame.txt";
	
	try (BufferedWriter buffer = new BufferedWriter(new FileWriter(new File(path)))){
	buffer.write(a + ";"+ b + "\n");
	} catch (IOException e) {
	e.printStackTrace();
	}
   

	}
	});
	}
	}


