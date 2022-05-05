import java.lang.Character.Subset;

public class MeinStringAnalysierer
{
	/**
	 * Liefert true zurï¿½ck, wenn der String nicht null ist und nur Ziffern enthï¿½lt.
	 * Beispiel: hatNurZiffern("12a43") ergibt false 
	 * hatNurZiffern("1242332322129") ergibt true
	 * @param s der zu untersuchende String
	 * @return true, falls der String nicht leer ist und nur aus Ziffern besteht
	 */
	public static boolean hatNurZiffern (String s) {
		boolean ret = false;
		
		if(s != null) {
			for(int i = 0; i < s.length(); i++) {
				if(Character.isDigit(s.charAt(i))) {
					ret = true;
				} else {
					ret = false;
					i = s.length();
				}
			}
		}
		return ret;
	}
	
	/**
	 * liefert den ï¿½bergebenen String in umgekehrter Reihenfolge zurï¿½ck. Falls der
	 * String null ist, wird null zurï¿½ck geliefert.
	 * Beispiel: umdrehenString("Rudi") ergibt "iduR"
	 * @param s der umzudrehende String
	 * @return null falls der String s null ist, ansonsten den umgedrehten String
	 */
	public static String umdrehenString (String s) {
		String ret = "";
		
		if(s != null) {
			for (int i = s.length()-1; i >= 0; i--) {
				ret = ret + s.charAt(i);
			}
		}
		return ret;
	}

	/**
	 * Liefert den um die Leerzeichen befreiten String zurï¿½ck. Wird null ï¿½bergeben,
	 * so liefert die Methode null zurï¿½ck.
	 * Beispiel: loeschenLeerzeichen("Susi Sorglos sitzt") ergibt "SusiSorglossitzt"
	 * @param s der von Leerzeichen zu sï¿½ubernde String
	 * @return null falls der ï¿½bergebene String null ist, ansonsten den von Leerzeichen
	 * gesï¿½uberten String
	 */
	public static String loeschenLeerzeichen (String s) {
		String ret = "";
		
		if(s != null) {
			ret = s.trim();
			for (int i = 0; i < ret.length();) {
				if (Character.isWhitespace(ret.charAt(i)))
					ret = ret.substring(0, i) + ret.substring(i + 1);
				else
					i++;
			}
		}
		return ret;
	}
	
