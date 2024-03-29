package Kreisberechnung;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KreisGUI extends JFrame {
	
	public KreisGUI () {
		this.setTitle("Kreisberechnung");
		this.setBounds(10,10,310,210);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		JLabel labelRadius = new JLabel("Radius:");
		JLabel labelUmfang = new JLabel("Umfang:");
		JLabel labelFlaeche = new JLabel("Fl�che:");
		JTextField textfRadius = new JTextField();
		JTextField textfUmfang = new JTextField();
		JTextField textfFlaeche = new JTextField();
		JButton buttonBerechne = new JButton("Berechne");
		
		//Komponenten definieren
		labelRadius.setBounds(10, 10, 100, 25);
		labelRadius.setFont(new Font("NotoMono-Regular", Font.PLAIN, 20));
		labelUmfang.setBounds(10, 40, 100, 25);
		labelUmfang.setFont(new Font("NotoMono-Regular", Font.PLAIN, 20));
		labelFlaeche.setBounds(10, 70, 100, 25);
		labelFlaeche.setFont(new Font("NotoMono-Regular", Font.PLAIN, 20));
		textfRadius.setBounds(90, 10, 200, 25);
		textfUmfang.setBounds(90, 40, 200, 25);
		textfFlaeche.setBounds(90, 70, 200, 25);
		buttonBerechne.setBounds(10, 110, 280, 50);
		
		//Komponenenten zur ContentPane hinzufuegen
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		contentPane.add(labelRadius);
		contentPane.add(labelUmfang);
		contentPane.add(labelFlaeche);
		contentPane.add(textfRadius);
		contentPane.add(textfUmfang);
		contentPane.add(textfFlaeche);
		contentPane.add(buttonBerechne);
		
		setVisible(true);
		
		//Berechnung vom Kreis
		Kreis kreis = new Kreis();
		kreis.setRadius(0);
		//Vermeiden eines NUmberFormatException. Sonst muesste BEnutzer alle drei Felder ausfuellen
		textfRadius.setText(String.valueOf(kreis.getRadius()));
		textfUmfang.setText(String.valueOf(kreis.getUmfang()));
		textfFlaeche.setText(String.valueOf(kreis.getFlaeche()));
		
		//Actionlistener fuer die Kreisberechnung
		buttonBerechne.addActionListener(new ActionListener() {
			//@Override
			public void actionPerformed(ActionEvent e) {
				try {
					//Lesen der Variablen
					double radius = (Double.parseDouble(textfRadius.getText()));
					double umfang = (Double.parseDouble(textfUmfang.getText()));
					double flaeche =(Double.parseDouble(textfFlaeche.getText()));
//					System.out.println("Radius: " + radius + "\nUmfang: " + umfang + "\nFlaeche: " + flaeche);
					
					//Herausfinden, welche Variable sich geaendert hat, dann diese setzen
					boolean hasNotChanged = true;
					if(!(kreis.getRadius()-0.1 < radius && radius < kreis.getRadius()+0.1) && hasNotChanged) {
						kreis.setRadius(radius);
						hasNotChanged = false;
					}
					
					if(!(kreis.getUmfang()-0.1 < umfang && umfang < kreis.getUmfang()+0.1) && hasNotChanged) {
						kreis.setUmfang(umfang);
						hasNotChanged = false;
					}
					
					if(!(kreis.getFlaeche()-0.1 < flaeche && flaeche < kreis.getFlaeche()+0.1) && hasNotChanged) {
						kreis.setFlaeche(flaeche);
					}
					
//					System.out.println("Radius: " + kreis.getRadius() + "\nUmfang: " + kreis.getUmfang() + "\nFlaeche: " + kreis.getFlaeche());
					//Ausgeben der berechneten Werte
					textfRadius.setText(String.valueOf(kreis.getRadius()));
					textfUmfang.setText(String.valueOf(kreis.getUmfang()));
					textfFlaeche.setText(String.valueOf(kreis.getFlaeche()));
				} catch (NumberFormatException e1) {
					//Wenn Eingebae fehlerhaft ist, werden die werte auf 0 gesetzt
					kreis.setRadius(0);
					textfRadius.setText(String.valueOf(kreis.getRadius()));
					textfUmfang.setText(String.valueOf(kreis.getUmfang()));
					textfFlaeche.setText(String.valueOf(kreis.getFlaeche()));
				}
			}
		});
	}
}
