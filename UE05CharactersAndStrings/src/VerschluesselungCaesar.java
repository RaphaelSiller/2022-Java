//import javax.swing.plaf.synth.SynthSpinnerUI;

/*
 * Verschl�sselt/Entschl�sselt einen eingegeben Text durch die C�sar-Verschl�sselung
 */
public class VerschluesselungCaesar
{

	public static void main(String[] args) {
		String text = "";
		char modus = 'v';
		int verschiebung = 1;
		
		//Dekoration
		System.out.println("Verschl�sselung nach Caesar");
		System.out.println("===========================");
		
		//Eingabe "modus" ist au�erhalb und am Ende der Schleife, damit Programm direkt nach "Abbruch" beendet wird.
		modus = EingabenKontrolle.charKontrolle("V>erschl�sseln, E>ntschl�sseln, A>bbruch: ");
		do {
			//Eingabe
			text = EingabenKontrolle.stringKontrolle("Text: ");
			verschiebung = TestScannerErweitert.readInt("Verschiebung: ");
			
			//macht verschiebung nutzbar, wenn au�erhalb der Anzahl an Buchstaben liegt
			while(verschiebung > 26) {
				verschiebung -= 26;
			}
			
			
			//Ausgabe = char + verschiebung, wobei verschiebung (positiv, wenn verschl�sselt) und (negativ, wenn entschl�sselt) wird.
			for(int i = 0; i < text.length(); i++) {
				//Leerzeichen werden herausgefiltert
				if(!Character.isWhitespace(text.charAt(i))) {
					//if und * (modus == 'v' || modus == 'V' ? 1 : -1) erzeugen eine Schleife des Alphabets.
					if(Character.isLetter(text.charAt(i)+(verschiebung * (modus == 'v' || modus == 'V' ? 1 : -1) ))){
						System.out.print((char)(text.charAt(i)+(verschiebung * (modus == 'v' || modus == 'V' ? 1 : -1) )));
					} else {
						System.out.print((char)(text.charAt(i)+(verschiebung * (modus == 'v' || modus == 'V' ? 1 : -1) )-26 * (modus == 'v' || modus == 'V' ? 1 : -1)));
					}
				}
				
			}
			System.out.println();
			modus = EingabenKontrolle.charKontrolle("V>erschl�sseln, E>ntschl�sseln, A>bbruch: ");
		} while(modus == 'v' || modus == 'e' || modus == 'V' || modus == 'E');

	}

}
