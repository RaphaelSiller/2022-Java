/*
 * wandelt eine Zahl aus dem Zehnersystem in ein beliebiges Zahlensystem zwischen 2 bis 9
 */
public class UmrechnungVonZehn
{

	public static void main(String[] args) {
		int zahl = 0;
		int basis = 0;
		String ergebnis = "";
		//Eingabe
		System.out.println("Umrechnung ins Zehnersystem");
		System.out.println("===========================");
		zahl = TestScanner.readInt("Geben Sie die Zahl ein: ");
		//eingabe Basis mit Kontrolle
		while(basis < 2 || basis > 10) {
			basis = TestScanner.readInt("Geben Sie die Basis ein: ");
			if (basis < 2 || basis > 10)
				System.out.println("Basis muss zwischen 2 und 9 liegen");
		}
		System.out.println();
		System.out.print("Die Zahl im " + basis + "-system lautet ");
		
		//Es wird die zahl mit der basis dividiert. Der Rest wird hingeschrieben. Dies wird mit dem Quotient wiederholt. 
		while(zahl > 0) {
			ergebnis = zahl%basis + ergebnis;
			zahl = zahl/basis;
		}
		System.out.println(ergebnis);

	}

}
