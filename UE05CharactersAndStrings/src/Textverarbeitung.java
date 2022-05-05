/**
 * Rohdatei zur Programmieraufgabe "Textverarbeitung"
 * @author Michael Wild
 */
public class Textverarbeitung
{
	public static void main(String[] args) {
		// L�nge auf welche die Zeilen abgeschnitten und auf die Blocksatz 
		// eingestellt wird
		final int LAENGE = 30;
		System.out.println("Textverarbeitung");
		System.out.println("================");
		String s1 = readString("1. Zeile: "); //"  Sein  oder  nicht sein,";
		String s2 = readString("2. Zeile: ");//"das  ist hier  die Frage.";
		String s3 = readString("3. Zeile: ");//" Wer hat   an der Uhr gedreht? Zuviel";
		String s4 = readString("4. Zeile: ");//"ist es wirklich  schon spät?  ";
		
		// Ermittlung der abgeschnittenen Zeilen
		s1 = abschneiden(s1,LAENGE);
		s2 = abschneiden(s2,LAENGE);
		s3 = abschneiden(s3,LAENGE);
		s4 = abschneiden(s4,LAENGE);
		System.out.println(">>Abschneiden");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		// Entfernen der Leerzeichen pro Zeile
		s1 = leerzeichenEntfernen(s1);
		s2 = leerzeichenEntfernen(s2);
		s3 = leerzeichenEntfernen(s3);
		s4 = leerzeichenEntfernen(s4);
		System.out.println(">>Leerzeichen entfernen");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		// Einstellen des Blocksates
		System.out.println(">>Blocksatz");
		s1 = blocksatz(s1,LAENGE);
		s2 = blocksatz(s2,LAENGE);
		s3 = blocksatz(s3,LAENGE);
		s4 = blocksatz(s4,LAENGE);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

	/**
	 * Schneidet den �bergebenen String s auf eine L�nge von l zurecht
	 * und gibt den abgeschnittenen String zur�ck. Sollte der String weniger
	 * als l Zeichen lang sein, so wird der String unver�ndert zur�ck gegeben.
	 * Die Methode kann nur funktionieren, falls s nicht null und falls
	 * l > 0 ist, ansonsten wird null als Ergebnis zur�ck geliefert
	 * @param s der abzuschneidende String
	 * @param l Laenge die der zur�ckzuliefernde String haben soll
	 * @return der auf die L�nge l gek�rzte String oder null falls s gleich null 
	 * oder l <= 0 ist
	 */
	public static String abschneiden(String s, int l) {
		String ret = null;
		// Rückgabe, wenn bereits unter angegeben Länge
		if (s.length() < l) {
			ret = s;
			return ret;
			// Rückgabe bei Normalfall
		} else {
			if (l > 0 && s != null) {
				ret = s.substring(0, l);
				return ret;
			}
			// Rückgabe, wenn string gleich null oder l <= 0
			else
				return null;
		}
	}
	
	/**
	 * Entfernt vom �bergebenen String s alle �berfl�ssigen Leerzeichen, die 
	 * nicht nur am Beginn und am Ende sondern auch zwischen den Worten im
	 * String vorhanden sein k�nnen. Falls f�r s null �bergeben wird, dann 
	 * liefert die Methode null zur�ck
	 * @param s String der die zu entfernen Leerzeichen enth�lt
	 * @return den String, der weder am Anfang noch am Ende Leerzeichen
	 * enth�lt und der auch zwischen den Worten nur jeweils ein Leerzeichen
	 * enth�lt. Insbesondere liefert die Methode null zur�ck, falls ihr null
	 * �bergeben wurde
	 */
	public static String leerzeichenEntfernen(String s) {
		String ret = null;
		// Normalfall
		if (s != null) {
			// entfernen von Leerzeichen am Anfang & Ende
			ret = s.trim();
			// entfernen von Leerzeichen zwischen Wörtern
			for (int i = 0; i < ret.length() - 1; i++) {
				// Ohne der While-Schleife, würde immer nur ein Leerzeichen entfernt werden
				while (Character.isWhitespace(ret.charAt(i)) && Character.isWhitespace(ret.charAt(i + 1))) {
					if (Character.isWhitespace(ret.charAt(i)) && Character.isWhitespace(ret.charAt(i + 1))) {
						ret = ret.substring(0, i) + ret.substring(i + 1);
					}
				}
			}
			return ret;
		} else
			return null;
	}
	
	/**
	 * Stellt auf den �bergebenen String s einen Blocksatz der L�nge l ein.
	 * Sollte der String s gleich null oder l�nger als l Zeichen sein oder
	 * sollte der String keine Leerzeichen enthalten �ber die der Blocksatz
	 * gebildet werden kann, so wird null als Ergebnis geliefert. Der Blocksatz 
	 * wird so gebildet, dass die fehlenden Leerzeichen bis zu L�nge l 
	 * gleichm��ig auf die bereits vorhandenen Leerzeichen aufgeteilt werden. 
	 * Bevor der Blocksatz eingestellt wird, werden beim vorhandenen String alle 
	 * unn�tigen Leerzeichen weggestrichen
	 * @param s String auf den der Blocksatz eingestellt werden soll
	 * @param l die L�nge des Blocksatzes
	 * @return den String, auf den der Blocksatz eingestellt wurde
	 */
	public static String blocksatz(String s, int l) {
		String ret = null;
		boolean hasWhitespace = false;
		// Anzahl der einzufügenden Leerzeichen
		int bisBlocksatz = 0;

		// konrolle ob Leerzeichen vorhanden ist
		for (int i = 0; i < s.length(); i++) {
			if (Character.isWhitespace(s.charAt(i)))
				hasWhitespace = true;
		}
		// Normalfall
		if (s != null && s.length() <= l && hasWhitespace == true) {
			// Festlegen der Anzahl an einzufügenden Leerzeichen
			bisBlocksatz = l - s.length();
			ret = s;
			// einfügen Leerzeichen
			while (bisBlocksatz > 0) {
				int i = 0;
				while (i < ret.length() && bisBlocksatz > 0) {
					if (Character.isWhitespace(ret.charAt(i)) && !Character.isWhitespace(ret.charAt(i - 1))) {
						ret = ret.substring(0, i) + " " + ret.substring(i);
						bisBlocksatz--;
					}
					i++;
				}
			}
			return ret;
			// Wenn Blocksatz nicht erstellt werden kann
		} else
			return ret;
	}

	public static String readString(String text) {
		System.out.print(text);
		return (new java.util.Scanner(System.in).nextLine());
	}
}
