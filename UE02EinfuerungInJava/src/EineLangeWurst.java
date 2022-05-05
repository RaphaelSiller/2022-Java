/**
* Es werden alle Zahlen von i bis n ausgegeben, die gebrochen durch 7 einen Rest von 5 haben.
*/

public class EineLangeWurst
{

	public static void main(String[] args) {
		int i = 0;
		int n = 60;
		System.out.println("Ergebnis");
		//i ist eine Schleifenvariable und n gibt an, bis wie veit die Vielfachen von 7 plus 5 berechnet werden sollten
		while(i <= n) {
			if(i%7 == 5) {
				System.out.println(i);
			}
			i++;
		}
		
	}

}
