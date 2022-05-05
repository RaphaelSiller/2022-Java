/*
 * ermittelt die Primfaktorenzerlegung einer Zahl >= 2
 */

public class Primfaktoren
{

	public static void main(String[] args) {
		int produkt = 0;
		int produktAusgabe = 0;
		int teiler = 2;
		
		System.out.println("Primfaktorenzerlegung");
		System.out.println("=====================");
		//Eingabe produkt und Kontrolle ob Zahl >= 2, damit Primfaktorenzerlegung funktionieren kann
		while(produkt<2) {
			produkt = TestScanner.readInt("Geben Sie die Zahl ein: ");
			produktAusgabe = produkt;
			if(produkt<2)
				System.out.println("Zahl muss größer als 1 sein");
		}
		System.out.println();
		System.out.println("Die Zerlegung lautet:");
		
		/* 
		 * Verarbeitung, indem so oft wie möglich durch den Teiler (anfangs 2). Wenn nicht mehr durch den Teiler geteilt werden kann, wird der 
		 * Teiler inkrementiert.
		 */
		while(teiler<produktAusgabe) {
			if(produkt%teiler == 0) {
				//Das folgende if setzt ein * vor der nächsten Zahl (ausgeschlossen wird die erste Zahl, deshalb das if)
				if (!(produkt==produktAusgabe))
					System.out.print(" * ");
				produkt /= teiler;
				System.out.print(teiler);
			} else {
				teiler++;
			}
		}
		
		System.out.println(" = " + produktAusgabe);
		

	}

}
