package AmazonPackage;

public class ArrayMethodenTest {

	public static void main(String[] args) {
		/*
		 * Test f�r
		 * randomIntArray
		 * printIntArray
		 */
		System.out.println("Test f�r \nrandomIntArray\nprintIntArray");
		int[] a = ArrayMethoden.randomIntArray(5, -5, 20);
		ArrayMethoden.printIntArray("a = ", a);
		ArrayMethoden.printIntArray("", ArrayMethoden.randomIntArray(50, -1, 1));
		
		/*
		 * Test f�r
		 * getMinimum
		 * getMaximum
		 * getMittelwert
		 */
		System.out.println();
		System.out.println("Test f�r \ngetMinimum\ngetMinimum\ngetMittelwert");
		a = ArrayMethoden.randomIntArray(5, -5, 20);
		ArrayMethoden.printIntArray("a = ", a);
		System.out.println(ArrayMethoden.getMinimum(a));
		System.out.println(ArrayMethoden.getMaximum(a));
		System.out.println(ArrayMethoden.getMittelwert(a));
		a = ArrayMethoden.randomIntArray(6, -5, 20);
		ArrayMethoden.printIntArray("a = ", a);
		System.out.println(ArrayMethoden.getMittelwert(a));
		
		/*
		 * Test f�r
		 * indexOf
		 * getMinPos
		 */
		System.out.println();
		System.out.println("Test f�r \nindexOf\ngetMinPos");
		a = ArrayMethoden.randomIntArray(5, 1, 10);
		ArrayMethoden.printIntArray("a = ", a);
		System.out.println(ArrayMethoden.getMinPos(a, 2));
		/*
		 * Test f�r 
		 * addZahl
		 */
		System.out.println();
		System.out.println("Test f�r \naddZahl");
		a = ArrayMethoden.randomIntArray(10, 0, 9);
		ArrayMethoden.printIntArray("a = ", a);
		ArrayMethoden.addZahl(a, 100);
		ArrayMethoden.printIntArray("a + 100 = ", a);

		/*
		 * Test f�r
		 * swap
		 */
		System.out.println();
		System.out.println("Test f�r \nswap");
		a = ArrayMethoden.randomIntArray(3, 1, 10);
		ArrayMethoden.printIntArray("a = ", a);
		ArrayMethoden.swap(a, 0, 2);
		ArrayMethoden.printIntArray("a = ", a);
		
		/*
		 * Test f�r
		 * sortMinArray
		 */
		System.out.println();
		System.out.println("Test f�r \nsortMinArray");
		a = ArrayMethoden.randomIntArray(50, 1, 100000);
		ArrayMethoden.printIntArray("a = ", a);
		ArrayMethoden.sortMinArray(a);
		ArrayMethoden.printIntArray("a = ", a);
		
		/*
		 * Test f�r
		 * delDoppelte
		 */	
		System.out.println();
		System.out.println("Test f�r \ndelDoppelte");
		a = ArrayMethoden.randomIntArray(50, 0, 10);
		ArrayMethoden.printIntArray("a = ", a);
		a = ArrayMethoden.delDoppelte(a);
		ArrayMethoden.printIntArray("adeldoppelte = ", a);

	}

}
