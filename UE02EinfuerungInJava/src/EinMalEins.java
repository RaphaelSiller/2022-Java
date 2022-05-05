/*
 * gibt die Ein-Mal-Eins-Tabelle aus.
 */
public class EinMalEins
{

	public static void main(String[] args) {
		//steht für die Spalte
		int l = 1; 
		//steht für die Zeile
		int b = 1; 
		
		System.out.println("Einmaleins-Tabelle");
		System.out.println("====================");
		while(b<=10) {
			//gibt die Zahlen einer Zeile aus. Wird für jede Zeile ausgeführt	
			while(l<=10) { 
				//sorgt dafür, dass der Abstand zwischen den Zahlen passt
				printZahl(l*b); 
				l++;
			}
			System.out.println();
			l = 1;
			b++;
		}
	}

	/**
	* Gibt die ihr übergebene Zahl rechtsbündig auf vier Stellen aus. So wird
	* beispielsweise die Zahl 5 folgendermaßen ausgegeben: ...5 während die 
	* Zahl 100 so ausgegeben wird .100
	* @param zahl die auszugebende Zahl
	*/
	public static void printZahl(int zahl) {
	if (zahl < 10)
		System.out.print("   " + zahl);
	else
		if (zahl < 100)
				System.out.print("  " + zahl);
		else
				System.out.print(" " + zahl);
	}

}
