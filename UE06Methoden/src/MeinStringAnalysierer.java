import java.lang.Character.Subset;

public class MeinStringAnalysierer
{
	/**
	 * Liefert true zur�ck, wenn der String nicht null ist und nur Ziffern enth�lt.
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
	 * liefert den �bergebenen String in umgekehrter Reihenfolge zur�ck. Falls der
	 * String null ist, wird null zur�ck geliefert.
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
	 * Liefert den um die Leerzeichen befreiten String zur�ck. Wird null �bergeben,
	 * so liefert die Methode null zur�ck.
	 * Beispiel: loeschenLeerzeichen("Susi Sorglos sitzt") ergibt "SusiSorglossitzt"
	 * @param s der von Leerzeichen zu s�ubernde String
	 * @return null falls der �bergebene String null ist, ansonsten den von Leerzeichen
	 * ges�uberten String
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
	 * Testet ob der �bergebene String ein Palindrom ist, d. h. von hinten gelesen das 
	 * Selbe bedeutet wie von vorne gelesen. Falls null �bergeben wurde oder die L�nge
	 * des String 0 ist, wird false zur�ck geliefert.
	 * Bevor auf Palindrom getestet wird, werden alle Leerzeichen aus dem String 
	 * entfernt. Gro�-/Kleinschreibung wird bei der Analyse nicht beachtet
	 * Beispiel: istPalindrom("Otto") ergibt true
	 * istPalindrom("Ei nie") ergibt true
	 * istPalindrom("Ein Neger mit Gazelle zagt im Regen nie") ergibt true
	 * @param s der zu untersuchende String
	 * @return true, falls der String nicht null und eine L�nge gr��er als 0 und ein
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
	 * Gibt einen String zur�ck, in dem die Zahl zahl linksb�ndig steht. Der String 
	 * soll anzahl Zeichen lang sein. Es m�ssen also rechts solange Leerzeichen erg�nzt 
	 * werden, bis der String die passende L�nge hat.
	 * Ist die Zahl l�nger als anzahl, so wird die Zahl in ihrer gesamten L�nge zur�ck
	 * gegeben
	 * Beispiel: links(15,3) ergibt "15 "
	 * links(15,4) ergibt "15  "
	 * @param zahl die linksb�ndig ausgegeben werden soll
	 * @param anzahl die L�nge des auszugebenden Strings
	 * @return den String, der ganz links die Zahl enth�lt und der auf anzahl Stellen
	 * bei Bedarf aufgef�llt wurde
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
	 * Gibt einen String zur�ckgibt, in dem die Zahl zahl rechtsb�ndig steht. Der String 
	 * soll anzahl Zeichen haben. Es m�ssen also links solange Leerzeichen erg�nzt 
	 * werden, bis der String die passende L�nge hat.
	 * Ist die Zahl l�nger als anzahl, so wird die Zahl in ihrer gesamten L�nge zur�ck
	 * gegeben
	 * Beispiel: rechts(15,3) ergibt " 15"
	 * rechts(15,4) ergibt "  15"
	 * @param zahl die im String rechtsb�ndig ausgegeben werden soll
	 * @param anzahl die L�nge des auszugebenden Strings
	 * @return den String, der ganz rechts die Zahl enth�lt und der auf anzahl Stellen
	 * bei Bedarf aufgef�llt wurde
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
	 * Z�hlt wie viele Buchstaben im String s vorhanden sind. Die deutschen Umlaute 
	 * werden nicht mitgez�hlt. Gro�-/Kleinschreibung wird ignoriert. 
	 * Ist s gleich null, so wird -1 als Ergebnis zur�ck geliefert
	 * Beispiel: zaehleBuchstaben("Hallo M�ller06"))ergibt 10
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
	 * Z�hlt wie viele Zeichen im String s keine Buchstaben sind. Die deutschen Umlaute 
	 * werden mit gez�hlt (d.h. als keine Buchstaben interpretiert). Die 
	 * Gro�-/Kleinschreibung wird ignoriert. 
	 * Ist s gleich null, so wird -1 als Ergebnis zur�ck geliefert
	 * Beispiel: zaehleNichtBuchstaben("Hallo M�ller06")) ergibt 4
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
	 * Z�hlt wie oft das Zeichen c im String s vorkommt. Die Gro�-/Kleinschreibung 
	 * wird ignoriert.
	 * Ist s gleich null, so wird -1 als Ergebnis zur�ck geliefert
	 * Beispiel: zaehleZeichen("Alle Bananen sind krumm!", 'a') ergibt 3
	 * @param s der zu durchsuchende String
	 * @param c das Zeichen, welches im String gesucht werden soll
	 * @return -1 falls der �bergebenen String null ist, ansonsten die Anzahl wie oft
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
	 * L�scht aus dem String s das Zeichen an der Position p.
	 * Falls der �bergebene String gleich null ist, die �bergebene Position < 0 oder
	 * �ber die L�nge des Strings hinaus geht, wird null zur�ck geliefert 
	 * Beispiel: loescheZeichenAnPosition("Peters@platz", 6) ergibt "Petersplatz"
	 * @param s der String in welchem das Zeichen gel�scht werden soll
	 * @param p die Position an welcher das Zeichen gel�scht werden soll
	 * @return den String, der das zu l�schende Zeichen an der Position nicht mehr
	 * enth�lt
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
	 * L�scht alle Zeichen c aus dem String s. Gro�-/Kleinschreibung wird dabei beachtet.
	 * Falls als String null �bergeben wird, so wird null zur�ck geliefert
	 * Beispiel: loescheZeichen("Ein Keller", 'e') ergibt "Ein Kllr"
	 * @param s der String in welchem das Zeichen c gel�scht werden soll
	 * @param c das zu l�schende Zeichen
	 * @return der String, der keine Zeichen c mehr enth�lt
	 */
	public static String loescheZeichen (String s, char c) {
		String ret = null;
		//Wenn kein Ausnahmefall ist
		if (s != null) {
			for (int i = 0; i < s.length();) {
				//Wenn Char c �bereinstimmt, dann wird das Zeichen im String gel�scht, sonst geht es ein Zeichen weiter
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
	 * L�scht aus dem String s einen Teilbereich heraus, der durch die Anfangsposition 
	 * start und durch seine L�nge l gegegeben ist. Werden alle Zeichen gel�scht, so muss
	 * null zur�ck gegeben werden
	 * Liefert null zur�ck, falls der �bergebene String null ist oder falls start
	 * und l �ber den String hinaus greifen.  s muss gr��er oder gleich 0 sein, und
	 * l muss gr��er als 0 sein
	 * Beispiel: loescheStringAnPosition("Hallo Leute!", 6, 5) ergibt "Hallo !"
	 * loeschenStringAnPosition("AG", 0, 2) ergibt null
	 * @param s der String in dem gel�scht werden soll
	 * @param start die Startposition ab der gel�scht wird
	 * @param l die Anzahl der zu l�schenden Zeichen
	 * @return der String, in dem mehrer Zeichen gel�scht wurden
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
	 * L�scht aus dem String s jedes Vorkommen des Strings ls. Die Gro�-/Kleinschreibung
	 * wird dabei beachtet. Die beiden �bergebenen Strings d�rfen nicht null sein und
	 * m�ssen Zeichen enthalten. Werden alle Zeichen gel�scht, so wird null zur�ck
	 * geliefert 
	 * Beispiel: loescheString("HHallallo Leute-HALLHallo", "Hall") ergibt
	 * "Hallo Leute-HALLo"
	 * loescheString("HallHall","Hall") ergibt null
	 * @param s der String in dem gel�scht werden soll
	 * @param ls der zu l�schende Teilstring
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
