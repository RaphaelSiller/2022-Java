/*
 * Zählt die Anzahl von Selbstlauten, Buchstaben, Leerzeichen und Zeichen eines eingegebenen Stringes
 */
public class TextStatistik
{

	public static void main(String[] args) {
		int nSelbstlaut = 0;
		int nBuchstabe = 0;
		int nLeerzeichen = 0;
		String text = "";
		
		System.out.println("Textstatistik");
		System.out.println("=============");
		//Eingabe mit Kontrolle
		while(text.length() == 0) {
			text = TestScannerErweitert.readString("Text: ");
			if(text.length() == 0)
				System.out.println("Text muss mindestens ein Zeichen enthalten");
		}
		System.out.println();
		
		for(int i=0;i<text.length();i++) {
			//Inkrementierung Zähler nSelbstlaut (a, e, i, o, u)
			if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u')
				nSelbstlaut++;
			
			//Inkrementierung Zähler nBuchstabe
			if(Character.isLetter(text.charAt(i)))
				nBuchstabe++;
			
			//Inkrementierung Zähler nLeerzeichen
			if(Character.isWhitespace(text.charAt(i)))
				nLeerzeichen++;
		}
		
		//Ausgabe
		System.out.println("Anzahl Selbstlaute: " + nSelbstlaut);
		System.out.println("Anzahl Buchstaben: " + nBuchstabe);
		System.out.println("Anzahl Leerzeichen: " + nLeerzeichen);
		System.out.println("Anzahl Zeichen: " + text.length());

	}

}
