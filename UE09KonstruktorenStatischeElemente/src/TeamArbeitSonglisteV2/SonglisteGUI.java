package TeamArbeitSonglisteV2;

import javax.swing.*; // JFrame, JTextField, JButton, JLabel
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*; // Container
import java.awt.event.*; // Adapter, Listener, Events
import java.io.File;

public class SonglisteGUI extends JFrame {

	public boolean isDarkModeActive = false;
	private JLabel labelTitel = null;
	private JLabel labelInterpret = null;
	private JLabel labelAlbum = null;
	private JLabel labelJahr = null;
	// private JLabel labelDarkmode = null;
	// private JLabel labelLightmode = null;

	private JTextField textfTitel = null;
	private JTextField textfInterpret = null;
	private JTextField textfAlbum = null;
	private JTextField textfJahr = null;

	private JButton buttonErster = null;
	private JButton buttonVoriger = null;
	private JButton buttonNaechster = null;
	private JButton buttonLetzter = null;
	private JButton buttonNeu = null;
	private JButton buttonLoeschen = null;
	private JButton buttonLoeschenAlle = null;

	public SonglisteGUI(Songliste songliste) {
		setTitle("Songliste");
		setBounds(700, 400, 395, 255);
		
		JFileChooser fileChooser = new JFileChooser();
		int returnValue = fileChooser.showOpenDialog(getContentPane());
		
		//Wenn korrekte DateiAngabe, ansonsten Defaultwert (welcher der DokumentOrdner ist
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File inputOutputDatei = fileChooser.getSelectedFile();
			songliste.setPfad(inputOutputDatei.getAbsolutePath());
		} else
			songliste.setPfad(fileChooser.getFileSystemView().getDefaultDirectory().toString() + "\\Songliste.csv");
		
		songliste.lesenSongs();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		labelTitel = new JLabel("Titel:"); // Label für Titel
		labelTitel.setBounds(10, 10, 60, 30);
		labelInterpret = new JLabel("Interpret:"); // Label für Intepret
		labelInterpret.setBounds(10, 40, 60, 30);
		labelAlbum = new JLabel("Album:"); // Label für Album
		labelAlbum.setBounds(10, 70, 60, 30);
		labelJahr = new JLabel("Jahr:"); // Label für Jahr
		labelJahr.setBounds(10, 100, 60, 30);

		textfTitel = new JTextField();
		textfTitel.setBounds(70, 15, 300, 25);
		textfInterpret = new JTextField();
		textfInterpret.setBounds(70, 45, 300, 25);
		textfAlbum = new JTextField();
		textfAlbum.setBounds(70, 75, 300, 25);
		textfJahr = new JTextField();
		textfJahr.setBounds(70, 105, 60, 25);

		buttonErster = new JButton();
		buttonErster.setText("Erster");
		buttonErster.setBounds(10, 140, 91, 35);
		buttonVoriger = new JButton();
		buttonVoriger.setText("Voriger");
		buttonVoriger.setBounds(100, 140, 91, 35);
		buttonNaechster = new JButton();
		buttonNaechster.setText("N�chster");
		buttonNaechster.setBounds(190, 140, 91, 35);
		buttonLetzter = new JButton();
		buttonLetzter.setText("Letzter");
		buttonLetzter.setBounds(280, 140, 91, 35);
		buttonNeu = new JButton();
		buttonNeu.setText("Neu");
		buttonNeu.setBounds(10, 175, 111, 35);
		buttonLoeschen = new JButton();
		buttonLoeschen.setText("L�schen");
		buttonLoeschen.setBounds(121, 175, 126, 35);
		buttonLoeschenAlle = new JButton();
		buttonLoeschenAlle.setText("Alle l�schen");
		buttonLoeschenAlle.setBounds(247, 175, 124, 35);
		JButton buttonDarkmode = new JButton();

