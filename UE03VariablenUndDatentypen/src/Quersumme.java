/* import java.util.concurrent.SynchronousQueue; //Kann mich nicht erinnern, diese Zeile geschrieben zu haben. 
 * Obwohl es ohne funktioniert, lösche ich es nicht, falls es trotzdem gebraucht wird.
 */

/*
 * Berechnet die Quersumme und gibt diese aus
 */
public class Quersumme
{

	public static void main(String[] args) {
		int zahl = 0;
		int quersumme = 0;
		int ausgabe = 0;
		//Wert ist Anzahl an Stellen der Zahl - 1
		int stelle = 4;
		
		//Eingabe
		System.out.println("Quersumme");
		System.out.println("=========");
		zahl = TestScanner.readInt("Geben Sie die Zahl ein: ");
		System.out.println();
		System.out.println("Die Quersumme lautet:");
		
		//Verarbeitung
		while(stelle >= 0) {
			/*
			 * Minuend ist die Variable zahl bis zu einer bestimmten Stelle, Subtrahend ist die gleiche Zahl wie derMinuend,
			 * aber die Einser-Stelle wird entfernt, wodurch die Differenz nur die Einser-Stelle ist. Die Differenz wird mit der Variable
			 * quersumme addiert. Die Differenz wird auch in Variable ausgabe für die Ausgabe abgespeichert
			 */
			quersumme += (zahl/(int)Math.pow(10, stelle)) - ((zahl/((int)Math.pow(10, (stelle+1))))*10);
			ausgabe = (zahl/(int)Math.pow(10, stelle)) - ((zahl/((int)Math.pow(10, (stelle+1))))*10);
			
			//Ausgabe der einzelnen Ziffern und des Ergebnis. if entfernt " + " bei der letzten Stelle.
			if(stelle>0) {
				System.out.print(ausgabe + " + ");
			} else {
				System.out.print(ausgabe);
			}
			//gehört nicht mehr zur Ausgabe
			stelle--;
		}
		//This is the final (countdown) output
		System.out.println(" = " + quersumme);
	}
		
}
