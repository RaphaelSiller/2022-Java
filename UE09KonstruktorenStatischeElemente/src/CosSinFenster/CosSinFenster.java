package CosSinFenster;

import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JFrame;

public class CosSinFenster extends JFrame {
		
	public CosSinFenster(String titel, int width, int height) {
		this.setTitle(titel);
		this.setLocation(10,10);
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	}
	
	public void paint() {
//		this.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
	}
	
	
	
	/** * Festlegen der Weltkoordinaten */
	private final double WELT_X0 = -10.0; private final double WELT_Y0 = -1.0; private final double WELT_X1 = 10.0; private final double WELT_Y1 = 1.0;
	/** * Umwandlung Welt-X-Koordinaten in Bildschirmkoordinaten. Da die Methoden * getHeight und getWidth auch die Ränder und insbesondere die Titelleiste in die
	* Höhe und Breite des Fensters einrechnen, müssen mit Insets diese Ränder * weggezählt werden
	* @param xwert die umzuwandelnde Welt-X-Koordinate * @return die Bildschirmkoordinate
	*/
	private int umrechnungX(double xwert) { 
		Insets i = getInsets(); 
		return i.left + (int) ((xwert - WELT_X0) * (getWidth() - i.left - i.right) / (WELT_X1 - WELT_X0));
	}
	private int umrechnungY(double ywert) { 
		Insets i = getInsets(); 
		return i.top + (int) (getHeight() - i.top - i.bottom / (ywert - WELT_Y0) * (getHeight() - i.top - i.bottom) / (WELT_Y1 - WELT_Y0));
	}
	
}
