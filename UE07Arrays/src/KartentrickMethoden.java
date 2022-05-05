
public class KartentrickMethoden {
	
	/**
	 * Wenn Spalte == 0 ist, also beim ersten Aufruf, wird ein 7*3 Array erstellt und mit den Zahlen von 1-21 gefüllt. 
	 * Es wird von oben nach unten und dann von rechts nach links inkrementierend aufgefüllt:
	 * [	
	 *  [1	 8	15]
	 * 	[2	 9	16]
	 * 	[3	10	17]
	 * 	[4	11	18]
	 * 	[5	12	19]
	 * 	[6	13	20]
	 * 	[7	14	21]
	 * ]
	 * 
	 * Ansonsten werden alle Karten des übergebenen Arrays spaltenweise "eingesammelt"
	 * und dann Zeilenweise wieder ausgegeben.
	 * @param karten, das Array, welches bearbeitet wird.
	 * @param spalte, in dem sich die vom Spieler ausgewählte Karte befindet. Die erste Spalte startet bei 1.
	 * @return
	 */
	public static int[][] fuellen(int[][] karten, int spalte) {
		int[][] ret;
		
		/*
		 * Erstes aufrufen Jedes Element hat den Wert: 1 + Reihe + (Spalte * 7). Die 1
		 * sorgt dafür, dass man bei 1 anstelle von 0 startet. Spalte * 7 ist ein
		 * offset, damit nicht jede Spalte wieder bei 1 startet
		 */
 		if(spalte == 0) { 
			ret = new int[7][3];
			for (int i = 0; i<ret.length; i++) {
				for (int j = 0; j < ret[i].length; j++) {
					ret[i][j] = 1 + i + (j*7);
				}
			}
		} else {
			// Es muss die vorherige Reihe eingesammelt werden.
			// Wenn die erste Spalte ausgewählt wurde, dann muss die dritte eingesammelt
			// werden
			spalte--; 
			if(spalte == 0)
				spalte = 3;
			
			//Spaltenweises Einsammeln der Karten, indem diese in den kartenStapel gelegt werden
			int[] kartenStapel = new int[21];
			int stapelIndex = 0;
			int k = 0;
			for (int j = 0; j < karten[k].length; j++) {
				for (; k < karten.length; k++) {
					kartenStapel[stapelIndex] = karten[k][spalte-1];
					stapelIndex++;
					
				}
				k = 0;
				// Ist für die Auswahl der nächsten Spalte zuständig.
				// Wenn noch eine spalte frei ist, dann wird diese ausgewählt, ansonsten startet
				// es wieder bei der ersten Spalte.
				if (spalte < 3)
					spalte++;
				else
					spalte = 1;
			}
			//Zeilenweises Ausgeben der Karten aus dem kartenStapel nach dem FiFo-Prinzip.
			ret = new int[7][3];
			stapelIndex = 0;
			for (int i = 0; i < karten.length; i++) {
				for (int j = 0; j < karten[i].length; j++) {
					ret[i][j] = kartenStapel[stapelIndex];
					stapelIndex++;
				}
			}
		}
		
		return ret;
	}
	
	/**
	 * Das übergebene Array wird in die Konsole ausgegeben, wobei jedes Zeile ein int-Array darstellt.
	 * @param karten, das Array, welches ausgegeben wird.
	 */
	public static void ausgeben(int[][] karten) {
		for (int i= 0; i < 7; i++) {
			for (int j = 0; j < karten[i].length; j++) {
				System.out.print(karten[i][j] < 10 ? "   " + karten[i][j] : "  " + karten[i][j]);
			} 
			System.out.println();
		}
	}

}
