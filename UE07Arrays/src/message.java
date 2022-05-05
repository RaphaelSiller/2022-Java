/**
 * importiert die Pakete java.awt und java.applet, damit im Applet die Klassen
 * Applet und Graphics verwendet werden k�nnen
 */
import java.applet.Applet;
import java.awt.*;

/**
 * Testapplet, welches zeigt wie Rechtecke und Linien in verschiedenen Farben auf
 * einer Zeichenfl�che im Applet ausgegeben werden k�nnen.
 * ACHTUNG: Java-Applets m�ssen anders gestartet werden als normale Java-Programme
 * @author Michael Wild
 *
 * Die Klasse TestGrafikAusgabe ist von der Klasse Applet abgeleitet und erbt somit
 * alle Eigenschaften, die ein Applet hat. Durch die Ableitung (Vererbung) wird die
 * Klasse TestGrafikAusgabe zum Applet
 */
public class message extends Applet
{
	// Fixe Anzahl von Zeilen und Spalten
	static final int ANZAHL_ZEILEN = 31;
	static final int ANZAHL_SPALTEN = 31;
	// Maximale Anzahl von Iterationsschritten
	static final int MAX_SCHRITTE = 150;

	/*
	 * Gibt einen booleanArray mit schwarzen blöcken für
	 * true und grauen für false aus
	 * @param g das darauf zu zeichnende Graphics
	 * @param breite des applets
	 * @param hoehe des applets
	 * @param auszugebende matrix
	 */
	public static void ausgebenMatrix(Graphics g,int breite,int hoehe,boolean[][] matrix) {
		for(int i=0;i<ANZAHL_ZEILEN;i++) {
	    for(int j=0;j<ANZAHL_SPALTEN;j++) {
	    	if(matrix[i][j]==true) {
	    		g.setColor(Color.black);
	    	}else {
	    		g.setColor(Color.gray);
	    		}
	    	g.fillRect(j*breite/ANZAHL_ZEILEN,i*(hoehe/ANZAHL_SPALTEN),breite / ANZAHL_ZEILEN-1, hoehe / ANZAHL_SPALTEN-1);
	    }
    }
	}
	
	/*
	 * füllt di matrix übergebene Matrix mit einem Stern der größe gs
	 * wenn gs 0 ist wird nur ein einzelner punkt in der mitte gefüllt
	 * @param gs größse des sterns
	 * @param die zu verädnernde matrix
	 * @return die matrix
	 */
	public static boolean[][] fuellenMatrixSternMitte(int gs,boolean[][] matrix) {
		boolean[][] ret=matrix;
		ret[ANZAHL_ZEILEN/2][ANZAHL_SPALTEN/2]=true;
		if(gs>0) {
			for (int i=1;i<=gs;i++) {
				ret[ANZAHL_ZEILEN/2][ANZAHL_SPALTEN/2-i]=true;
				ret[ANZAHL_ZEILEN/2][ANZAHL_SPALTEN/2+i]=true;
				ret[ANZAHL_ZEILEN/2-i][ANZAHL_SPALTEN/2]=true;
				ret[ANZAHL_ZEILEN/2+i][ANZAHL_SPALTEN/2]=true;
			}
		}
		return ret;
	}
	
	/*
	 * Liefert die anzahl der nachbarn eines elements
	 * mit dem wert true zurück
	 * @param zeile position des elemets
	 * @param spalte position des elements
	 * @param die matrix
	 * @return die anzahl der nachbarn
	 */
	public static int anzahlLebendeNachbaren(int zeile,int spalte,boolean[][]matrix) {
		int ret=0;
		for(int i=-1;i<2;i++) {
			for (int j=-1;j<2;j++) {
				if (zeile-1>=0&&spalte-1>=0&&zeile+1<=ANZAHL_ZEILEN-1&&spalte+1<=ANZAHL_SPALTEN-1) {
					if(matrix[zeile+i][spalte+j]==true&&(i!=0||j!=0)) {
						ret++;
					}
				}
			}
		}
		return ret;
	}
	
