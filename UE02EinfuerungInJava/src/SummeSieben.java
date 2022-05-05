/*
 * Es wird die Summe aller Vielfache von 7 unter 1000 ausgegeben.
 */
public class SummeSieben
{

	public static void main(String[] args) {
		int summe = 0;
		int i =1;
		
		//Es werden alle Vielfache von 7 unter 1000 addiert.
		while(7*i < 1000) {
			summe = summe + (7*i);
			i++;
		}
		//Die Summe wird ausgegeben.
		System.out.print(summe);
	}

}
