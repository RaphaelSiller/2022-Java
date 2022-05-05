/*
 * Ermittelt die ersten fünf perfekten (vollkommenen Zahlen), also jene Zahlen, die gleich der Summe aller ganzzähligen Teiler sind.
 */
public class PerfekteZahlen
{

	public static void main(String[] args) {
		int perfekteZahl = 3;
		int teiler = 0;
		int summe = 0;
		
		/*
		 * In der For-Schleife wird jede Zahl, startend von 6, mit der Summe aller ihrer Teiler verglichen. Wenn die Summe gleich wie die Zahl selbst ist, handelt es sich
		 * um eine perferkte Zahl. Es werden insgesamt 5 perfekte Zahlen ermittelt. Die Anzahl bestimmt die For-Schleife
		 */
		for(int i=0;i<5;) {
			teiler = 1;
			summe = 0;
			//ermittelt Summe der Teiler
			while(teiler < perfekteZahl) {
				//ermittelt Teiler
				if(perfekteZahl%teiler == 0) 
					summe += teiler;
				teiler++;
			}
			
			//ermittelt, ob es sich um eine perfekte Zahl handelt
			if(summe == perfekteZahl) {
				System.out.println(perfekteZahl);
				i++;
			}
			perfekteZahl++;
		}

	}

}
