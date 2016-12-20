package Aufbau1;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Insets;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CreateFrame {

	private JFrame frame = new JFrame("Uhr");
	public JFrame getFrame() {
		return frame;
	}
	
	private Container contentPane = frame.getContentPane();	
	public Container getContentPane() {
		return contentPane;
	}

	JButton b1 = new JButton("Swing");
	JButton b2 = new JButton("Stop");
	public JButton getB1() {
		return b1;
	}

	public JButton getB2() {
		return b2;
	}
	
	
	public void bouton(){	

		frame.getContentPane().add(b2,BorderLayout.SOUTH);
		frame.getContentPane().add(b1,BorderLayout.SOUTH);

		Insets insets = frame.getContentPane().getInsets();
		b1.resize(70, 30);
		b2.resize(70, 30);
		JPanel Panel1 = new JPanel();
		Panel1.add(b1);
		Panel1.add(b2);
		frame.getContentPane().add(Panel1,"South");
		
	}
	
	public void fenster(){
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(160,150);       		
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
