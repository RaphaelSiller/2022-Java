package geometrischeFiguren;

public class Kreis extends Ellipse{
	/**
	 * Custom-Konstruktor
	 * @param x-Koordinate
	 * @param y-Koordinate
	 * @param breite
	 * @param hoehe
	 */
	public Kreis(int x, int y, int durchmesser) {
		super(x, y, durchmesser, durchmesser);
	}
}
