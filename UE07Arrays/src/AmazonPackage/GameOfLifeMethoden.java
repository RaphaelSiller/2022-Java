package AmazonPackage;
public class GameOfLifeMethoden {

	/**
	 * Diese Methode f�llt in die �bergebene Matrix einen Stern mit bestimmter
	 * Gr��e. Der Stern wird genau in die Mitte der Matrix eingef�gt. Wird f�r die
	 * Sterngr��e 0 �bergeben, so wird ein einziges Feld in der Mitte der Matrix
	 * gef�llt.
	 * 
	 * @param matrix,
	 *            die mit einem Stern gef�llt werden soll
	 * @param groesseStern,
	 *            der Radius des Sterns, wobei 0 ein K�stchen, 1 drei K�astchen und
	 *            2 f�nf K�stchen bedeutet.
	 */
	public static void fuellenMatrixSternMitte(boolean[][] matrix, int groesseStern) {
		int xOffset = GameOfLife.ANZAHL_SPALTEN / 2 - groesseStern;
		int yOffset = GameOfLife.ANZAHL_ZEILEN / 2 - groesseStern;
		// x-Achse
		for (int i = 0; i <= groesseStern * 2; i++) {
			matrix[GameOfLife.ANZAHL_ZEILEN / 2][xOffset + i] = true;
		}
		// y-Achse
		for (int i = 0; i <= groesseStern * 2; i++) {
			matrix[yOffset + i][GameOfLife.ANZAHL_SPALTEN / 2] = true;
		}
	}

	/**
	 * Gibt die Anzahl aller "Nachbarfeldern" mit Wert True, des ausgew�hlten Feldes
	 * zur�ck
	 * 
	 * @param matrix,
	 *            welche verwendet wird
	 * @param x
	 *            die x-Koordinate, bzw. die Spalte, vom Feld, von dem die Anzahl
	 *            der Nachbarn ermittelt wird
	 * @param y
	 *            die y-Koordinate, bzw. die Zeile, vom Feld, von dem die Anzahl der
	 *            Nachbarn ermittelt wird
	 * @return die Anzahl der Nachbarn vom angegebenen Feld
	 */
	public static int anzahlLebendeNachbaren(boolean[][] matrix, int x, int y) {
		int ret = 0;

		for (int i = x - 1; i <= x + 1; i++) {
			for (int j = y - 1; j <= y + 1; j++) {
				if ((j >= 0 && i >= 0 && j < matrix.length && i < matrix[j].length) && matrix[j][i]
						&& !(i == x && j == y)) {
					ret++;
				}
			}
		}

		return ret;
	}

	/**
	 * Berechnet den n�chsten Lebenszyklus der �bergebenen Matrix und gibt diese in
	 * einer neuen Matrix zur�ck.
	 * 
	 * @param matrix,
	 *            von der der n�chste Lebenszyklus berechnet werden soll.
	 * @return eine neue Matrix, welche den n�chsten Lebenszyklus darstellt
	 */
	public static boolean[][] berechneMatrix(boolean[][] matrix) {
		boolean[][] ret = new boolean[matrix.length][matrix[0].length];

		for (int x = 0; x < ret.length; x++) {
			for (int y = 0; y < ret[x].length; y++) {
				int nNachbarn = anzahlLebendeNachbaren(matrix, x, y);
				// Wenn lebendes Feld(matrix == true) 2 oder 3 Nachbarn oder
				// totes Feld(matrix == false) genau 3 Nachbarn hat
				if ((matrix[x][y] && 2 <= nNachbarn && nNachbarn <= 3) || (!matrix[x][y] && nNachbarn == 3)) {
					ret[x][y] = true;
				}
			}
		}

		return ret;
	}

	/**
	 * Vergleicht beide �bergebenen Matrixen miteinander. Wenn ein Unterschied
	 * vorkommt, wird true zur�ckgegeben
	 * 
	 * @param matrix1
	 *            die erste matrix; wird mit matrix2 verglichen
	 * @param matrix2
	 *            die zweite matrix; wird mit matrix1 verglichen
	 * @return true, wenn Unterschiede vorhanden sind, false, wenn keine
	 *         Unterschiede vorhanden sind
	 */
	public static boolean existierenUnterschiede(boolean[][] matrix1, boolean[][] matrix2) {
		boolean ret = false;

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				if (matrix1[i][j] != matrix2[i][j]) {
					ret = true;
					i = matrix1.length;
					j = matrix1[0].length;
				}
			}
		}

		return ret;
	}

	/**
	 * F�llt zuf�lligerweise Leben in die �bergebene Matrix ein. Die
	 * Wahrscheinlichkeit, das ein Feld leben enth�lt, wird mit verhaeltnis
	 * angegeben.
	 * 
	 * @param matrix,
	 *            in die Leben eingehaucht werden soll.
	 * @param verhaeltnis
	 *            Die Wahrscheinlichkeit, das ein Feld leben enth�lt. 0.1 bedeutet
	 *            beispielsweise 10%
	 */
	public static void fuellenMatrixZufaellig(boolean[][] matrix, double verhaeltnis) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (Math.random() < verhaeltnis) {
					matrix[i][j] = true;
				}
			}
		}
	}

	/**
	 * Veranlasst dass das Programm millis Millisekunden pausiert
	 * 
	 * @param millis
	 *            Anzahl der Millisekunden die gewartet werden
	 */
	public static void bremse(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		}
	}

}
