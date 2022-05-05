package StoppUhr;

public class QuadratProgramm {

	public static void main(String[] args) {
		//initialisierung Aray
		Quadrat[] q1 = new Quadrat[50];
		for (int i = 0; i < q1.length; i++) {
			q1[i] = new Quadrat();
			q1[i].setSeiteA((Math.random() * 10));
		}
		//Ausgabe aller Arrays
		for (int i = 0; i < q1.length; i++) {
			System.out.println(q1[i].toString());;
		}
		//Ausgabe größten Arrays
		int biggestQuadratIndex = 0;
		for (int i = 0; i < q1.length; i++) {
			if (q1[i].getSeiteA() > q1[biggestQuadratIndex].getSeiteA()) {
				biggestQuadratIndex = i;
			}
		}
		System.out.println("\ngroesstes Quadrat:");
		System.out.println(q1[biggestQuadratIndex].toString());
	}

}