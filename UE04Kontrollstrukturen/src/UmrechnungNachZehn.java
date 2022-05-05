/*
 * wandelt eine Zahl von einem beliebeigen Zahlsystem (zwischen Binär bis Nonansystem) in das Zehnersystem um
 */
public class UmrechnungNachZehn
{

	public static void main(String[] args) {
		int zahl = 0;
		int basis = 0;
		int stelle = 128;
		int ergebnis = 0;
		
		//Eingabe
		System.out.println("Umrechnung ins Zehnersystem");
		System.out.println("===========================");
		zahl = TestScanner.readInt("Geben Sie die Zahl ein: ");
		//Eingabe Basis mit Kontrolle
		while(basis < 2 || basis > 10) {
			basis = TestScanner.readInt("Geben Sie die Basis ein: ");
			if (basis < 2 || basis > 10)
				System.out.println("Basis muss zwischen 2 und 9 liegen");
		}
		System.out.println();
		System.out.print("Die Zahl im Zehnersystem lautet ");
		
		/* 
		 * Von einem beliebigen Zahlensystem ins Zehnersystem wird durch folgende Rechnung umgerechnet: (n=Wert der Stelle, b=Basis)
		 * ... n * b^3 + n * b^2 + n * b^1 + n * b^0 =
		 * In Worten ausgedrückt: Es wird die Summe von "Wert der Stelle" * "basis"^"stelle" ermittelt
		 */
		while(stelle>=0) {
			ergebnis += ((zahl/(int)Math.pow(10, stelle)) - ((zahl/((int)Math.pow(10, (stelle+1))))*10))*Math.pow(basis, stelle);
			stelle--;
		}
		System.out.println(ergebnis);

	}

}
