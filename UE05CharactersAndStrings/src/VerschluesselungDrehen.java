/*
 * "Verschlüsselt" einen Text, indem die Zeichen von Vorne und von Hinten richtung Mitte wieder ausgegeben werden
 */
public class VerschluesselungDrehen {

	public static void main(String[] args) {
		String text = "";
		String drehtext = "";
		char schleife = 'j';
		int i = 0;
		
		System.out.println("Verschluesselung durch Drehen");
		System.out.println("============================");
		while(schleife == 'j') {
			while(i<(text.length()+1)/2 || text.length()==0) {
				//Eingabe mit Kontrolle
				while(text.length() == 0) {
					text = TestScannerErweitert.readString("Text: ");
					if(text.length() == 0)
						System.out.println("Text muss mindestens ein Zeichen enthalten");
					else
						System.out.print("Verschluesselt: ");
				}
				
				//"Verschluesselung"
				drehtext = drehtext + (text.charAt(i));
				i++;
				drehtext = drehtext + (text.charAt(text.length()-i));
			}
			
			//entfernt doppeltes Zeichen bei ungeeraden Strings
			if (text.length() != drehtext.length())
				drehtext = drehtext.substring(0, drehtext.length() - 1);
			
			System.out.println(drehtext);
			schleife = TestScannerErweitert.readChar("Nochmal (j/n)? ");
			//Variablenzuruecksetzung
			text = "";
			drehtext = "";
			i = 0;
		}

	}

}
