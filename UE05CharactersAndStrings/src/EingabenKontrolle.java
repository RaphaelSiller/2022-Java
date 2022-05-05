/*
 * Kontrolliert, ob der eingegebene String, bzw. Char nur aus Buchstaben besteht.
 */
public class EingabenKontrolle
{

	public static void main(String[] args) {
		String kontrolleString = null;
		char kontrolleChar = 32;
		kontrolleString = stringKontrolle("Bitte geben Sie den zu kontrollierenden String ein: ");
		System.out.println("Ihre Eingabe ist ok\nSie war: " + kontrolleString);
		kontrolleChar = charKontrolle("Bitte geben Sie den zu kontrollierenden Char ein: ");
		System.out.println("Ihre Eingabe ist ok\nSie war: " + kontrolleChar);

	}
	
	public static String stringKontrolle(String output) {
		boolean  beendet = false;
		String ret = null;
		
		while(!beendet) {
			ret = TestScannerErweitert.readString(output);
			for(int i=0; i<ret.length();i++) {
				if(!Character.isLetter(ret.charAt(i))) {
					System.out.println("Bitte geben Sie einen Buchstaben ein");
					i = ret.length();
					beendet = false;
				} else
					beendet = true;
			}
		}
		return ret;
		
	}
	
	public static char charKontrolle(String output) {
		char ret = 32;
		boolean  beendet = false;
		
		
		
		while(!beendet) {
			ret = TestScannerErweitert.readChar(output);
			if(Character.isLetter(ret))
				beendet = true;
			else
				System.out.println("Bitte geben Sie einen Buchstaben ein");
			//return(eingabe);
		}
		return ret;
	}
}
