
public class toRekursiv {

	public static void main(String[] args) {
		
		
		// While Rekursiv
		int whileRekursivStartValue = 5;
		whileRekursiv(whileRekursivStartValue);
		// Kontrolle
		while (whileRekursivStartValue > 3) {
			System.out.println("	" + whileRekursivStartValue * 3);
			whileRekursivStartValue--;
		}

		// machWas
		int machWasStartValue = 31;
		System.out.println(machWas(machWasStartValue));
		// Kontrolle
		int ret=0;
		while (machWasStartValue / 2 > 0) {
			ret = ret + 1;
			machWasStartValue = machWasStartValue / 2;
			}
		System.out.println("	" + ret);
	}
	
	public static void whileRekursiv(int i) {
		if (i > 3) {
			System.out.println(i * 3);
			whileRekursiv(i - 1);
		}
	}

	public static int machWas(int x) {
		int ret = 0;
		if (x / 2 > 0) {
			ret = machWas(x / 2) + 1;
		}
		return ret;
	}

}