		buttonDarkmode.setBounds(340, 105, 30, 30);
		buttonDarkmode.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Color lightModeColor = new Color(255, 255, 255);
				Color darkModeColor = new Color(28, 31, 34);
				if (isDarkModeActive) {
					buttonDarkmode.setBackground(lightModeColor);
					textfTitel.setBackground(lightModeColor);
					textfTitel.setForeground(darkModeColor);
					textfInterpret.setBackground(lightModeColor);
					textfInterpret.setForeground(darkModeColor);
					textfAlbum.setBackground(lightModeColor);
					textfAlbum.setForeground(darkModeColor);
					textfJahr.setBackground(lightModeColor);
					textfJahr.setForeground(darkModeColor);

					buttonErster.setBackground(lightModeColor);
					buttonErster.setForeground(darkModeColor);
					buttonVoriger.setBackground(lightModeColor);
					buttonVoriger.setForeground(darkModeColor);
					buttonNaechster.setBackground(lightModeColor);
					buttonNaechster.setForeground(darkModeColor);
					buttonLetzter.setBackground(lightModeColor);
					buttonLetzter.setForeground(darkModeColor);
					buttonNeu.setBackground(lightModeColor);
					buttonNeu.setForeground(darkModeColor);
					buttonLoeschen.setBackground(lightModeColor);
					buttonLoeschen.setForeground(darkModeColor);
					buttonLoeschenAlle.setBackground(lightModeColor);
					buttonLoeschenAlle.setForeground(darkModeColor);

					getContentPane().setBackground(lightModeColor);
					labelTitel.setForeground(darkModeColor);
					labelInterpret.setForeground(darkModeColor);
					labelAlbum.setForeground(darkModeColor);
					labelJahr.setForeground(darkModeColor);

					isDarkModeActive = false;
				} else {
					buttonDarkmode.setBackground(darkModeColor);
					textfTitel.setBackground(darkModeColor);
					textfTitel.setForeground(lightModeColor);
					textfInterpret.setBackground(darkModeColor);
					textfInterpret.setForeground(lightModeColor);
					textfAlbum.setBackground(darkModeColor);
					textfAlbum.setForeground(lightModeColor);
					textfJahr.setBackground(darkModeColor);
					textfJahr.setForeground(lightModeColor);

					buttonErster.setBackground(darkModeColor);
					buttonErster.setForeground(lightModeColor);
					buttonVoriger.setBackground(darkModeColor);
					buttonVoriger.setForeground(lightModeColor);
					buttonNaechster.setBackground(darkModeColor);
					buttonNaechster.setForeground(lightModeColor);
					buttonLetzter.setBackground(darkModeColor);
					buttonLetzter.setForeground(lightModeColor);
					buttonNeu.setBackground(darkModeColor);
					buttonNeu.setForeground(lightModeColor);
					buttonLoeschen.setBackground(darkModeColor);
					buttonLoeschen.setForeground(lightModeColor);
					buttonLoeschenAlle.setBackground(darkModeColor);
					buttonLoeschenAlle.setForeground(lightModeColor);

					getContentPane().setBackground(darkModeColor);
					labelTitel.setForeground(lightModeColor);
					labelInterpret.setForeground(lightModeColor);
					labelAlbum.setForeground(lightModeColor);
					labelJahr.setForeground(lightModeColor);

					isDarkModeActive = true;
				}
			}
		});

		Container contentPane = // Komponenten zum Fenster fügen
				getContentPane();
		contentPane.setLayout(null);
		// add Label
		contentPane.add(labelTitel);
		contentPane.add(labelInterpret);
		contentPane.add(labelAlbum);
		contentPane.add(labelJahr);
		// add TextField
		contentPane.add(textfTitel);
		contentPane.add(textfInterpret);
		contentPane.add(textfAlbum);
		contentPane.add(textfJahr);
		// add Button
		contentPane.add(buttonErster);
		contentPane.add(buttonVoriger);
		contentPane.add(buttonNaechster);
		contentPane.add(buttonLetzter);
		contentPane.add(buttonNeu);
		contentPane.add(buttonLoeschen);
		contentPane.add(buttonLoeschenAlle);
		contentPane.add(buttonDarkmode);
		setResizable(false);
		setVisible(true);
	
		// Speichert die Aenderungen ab, wenn das Fenster geschlossen wird
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				saveChanges(songliste);
				songliste.schreibenSongs();
			}
		});

		buttonErster.addActionListener(new ActionListener() {
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

		buttonVoriger.addActionListener(new ActionListener() {
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

		buttonNaechster.addActionListener(new ActionListener() {

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

		buttonLetzter.addActionListener(new ActionListener() {
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

		buttonNeu.addActionListener(new ActionListener() {
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

		buttonLoeschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(getContentPane(), "Wirklich alle Tracks l�schen?", "rm -rf /*.mp3",
						JOptionPane.YES_NO_OPTION) == (JOptionPane.YES_OPTION)) {
					songliste.loeschenAktuellen();
					songAnzeigen(songliste.getAktueller());
				}
			}
		});

		buttonLoeschenAlle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(getContentPane(), "Diesen Track wirklich l�schen?", "L�schen",
						JOptionPane.YES_NO_OPTION) == (JOptionPane.YES_OPTION)) {
					songliste.loeschenAlle();
					songAnzeigen(null);
				}
			}
		});

	}

	private void saveChanges(Songliste songliste) {
		try {
			Song aktuellerSong = new Song(textfTitel.getText(), textfInterpret.getText(), textfAlbum.getText(),
					Integer.parseInt(textfJahr.getText()));
			songliste.aendernAktuellen(aktuellerSong);
		} catch (NumberFormatException e) {
			textfJahr.setText("Muss eine Ganzzahl sein!");
			JOptionPane.showMessageDialog(getContentPane(), "Nur Ganzzahl sind g�ltig; �nderung nicht gespeichert");
		}
	}

	public void songAnzeigen(Song s) {
		if (s != null) {
			textfTitel.setText(s.getTitel());
			textfInterpret.setText(s.getInterpret());
			textfAlbum.setText(s.getAlbum());
			textfJahr.setText(String.valueOf(s.getErscheinungsjahr()));
		} else {
			textfTitel.setText("");
			textfInterpret.setText("");
			textfAlbum.setText("");
			textfJahr.setText("");
		}
	}
}
