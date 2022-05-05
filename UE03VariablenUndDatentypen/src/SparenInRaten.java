/*
 * Gibt das Guthaben eines Sparbuches nach einem Jahr aus.
 */
public class SparenInRaten
{

	public static void main(String[] args) {
		//k0 = Anfangskapital
		double k0 = 1;
		//mr = Monatsrate
		double mr = 1;
		//p = Zinssatz
		double p = 1;
		//kn = Endkapital
		double kn = 1;
		//sr = Summe der Zinsen aller Monatsraten
		double sr = 0;
		//i = Schleifenvariable
		int i = 12;
		
		//Eingabe
		k0 = TestScanner.readDouble("Geben Sie das Guthaben am Anfang des Jahres ein: ");
		mr = TestScanner.readDouble("Geben Sie die Monatsrate ein: ");
		p = TestScanner.readDouble("Geben Sie den Jahreszinssatz ein: ");
		System.out.println();
		
		//Verarbeitung
		//Berechnung der Summe aller Zinsen der Monatsraten
		while(i>0) {
			sr += mr*(p*(i/12d)/100);
			i--;
		}
		//Berechnung Endkapital
		kn = k0 + (k0*(p/100)) + 12*mr + sr;
		
		//gibt das Endkapital mit 2 Nachkommastellen an
		System.out.println("Das Guthaben am Ende des Jahres beträgt " + (Math.floor(kn*100)/100));
	}

}
