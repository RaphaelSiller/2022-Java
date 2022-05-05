/*
 * Liest den Radius von Einer Benutzereingabe und berechnet/gibt den Umfang, Oberfläche, Volumen aus.
 */
public class KugelBerechnung {

	public static void main(String[] args) {
		double radius = 1;
		double umfang = 1;
		double flaeche = 1;
		double volumen = 1;
		
		//Gibt alles bis einschließlich Eingabe des Radius aus
		System.out.println("Kugelberechnung");
		System.out.println("===============");
		radius = TestScanner.readDouble("Geben Sie den Radius der Kugel ein: ");
		System.out.println();
		
		//Berechnung
		umfang = 2 * Math.PI * radius;
		flaeche = 4 * Math.PI * Math.pow(radius, 2);
		volumen = 4d/3 * Math.PI * Math.pow(radius, 3);
		
		//Ausgabe Ergebnisse
		System.out.println("Der Umfang der Kugel beträgt: " + umfang);
		System.out.println("Die Oberfläche der Kugel beträgt: " + flaeche);
		System.out.println("Das Volumen der Kugel beträgt: " + volumen);
		
	}

}