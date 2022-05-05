/*
 * Ermittelt den Größten gemeinsamen Teiler (GgT) zweier Zahlen nach dem Algorithmus von Euklid
 */
public class GgTEuklid
{

	public static void main(String[] args) {
		int zahl1 = 0;
		int zahl2 = 0;
		int rest = 0;
		
		//Eingabe
		System.out.println("GgT von Euklid");
		System.out.println("==============");
		zahl1 = TestScanner.readInt("Erste Zahl: ");
		zahl2 = TestScanner.readInt("Zweite Zahl: ");
		System.out.println();
		
		/*
		 * Der GgT von Euklid wird ermittelt, indem man:
		 * 1. Den Rest ermittelt.
		 * 2. zahl1 den Wert von zahl2 übernimmt.
		 * 3. zahl2 den Wert des Restes übernimmt.
		 * 4. Schritt 1 bis 3 solange wiederholt, bis zahl1 und zahl2 teilbar sind.
		 */
		while(zahl1%zahl2 != 0) {
			rest = zahl1%zahl2; 
			zahl1 = zahl2;
			zahl2 = rest;
		}
		
		//Ausgabe
		System.out.println("Der größte gemeinsame Teiler Teiler lautet " + rest);

	}

}
