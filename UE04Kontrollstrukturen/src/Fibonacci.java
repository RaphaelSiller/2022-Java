/*
 * Ermittelt die n-te Fibonacci-Zahl. Warnung: ignoriert Overflow
 */
public class Fibonacci
{

	public static void main(String[] args) {
		int zahl1 = 1;
		int zahl2 = 1;
		int summe = 0;
		//Stelle der Fibonacci-Zahl
		int fn = -1;
		
		//Eingabe
		System.out.println("Fibonacci-Zahlen");
		System.out.println("================");
		//Eingabe von fn und Kontrolle, ob fn positiv ist
		while(fn <= 0) {
			fn = TestScanner.readInt("Die wievielte Zahl? ");
			if(fn < 0)
				System.out.println("Die Zahl muss größer oder gleich Null sein");
		}
		
		/*
		 * Die n-te Fibonacci-Zahl wird berechnet indem die 2 vorherigen Zahlen addiert werden.
		 * Genau dies wird für alle Fibonacci-Zahlen bis einschließlich der fn-ten.
		 */
		for(int i=1; i<fn; i++) {
			summe = zahl1 + zahl2;
			zahl1 = zahl2;
			zahl2 = summe;					
		}
		
		//Ausgabe
		System.out.println("Die " + fn + ". Fibonacci-Zahl lautet " + summe);

	}

}
