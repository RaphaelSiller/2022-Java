/*
 * Gibt den größten Wert eines Integers und den Wert nach einem Overflow aus
 */
public class IntUeberlauf
{

	public static void main(String[] args) {
		int intUeberlauf = Integer.MAX_VALUE;
		
		System.out.println("Der maximale Wert für einen Integer ist " + intUeberlauf);
		intUeberlauf++;
		System.out.print("Wird eine 1 addiert so beträgt der Integer " + intUeberlauf);
	}

}
