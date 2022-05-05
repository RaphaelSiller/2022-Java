/*
 * Wie Zahlenraten, nur dass der Computer die zahl finden muss und der Benutzer sagt, 
 * ob die eingegebene Zahl (des Computers) größer oder kleiner ist
 */
public class ZahlenratenUmgekehrt
{
 
	public static void main(String[] args) {
		//kleinste zahl, die Computer erraten wird
		int minzahl = 0;
		//größte zahl, die Computer erraten wird
		int maxzahl = 1000;
		//Tipp des Computer
		int tipp = (int)(Math.random()*1000);
		//Zustand, ob die Zahl des Computers kleiner oder größer als die ausgedachte Zahl ist.-
		int zustand = 0;
		//beendet Spiel
		boolean erraten = false;
		
		//Erste Ausgabe
		System.out.println("Umgekehrtes Zahlenraten");
		System.out.println("=======================");
		System.out.println("Suchen Sie sich einme Zahl im Intervall [0, 1000]");
		System.out.println("aus. Ich werde sie finden.");
		
		/*
		 * Das Zahlenraten selbst. Die Zahl des Computers ist eine Zufallszahl im möglichen Bereich. 
		 * Der Bereich, welcher durch die Variablen minzahl und maxzahl definiert wird, wird bei jeder Auswertung festgelegt.
		 */
		while(erraten==false) {
			System.out.println("Mein Tipp: " + tipp);
			//Eingabe und Auswertung, ob die Zahl größer, kleiner oder gefunden wurde
			zustand = TestScanner.readInt("Zahl kleiner (0), größer (1), gefunden (2): ");
			if(zustand == 0)
				maxzahl = tipp;
			if(zustand == 1)
				minzahl = tipp;
			if(zustand == 2) {
				System.out.println("Ich habe die zahl gefunden");
				erraten = true;
			}
			//Festlegen des neuen Tipp
			tipp = (int)(minzahl + Math.random()*(1000-minzahl-(1000-maxzahl)));
			
			//Möchtegern-Anti-Cheat
			if(minzahl == maxzahl) {
				System.out.println("Sie sind ein elendiger Betrüger :(");
				erraten = true;
			}
		}
				
	}

}
