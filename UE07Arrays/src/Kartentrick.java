
public class Kartentrick {

	public static void main(String[] args) {
		do {
			int[][] karten = null;
			karten = KartentrickMethoden.fuellen(karten, 0);
			KartentrickMethoden.ausgeben(karten);
			int spalte = TestScannerErweitert.readInt("Spalte der Karte: ");
			
			karten = KartentrickMethoden.fuellen(karten, spalte);
			KartentrickMethoden.ausgeben(karten);
			spalte = TestScannerErweitert.readInt("Spalte der Karte: ");
			
			karten = KartentrickMethoden.fuellen(karten, spalte);
			KartentrickMethoden.ausgeben(karten);
			spalte = TestScannerErweitert.readInt("Spalte der Karte: ");
			
			karten = KartentrickMethoden.fuellen(karten, spalte);
			KartentrickMethoden.ausgeben(karten);
			System.out.println("Karte " + karten[3][1] + " wurde gewählt");
			
		} while (Character.toLowerCase(TestScannerErweitert.readChar("Nochmals (j/n)? ")) == 'j');

	}

}
