package TeamArbeitSonglisteV2;

import javax.swing.*; // JFrame, JTextField, JButton, JLabel
import java.awt.*; // Container
import java.awt.event.*; // Adapter, Listener, Events

public class SonglisteGUI extends JFrame
{
	
	public boolean isDarkModeActive = false;
	private JLabel l1 = null;
	private JLabel l2 = null;
	private JLabel l3 = null;
	private JLabel l4 = null;

	private JTextField t1 = null;
	private JTextField t2 = null;
	private JTextField t3 = null;
	private JTextField t4 = null;

	private JButton b1 = null;
	private JButton b2 = null;
	private JButton b3 = null;
	private JButton b4 = null;
	private JButton b5 = null;
	private JButton b6 = null;
	private JButton b7 = null;
	

	public SonglisteGUI(Songliste songliste) {
		setTitle("Songliste");
		setBounds(700, 400, 395, 255);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1 = new JLabel("Titel:"); // Label für Titel
		l1.setBounds(10, 10, 60, 30);
		l2 = new JLabel("Interpret:"); // Label für Intepret
		l2.setBounds(10, 40, 60, 30);
		l3 = new JLabel("Album:"); // Label für Album
		l3.setBounds(10, 70, 60, 30);
		l4 = new JLabel("Jahr:"); // Label für Jahr
		l4.setBounds(10, 100, 60, 30);

		t1 = new JTextField();
		t1.setBounds(70, 15, 300, 25);
		t2 = new JTextField();
		t2.setBounds(70, 45, 300, 25);
		t3 = new JTextField();
		t3.setBounds(70, 75, 300, 25);
		t4 = new JTextField();
		t4.setBounds(70, 105, 60, 25);

		b1 = new JButton();
		b1.setText("Erster");
		b1.setBounds(10, 140, 91, 35);
		b2 = new JButton();
		b2.setText("Voriger");
		b2.setBounds(100, 140, 91, 35);
		b3 = new JButton();
		b3.setText("Nächster");
		b3.setBounds(190, 140, 91, 35);
		b4 = new JButton();
		b4.setText("Letzter");
		b4.setBounds(280, 140, 91, 35);
		b5 = new JButton();
		b5.setText("Neu");
		b5.setBounds(10, 175, 111, 35);
		b6 = new JButton();
		b6.setText("Löschen");
		b6.setBounds(121, 175, 126, 35);
		b7 = new JButton();
		b7.setText("Alle löschen");
		b7.setBounds(247, 175, 124, 35);
		JButton JButtonDarkMode = new JButton();
    JButtonDarkMode.setBounds(340, 105, 30, 30);
    JButtonDarkMode.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			Color lightModeColor = new Color(255, 255, 255);
			Color darkModeColor = new Color(28, 31, 34);
			if(isDarkModeActive) {
				JButtonDarkMode.setBackground(lightModeColor);
				t1.setBackground(lightModeColor);
				t1.setForeground(darkModeColor);
				t2.setBackground(lightModeColor);
				t2.setForeground(darkModeColor);
				t3.setBackground(lightModeColor);
				t3.setForeground(darkModeColor);
				t4.setBackground(lightModeColor);
				t4.setForeground(darkModeColor);

				b1.setBackground(lightModeColor);
				b1.setForeground(darkModeColor);
				b2.setBackground(lightModeColor);
				b2.setForeground(darkModeColor);
				b3.setBackground(lightModeColor);
				b3.setForeground(darkModeColor);
				b4.setBackground(lightModeColor);
				b4.setForeground(darkModeColor);
				b5.setBackground(lightModeColor);
				b5.setForeground(darkModeColor);
				b6.setBackground(lightModeColor);
				b6.setForeground(darkModeColor);
				b7.setBackground(lightModeColor);
				b7.setForeground(darkModeColor);
				
				getContentPane().setBackground(lightModeColor);
				l1.setForeground(darkModeColor);
				l2.setForeground(darkModeColor);
				l3.setForeground(darkModeColor);
				l4.setForeground(darkModeColor);
				
				isDarkModeActive = false;
			} else {
				JButtonDarkMode.setBackground(darkModeColor);
				t1.setBackground(darkModeColor);
				t1.setForeground(lightModeColor);
				t2.setBackground(darkModeColor);
				t2.setForeground(lightModeColor);
				t3.setBackground(darkModeColor);
				t3.setForeground(lightModeColor);
				t4.setBackground(darkModeColor);
				t4.setForeground(lightModeColor);

				b1.setBackground(darkModeColor);
				b1.setForeground(lightModeColor);
				b2.setBackground(darkModeColor);
				b2.setForeground(lightModeColor);
				b3.setBackground(darkModeColor);
				b3.setForeground(lightModeColor);
				b4.setBackground(darkModeColor);
				b4.setForeground(lightModeColor);
				b5.setBackground(darkModeColor);
				b5.setForeground(lightModeColor);
				b6.setBackground(darkModeColor);
				b6.setForeground(lightModeColor);
				b7.setBackground(darkModeColor);
				b7.setForeground(lightModeColor);
				
				getContentPane().setBackground(darkModeColor);
				l1.setForeground(lightModeColor);
				l2.setForeground(lightModeColor);
				l3.setForeground(lightModeColor);
				l4.setForeground(lightModeColor);
				
				isDarkModeActive = true;
			}
		}
	});

		Container contentPane = // Komponenten zum Fenster fügen
				getContentPane();
		contentPane.setLayout(null);
		// add Label
		contentPane.add(l1);
		contentPane.add(l2);
		contentPane.add(l3);
		contentPane.add(l4);
		// add TextField
		contentPane.add(t1);
		contentPane.add(t2);
		contentPane.add(t3);
		contentPane.add(t4);
		// add Button
		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
		contentPane.add(b4);
		contentPane.add(b5);
		contentPane.add(b6);
		contentPane.add(b7);
		contentPane.add(JButtonDarkMode);
		setVisible(true);
		
		//Speichert die Aenderungen ab, wenn das Fenster geschlossen wird
		this.addWindowListener(new WindowAdapter() {
		    public void windowClosing(WindowEvent e) {
		    	saveChanges(songliste);
		        songliste.schreibenSongs();
		    }
		});
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveChanges(songliste);
				Song aktuellerSong = songliste.getAktueller();
				if (aktuellerSong.equals(songliste.getErster())) {
					JOptionPane.showMessageDialog(getContentPane(), "Am Anfang angekommen");
				} else {
					aktuellerSong = songliste.getErster();
					songAnzeigen(aktuellerSong);
				}
			}
		});
		
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveChanges(songliste);
				if (songliste.getNummerAktueller() < 1) {
					JOptionPane.showMessageDialog(getContentPane(), "Am Anfang angekommen");
				} else {
					Song aktuellerSong = songliste.getVoriger();
					songAnzeigen(aktuellerSong);
				}
			}
		});

		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				saveChanges(songliste);
				Song aktuellerSong;
				if ((aktuellerSong = songliste.getNaechster()) == null) {
					JOptionPane.showMessageDialog(getContentPane(), "Am Ende angekommen");
				} else {
					songAnzeigen(aktuellerSong);
				}
			}
		});

		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveChanges(songliste);
				Song aktuellerSong = songliste.getAktueller();
				if (aktuellerSong.equals(songliste.getLetzter())) {
					JOptionPane.showMessageDialog(getContentPane(), "Am Ende angekommen");
				} else {
					aktuellerSong = songliste.getLetzter();
					songAnzeigen(aktuellerSong);
				}
			}
		});

		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Song aktuellerSong = null;
					aktuellerSong = new Song();
					songliste.anfuegenNeuen(aktuellerSong);
					songAnzeigen(aktuellerSong);
				} catch (Exception e2) {

				}
			}
		});
		
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				songliste.loeschenAktuellen();
				songAnzeigen(songliste.getAktueller());
			}
		});
		
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				songliste.loeschenAlle();
				songAnzeigen(null);
				
			}
		});

	}
	
	private void saveChanges(Songliste songliste) {
		try {
			Song aktuellerSong = new Song(t1.getText(), t2.getText(), t3.getText(), Integer.parseInt(t4.getText()));
			songliste.aendernAktuellen(aktuellerSong);
		} catch (NumberFormatException e) {
			t4.setText("Muss eine Ganzzahl sein!");
		}
		
		
	}
	
	public void songAnzeigen(Song s) {
		if(s != null) {
			t1.setText(s.getTitel());
			t2.setText(s.getInterpret());
			t3.setText(s.getAlbum());
			t4.setText(String.valueOf(s.getErscheinungsjahr()));
		} else {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}
	}
}