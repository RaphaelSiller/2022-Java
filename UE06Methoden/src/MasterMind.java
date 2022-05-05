
public class MasterMind {

	public static void main(String[] args) {
		int nFarben = 0;
		int nStellen = 4;
		int nVersuche = 0;
		String code = "";
		String tipp = "";
		// Dekoration
		System.out.println("Mastermind\n========");

		nFarben = TestScannerErweitert.readInt("Anzahl Farben: ");
		while (code != "ENDE") {
			// Vorbereitung
			System.out.print("=======================> ");
			code = MasterMindMethoden.erzeugeCode(nStellen, nFarben);

			while (!tipp.equals("ENDE") && MasterMindMethoden.ermittleSchwarz(code, tipp) != nStellen) {
				// Eingabe Tipp
				tipp = MasterMindMethoden.eingabeTipp(nStellen);
				if (!tipp.equals("ENDE")) {
					// Ausgabe von Weiss und Schwarz
					nVersuche++;
					System.out.print(nVersuche + "): " + tipp + " = (w: " + MasterMindMethoden.ermittleWeiss(code, tipp)
							+ ", s: " + MasterMindMethoden.ermittleSchwarz(code, tipp) + "): ");
					// Kontrolle ob erraten
					if (MasterMindMethoden.ermittleSchwarz(code, tipp) == nStellen)
						System.out.println("Code gefunden");
				}

			}

		}

	}

}
