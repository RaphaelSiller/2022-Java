/*
 * Zeigt, dass beim addieren von Zahlen, die nur ein Bruchteil des ersten Summanden sind, sich die Summe nicht verändert.
 */
public class DoubleUeberlauf {

	public static void main(String[] args) {
		int i = 0; //Laufvariable
		double doubleUeberlauf = Double.MAX_VALUE;
		
		System.out.println("Der maximale Wert eines Doubles beträgt" + doubleUeberlauf);
		//Es wird 100'000 mal eine Zahl addiert, die das Limit von Nachkommastellen weit Uebertrifft
		while(i<100000) {
			doubleUeberlauf += 1E100;
			i++;
		}
		System.out.print("nachdem 100000 1E100 addiert wurde, beträgt der Wert: " + doubleUeberlauf);

	}

}