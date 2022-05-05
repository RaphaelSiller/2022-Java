//gibt einen Weihnachtsbaum aus
public class Weihnachtsbaum
{

	public static void main(String[] args) {
		int zeilen = 16;
		//Baum
		while(zeilen >=0) {
			//Abstand bis Anfang des Baumes
			printLeerzeichen(zeilen);
			//Sterne linke Seite + Mitte
			printSterne(16 - zeilen);
			//Sterne rechte Seite
			printSterne(15 - zeilen);
			System.out.println();
			zeilen--;
		}
		//Stamm
		for(int i=0; i<3; i++) {
			//Abstand bis Anfang des Stammes
			printLeerzeichen(14);
			//Stamm
			printSterne(3);
			System.out.println();
		}
	}
	
	
	/*
	 * gibt n mal Leerzeichen aus, wo n der übergebene Integer ist
	 */
	public static void printLeerzeichen(int anzahl) {
		int i = 0;
		
		while(i<anzahl) {
			System.out.print(" ");
			i++;
		}
	}
	
	
	/*
	 * gibt n mal * aus, wo n der übergebene Integer ist
	 */
	public static void printSterne(int anzahl) {
		int i = 0;
		
		while(i<anzahl) {
			System.out.print("*");
			i++;
		}
	}
}
