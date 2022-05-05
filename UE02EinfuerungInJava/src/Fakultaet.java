/*
 * Es wird die Fakultaet von n ausgegeben
 */
public class Fakultaet
{

	public static void main(String[] args) {
		int fakultaet = 1;
		int n = 10;
		//muss bei n*-1 starten, da sonst Fakultaet falsch berechnet wird
		int i = n*-1; 
		
		//in der Schleife wird die Fakultaet berechnet.
		while(i < 0) {
			i++;
			//i hat die Aufgabe, die Multiplikationen bei 1 starten zu lassen.
			fakultaet = fakultaet * (n+i); 
		}
		System.out.print(fakultaet);
	}

}
