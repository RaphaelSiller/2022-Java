package StoppUhr;
import java.awt.Color;
import java.awt.Graphics;


public class Ball {
	// der Radius des Balles der nicht negativ sein darf. Der Standardwert wird auf
	// 0 gesetzt.
	private int radius = 0;

	// die X-Position des Balls vom Mittelpunkt des Balls aus gemessen. Diese wird
	// auf den Standardwert 60 gesetzt und darf nicht negativ sind.
	private int xposition = 60;

	// die Y-Position des Balls vom Mittelpunkt des Balls aus gemessen. Diese wird
	// auf den Standardwert 80 gesetzt und darf nicht negativ sein.
	private int yposition = 80;

	// die X-Richtung in der sich der Ball bewegt. Diese wird auf 0 gesetzt. Die
	// Richtungswerte können auch negativ sein.
	private int xrichtung = 0;

	// Die Y-Richtung in der sich der Ball bewegt. Diese wird auf 0 gesetzt und kann
	// auch negativ sein.
	private int yrichtung = 0;

	// Die Farbe des Balls vom Typ java.awt.Color. Die Standardfarbe wird Schwarz
	// (java.awt.Color.BLACK) gesetzt.
	private java.awt.Color farbe = java.awt.Color.BLACK;

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @return the xposition
	 */
	public int getXposition() {
		return xposition;
	}

	/**
	 * @return the yposition
	 */
	public int getYposition() {
		return yposition;
	}

	/**
	 * @return the xrichtung
	 */
	public int getXrichtung() {
		return xrichtung;
	}

	/**
	 * @return the yrichtung
	 */
	public int getYrichtung() {
		return yrichtung;
	}

	/**
	 * @return the farbe
	 */
	public java.awt.Color getFarbe() {
		return farbe;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * @param xposition the xposition to set
	 */
	public void setXposition(int xposition) {
		this.xposition = xposition;
	}

	/**
	 * @param yposition the yposition to set
	 */
	public void setYposition(int yposition) {
		this.yposition = yposition;
	}

	/**
	 * @param xrichtung the xrichtung to set
	 */
	public void setXrichtung(int xrichtung) {
		this.xrichtung = xrichtung;
	}

	/**
	 * @param yrichtung the yrichtung to set
	 */
	public void setYrichtung(int yrichtung) {
		this.yrichtung = yrichtung;
	}

	/**
	 * @param farbe the farbe to set
	 */
	public void setFarbe(java.awt.Color farbe) {
		this.farbe = farbe;
	}

	/**
	 * Gibt die Werte in Form eines Strings zurueck
	 * 
	 * @return String mit allen Werten in der Form: "r = 10, xposition = 20,
	 *         yposition = 70, xrichtung = 10, yrichtung = -5" zurueck liefert.
	 */
	public String toString() {
		String ret = ("r = " + this.radius + ", xposition = " + this.xposition + ", yposition = " + this.yposition
				+ ", xrichtung = " + this.xrichtung + ", yrichtung = " + this.yrichtung);

		return ret;
	}
	/**
	 * Setzt folgende Eigenschaften mit zufaelligen Werten.
	 * 		radius
	 * 			zwischen 2 und 40
	 * 		xrichtung/yrichtung
	 * 			zwischen -10 und 10, 0 kommt nicht vor
	 * 		farbe
	 * 			liegt im RGB-Spektrum
	 * 			
	 */
	public void setZufaellig() {
		// Radius
		radius = (int) (Math.random() * 38 + 2.5);
		// XRichtung
		do {
			xrichtung = (int) (Math.random() * 20 - 10);
		} while (xrichtung == 0);
		// YRichutng
		do {
			yrichtung = (int) (Math.random() * 20 - 10);
		} while (yrichtung == 0);
		// farbe
		farbe = new Color((int) (Math.random() * 255 + 0.5), (int) (Math.random() * 255 + 0.5),
				(int) (Math.random() * 255 + 0.5));
	}
	
	public void bewege(Graphics g, int breite, int hoehe) {
		int newXPosition = xposition + xrichtung;
		int newYPosition = yposition + yrichtung;
		
		//Kontrolle ob ueber linken Bereich
		if(xposition < 0 && xrichtung < 0) {
			xposition = 0;
			xrichtung *= -1;
		} else {
			//Kontrolle ob ueber rechten Bereich
			if (xposition + (2*radius) > breite && xrichtung > 0) {
				xposition = breite - (2*radius);
				xrichtung *= -1;
			} else {
				xposition = newXPosition;
			}
		}
		//Kontrolle ob ueber obern Bereich
		if(yposition < 0 && yrichtung < 0) {
			yposition = 0;
			yrichtung *= -1;
		} else {
			//Kontrolle ob ueber unteren Bereich
			if (yposition + (2*radius) > hoehe && yrichtung > 0) {
				yposition = hoehe - 2*radius;
				yrichtung *= -1;
			} else {
				yposition = newYPosition;
			}
		}
		//Ausgabe
		g.setColor(farbe);
		g.fillOval(xposition, yposition, radius*2, radius*2);
	}
}
