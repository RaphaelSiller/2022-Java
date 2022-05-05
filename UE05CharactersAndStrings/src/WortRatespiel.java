/*
 * Das klassische Männchen am Galgen-Spiel ohne Männchen am Galgen.
 */
public class WortRatespiel
{

	public static void main(String[] args) {
		//Wort, welches gesucht werden muss
		String wantedWord = null;
		//Wort/Buchstaben, welche bereits erratet wurden
		String knownWord = "";
		//Eingabe, welche dann in das knownWord eingesetzt wird
		String eingabe = null;
		//Anzahl an Versuchen
		int nVersuche = 0;
		//Wiederholung ja/nein
		char nochmal = 'j';
		
		//Dekoration
		System.out.println("Wortratespiel");
		System.out.println("=============");
		
		while(nochmal == 'j') {
			//Eingabe des gesuchten Wort
			wantedWord = EingabenKontrolle.stringKontrolle("Gesuchtes Wort: ");
			wantedWord = wantedWord.toUpperCase();
			//Erstellen knownWorld
			for(int i=0; i<wantedWord.length(); i++) {
				knownWord = knownWord + ".";
			}
			
			//Das Erraten
			while(!knownWord.equals(wantedWord)) {
				//Ausgabe der erratenen Buchstaben
				System.out.println("Ihr Wort:       " + knownWord);
				//Eingabe
				eingabe = EingabenKontrolle.stringKontrolle("Buchstabe/Wort ");
				eingabe = eingabe.toUpperCase();
				nVersuche++;
				
				/*
				 * Verarbeitung der Eingabe zu knownWord, indem jeder char der eingabe mit jedem char des wantedWord verglichen wird.
				 * Wenn zwei verglichene chars übereinstimmen, wird der char des knownWord ersetzt
				*/
				for(int i=0; i<eingabe.length(); i++) {
					for(int j=0; j<knownWord.length(); j++) {
						if(eingabe.charAt(i) == wantedWord.charAt(j)) {
							knownWord = knownWord.substring(0, j) + eingabe.charAt(i) + knownWord.substring(j+1);
						}
					}
				}
				
			}
			System.out.println("Sie haben in " + nVersuche + " Schritten das Wort erraten!");
			nochmal = EingabenKontrolle.charKontrolle("Nochmal (j/n)? ");
			knownWord = "";
		}

	}

}
