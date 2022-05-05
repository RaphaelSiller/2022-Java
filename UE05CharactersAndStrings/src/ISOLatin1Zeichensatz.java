/*
 * Gibt den ISO-Latin1-Zeichensatz von der 33. bis 256. Stelle aus
 */
public class ISOLatin1Zeichensatz
{

	public static void main(String[] args) {
		int stelle = 32;
		
		while(stelle<256) {
			//for-Schleife zuständig für ein tabellenartiges Aussehen
			for(int i=0; i<8;i++) {
				//if lässt alle Zeichen in einer Spalte erscheinen.
				if(stelle<100)
					System.out.print(" " + stelle + " " + (char)stelle + " ");
				else
					System.out.print(stelle + " " + (char)stelle + " ");
				stelle++;
			}
			System.out.println();
		}

	}

}
