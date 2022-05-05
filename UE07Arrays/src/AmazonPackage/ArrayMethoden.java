package AmazonPackage;
public class ArrayMethoden {

	/**
	 * Erstellt ein neues Array mit der Gr��e anzahl. Die einzelnen Elemente werden
	 * mit Zufallszahlen zwischen von und bis gef�llt.
	 * 
	 * @param int
	 *            anzahl Die Gr��e des neuen Arrays
	 * @param von
	 *            Der kleinste Wert, welcher im Array vorkommen kann.
	 * @param bis
	 *            Der gr��te Wert, welcher im Array vorkommen kann.
	 * @return Das neu erstellte Array
	 */
	public static int[] randomIntArray(int anzahl, int von, int bis) {
		int[] ret = new int[anzahl];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = (int) (Math.random() * (Math.abs(von) + Math.abs(bis)) + 0.5) + von;
		}
		return ret;
	}

	/**
	 * Gibt den �bergebenen String in der Konsole aus. Die Ausgabe erfolgt in der
	 * Form: msg {Werte des Arrays getrennt durch einen Beistrich}
	 * 
	 * @param String
	 *            msg Der String, welcher als erstes ausgegeben wird.
	 * @param int[]
	 *            a das Array, welches ausgegeben werden sollte
	 */
	public static void printIntArray(String msg, int[] a) {
		System.out.print(msg + "{");
		for (int i = 0; i < a.length; i++) {
			System.out.print((i != a.length - 1) ? (a[i] + ", ") : a[i]);
		}
		System.out.println(" }");
	}

	/**
	 * Gibt den kleinsten Wert des �bergebenen Arrays zur�ck.
	 * 
	 * @param int[]
	 *            a das �bergebene Array.
	 * @return der kleinste Wert des �bergebenen Array a[].
	 */
	public static int getMinimum(int[] a) {
		int ret = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < ret)
				ret = a[i];
		}
		return ret;
	}

	/**
	 * Gibt den kleinsten Wert des �bergebenen Arrays, ab pos, zur�ck.
	 * 
	 * @param int[]
	 *            a das �bergebene Array.
	 * @param int
	 *            pos, der erste Index, welcher kontrolliert wird
	 * @return der kleinste Wert des �bergebenen Array a[].
	 */
	public static int getMinimum(int[] a, int pos) {
		int ret = a[pos];
		for (; pos < a.length; pos++) {
			if (a[pos] < ret)
				ret = a[pos];
		}
		return ret;
	}

	/**
	 * Gibt den gr��ten Wert des �bergebenen Arrays zur�ck.
	 * 
	 * @param int[]
	 *            a das �bergebene Array.
	 * @return der gr��te Wert des �bergebenen Array a[].
	 */
	public static int getMaximum(int[] a) {
		int ret = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > ret)
				ret = a[i];
		}
		return ret;
	}

	/**
	 * Gibt den Mittelwert des �bergebenen Arrays zur�ck.
	 * 
	 * @param int[]
	 *            a das �bergebene Array.
	 * @return der Mittelwert des �bergebenen Array a[].
	 */
	public static double getMittelwert(int[] a) {
		double ret = 0;
		if (a.length % 2 == 0) // Wenn das Array eine gerade Anzahl an Elementen hat
			ret = a[(a.length / 2) - 1] + a[a.length / 2];
		else
			ret = a[(a.length / 2)];
		return ret;
	}

	/**
	 * Gibt den Index des ersten Elements mit der Zahl z zur�ck.
	 * 
	 * @param int[]
	 *            a das �bergebene Array
	 * @param int
	 *            z die Zahl, nach der gesucht wird
	 * @return den Index des ersten Elementes == z.
	 */
	public static int indexOf(int[] a, int z) {
		int ret = -1;
		for (int i = 1; i < a.length; i++) {
			if (a[i] == z) {
				ret = i;
				i = a.length;
			}
		}
		return ret;
	}

	/**
	 * Gibt den Index des ersten Elements mit der Zahl z zur�ck. Die Suche startet
	 * inklusive vom Index pos.
	 * 
	 * @param int[]
	 *            a das �bergebene Array
	 * @param int
	 *            z die Zahl, nach der gesucht wird
	 * @param int
	 *            pos der Index, von dem die Suche startet
	 * @return den Index des ersten Elementes == z.
	 */
	public static int indexOf(int[] a, int z, int pos) {
		int ret = -1;
		for (; pos < a.length; pos++) {
			if (a[pos] == z) {
				ret = pos;
				pos = a.length;
			}
		}
		return ret;
	}

	/**
	 * Gibt die kleinste Zahl des �bergebenene Arrays, ab pos, zur�ck. Index pos
	 * wird mit eingeschlossen.
	 * 
	 * @param int[]
	 *            a das Array, in dem die position des kleinsten Wertes ermittelt
	 *            wird.
	 * @param int
	 *            pos der Index, ab dem die Suche gestartet wird.
	 * @return der Index der ersten kleinsten Zahl.
	 */
	public static int getMinPos(int[] a, int pos) {
		int ret = -1;
		ret = indexOf(a, getMinimum(a, pos), pos);
		return ret;
	}

	/**
	 * Addiert zu jedem Wert des Arrays a den Integer z.
	 * 
	 * @param a
	 *            das Array, zudem auf jeden Element z addiert wird
	 * @param z,
	 *            die Zahl, welche addiert wird
	 */
	public static void addZahl(int[] a, int z) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] + z;
		}
	}

	/**
	 * Tauscht zwei Werte im Array a aus. Die zwei Werte werden mit int i und int j
	 * angegeben.
	 * 
	 * @param int[]
	 *            a Das Array, in dem zwei Werte ausgetauscht werden.
	 * @param int
	 *            i, der Index des ersten Wertes, welcher ausgetauscht wird.
	 * @param int
	 *            j, der Index des zweiten Wertes, welcher ausgetauscht wird.
	 */
	public static void swap(int[] a, int i, int j) {
		int zwischenSpeicher = a[i];
		a[i] = a[j];
		a[j] = zwischenSpeicher;
	}

	/**
	 * Sortiert ein Array durch Minimumsuche
	 * 
	 * @param int[]
	 *            a, das Array, welches sortiert werden soll
	 */
	public static void sortMinArray(int[] a) {
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {
			j = getMinPos(a, i);
			// System.out.println("int i = " + i + " int j = " + j);

			if (j > 0) {
				// System.out.println("Werti = " + a[i] + " Wertj = " + a[j]);
				if (a[i] > a[j])
					swap(a, i, j);
			}
		}
	}

	/**
	 * Entfernt alle doppelten Werte eines Array und speichert das neue Array in ein
	 * altes
	 * 
	 * @param a
	 * @return
	 */
	public static int[] delDoppelte(int[] a) {
		// Vorg�ngerversion, wo 0 nicht mitgenommen wird
		//
		// int[] aClone = a.clone();
		// int[] ret;
		// int zeroCounter = 0;
		// //doppelte durch 0 ersetzen
		// for (int i = 0; i < aClone.length; i++) {
		// if (aClone[i] != 0) {
		// for (int j = i+1; j<aClone.length; j++) {
		// if(aClone[i] == aClone[j])
		// aClone[j] = 0;
		// }
		// } else
		// zeroCounter++;
		// }
		// //Das Array mit 0 in ein kleineres Array geben, welches keine 0 enth�lt
		// ret = new int[aClone.length - zeroCounter];
		// int j = 0;
		// //Es wird jedes Element von aClone ungleich 0 in das Array ret geschrieben
		// for (int i = 0; i < ret.length;) {
		// if(aClone[j] != 0) {
		// ret[i] = aClone[j];
		// i++;
		// }
		// j++;
		// }
		// return ret;

		int[] aClone = a.clone();
		int[] ret;
		int zeroCounter = 0;
		boolean[] isDouble = new boolean[a.length];
		// doppelte werden im Array isDouble gekennzeichnet
		for (int i = 0; i < aClone.length; i++) {
			for (int j = i + 1; j < aClone.length; j++) {
				if (aClone[i] == aClone[j]) {
					isDouble[j] = true;
				}
			}
		}
		//Es wird die Anzahl der Doppelten gez�hlt, damit ret kleiner ist
		for (int i = 0; i < isDouble.length; i++) {
			if (isDouble[i])
				zeroCounter++;
		}

		// Es werden die 
		ret = new int[aClone.length - zeroCounter];
		int j = 0;
		// Es wird jedes Element von aClone ungleich 0 in das Array ret geschrieben
		for (int i = 0; i < ret.length;) {
			if (!isDouble[j]) {
				ret[i] = aClone[j];
				i++;
			}
			j++;
		}
		return ret;
	}
}
