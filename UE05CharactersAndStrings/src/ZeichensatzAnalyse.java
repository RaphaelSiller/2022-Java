/*
 * Ordnet alle Zeichen des ISOLatin1Zeichensatz zwischen 32 und 255 nach Buchstabe, Ziffer, Wortzwischenräume, Groß- und Kleinbuchstaben
 */
public class ZeichensatzAnalyse
{

	public static void main(String[] args) {
		int stelle = 32;
		
		//isLetter
		System.out.println("isLetter");
		/*
		 * kontrolliert jeden char zwischen 32 und 255, ob es sich um einen Buchstaben handelt. Wenn ja, wird dieser ausgegeben.
		 * Die For-schleife sorgt für eine neue Zeile nach 30 Zeichen.
		 */
		while(stelle<256) {
			for(int i=0;i<30 && stelle<256;) {
				if(Character.isLetter((char)stelle)) {
					System.out.print((char)stelle + " ");
					i++;
				}
				stelle++;
			}
			System.out.println();
		}
		
		//isDigit
		stelle=32;
		System.out.println("isDigit");
		/*
		 * kontrolliert jeden char zwischen 32 und 255, ob es sich um eine Ziffer handelt. Wenn ja, wird diese ausgegeben.
		 * Die For-schleife sorgt für eine neue Zeile nach 30 Zeichen.
		 */
		while(stelle<256) {
			for(int i=0;i<30 && stelle<256;) {
				if(Character.isDigit((char)stelle)) {
					System.out.print((char)stelle + " ");
					i++;
				}
				stelle++;
			}
			System.out.println();
		}
		
		//isWhitespace
		stelle=32;
		System.out.println("isWhitespace");
		/*
		 * kontrolliert jeden char zwischen 32 und 255, ob es sich um einen Whitespace handelt. Wenn ja, wird diese ausgegeben.
		 * Die For-schleife sorgt für eine neue Zeile nach 30 Zeichen.
		 */
		while(stelle<256) {
			for(int i=0;i<30 && stelle<256;) {
				if(Character.isWhitespace((char)stelle)) {
					System.out.print(stelle + " ");
					i++;
				}
				stelle++;
			}
			System.out.println();
		}
		
		//isUpperCase
		stelle=32;
		System.out.println("isUpperCase");
		/*
		 * kontrolliert jeden char zwischen 32 und 255, ob es sich um einen Großbuchstaben handelt. Wenn ja, wird diese ausgegeben.
		 * Die For-schleife sorgt für eine neue Zeile nach 30 Zeichen.
		 */
		while(stelle<256) {
			for(int i=0;i<30 && stelle<256;) {
				if(Character.isUpperCase((char)stelle)) {
					System.out.print((char)stelle + " ");
					i++;
				}
				stelle++;
			}
			System.out.println();
		}
		
	//isLowerCase
			stelle=32;
			System.out.println("isLowerCase");
			/*
			 * kontrolliert jeden char zwischen 32 und 255, ob es sich um einen Kleinbuchstaben handelt. Wenn ja, wird diese ausgegeben.
			 * Die For-schleife sorgt für eine neue Zeile nach 30 Zeichen.
			 */
			while(stelle<256) {
				for(int i=0;i<30 && stelle<256;) {
					if(Character.isLowerCase((char)stelle)) {
						System.out.print((char)stelle + " ");
						i++;
					}
					stelle++;
				}
				System.out.println();
			}

	}

}
