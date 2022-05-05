/*
 * Addiert hundert Mal 0,1
 */
public class HundertMalDouble
{

	public static void main(String[] args) {
		int i = 0;
		double summe = 0;
		
		while(i < 100) {
			summe += 0.1;
			i++;
			System.out.println(summe);
		}
	}

}
