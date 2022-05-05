/*
 * Gibt alle Teiler der Zahl z aus.
 */
public class Teiler
{

	public static void main(String[] args) {
		int z = Integer.parseInt(args[0]);
		int i = 0;
		
		System.out.print("Die Teiler von " + z + " sind ");
		//Schleife für alle Zahlen von i bis z
		while(i <= z) { 
			i++;
			//Ohne "wenn" funktioniert es nicht. 
			if(z != i) { 
				if(z%i == 0) {
					System.out.print(i + ", ");
				}
			} else {
			System.out.print(i);
			}
		}

	}

}
