package CosSinFenster;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.geom.Line2D;

import javax.swing.JFrame;

	public class CosSinFenster extends JFrame {

		/** 
		 * Festlegen der Weltkoordinaten 
		 */
		private final double WELT_X0 = -10.0; 
		private final double WELT_Y0 = -1.0; 
		private final double WELT_X1 = 10.0; 
		private final double WELT_Y1 = 1.0;
		
	public CosSinFenster() {
		setTitle("Cossinus-, Sinusberechnung");
		setBounds(10, 10, 600, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawLine(umrechnungX(WELT_X0), umrechnungY(0), umrechnungX(WELT_X1), umrechnungY(0)); //X-Achse
		g.drawLine(umrechnungX(0), umrechnungY(WELT_Y0), umrechnungX(0), umrechnungY(WELT_Y1)); //Y-Achse
		for (double i = WELT_X0; i < WELT_X1; i+=0.01) {
			g.drawLine(umrechnungX(i), umrechnungY(Math.sin(i)), umrechnungX(i+0.01), umrechnungY(Math.sin(i+0.01))); //Sinuskurve
			g.drawLine(umrechnungX(i), umrechnungY(Math.cos(i)), umrechnungX(i+0.01), umrechnungY(Math.cos(i+0.01))); //Cosinuskurve
		}
    }
	
	
	/** 
	 * Umwandlung Welt-X-Koordinaten in Bildschirmkoordinaten. Da die Methoden * getHeight und getWidth auch die R�nder und 
	 * insbesondere die Titelleiste in die H�he und Breite des Fensters einrechnen, m�ssen mit Insets diese R�nder * weggez�hlt werden
	 * @param xwert die umzuwandelnde Welt-X-Koordinate 
	 * @return die Bildschirmkoordinate
	 */
	private int umrechnungX(double xwert) { 
		Insets i = getInsets(); 
		return i.left + (int) ((xwert - WELT_X0) * (getWidth() - i.left - i.right) / (WELT_X1 - WELT_X0));
	}
	
	private int umrechnungY(double ywert) { 
		Insets i = getInsets(); 
		return i.top + (int) (getHeight() - i.top - i.bottom - (ywert - WELT_Y0) * (getHeight() - i.top - i.bottom) / (WELT_Y1 - WELT_Y0));
	}
}
