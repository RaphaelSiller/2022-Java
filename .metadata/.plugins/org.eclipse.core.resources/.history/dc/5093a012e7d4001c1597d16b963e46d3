package StoppUhr;
/**
 * Bindet die nachfolgend verwendeten Klassen BufferedReader, BufferedWriter,
 * FileReader, FileWriter und die verwendeten Exceptions ein
 */
import java.io.*;

/**
 * Diese Klasse soll das zeilenweise Lesen aus einer Datei (quelle) und das 
 * zeilenweise Schreiben in eine Datei (ziel) veranschaulichen 
 * @author Michael Wild
 *
 */
public class DateiLeseSchreibTest
{
	public static void main(String[] args) {
		// Pfad zu den Textdateien
		String quelle = "D:\\eclipse-workspace-BackUp\\Rohdateien\\Ue08\\Songs\\tracklist.csv";
		String ziel =   "D:\\eclipse-workspace-BackUp\\Rohdateien\\Ue08\\Songs\\ziel.csv";
		
		//Ermittlung der Anzahl der Songs
		int nLines = 0;
		try {
			nLines = countLines(quelle);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Song[] musikSammlung = new Song[nLines];
		
		
		// Zeilenweises Lesen aus einer Datei
		try {
			BufferedReader reader = new BufferedReader(new FileReader(quelle));
			reader.readLine();
			int i = 0;
			musikSammlung[i] = new Song();
			musikSammlung[i].setSong(reader.readLine());
			i++;
			while (true) {
				String zeile = reader.readLine();
				
				
				if (zeile == null)
					// Dateiende erkannt
					break;
				else {
					//Einfügen des neuen Songs
					musikSammlung[i] = new Song();
					musikSammlung[i].setSong(zeile);
					//Sortieren
					int j = i;
					while(j > 0 && musikSammlung[j].compareTo(musikSammlung[j-1]) < 0) {
						Song swapSong;
						swapSong = musikSammlung[j-1].clone();
						musikSammlung[j-1] = musikSammlung[j];
						musikSammlung[j] = swapSong;
						j--;
					}
					
					i++;
					System.out.println(zeile);
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Datei nicht gefunden");
		} catch (IOException e) {
			System.out.println("Lesefehler in Datei");
		}
		
		// Zeilenweises Schreiben in eine Datei
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(ziel));
			// ACHTUNG: Am Ende jeder Zeile muss eine Zeilenschaltung \n eingefügt werden
			writer.write("Titel;Album;Interpret;Jahr\n");
			
			//Zeilenweises Ausgeben der einzelnen Songs
			for (int i = 0; i < musikSammlung.length; i++) {
				if(musikSammlung[i] != null) {
					String output = musikSammlung[i].toString() + "\n";
					writer.write(output);
				}
			}
			writer.close();
		} catch (IOException e) {
			System.out.println("Datei nicht angelegt");
		}
	}
	
	/**
	 * Kindly copied and modified from StackOverflow link: https://stackoverflow.com/a/18009472
	 * gibt die Anzahl an Zeilen einer .csv zurueck.
	 * @param filepath, zu der Datei, von der die Zeilen gezaehlt werden sollen
	 * @return die Anzahl der Zeilen
	 * @throws IOException
	 */
	public static int countLines(String filepath) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
	     String input;
	     int count = 0;
	     while((input = bufferedReader.readLine()) != null)
	     {
	         count++;
	     }

//	     System.out.println("Count : "+count);
	     bufferedReader.close();
	     return count;
	}
}