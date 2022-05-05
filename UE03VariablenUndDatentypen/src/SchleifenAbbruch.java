/*
 * Testprogramm um zu verstehen, warum doubles nie bei == oder != Vergelichen benutzt werden sollte und warum "Math.abs(a-b) < 1E-10" nütlich ist.
 */
public class SchleifenAbbruch
{

	public static void main(String[] args) {
		double n = 10.0;
		double i = 0.0;
		while (i != n) {
		 i = i + 0.1; 
		 System.out.println(i);
		} 

	}

}

//Es ist eine Endlosschleife, da i sehr wahrscheinlich nie GENAU mit n übereinstimmen wird.