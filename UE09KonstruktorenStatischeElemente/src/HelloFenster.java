import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class HelloFenster extends JFrame{
	
	private static JTextField textField1;
	
	public static void main(String[] args) {
		//Erstellen des Fensters
		HelloFenster fenster1 = new HelloFenster();
		
		//Erstellen des Textfeldes
		textField1 = new JTextField();
		textField1.setLayout(null);
		textField1.setSize(450, 300) ;
		textField1.setFont(new Font("Dialog", Font.BOLD, 20));
		textField1.setEditable(false) ;
		textField1.setText("Hello world");
		textField1.setBounds (48, 24,193,49);
		textField1.setForeground(new Color(255));
		textField1.setBackground(new Color(12632256));
		
		//Hinzufügen des Textfeldes zum Fenster und sichtbar machen
		fenster1.add(textField1);
		fenster1.setVisible(true);
	}
	/**
	 * Konstruktor für ein Standartfenster
	 */
	public HelloFenster() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(250, 100);
		this.setLocation(50,50);
		this.setResizable(false);
		this.setTitle("Das Fenster zur Welt");
	}
}
