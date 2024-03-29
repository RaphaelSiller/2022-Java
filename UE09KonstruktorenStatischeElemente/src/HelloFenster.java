import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HelloFenster extends JFrame{
	
	private static JTextField textField1;
	
	public static void main(String[] args) {
		//Erstellen des Fensters
		HelloFenster fenster1 = new HelloFenster();
		
		//Erstellen des Textfeldes
		textField1 = new JTextField();
		textField1.setLayout(null);
		textField1.setSize(900, 450) ;
		textField1.setFont(new Font("Dialog", Font.BOLD, 20));
		textField1.setEditable(false) ;
		textField1.setText("Hello world");
		textField1.setBounds (48, 24,193,49);
		textField1.setForeground(new Color(255));
		textField1.setBackground(new Color(12632256));
		
		JButton darkMode = new JButton();
		darkMode.setBounds(100, 50, 50, 50);
		boolean isDarkModeActive = false;
		
		darkMode.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isDarkModeActive) {
					Color darkModeColor = new Color(28, 31, 34);
					darkMode.setBackground(darkModeColor);
					isDarkModeActive = true;
				} else {
					Color lightModeColor = new Color(28, 31, 34);
					darkMode.setBackground(lightModeColor);
					isDarkModeActive = true;
				}
			}
		});
		
		//Hinzuf�gen des Textfeldes zum Fenster und sichtbar machen
		fenster1.add(textField1);
		fenster1.add(darkMode);
		fenster1.setVisible(true);
	}
	/**
	 * Konstruktor f�r ein Standartfenster
	 */
	public HelloFenster() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(250, 100);
		this.setLocation(50,50);
		this.setResizable(false);
		this.setTitle("Das Fenster zur Welt");
	}
}
