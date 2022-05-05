public class MeinZahlensystemwandler
{
	
	public static void main(String[] Args) {
		TestZahlensystemwandler.main(null);
	}
	
	/**
	 * Wandelt das Zeichen nr in eine Zahl um, wobei die Groß-/Klein-schreibung 
	 * ignoriert wird:
	 * '0' ergibt 0, '1' ergibt 1, ... '9' ergbit 9, 'A' ergibt 10, 'B' ergibt 11, ...,
	 * 'Z' ergibt 35
	 * Sollte ein ungültiges Zeichen übergeben werden, so gibt die Methode -1 zurück
	 * @param nr das umzuwandelnde Zeichen
	 * @return die Zahl für die das Zeichen steht
	 */
	public static int getDigit (char nr) {
		int ret = -1;
		
		if(Character.isDigit(nr)) {
			ret = nr - 48;
		} else
			if (Character.isLetter(nr)) {
				if (Character.isLowerCase(nr))
					ret = (char)(nr - 87);
				else
					ret = (char)(nr - 55);
			}
		return ret;
	}
	/**
	 * Wandelt die Nummer der Ziffer nr in ein Zeichen um:
	 * 0 ergibt '0', 1 ergibt '1', ..., 9 ergibt '9', 10 ergibt 'A', 11 ergibt 'B', 
	 * ..., 35 ergibt 'Z'
	 * Sollte eine ungültige Nummer übergeben werden, so gibt die Methode einen Stern 
	 * '*' zurück
	 * @param nr die Nummer welche in ein Zeichen umgewandelt werden soll
	 * @return das Zeichen das für die Nummer steht
	 */
	public static char getDigit (int nr) {
		char ret = '*';
		if(Character.isLetter((char)nr+87) || Character.isDigit((char)nr+48))
			if(nr <= 9)
				ret = (char)(nr + 48);
			else
				ret = (char)(nr + 55);
		
		return ret;
	}
	
	/**
	 * Wandelt die Zahl num mit der Basis basis in eine Dezimalzahl um und liefert
	 * diese zurück. Falls die übergebene Zahl num gleich null oder deren Länge gleich
	 * 0 ist oder die Basis kleiner als 2 ist, wird -1 zurück geliefert. Wenn eine
	 * Ziffer der übergebenen Zahl nicht zur Basis pass, wird ebenfalls -1 zurück
	 * geliefert
	 * Beispiel: numToDec("01110110", 2) ergibt 118
	 * numToDec("170712", 8) ergibt 61898
	 * numToDec("170712", 7) ergibt -1
	 * @param num die umzuwandelnde Zahl als String übergeben
	 * @param basis die Basis der umzuwandelnden Zahl
	 * @return das Ergebnis im Dezimalsystem
	 */
	public static int numToDec(String num, int basis) {
		int ret = -1;
		
		if(!(num == null || num.length() == 0 || basis < 2)) {
			ret = 0;
			//Für die Vereinfachung wird der String umgedreht
			num = MeinStringAnalysierer.umdrehenString(num);
			for (int stelle = num.length()-1; stelle >= 0; stelle--) {
				ret += getDigit(num.charAt(stelle)) * Math.pow(basis, stelle);
				if (getDigit(num.charAt(stelle)) >= basis) {
					ret = -1;
					stelle = -1;
				}
			}
			
		}
		
		return ret;
	}
	
	/**
	 * Wandelt die Dezimalzahl dec in eine Zahl mit der Basis basis um und gibt diese
	 * zurück. Dabei muss die Dezimalzahl dec größer oder gleich 0 sein und die Basis
	 * muss größer als 1 sein, ansonsten wird null zurück geliefert.
	 * Beispiel: decToNum(118,2) ergibt 1110110
	 * decToNum(61898,8) ergibt 170712
	 * @param dec die umzuwandelnde Dezimalzahl
	 * @param basis nach welcher umgewandelt wird
	 * @return die umgewandelte Zahl
	 */
	public static String decToNum(int dec, int basis) {
		String ret = "";
		if (dec >= 0 && basis > 1) {
			while(dec > 0) {
				ret = dec%basis + ret;
				dec = dec/basis;
			}
		} else
			ret = null;
		
		return ret;
	}
	 
	/**
	 * Wandelt die Zahl num mit der Basis 16 in eine Dezimalzahl um und liefert
	 * diese zurück. Falls die übergebene Zahl num gleich null oder deren Länge gleich
	 * 0 ist, wird -1 zurück geliefert.
	 * Beispiel: hexToDec("AFE") ergibt 2814
	 * numToDec("D5") ergibt 213
	 * numToDec(null) ergibt -1
	 * @param num die umzuwandelnde Zahl als String übergeben
	 * @return das Ergebnis im Dezimalsystem
	 */
	public static int hexToDec(String num) {
		int ret = -1;
		if (!(num == null || num.length() == 0)) {
			ret = 0;
			num = MeinStringAnalysierer.umdrehenString(num);
			for (int stelle = num.length()-1; stelle >= 0; stelle--) {
				ret += getDigit(num.charAt(stelle)) * (int)Math.pow(16, stelle);
//				System.out.print(getDigit(num.charAt(stelle))  * (int)Math.pow(16, stelle) + "\t");
			}
		}
		
		return ret;
	}
	
	/**
	 * Wandelt die Dezimalzahl dec in eine Zahl mit der Basis 16 um und gibt diese
	 * zurück. Dabei muss die Dezimalzahl dec größer oder gleich 0 sein ansonsten wird null zurück geliefert.
	 * Beispiel: decToNum(118) ergibt 76
	 * decToNum(618) ergibt 26A
	 * @param dec die umzuwandelnde Dezimalzahl
	 * @param basis nach welcher umgewandelt wird
	 * @return die umgewandelte Zahl
	 */
	public static String decToHex(int dec) {
		String ret = "";
		if (dec >= 0) {
			while(dec > 0) {
				if (dec%16 < 10)
					ret = dec%16 + ret;
				else
					ret = (char)(dec%16 + 65) + ret;
				dec = dec/16;
			}
		} else
			ret = null;
		
		return ret;
	}

	/**
	 * Wandelt die Binärzahl dual in das Zehnersystem um und gibt diese
	 * zurück. Falls die übergebene Zahl gleich null oder deren Länge gleich
	 * 0 ist, wird -1 zurück geliefert.
	 * Beispiel: dualToDec("01110110") ergibt 118
	 * dualToDec("01110110") ergibt 118
	 * @param num die umzuwandelnde Zahl als String übergeben
	 * @param basis die Basis der umzuwandelnden Zahl
	 * @return das Ergebnis im Dezimalsystem
	 */
	public static int dualToDec(String dual) {
		int ret = 0;
		
		ret = numToDec(dual, 2);
		
		return ret;
	}
	
	/*
	 * Wandelt die Dezimalzahl dec in eine Binärzahl umund gibt diese
	 * zurück. Dabei muss die Dezimalzahl dec größer oder gleich 0 sein und die Basis
	 * muss größer als 1 sein, ansonsten wird null zurück geliefert.
	 * Beispiel: decToDual(118) ergibt 1110110
	 * decToDual(170) ergibt 10101010
	 * @param dec die umzuwandelnde Dezimalzahl
	 * @param basis nach welcher umgewandelt wird
	 * @return die umgewandelte Zahl
	 */
	public static String decToDual(int dec) {
		String ret = "";
		
		ret = decToNum(dec, 2);
		
		return ret;
	}
	
	/**
	 * Wandelt die Zahl num mit der Basis basis in eine Dezimalzahl um und liefert
	 * diese zurück. Falls die übergebene Zahl num gleich null oder deren Länge gleich
	 * 0 ist oder die Basis kleiner als 2 ist, wird -1 zurück geliefert. Wenn eine
	 * Ziffer der übergebenen Zahl nicht zur Basis pass, wird ebenfalls -1 zurück
	 * geliefert
	 * Beispiel: numToDec("01110110", 2) ergibt 118
	 * numToDec("170712", 8) ergibt 61898
	 * numToDec("170712", 7) ergibt -1
	 * @param num die umzuwandelnde Zahl als String übergeben
	 * @param basis die Basis der umzuwandelnden Zahl
	 * @return das Ergebnis im Dezimalsystem
	 */
	public static String numToNum(String num, int basis, int ziel) {
		String ret = "";
		
		ret = decToNum(numToDec(num, basis), ziel);
		
		return ret;
	}
}