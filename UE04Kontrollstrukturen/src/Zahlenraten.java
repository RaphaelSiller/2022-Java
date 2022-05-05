/*
 * Computer erstellt eine Zahl und der Benutzer muss sie erraten. Der Computer sagt, ob eingegebene Zahl zu groß oder zu klein ist.
 */
public class Zahlenraten
{

	public static void main(String[] args) {
		int zahl = (int)(Math.random()*1000);
		int eingabe = 0;
		boolean erraten = false;
		
		System.out.println("Zahlenraten");
		System.out.println("===========");
		System.out.println("Ich habe mir eine Zahl im Intervall [0, 1000] ausgedacht. Versuchen Sie diese zu erraten");
		
		//Zuerst erfolgt die Eingabe und dann der Vergleich (größer, kleiner, gleich groß).
		while(erraten == false) {
			eingabe = TestScanner.readInt("Ihr Tipp: ");
			if(eingabe < zahl)
				System.out.println("Ihre Zahl ist zu klein");
			if(eingabe > zahl)
				System.out.println("Ihre Zahl ist zu groß");
			if(eingabe == zahl) {
				System.out.println("Mein Kompliment! Sie haben die Zahl erraten");
				erraten = true;
			}
		}

	}

}
