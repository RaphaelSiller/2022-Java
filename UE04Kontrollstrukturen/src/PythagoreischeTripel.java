/*
 * Erzeugt eine .csv (Excel-Datei), welche alle pythagoreischen Dreiecke bis zu einer Seitenlänge von 1'000 enthält.
 */
public class PythagoreischeTripel
{

	public static void main(String[] args) {
		//Die Seiten a, b, c eines normalen Dreiecks
		int a=3;
		int b=4;
		int c=5;
		
		try {
			// Umleiten der Standardausgabe in die Datei welche unter dem angegebenen
			// Laufwerk und Pfad gespeichert wird. Ist die Datei dort nicht vorhanden,
			// wird sie angelegt
			System.setOut(new java.io.PrintStream("H:\\PythagoreischeTripel.csv"));
			
			//Spaltenbeschriftung
			System.out.println("Pythagoreisches Tripel");
			System.out.println("Seite a; Seite b; Seite c;");
			
			/* Ermittlung aller Dreiecke, indem jede mögliche Kombination der Seitenlängen vom ersten Dreieck (3;4;5) bis 1000 überprüft wird, ob
			 * sie ein rechtwinkliges Dreieck ist oder nicht. Damit ein Dreieck nicht doppelt aufscheint, werden nur jene benutzt, wo die 
			 * Kathete b größer als Kathete a ist. Da hier Integer benutzt werden, ist eine Überprüfung auf Ganzkommazahlen nicht notwendig,
			 * um festzustellen, ob es sich um ein Pythagoreisches oder "normales rechtwinkliges" Dreieck handelt.
			 */
			while(a<1000) {
				while(b<1000) {
					while(c<1000) {
						//Prüfung ob Pythagoreisches Dreieck
						if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a<b) {
							System.out.println(a + ";" + b + ";" + c + ";");
						}
						c++;
					}
					c=5;
					b++;
				}
				b=4;
				a++;
			}
		} catch (java.io.FileNotFoundException e) {
			// Es ist ein Fehler beim Erstellen oder Öffnen der Datei aufgetreten
			System.out.println("Fehler beim Erstellen der Datei");
		}

	}

}
