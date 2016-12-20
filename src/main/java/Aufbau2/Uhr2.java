package Aufbau2;
import java.awt.BorderLayout;

public class Uhr2 {
   
    
	public void uhr() {
		 CreateFrame cf = new CreateFrame();
	     Chrono init = new Chrono();
		 Lancement l  = new Lancement(init,cf);
		 Taille t = new Taille(cf);  
		 Farbe h = new Farbe(cf,init);
		 SaveFarbe s = new SaveFarbe(cf, init);
		 Schrift a = new Schrift(cf);
		 
	a.a();
	cf.fenster();
	h.hinter();
	h.schrift();
	cf.einlesenFrame();
	cf.bouton();
	
    cf.getContentPane().add(init.getLabel1(),BorderLayout.CENTER);
	cf.getFrame().setVisible(true);
	
     l.swing();
	 l.stop();
		
	 t.save();
	 s.hinterfarbe();
	 
	 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     	
		new Uhr2().uhr();
		

	}

}

