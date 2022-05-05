/*
 * Es wird kontrolliert, ob die Zahl z eine Primzahl ist oder nicht.
 */
public class PrimzahlTest
{

	public static void main(String[] args) {
		int z = Integer.parseInt(args[0]);
		int i = 2;
		//kontrolliert, ob "Die Zahl ist eine Primzahl ausgegeben wird oder nicht
		boolean primzahl = true;	

		//Es wird geschaut ob eine Zahl von 2 bis z dividiert durch z KEINEN Rest hat.
		while(i < z) {
			//Wenn z durch i Teilbar ist, wird die while-Schleife abgebrochen
			if(z%i == 0) {	
				System.out.print("Die Zahl ist keine Primzahl.");
				primzahl = false;
				i=z;
			}
		i++;
		}
	if(primzahl == true) {
		System.out.print("Die Zahl ist eine Primzahl.");
	}
	}

}
