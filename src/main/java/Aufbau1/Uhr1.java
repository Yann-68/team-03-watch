package Aufbau1;
import java.awt.*;

public class Uhr1 {
   
    
	public void uhr() {
		 CreateFrame cf = new CreateFrame();
	     Chrono init = new Chrono();
		 Lancement l  = new Lancement(init,cf);
		 Taille t = new Taille(cf);  
		 
	cf.fenster();	 
	cf.einlesenFrame();
	cf.bouton();
	
    cf.getContentPane().add(init.getLabel1(),BorderLayout.CENTER);
	cf.getFrame().setVisible(true);
	
     l.swing();
	 l.stop();
		
	 t.save();
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     	
		new Uhr1().uhr();
		

	}

}
