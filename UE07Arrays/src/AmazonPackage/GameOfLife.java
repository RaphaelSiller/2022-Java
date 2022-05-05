package AmazonPackage;
import java.awt.*;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

public class GameOfLife extends Applet {
	// Fixe Anzahl von Zeilen und Spalten
	static final int ANZAHL_ZEILEN = 50;
	static final int ANZAHL_SPALTEN = 50;
	// Maximale Anzahl von Iterationsschritten
	static final int MAX_SCHRITTE = 150;

	/**
	 * Diese Methode wird aufgerufen, wenn zum ersten Mal das Applet am Bildschirm
	 * erscheint. Sie wird aber auch dann aufgerufen, wenn das Applet neu am
	 * Bildschirm dargestellt werden muss (z. B. bei Gr��en�nderung)
	 */
	public void paint(Graphics g) {
		System.out.println("Start");
		// "Spielfl�che" erstellen
		boolean[][] matrix1 = new boolean[ANZAHL_ZEILEN][ANZAHL_SPALTEN];
		boolean[][] matrix2 = new boolean[ANZAHL_ZEILEN][ANZAHL_SPALTEN];
		// Erstes F�llen
		GameOfLifeMethoden.fuellenMatrixSternMitte(matrix1, 30);
//		GameOfLifeMethoden.fuellenMatrixZufaellig(matrix1, 0.5);
		int schrittZaehler = 0;
		do {
			ausgebenMatrix(g, matrix1);
			matrix2 = matrix1;
			matrix1 = GameOfLifeMethoden.berechneMatrix(matrix1);
			schrittZaehler++;
			GameOfLifeMethoden.bremse(100);
		} while (schrittZaehler < MAX_SCHRITTE && GameOfLifeMethoden.existierenUnterschiede(matrix1, matrix2));
		System.out.println("finished");
	}

	/**
	 * Gibt die �bergebene Matrix als Applet aus. False werden mit schwarzen, True
	 * werden mit grauen Rechtecken dargestellt.
	 * 
	 * @param g
	 * @param matrix,
	 *            die ausgegeben werden sollte
	 */
	public void ausgebenMatrix(Graphics g, boolean[][] matrix) {
		// Ermittle die Breite und H�he des Applets in Pixel
		int breite = getWidth();
		int hoehe = getHeight();
		int xOffset = 0;
		int yOffset = 0;

		// Ausgabe eines gef�llten Rechtecks
		int breiteFeld = (int) ((breite / ANZAHL_SPALTEN) * 0.95);
		int breiteRand = (breite / ANZAHL_SPALTEN) - breiteFeld;
		int hoeheFeld = (int) ((hoehe / ANZAHL_ZEILEN) * 0.95);
		int hoeheRand = (hoehe / ANZAHL_ZEILEN) - hoeheFeld;

		for (int i = 0; i < ANZAHL_ZEILEN; i++) {
			for (int j = 0; j < ANZAHL_SPALTEN; j++) {
				if (matrix[i][j] == true)
					g.setColor(Color.gray);
				else
					g.setColor(Color.black);

				g.fillRect(xOffset, yOffset, breiteFeld, hoeheFeld);
				xOffset += breiteFeld + breiteRand;
			}
			xOffset = 0;
			yOffset += hoeheFeld + hoeheRand;
		}

	}

}