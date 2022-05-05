package StoppUhr;
/**
 * Hat die Eigenschaften eines Quadrats:
 * SeiteA, SeiteB, Umfang und Flaeche
 * 
 * Es werden die Methoden
 * clone, equals, compareTo und toString bereitgestellt
 * 
 * @author Raphael Siller
 *
 */
public class Quadrat {
	private double seiteA;

	/** 
	 * Liefert die L�nge von SeiteA
	 * @return seiteA vom Quadrat
	 */
	public double getSeiteA() {
		return seiteA;
	}

	/** 
	 * Setzt die L�nge von SeiteA
	 * @param seiteA L�nge, welche gesetzt werden soll
	 */
	public void setSeiteA(double seiteA) {
		if(seiteA>0.0)
			this.seiteA = seiteA;
	}
	
	/** 
	 * Liefert die L�nge von SeiteB
	 * @return SeiteB vom Quadrat
	 */
	public double getSeiteB() {
		return seiteA;
	}

	/** 
	 * Setzt die L�nge von SeiteB
	 * @param seiteB L�nge, welche gesetzt werden soll
	 */
	public void setSeiteB(double SeiteB) {
		if(SeiteB>0)
			this.seiteA = SeiteB;
	}
	
	/** 
	 * Liefert den Umfang des Quadrats
	 * @return Umfang vom Quadrat
	 */
	public double getUmfang() {
		return seiteA * 4;
	}

	/** 
	 * Setzt den Umfang des Quadrats
	 * @param Umfang welcher gesetzt werden soll
	 */
	public void setUmfang(double Umfang) {
		if(Umfang>0)
			this.seiteA = Umfang * 0.25;
	}
	
	/** 
	 * Liefert die Flaeche des Quadrats
	 * @return Flaeche vom Quadrat
	 */
	public double getFlaeche() {
		return Math.sqrt(seiteA);
	}

	/** 
	 * Setzt die Flaeche des Quadrats
	 * @param Flaeche welche gesetzt werden soll
	 */
	public void setFlaeche(double Flaeche) {
		if(Flaeche>0)
			this.seiteA = seiteA*seiteA;
	}
	
	/**
	 * Erstellt ein Duplikat des Quadrats auf den die Methode aufgerufen wird. Das
	 * Duplikat vom Typ Quadrat wird zur�ck geliefert.
	 * 
	 * @return das Duplikat des Quadrats
	 */
	public Quadrat clone() {
		Quadrat ret = new Quadrat();
		ret.setSeiteA(this.getSeiteA()); 
		return ret;
	}
	
	/**
	 * Kontrolliert ob Seite A des Quadrats gleich lang wie SeiteA vom Quadrat, welcher der Methode �bergeben wird
	 * @param q das zu vergleichende Quadrat
	 * @return true falls SeiteA von beiden Quadraten gleich ist
	 */
	public boolean equals(Quadrat q) {
		boolean ret = false;
		if (q.getSeiteA() == this.getSeiteA())
			ret = true;
		return ret;
	}
	
	/**
	 * Kontrolliert, ob er Kreis kleiner als das �bergebene Kreisobjekt k ist (R�ckgabewert = -1), 
	 * gr��er (R�ckgabewert = 1) oder gleich dem �bergebenen Kreisobjekt k ist (R�ckgabewert = 0)
	 * 
	 * @param q - das zu vergleichende Objekt
	 * @return -1 falls das Objekt kleiner als das �bergebene Objekt k ist
	 *  		0 falls das Objekt gleich dem �bergebenen Objekt k ist
	 *  		1 falls das Objekt gr��er als das �bergebene Objekt k ist
	 */
	public int compareTo(Quadrat q) {
		int ret = -2;
		if (this.getSeiteA() < q.getSeiteA())
			ret = -1;
		if (this.getSeiteA() == q.getSeiteA())
			ret = 0;
		if (this.getSeiteA() > q.getSeiteA())
			ret = 1;
		return ret;
	}
	
	public String toString() {
		String ret = "a = " + this.getSeiteA() + ", b = " + this.getSeiteB() + ", U = " + this.getUmfang() + ", F = " + this.getFlaeche();	
		return ret;
	}

}
