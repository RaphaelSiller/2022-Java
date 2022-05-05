
public class MasterMindMethoden {

	/*
	 * Ermittelt einen Farbcode welcher nStellen lang ist und aus nFarben besteht. Jede Farbe kommt nur einmal vor.
	 * Wenn dies nicht machbar ist (nFarben kleiner als nStellen), dann wird null zurückgegeben
	 * @param nStelle gibt an, aus wie vielen Zeichen der Farbcode besteht.
	 * @param nFarben aus wie vielen unterschiedlichen Farben der Code besteht.
	 * @return den Farbcode als String
	 */
	public static String erzeugeCode(int nStelle, int nFarben) {
		String ret = "";
		
		if (nStelle < nFarben) {
			for (int i = 0; i < nStelle; i++) {
				char addendum = (char) ((int) (Math.random() * nFarben - 0.5) + 65);
				for (int j = 0; j < ret.length(); j++) {
					while (addendum == ret.charAt(j)) {
						addendum = (char) ((int) (Math.random() * nFarben - 0.5) + 65);
						j = 0;
					}
				}
				ret = ret + addendum;
			}
		} else
			ret = null;
		
		return ret;
	}
	/*
	 * Kontrolliert, ob der übergebene String doppelte Zeichen enthält. Ist das der Fall, wird true zurückgegeben.
	 * False wird zurückgegeben, wenn String gleich null ist oder die länge des Strings 0 ist.
	 * Groß und kleinschreibung wird nicht berücksichtigt.
	 * @param code, der zu kontrollierende String
	 * @return ob doppelte Zeichen enthalten sind.
	 */
	public static boolean enthaeltDoppelte(String code) {
		boolean ret = false;
			
		code = code.toUpperCase();
		for (int i = 0; i < code.length()-1; i++) {
			for (int j = i+1; j < code.length(); j++) {
				if (code.charAt(j) == code.charAt(i)) {
					ret = true;
					i = code.length();
					j = code.length();
				}
			}
		}
		
		return ret;
	}
	
	/*
	 * Methode zuständig für die Eingabe des Tipps 
	 * Vor der Eingabe steht "Ihr Tipp:" Falls die Eingabe nicht ordnungsgemäß ist, wird die Eingabe wiederholt.
	 * Die Eingabe ist nicht Ordnungsgemäß, wenn die Eingabe leer ist, nicht die geforderte Länge hat oder doppelte
	 * Farben vorkommen.
	 * Wenn der Benutzer "ende" eingibt, wird die Eingabe des Benutzers zurückgegeben
	 * Die Eingabe wird in Großbuchstaben zurückgegeben
	 */
	public static String eingabeTipp(int laenge) {
		String ret = "";
		
		while (!ret.equals("ENDE") && (ret == null || ret == "" || enthaeltDoppelte(ret))) {
			ret = TestScannerErweitert.readString("Ihr Tipp: ");
			ret = ret.toUpperCase();
			if (!ret.equals("ENDE") && (ret == null || ret == "" || enthaeltDoppelte(ret))) {
				System.out.println("Die Eingabe darf nicht leer sein bzw. doppelte Zeichen enthalten oder hat nicht die erforderte Länge " + laenge);
			}
		}
		return ret;
	}
	
	/*
	 * Ermittelt die Anzahl an Farben, welche sich am richtigen Platz befinden.
	 * Die Methode liefert -1, wenn beide Strings unterschiedlich lang sind.
	 * @param code, der code, der erraten werden muss
	 * @param tipp, der eingegebene code, der zu vergleichen ist
	 * @return die Anzahl der Farben, die an der richtigen Position sind.
	 */
	public static int ermittleSchwarz(String code, String tipp) {
		int ret = 0;
		if (code.length() == tipp.length()) {
			for (int i = 0; i < code.length(); i++) {
				if (code.charAt(i) == tipp.charAt(i)) {
					ret++;
				}
			}
		} else
			ret = -1;
		return ret;
	}
	
	/*
	 * Ermittelt die Anzahl an Farben, welche im zu erratenden Code vorhanden sind.
	 * Die Methode liefert -1, wenn beide Strings unterschiedlich lang sind.
	 * @param code, der code, der erraten werden muss
	 * @param tipp, der eingegebene code, der zu vergleichen ist
	 * @return die Anzahl der Farben, die im zu erratenden Code vorhanden sind
	 */
	public static int ermittleWeiss(String code, String tipp) {
		int ret = 0;
		if (code.length() == tipp.length()) {
			for (int i = 0; i < code.length(); i++) {
				for (int j = 0; j < tipp.length(); j++) {
					if (code.charAt(i) == tipp.charAt(j))
						ret++;
				}
			}
		} else
			ret = -1;
		return ret;
	}

}