	/*
	 * Diese Methode verwendet die vorige Methode, um einen neuen Lebenszyklus für
	 * die ihr übergebene Matrix zu berechnen. Das neu berechnete Leben wird in
	 * einer neuen Matrix zurück geliefert. Dabei wird die alte Matrix nicht
	 * geändert.
	 * @param die alte matrix
	 * @return neu berechnete matrix
	 */
	public static boolean[][] berechneMatrix(boolean[][] matrix){
		boolean[][] ret=new boolean[ANZAHL_ZEILEN][ANZAHL_SPALTEN];
		for (int i=0;i<ANZAHL_ZEILEN;i++) {
			for (int j=0;j<ANZAHL_SPALTEN;j++) {
				int anz=anzahlLebendeNachbaren(i,j,matrix);
				if(matrix[i][j]==true&&anz>1&&anz<4) {
					ret[i][j]=true;
				}else if (matrix[i][j]==false&&anz==3) {
					ret[i][j]=true;
				}
			}
		}
		return ret;
	}
	
	/*
	 * Kontrolliert ob die beiden ihr übergebenen Matrizen unterschiedlich sind oder
	 * nicht. Sie liefert true zurück, falls die Matrizen an unterschiedlichen
	 * Stellen gefüllt sind.
	 * @param erste matrix
	 * @param zweite matrix
	 * @return Unterschiede oder nicht
	 */
	public static boolean existierenUnterschiede(boolean[][] matrix1,boolean[][] matrix2) {
		boolean ret=false;
		for (int i=0;i<ANZAHL_ZEILEN;i++) {
			for (int j=0;j<ANZAHL_SPALTEN;j++) {
				if(matrix1[i][j]!=matrix2[i][j]) {
					ret=true;
					i=ANZAHL_ZEILEN;
					j=ANZAHL_SPALTEN;
				}
			}
		}
		return ret;
	}
	
	/**
	 * Veranlasst dass das Programm millis Millisekunden pausiert
	 * @param millis Anzahl der Millisekunden die gewartet werden
	 */
	public void bremse(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		}
	}

	
	/*
	 * Der übergebene Matrix wird an zufälligen true Leben einfügt.
	 * Der Methode wird auch ein Verhältnis übergeben, das ihr sagt wie das
	 * Verhältnis zwischen gefüllten und nicht gefüllten Positionen sein soll. Das
	 * Verhältnis 0.1 bedeutet, dass 10% der Positionen mit Leben gefüllt werden
	 * sollen.
	 * @param die zu verändernde Matrix
	 * @param das Verhältnis
	 * @return dei veränderte Matrix
	 */
	public static boolean[][] fuellenMatrixZufaellig(boolean[][] matrix, double d){
		boolean[][] ret=matrix;
		for (int i=0; i<(d*ANZAHL_SPALTEN*ANZAHL_ZEILEN);i++){
			int rand1=(int)(Math.random()*ANZAHL_ZEILEN);
			int rand2=(int)(Math.random()*ANZAHL_SPALTEN);
			if(ret[rand1][rand2]==false) {
				ret[rand1][rand2]=true;
			}else {
				i--;
			}
		}
		return ret;
	}
	
	/* wie die Main -Methode
	 * macht ein Applet welcher das game of life darstellt
	 */	
	public void paint(Graphics g) {
		System.out.println("Start");
		// Ermittle die Breite und H�he des Applets in Pixel
		int breite = getWidth();
    int hoehe = getHeight();
    boolean[][] matrix1 = new boolean[ANZAHL_ZEILEN][ANZAHL_SPALTEN];
    boolean[][] matrix2 = new boolean[ANZAHL_ZEILEN][ANZAHL_SPALTEN];
    matrix1=fuellenMatrixSternMitte(14,matrix1);
    int schritte=0;
    do {
    	ausgebenMatrix(g,breite,hoehe,matrix1);
    	matrix2=matrix1;
    	matrix1=berechneMatrix(matrix2);
    	bremse(1000);
    	schritte++;
    }while(schritte<MAX_SCHRITTE&&existierenUnterschiede(matrix1,matrix2));
  }
}
