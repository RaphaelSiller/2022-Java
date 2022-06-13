package FressenUndGefressenWerden;

public class BeweglichesGutesObjekt extends UnbeweglichesObjekt {
	// Die Geschwindigkeit der anzulegenden Objekte.
	protected static int geschwindigkeit;
	private bool isStuck = false;
	// X- und Y-Richtung des Objektes.
	protected int xRichtung;
	protected int yRichtung;

	// Erhält das Bild, welches dargestellt werden soll.
	public BeweglichesGutesObjekt(java.lang.String dateiname) {
		super(dateiname);
	}

	/**
	 * Versucht das Objekt in die eingestellte Richtung zu bewegen. Erfolgt
	 * bei der schrittweisen Bewegung des Objektes ein Zusammenprall mit einem
	 * anderen Objekt oder mit dem Fensterrand muss ausgewichen werden.
	 */
	void bewege() {
		int xSchrittRichtung = xRichtung > 0 ? 1 : -1;
		int ySchrittRichtung = yRichtung > 0 ? 1 : -1;
		for(int schritt = 0; schritt < Math.abs(xRichtung); schritt++) {
			if(this.getObjektBei(getX() + xSchrittRichtung, getY() + ySchrittRichtung) == null) {//Wenn Weg frei ist
				this.setLocation(getX() + xSchrittRichtung, getY() + ySchrittRichtung);
			} else if(this.getObjektBei(getX() - xSchrittRichtung, getY() + ySchrittRichtung) == null) {
				xRichtung *= -1;
				schritt = Math.abs(xRichtung); //TODO find out why sandwiches are stuck when hitting something on the right side
			} else if(this.getObjektBei(getX() + xSchrittRichtung, getY() - ySchrittRichtung) == null) {
				yRichtung *= -1;
				schritt = Math.abs(xRichtung);
			} else {
				xRichtung *= -1; yRichtung *= -1;
				schritt = Math.abs(xRichtung);
			}
		}
	}

	/**
	 * Liefert die momentane X-Richtung des Objektes. Ist die Richtung negativ,
	 * bewegt sich das Objekt nach links, sonst nach rechts
	 * 
	 * @return die X-Richtung des Objektes
	 */
	public int getxRichtung() {
		return xRichtung;
	}

	/**
	 * Setzt die X-Richtung des Objektes. Dabei wird die Y-Richtung entsprechen
	 * angepasst. Ist beispielsweise die Y-Richtung auf -3 gesetzt und die
	 * X-Richtung wird auf 5 eingestellt, so muss die Y-Richtung auf -5 eingestellt
	 * werden, den X- und Y-Richtung müssen betragsmäßig immer gleich sein
	 * 
	 * @param xRichtungs
	 *            - die eingestellt werden soll
	 */
	public void setxRichtung(int xRichtung) {
		this.xRichtung = xRichtung;
		if (yRichtung >= 0)
			yRichtung = Math.abs(xRichtung);
		else
			yRichtung = 0-Math.abs(xRichtung);
	}

	/**
	 * Liefert die momentane Y-Richtung des Objektes. Ist die Richtung negativ,
	 * bewegt sich das Objekt nach oben, sonst nach unten
	 * 
	 * @return die Y-Richtung des Objektes
	 */
	public int getyRichtung() {
		return yRichtung;
	}

	/**
	 * Setzt die Y-Richtung des Objektes. Dabei wird die X-Richtung entsprechen
	 * angepasst. Ist beispielsweise die X-Richtung auf -3 gesetzt und die
	 * Y-Richtung wird auf 5 eingestellt, so muss die X-Richtung auf -5 eingestellt
	 * werden, den X- und Y-Richtung müssen betragsmäßig immer gleich sein
	 * 
	 * @param yRichtung
	 *            - die eingestellt werden soll
	 */
	public void setyRichtung(int yRichtung) {
		this.yRichtung = yRichtung;
		if(xRichtung >= 0)
			xRichtung = Math.abs(yRichtung);
		else
			xRichtung = 0-Math.abs(yRichtung);
	}

	/**
	 * Liefert die Geschwindigkeit alle neu anzulegenden Objekte zurück
	 * 
	 * @return die Geschwindigkeit aller neu anzulegenden Objekte
	 */
	static int getGeschwindigkeit() {
		return geschwindigkeit;
	}

	/**
	 * Legt die Geschwindigkeit für alle neu anzulegenden Objekte fest. Die
	 * Geschwindigkeit muss größer als 0 sein
	 * 
	 * @param geschwindigkeit
	 */
	public void setGeschwindigkeit(int geschwindigkeit) {
		if(geschwindigkeit>0) {
			this.geschwindigkeit = geschwindigkeit;
		}
	}
}
