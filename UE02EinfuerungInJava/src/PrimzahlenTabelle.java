/*
 * Gibt eine Tabelle von 90 bis 120 aus, welche angibt, ob eine Zahl eine Primzahlen ist.
 */
public class PrimzahlenTabelle
{

	public static void main(String[] args) {
		int zahl = 90;
		int n = 120;
		System.out.println("Primzahlentabelle");
		System.out.println("=================");
		while(zahl <= n) {
			printZahl(zahl);
			istPrimzahl(zahl);
			System.out.println();
			zahl++;
		}
			
		

	}
	/*
	 * kontrolliert, ob es eine Primzahl ist oder nicht.
	 */
	public static void istPrimzahl(int z) {
		int i = 2;
		//kontrolliert, ob "Die Zahl ist eine Primzahl" ausgegeben wird oder nicht.
		boolean primzahl = true;	
	
		//Es wird geschaut ob eine Zahl von 2 bis z dividiert durch z KEINEN Rest hat.
		while(i < z) {
			//Wenn z durch i Teilbar ist, wird die while-Schleife abgebrochen
			if(z%i == 0) {	
				System.out.print(" ist nicht Primnzahl");
				primzahl = false;
				i=z;
			}
		i++;
		}
	if(primzahl == true) {
		System.out.print(" ist Primzahl");
	}
	}
	
	/*
	 * gibt die Zahl rechstbündig aus.
	 */
	public static void printZahl(int zahl) {
		//Anzahl Stellen
		int j = 10; 
		//Anzahl Leerzeichen
		int k = 3; 
		//geht bis die Zahl mehr als 3 Stellen hat. Mit jedem Durchlauf wird ein Leerzeichen entfernt.
		while(j <= 1000) { 
			//ermittelt Anzahl der Stellen
			if (zahl < j) { 
				while(k>0) {
					System.out.print(" ");
					k--;
				}
				System.out.print(zahl);
				//beendet while Schleife
				j = 1001; 
			}
		//erhöt Anzahl der Stellen
		j = j*10; 
		k--;
		}
	}
}