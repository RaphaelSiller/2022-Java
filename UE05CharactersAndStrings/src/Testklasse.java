/*
 * Dient nur zum Testen
 */
public class Testklasse
{

	public static void main(String[] args) {
		String s = "Meine Oma fährt Motorrad";
		
		int indexs = 1;
		while(indexs>0) {
			indexs = s.indexOf(' ', indexs);
			s = s.substring(0, indexs) + " " + s.substring(indexs);
			System.out.println(s);
		}
		
	}

}
