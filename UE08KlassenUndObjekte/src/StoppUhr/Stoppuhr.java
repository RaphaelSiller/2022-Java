package StoppUhr;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Simulation einer Stoppuhr. Sie kann insgesamt 1'000 Runden aufzeichnen.
 * Außerdem kann sie alle Zeiten in eine .csv Datei exportieren. Sie wird
 * 
 * @author EndroidMc
 *
 */
public class Stoppuhr {
	long startzeit;
	long rundenZeit[] = new long[1000]; //Wird fuer jede Messung zurueckgesezt
	int aktuelleRunde = 1;
	long zeitArchiv[] = new long[1000]; //Enthaelt alle gemessenen Zeiten dieses Objektes.
	int indexZeitArchiv = 0;
	String dateiName = System.getProperty("user.home") + "/Downloads/output.csv";

	
	public Stoppuhr() {
		for (int i = 0; i < rundenZeit.length; i++) {
			rundenZeit[i] = -1;
		}
		
		for (int i = 0; i < zeitArchiv.length; i++) {
			zeitArchiv[i] = -1;
		}
	}
	
	
	/**
	 * Fuegt zuerst die derzeitige Zeit ein und leert alle aufgezeichneten Zeiten,
	 * falls es welche gibt.
	 */
	public void starteStoppuhr() {
		rundenZeit[0] = new java.util.GregorianCalendar().getTimeInMillis();

		aktuelleRunde = 1;
		//Einfuegen ins ZeitArchiv
		zeitArchiv[indexZeitArchiv] = rundenZeit[0];
		indexZeitArchiv++;

	}

	/**
	 * Fuegt den Zeitpunkt in das Array ein. Es kann mit dem Festhalten einer Runde
	 * von einer normalen Stoppuhr verglichen werden.
	 */
	public void stoppeStoppuhr() {
		rundenZeit[aktuelleRunde] = new java.util.GregorianCalendar().getTimeInMillis();
		aktuelleRunde++;
		zeitArchiv[indexZeitArchiv] = getGestoppteZeit();
		indexZeitArchiv++;
	}

	/**
	 * Setze den Pfad, wo die Messungen in einer .csv Datei abgespeichert werden
	 * sollen. Standartmaessig ist der Pfad auf den Downloadordner mit dem Namen
	 * output.csv gesetzt
	 * 
	 * @param dateiName,
	 *            der Pfad zum Speicherort
	 */
	public void setDateiname(String dateiName) {
		if (dateiName != null && !dateiName.equals(""))
			this.dateiName = dateiName;
	}

	/**
	 * Gibt die Differenz von der letzten Runde bis zum Startpunkt zurueck. Um die
	 * Differenz zwischen letzten Stopppunkt und vorletzten Stopppunkt zu bekommen,
	 * benutze bitte getRundenZeitLetzteRunde
	 * 
	 * @return die Zeitdifferenz zum Anfang der Messung
	 */
	public long getGestoppteZeit() {
		long ret = rundenZeit[aktuelleRunde-1] - rundenZeit[0];
		return ret;
	}

	/**
	 * Gibt die Differenz von der letzten Runde bis zur vorherigen Runde zurueck. Um
	 * die Differenz der letzten Runde zum Anfangspunkt zu bekommen, benutze bitte
	 * getGestoppteZeit
	 * 
	 * @return die Zeitdifferenz zum letzten Stoppen
	 */
	public long getRundenZeit() {
		long ret = rundenZeit[aktuelleRunde-1] - rundenZeit[aktuelleRunde - 2];
		return ret;
	}

	/**
	 * Gibt die Differenz von der angegeben Runde bis zum Startpunkt zurueck. Um die
	 * Differenz zwischen einem bestimmten Stopppunkt und vorherigen Stopppunkt zu
	 * bekommen, benutze bitte getRundenZeitLetzteRunde. Wenn runde kleiner als 0
	 * ist, wird die Anfangszeit zurueckgegeben.
	 * 
	 * @param runde,
	 *            von der die Zeit zurueckgegeben werden muss.
	 * @return die Zeitdifferenz zum Anfang der Messung, wenn runde kleiner als 0
	 *         ist, wird die Anfangszeit zurueckgegeben.
	 */
	public long getGestoppteZeit(int runde) {
		long ret = 0;
		if (runde > 0)
			ret = rundenZeit[runde] - rundenZeit[0];
		else
			ret = rundenZeit[0];

		return ret;
	}

	/**
	 * Gibt die Differenz von der angegeben Runde bis zur vorherigen Runde zurueck.
	 * Um die Differenz zwischen einem bestimmten Stopppunkt und dem Anfang zu
	 * bekommen, benutze bitte getRundenZeitLetzteRunde. Wenn runde kleiner als 0
	 * ist, wird die Anfangszeit zurueckgegeben.
	 * 
	 * @param runde,
	 *            von der die Zeit zurueckgegeben werden muss.
	 * @return die Zeitdifferenz zum letzten Stoppen, wenn runde kleiner als 0 ist,
	 *         wird die Anfangszeit zurueckgegeben.
	 */
	public long getRundenZeit(int runde) {
		long ret = 0;
		if (runde > 0)
			ret = rundenZeit[runde] - rundenZeit[runde - 1];
		else
			ret = rundenZeit[0];

		return ret;
	}

	/**
	 * Gibt alle gemessenen Werte als .csv Datei aus. Die .csv Datei wird
	 * standartmaessig im Download-Ordner gespeichert. Das Ziel kann mit der Methode
	 * setDateiname veraendert werden.
	 * 
	 * @return 0, falls keine Fehler auftraten
	 */
	public int schreibeZeiten() {
		int ret = 0;

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(dateiName));
			// ACHTUNG: Am Ende jeder Zeile muss eine Zeilenschaltung \n eingefügt werden
			writer.write("Runde;ZeitZumStartpunkt[ms]\n");
			int rundenCounter = 1;
			for (int i = 0; i < indexZeitArchiv; i++) {
				//Wenn neuer Startpunkt
				if(zeitArchiv[i] > zeitArchiv[i+1] && zeitArchiv[i+1] != 0) {
					writer.write("startpunkt;" + zeitArchiv[i] + "\n");
					rundenCounter = 1;
				}else {
					writer.write(rundenCounter + ";" +  zeitArchiv[i] + "\n");
					rundenCounter++;
				}
				
			}

			writer.close();
		} catch (IOException e) {
			System.out.println("Datei nicht angelegt");
			ret = -1;
		}

		return ret;
	}
}