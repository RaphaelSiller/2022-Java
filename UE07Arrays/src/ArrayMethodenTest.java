
public class ArrayMethodenTest {

	public static void main(String[] args) {
		/*
		 * Test für
		 * randomIntArray
		 * printIntArray
		 */
		System.out.println("Test für \nrandomIntArray\nprintIntArray");
		int[] a = ArrayMethoden.randomIntArray(5, -5, 20);
		ArrayMethoden.printIntArray("a = ", a);
		ArrayMethoden.printIntArray("", ArrayMethoden.randomIntArray(50, -1, 1));
		
		/*
		 * Test für
		 * getMinimum
		 * getMaximum
		 * getMittelwert
		 */
		System.out.println();
		System.out.println("Test für \ngetMinimum\ngetMinimum\ngetMittelwert");
		a = ArrayMethoden.randomIntArray(5, -5, 20);
		ArrayMethoden.printIntArray("a = ", a);
		System.out.println(ArrayMethoden.getMinimum(a));
		System.out.println(ArrayMethoden.getMaximum(a));
		System.out.println(ArrayMethoden.getMittelwert(a));
		a = ArrayMethoden.randomIntArray(6, -5, 20);
		ArrayMethoden.printIntArray("a = ", a);
		System.out.println(ArrayMethoden.getMittelwert(a));
		
		/*
		 * Test für
		 * indexOf
		 * getMinPos
		 */
		System.out.println();
		System.out.println("Test für \nindexOf\ngetMinPos");
		a = ArrayMethoden.randomIntArray(5, 1, 10);
		ArrayMethoden.printIntArray("a = ", a);
		System.out.println(ArrayMethoden.getMinPos(a, 2));
		/*
		 * Test für 
		 * addZahl
		 */
		System.out.println();
		System.out.println("Test für \naddZahl");
		a = ArrayMethoden.randomIntArray(10, 0, 9);
		ArrayMethoden.printIntArray("a = ", a);
		ArrayMethoden.addZahl(a, 100);
		ArrayMethoden.printIntArray("a + 100 = ", a);

		/*
		 * Test für
		 * swap
		 */
		System.out.println();
		System.out.println("Test für \nswap");
		a = ArrayMethoden.randomIntArray(3, 1, 10);
		ArrayMethoden.printIntArray("a = ", a);
		ArrayMethoden.swap(a, 0, 2);
		ArrayMethoden.printIntArray("a = ", a);
		
		/*
		 * Test für
		 * sortMinArray
		 */
		System.out.println();
		System.out.println("Test für \nsortMinArray");
		a = ArrayMethoden.randomIntArray(50, 1, 100000);
		ArrayMethoden.printIntArray("a = ", a);
		ArrayMethoden.sortMinArray(a);
		ArrayMethoden.printIntArray("a = ", a);
		
		/*
		 * Test für
		 * delDoppelte
		 */	
		System.out.println();
		System.out.println("Test für \ndelDoppelte");
		a = ArrayMethoden.randomIntArray(50, 0, 10);
		ArrayMethoden.printIntArray("a = ", a);
		a = ArrayMethoden.delDoppelte(a);
		ArrayMethoden.printIntArray("adeldoppelte = ", a);

	}

}
