//import javax.swing.plaf.synth.SynthSpinnerUI;

/*
 * Verschlüsselt/Entschlüsselt einen eingegeben Text durch die Cäsar-Verschlüsselung
 */
public class VerschluesselungCaesar
{

	public static void main(String[] args) {
		String text = "";
		char modus = 'v';
		int verschiebung = 1;
		
		//Dekoration
		System.out.println("Verschlüsselung nach Caesar");
		System.out.println("===========================");
		
		//Eingabe "modus" ist außerhalb und am Ende der Schleife, damit Programm direkt nach "Abbruch" beendet wird.
		modus = EingabenKontrolle.charKontrolle("V>erschlüsseln, E>ntschlüsseln, A>bbruch: ");
		do {
			//Eingabe
			text = EingabenKontrolle.stringKontrolle("Text: ");
			verschiebung = TestScannerErweitert.readInt("Verschiebung: ");
			
			//macht verschiebung nutzbar, wenn außerhalb der Anzahl an Buchstaben liegt
			while(verschiebung > 26) {
				verschiebung -= 26;
			}
			
			
			//Ausgabe = char + verschiebung, wobei verschiebung (positiv, wenn verschlüsselt) und (negativ, wenn entschlüsselt) wird.
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
			modus = EingabenKontrolle.charKontrolle("V>erschlüsseln, E>ntschlüsseln, A>bbruch: ");
		} while(modus == 'v' || modus == 'e' || modus == 'V' || modus == 'E');

	}

}
