/*
 * Ermittelt von einem Dreieck nach der Eingabe der 3 Seiten: Umfang und Fläche und 
 * ob es ein Unmögliches Dreieck, gleichseitiges, gleichschenkliges rechtwinkliges oder pythagoreisches Dreieck ist.
 * Bei beiden letzteren Arten wird auch die Hypothenuse ermittelt.
 */
public class DreieckEigenschaften
{

	public static void main(String[] args) {
		//beendet die Schleife, wenn = 1
		int aktiviert = 0;
		//Die 3 Seiten des Dreiecks
		double a = 1;
		double b = 1;
		double c = 1;
		final double EPSILON = 1E-10;
		
		//Dekoration
		System.out.println("Eigenschaften eines Dreiecks");
		System.out.println("============================");
		
		
		//Nach der Eingabe werden die vorgegebenen Eigenschaften Überprüft
		while(aktiviert == 0) {
			//Eingabe
			a = TestScanner.readDouble("Seite a: ");
			b = TestScanner.readDouble("Seite b: ");
			c = TestScanner.readDouble("Seite c: ");
			System.out.println();
			
			//Prüfung ob unmögliches Dreieck ist
			if((a+b)<c || (a+c)<b || (b+c)<a) {
				System.out.println("Unmögliches Dreieck");
			} else {
				
				//Berechnung Umfang
				System.out.println("Umfang: " + (a+b+c));
				//Fläche mithilfe der Heronschen Flächenformel Wurzel aus (U/2*(U/2-a)*(U/2-b)*(U/2-c))
				System.out.println("Fläche: " + Math.sqrt(((a+b+c)*0.5)*(((a+b+c)*0.5)-a)*(((a+b+c)*0.5)-b)*(((a+b+c)*0.5)-c)));
				
				
				//Prüfung ob gleichseitiges Dreieck
				if(a==b && a==c) {
					System.out.println("Gleichseitiges Dreieck");
				} 
				
				//Prüfung ob gleichschenkliges Dreieck
				if (a==b || a==c || b==c) {
					System.out.println("Gleichschenkliges Dreieck");
				}
				
				//Prüfung ob rechwinkliges und Pythogaräisches Dreieck (a²+b²=c²)
				if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
					if(a-(int)a<EPSILON && b-(int)b<EPSILON && c-(int)c<EPSILON) {
						System.out.println("Pythagoräisches Dreieck");
						System.out.println("Hypotenuse: " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
					} else {
						System.out.println("Rechtwinkliges Dreieck");
						System.out.println("Hypotenuse: " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
					}
				}
				//Prüfung ob rechwinkliges Dreieck und Pythogaräisches Dreieck (a²+c²=b²)
				if(Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
					if(a-(int)a<EPSILON && b-(int)b<EPSILON && c-(int)c<EPSILON) {
						System.out.println("Pythagoräisches Dreieck");
						System.out.println("Hypotenuse: " + Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2)));
					} else {
						System.out.println("Rechtwinkliges Dreieck");
						System.out.println("Hypotenuse: " + Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2)));
					}
				}
				//Prüfung ob rechwinkliges Dreieck und Pythogaräisches Dreieck (b²+c²=a²)
				if(Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
					if(a-(int)a<EPSILON && b-(int)b<EPSILON && c-(int)c<EPSILON) {
						System.out.println("Pythagoräisches Dreieck");
						System.out.println("Hypotenuse: " + Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2)));
					} else {
						System.out.println("Rechtwinkliges Dreieck");
						System.out.println("Hypotenuse: " + Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2)));
					}
				}
			}
			//Gibt Benutzer Option, das Programm zu beenden.
			System.out.println();
			aktiviert = TestScanner.readInt("Nochmal (0), Beenden (1): ");
			System.out.println();
		}
	}

}
