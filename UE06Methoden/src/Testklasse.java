/*
 * Dient nur zum Testen
 */
public class Testklasse
{

	public static void main(String[] args) {
		System.out.println(potenz(2,3));
	}
	
	public static int potenz(int basis, int potenz) {
		int ret = 1;
		
		if (potenz > 0)
			ret = basis * potenz(basis, potenz - 1);
		
		return ret;
	}

}