	/**
	 * Testet ob der ï¿½bergebene String ein Palindrom ist, d. h. von hinten gelesen das 
	 * Selbe bedeutet wie von vorne gelesen. Falls null ï¿½bergeben wurde oder die Lï¿½nge
	 * des String 0 ist, wird false zurï¿½ck geliefert.
	 * Bevor auf Palindrom getestet wird, werden alle Leerzeichen aus dem String 
	 * entfernt. Groï¿½-/Kleinschreibung wird bei der Analyse nicht beachtet
	 * Beispiel: istPalindrom("Otto") ergibt true
	 * istPalindrom("Ei nie") ergibt true
	 * istPalindrom("Ein Neger mit Gazelle zagt im Regen nie") ergibt true
	 * @param s der zu untersuchende String
	 * @return true, falls der String nicht null und eine Lï¿½nge grï¿½ï¿½er als 0 und ein
	 * Palidrom ist
	 */
	public static boolean istPalindrom (String s) {
		boolean ret = true;
		String sumgekehrt = umdrehenString(s);
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) != s.charAt(i))
				ret = false;
		}
		return ret;
	}
	
	/**
	 * Gibt einen String zurï¿½ck, in dem die Zahl zahl linksbï¿½ndig steht. Der String 
	 * soll anzahl Zeichen lang sein. Es mï¿½ssen also rechts solange Leerzeichen ergï¿½nzt 
	 * werden, bis der String die passende Lï¿½nge hat.
	 * Ist die Zahl lï¿½nger als anzahl, so wird die Zahl in ihrer gesamten Lï¿½nge zurï¿½ck
	 * gegeben
	 * Beispiel: links(15,3) ergibt "15 "
	 * links(15,4) ergibt "15  "
	 * @param zahl die linksbï¿½ndig ausgegeben werden soll
	 * @param anzahl die Lï¿½nge des auszugebenden Strings
	 * @return den String, der ganz links die Zahl enthï¿½lt und der auf anzahl Stellen
	 * bei Bedarf aufgefï¿½llt wurde
	 */
	public static String links (int zahl, int anzahl) {
		String ret = "";
		
		ret += zahl;
		if(anzahl-ret.length()>0) {
			for (int i = 0; i < anzahl - ret.length(); i++) {
				ret += " ";
			}
		}
		return ret;
	}
	
	/**
	 * Gibt einen String zurï¿½ckgibt, in dem die Zahl zahl rechtsbï¿½ndig steht. Der String 
	 * soll anzahl Zeichen haben. Es mï¿½ssen also links solange Leerzeichen ergï¿½nzt 
	 * werden, bis der String die passende Lï¿½nge hat.
	 * Ist die Zahl lï¿½nger als anzahl, so wird die Zahl in ihrer gesamten Lï¿½nge zurï¿½ck
	 * gegeben
	 * Beispiel: rechts(15,3) ergibt " 15"
	 * rechts(15,4) ergibt "  15"
	 * @param zahl die im String rechtsbï¿½ndig ausgegeben werden soll
	 * @param anzahl die Lï¿½nge des auszugebenden Strings
	 * @return den String, der ganz rechts die Zahl enthï¿½lt und der auf anzahl Stellen
	 * bei Bedarf aufgefï¿½llt wurde
	 */
	public static String rechts (int zahl, int anzahl) {
		String ret = "";
		
		ret += zahl;
		if(anzahl-ret.length()>0) {
			for (int i = 0; i < anzahl - ret.length(); i++) {
				ret = " " + ret;
			}
		}
		return ret;
	}
	
	/**
	 * Zï¿½hlt wie viele Buchstaben im String s vorhanden sind. Die deutschen Umlaute 
	 * werden nicht mitgezï¿½hlt. Groï¿½-/Kleinschreibung wird ignoriert. 
	 * Ist s gleich null, so wird -1 als Ergebnis zurï¿½ck geliefert
	 * Beispiel: zaehleBuchstaben("Hallo Mï¿½ller06"))ergibt 10
	 * @param s der auf Buchstaben hin zu testenden String
	 * @return -1 falls s gleich null ist, ansonsten die Anzahl der Buchstaben die in
	 * s zu finden sind 
	 */
	public static int zaehleBuchstaben (String s) {
		int ret = 0;
		
		//Wenn kein Sonderfall zutritt
		if (s != null) {
			for (int i = 0; i < s.length(); i++) {
				if (Character.isLetter(s.charAt(i)))
					ret++;
			}
		} else
			ret = -1;
		return ret;
	}
	
	/**
	 * Zï¿½hlt wie viele Zeichen im String s keine Buchstaben sind. Die deutschen Umlaute 
	 * werden mit gezï¿½hlt (d.h. als keine Buchstaben interpretiert). Die 
	 * Groï¿½-/Kleinschreibung wird ignoriert. 
	 * Ist s gleich null, so wird -1 als Ergebnis zurï¿½ck geliefert
	 * Beispiel: zaehleNichtBuchstaben("Hallo Mï¿½ller06")) ergibt 4
	 * @param s der auf Buchstaben hin zu testenden String
	 * @return -1 falls s gleich null ist, ansonsten die Anzahl der Zeichen im String,
	 * die nicht Buchstaben sind 
	 */
	public static int zaehleNichtBuchstaben (String s) {
		int ret = 0;
		
		//Wenn kein Sonderfall zutritt
		if (s != null)
			ret = s.length() - zaehleBuchstaben(s);
		else
			ret = -1;
		return ret;
	}
	
	/**
	 * Zï¿½hlt wie oft das Zeichen c im String s vorkommt. Die Groï¿½-/Kleinschreibung 
	 * wird ignoriert.
	 * Ist s gleich null, so wird -1 als Ergebnis zurï¿½ck geliefert
	 * Beispiel: zaehleZeichen("Alle Bananen sind krumm!", 'a') ergibt 3
	 * @param s der zu durchsuchende String
	 * @param c das Zeichen, welches im String gesucht werden soll
	 * @return -1 falls der ï¿½bergebenen String null ist, ansonsten die Anzahl wie oft
	 * das Zeichen c im String s vorkommt
	 */
	public static int zaehleZeichen (String s, char c) {
		int ret = 0;
		//Wenn kein Sonderfall zutritt
		if (s != null) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == c)
					ret++;
			}
		}
		return ret;
	}
	
	/**
	 * Löscht aus dem String s das Zeichen an der Position p.
	 * Falls der übergebene String gleich null ist, die übergebene Position < 0 oder
	 * über die Länge des Strings hinaus geht, wird null zurück geliefert 
	 * Beispiel: loescheZeichenAnPosition("Peters@platz", 6) ergibt "Petersplatz"
	 * @param s der String in welchem das Zeichen gelöscht werden soll
	 * @param p die Position an welcher das Zeichen gelöscht werden soll
	 * @return den String, der das zu löschende Zeichen an der Position nicht mehr
	 * enthält
	 */
	public static String loescheZeichenAnPosition (String s, int p) {
		String ret = null;
		//wenn kein Sonderfall zutritt
		if (!(s == null || p > s.length() || p < 0)) {
			ret = s.substring(0, p) + s.substring(p+1);
		}
		return ret;
	}
	
	/**
	 * Löscht alle Zeichen c aus dem String s. Groß-/Kleinschreibung wird dabei beachtet.
	 * Falls als String null übergeben wird, so wird null zurück geliefert
	 * Beispiel: loescheZeichen("Ein Keller", 'e') ergibt "Ein Kllr"
	 * @param s der String in welchem das Zeichen c gelöscht werden soll
	 * @param c das zu löschende Zeichen
	 * @return der String, der keine Zeichen c mehr enthï¿½lt
	 */
	public static String loescheZeichen (String s, char c) {
		String ret = null;
		//Wenn kein Ausnahmefall ist
		if (s != null) {
			for (int i = 0; i < s.length();) {
				//Wenn Char c übereinstimmt, dann wird das Zeichen im String gelöscht, sonst geht es ein Zeichen weiter
				if (s.charAt(i) == c) {
					s = s.substring(0, i) + s.substring(i+1);
				} else
					i++;
			}
			ret = s;
		}
		return ret;
	}
	
	/**
	 * Löscht aus dem String s einen Teilbereich heraus, der durch die Anfangsposition 
	 * start und durch seine Länge l gegegeben ist. Werden alle Zeichen gelöscht, so muss
	 * null zurück gegeben werden
	 * Liefert null zurück, falls der übergebene String null ist oder falls start
	 * und l über den String hinaus greifen.  s muss größer oder gleich 0 sein, und
	 * l muss größer als 0 sein
	 * Beispiel: loescheStringAnPosition("Hallo Leute!", 6, 5) ergibt "Hallo !"
	 * loeschenStringAnPosition("AG", 0, 2) ergibt null
	 * @param s der String in dem gelöscht werden soll
	 * @param start die Startposition ab der gelöscht wird
	 * @param l die Anzahl der zu löschenden Zeichen
	 * @return der String, in dem mehrer Zeichen gelöscht wurden
	 */
	public static String loescheStringAnPosition (String s, int start, int l) {
		String ret = null;
		//Wenn kein Ausnahmefall ist
		if(!(s == null || start + l > s.length() || start < 0 || l < 0)) {
			ret = s.substring(0, start) + s.substring(start + l);
		}
		return ret;
	}

	/**
	 * Löscht aus dem String s jedes Vorkommen des Strings ls. Die Groß-/Kleinschreibung
	 * wird dabei beachtet. Die beiden übergebenen Strings dürfen nicht null sein und
	 * müssen Zeichen enthalten. Werden alle Zeichen gelöscht, so wird null zurück
	 * geliefert 
	 * Beispiel: loescheString("HHallallo Leute-HALLHallo", "Hall") ergibt
	 * "Hallo Leute-HALLo"
	 * loescheString("HallHall","Hall") ergibt null
	 * @param s der String in dem gelöscht werden soll
	 * @param ls der zu löschende Teilstring
	 * @return der String, in dem der Teilstring nicht mehr vorkommt
	 */
	public static String loescheString (String s, String ls) {
		String ret = null;
		//Wenn kein Ausnahmefall ist
		if(!(s == null || ls == null || s.length() <= 0 || ls.length() <= 0)) {
			while (s.indexOf(ls) != -1) {
				s = s.substring(0, s.indexOf(ls)) + s.substring(s.indexOf(ls) + ls.length());
			}
		}
		if (s.length() == 0)
			ret = s;
		
		return ret;
	}
}
