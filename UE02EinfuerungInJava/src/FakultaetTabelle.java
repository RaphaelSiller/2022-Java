/*
 * Erstellt eine Tabelle aller Fakultäten der Zahlen 1 bis 10.
 */
public class FakultaetTabelle
{

	public static void main(String[] args) {
		int n = 1;
		
		System.out.println("       n      n!");
		System.out.println("================");
		
		while(n<=10) {
			//gibt die Zahl rechtsbündig aus
			printZahl(n); 
			//Ermittelt die Fakultät von n und gibt die Zahl Rechstbündig aus
			fakultaet(n); 
			n++;
			System.out.println();
		}
	}
	
	/*
	 * Ermittelt die Fakultät von n
	 */
	public static void fakultaet(int n) {
		int fakultaet = 1;
		//muss bei n*-1 starten, da sonst Fakultät falsch berechnet wird
		int i = n*-1; 
		
		//in der Schleife wird die Fakultät berechnet.
		while(i < 0) {
			i++;
			//i hat die Aufgabe, die Multiplikationen bei 1 starten zu lassen.
			fakultaet *= (n+i); 
		}
		//gibt die Zahl rechtsbündig aus
		printZahl(fakultaet); 
	}	
	
	/*
	 * gibt die Zahl rechtsbündig aus
	 */
	public static void printZahl(int zahl) {
			//Anzahl Stellen
			int j = 10; 
			//Anzahl Leerzeichen
			int k = 7; 
			//geht bis die Zahl mehr als 8 Stellen hat. Mit jedem Durchlauf wird ein Leerzeichen entfernt.
			while(j <= 10000000) { 
				//ermittelt Anzahl der Stellen
				if (zahl < j) { 
					while(k>0) {
						System.out.print(" ");
						k--;
					}
					System.out.print(zahl);
					//beendet while Schleife
					j = 10000001; 
				}
			//erhöt Anzahl der Stellen
			j = j*10; 
			k--;
			}
		}
	
}
