/*
 * Berechnet nach der Eingabe von Anfangskapital, Zinssatz und Anzahl an Jahren das Endkapital aus.
 */
public class Zinseszinsen
{

	public static void main(String[] args) {
		//k0 = Anfangskapital
		double k0 = 1;
		//p = Zinssatz
		double p = 1;
		//n = Anzahl an Jahren
		int n = 1;
		//kn = Endkapital
		double kn = 1;
		
		//Eingabe
		System.out.println("Zinzeszinsen");
		System.out.println("============");
		k0 = TestScanner.readDouble("Geben Sie das Anfangskapital ein: ");
		p = TestScanner.readDouble("Geben Sie den Zinssatz ein: ");
		n =  TestScanner.readInt("Geben Sie die Anzahl an Jahren ein: ");
		System.out.println();
		
		//Verarbeitung
		kn = k0 * Math.pow(((p/100) + 1), n);
		
		//Ausgabe
		System.out.println("Das Endkapital nach " + n + " Jahren beträgt " + (int)kn);
	}

}
