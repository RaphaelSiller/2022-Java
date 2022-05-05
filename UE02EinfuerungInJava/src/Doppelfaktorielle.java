/*
 * Es wird die Doppelfaktorielle von n ausgegeben
 */
public class Doppelfaktorielle
{

	public static void main(String[] args) {
		int dfakultaet = 1;
		int n = Integer.parseInt(args[0]);
		int i = n*-1; 
		
		//in der Schleife wird die Doppelfaktorielle berechnet.
		while(i < 0) {
			i = i+2;
			//i hat die Aufgabe, die Multiplikationen bei 2 starten zu lassen.
			dfakultaet = dfakultaet * (n+i); 
		}
		System.out.print(dfakultaet);
	}

}
