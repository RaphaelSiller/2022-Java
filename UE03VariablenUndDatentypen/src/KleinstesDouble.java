/*
 * Gibt die kleinste positive Double Zahl aus, indem man von 1 startet und immer halbiert, bis die Variable 0 ist.
 */
public class KleinstesDouble
{

	public static void main(String[] args) {
		double kleinsteDouble = 1.0;
		double Ausgabe = 1.0;
		while(kleinsteDouble != 0) {
			//Speichert den vorherigen Wert, da kleinsteDouble im letzen Durchlauf 0 beträgt.
			Ausgabe = kleinsteDouble;
			kleinsteDouble /=2;
		}
		System.out.println("Der kleinste positve Double-Wert ist " + Ausgabe);
	}

}
