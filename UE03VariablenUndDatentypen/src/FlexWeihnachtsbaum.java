/*
 * gibt einen Weihnachtsbaum aus, bei dem man selbst die Höhe des Baumes und Stammes bestimmen kann.
 */
public class FlexWeihnachtsbaum
{

	public static void main(String[] args) {
		int zeilen = 16;
		int gesamtZeilen = zeilen;
		int zeilenStamm = 3;
		
		zeilen = TestScanner.readInt("Geben Sie die Höhe des Baumes ein: ") + 1;
		zeilenStamm = TestScanner.readInt("Geben Sie die Höhe des Stammes ein: ");
		gesamtZeilen = zeilen;
		
		//Baum
		while(zeilen >0) {
			//Abstand bis Anfang des Baumes
			Weihnachtsbaum.printLeerzeichen(zeilen);
			//Sterne linke Seite + Mitte
			Weihnachtsbaum.printSterne(gesamtZeilen - zeilen);
			//Sterne rechte Seite
			Weihnachtsbaum.printSterne(gesamtZeilen - 1 - zeilen);
			System.out.println();
			zeilen--;
		}
		
		//Stamm
		for(int i=0; i<zeilenStamm; i++) {
			//Abstand bis Anfang des Stammes
			Weihnachtsbaum.printLeerzeichen(gesamtZeilen - 2);
			//Stamm
			Weihnachtsbaum.printSterne(3);
			System.out.println();
		}
	}

}
