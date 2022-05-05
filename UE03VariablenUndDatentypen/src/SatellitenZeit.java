/*
 * Wandelt eine Eingabe (Zeit) von Sekunden in Tage, Stunden, Minuten, Sekunden um.
 */
public class SatellitenZeit
{

	public static void main(String[] args) {
		//ssat = satellitenzeit
		int ssat = 0;
		int d = 0;
		int h = 0;
		int m = 0;
		int s = 0;
		
		//eingabe
		System.out.println("Satellitenzeit");
		System.out.println("==============");
		ssat = TestScanner.readInt("Geben Sie die Sekunden ein: ");
		System.out.println();
		
		//Verarbeitung
		//wandelt ssat von Sekunden in Tage/Stunden/Minuten/Sekunden um und subtrahiert die vorherigen Werte
		d = ssat/(24*60*60);
		h = ssat/(60*60) - d*24;
		m = ssat/60 - d*24*60 - h*60;
		s = ssat - d*24*60*60 - h*60*60 - m*60;
		
		//Ausgabe
		System.out.println("Die umgerechnete Zeit ist:");
		System.out.println("d " + d + " h " + h + " m " + m + " s " +s);

	}

}
