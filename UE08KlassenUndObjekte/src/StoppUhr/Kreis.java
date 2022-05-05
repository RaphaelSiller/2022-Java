package StoppUhr;

public class Kreis {
	double radius;

	/**
	 * Erstellt ein Duplikat des Kreises auf den die Methode aufgerufen wird. Das
	 * Duplikat vom Typ Kreis wird zur�ck geliefert
	 * 
	 * @return das Duplikat des Kreises
	 */
	public Kreis clone() {
		Kreis ret = new Kreis();
		ret.setRadius(this.getRadius());
		return ret;
	}

	/**
	 * Kontrolliert, ob er Kreis kleiner als das �bergebene Kreisobjekt k ist (R�ckgabewert = -1), 
	 * gr��er (R�ckgabewert = 1) oder gleich dem �bergebenen Kreisobjekt k ist (R�ckgabewert = 0)
	 * @param k - das zu vergleichende Objekt
	 * @return -1 falls das Objekt kleiner als das �bergebene Objekt k ist
	 *  		0 falls das Objekt gleich dem �bergebenen Objekt k ist
	 *  		1 falls das Objekt gr��er als das �bergebene Objekt k ist
	 */
	public int compareTo(Kreis k) {
		int ret = 0;
		if (k.getRadius() < this.getRadius())
			ret = 1;
		if (k.getRadius() == this.getRadius())
			ret = 0;
		if (k.getRadius() > this.getRadius())
			ret = -1;
		return ret;
	}
	/**
	 * Kontrolliert ob der Kreis denselben Radius hat wie jener Kreis, welcher der Methode �bergeben wird
	 * @param k - das zu vergleichende Objekt
	 * @return true, falls der Kreis und das �bergebene Kreisobjekt denselben Radius haben
	 */
	public boolean equals(Kreis k) {
		boolean ret = false;
		if (k.getRadius() == this.getRadius())
			ret = true;
		return ret;
	}
	
	/**
	 * Liefert die Flaeche des Kreises zur�ck
	 * 
	 * @return die Flaeche des Kreises
	 */
	public double getFlaeche() {
		return Math.PI * Math.pow(radius, 2);
	}

	/**
	 * Liefert den Radius des Kreises zur�ck
	 * 
	 * @return den Radius des Kreises
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * Liefert den Umfang des Kreises zur�ck
	 * 
	 * @return den Umfang des Kreises
	 */
	public double getUmfang() {
		return 2*Math.PI*radius;
	}

	/**
	 * Setzt die Flaeche des Kreises. Die �bergebene Flaeche darf nicht 0 sein. Die
	 * Methode errechnet sich aus der Flaeche den Radius und setzt diesen
	 * 
	 * @param flaeche
	 *            - die zu setzende Flaeche
	 */
	public void setFlaeche(double flaeche) {
		if (flaeche != 0) {
			this.setRadius(Math.sqrt(flaeche / Math.PI));
		}
	}

	/**
	 * Setzt den Radius. Der Radius wird nur gesetzt, falls der �bergebene Parameter
	 * radius gr��er oder gleich 0 ist, ansonsten wird der Radius nicht gesetzt und
	 * der alte Wert des Radiuses beibehalten.
	 * 
	 * @param radius,
	 *            welcher gesetzt werden soll
	 */
	public void setRadius(double radius) {
		if (radius >= 0) {
			this.radius = radius;
		}
	}

	/**
	 * Setzt den Umfang des Kreises. Der �bergebene Umfang darf nicht 0 sein. Die
	 * Methode errechnet sich aus dem Umfang den Radius und setzt diesen
	 * 
	 * @param umfang
	 *            - der zu setzende Umfang
	 */
	public void setUmfang(double umfang) {
		this.setRadius(umfang / (2 * Math.PI));
	}

	/**
	 * Gibt die Stringentsprechung des Kreises zur�ck.
	 */
	public String toString() {
		String ret = ("r = " + this.getRadius() + ", U = " + this.getUmfang() + ", F = " + this.getFlaeche());
		return ret;
	}

}
