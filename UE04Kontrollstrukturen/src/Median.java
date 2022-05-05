/*
 * Liest drei Zahlen ein und gibt die zweitkleinste Zahl aus
 */
public class Median
{

	public static void main(String[] args) {
		int zahl1 = 0;
		int zahl2 = 0;
		int zahl3 = 0;
		
		//Eingabe
		System.out.println("Median");
		System.out.println("======");
		zahl1 = TestScanner.readInt("1. Zahl: ");
		zahl2 = TestScanner.readInt("2. Zahl: ");
		zahl3 = TestScanner.readInt("3. Zahl: ");
		System.out.println();
		
		//Sonderfälle:
		
		//Alle Zahlen sind gleich groß
		if(zahl1 == zahl2 && zahl1 == zahl3) {
			System.out.println("Der Median lautet " + zahl1);
		} else{
				//zwei Zahlen sind gleich groß
				if(zahl1 == zahl2) {
					System.out.println("Der Median lautet " + zahl1);
				}
				if(zahl1 == zahl3) {
					System.out.println("Der Median lautet " + zahl1);
				}
				if(zahl2 == zahl3) {
					System.out.println("Der Median lautet " + zahl2);
				}
		}
	
		 
		//Mediansuche: Jede Zahl wird kontrolliert, ob sie zwischen beiden anderen liegt. 
		
		//zahl1
		if((zahl2 < zahl1 && zahl1 < zahl3) || (zahl3 < zahl1 && zahl1 < zahl2))
			System.out.println("Der Median lautet " + zahl1);
		//zahl2
		if((zahl1 < zahl2 && zahl2 < zahl3) || (zahl3 < zahl2 && zahl2 < zahl1))
			System.out.println("Der Median lautet " + zahl2);
		//zahl3
		if((zahl1 < zahl3 && zahl3 < zahl2) || (zahl2 < zahl3 && zahl3 < zahl1))
		System.out.println("Der Median lautet " + zahl3);
	}

}
