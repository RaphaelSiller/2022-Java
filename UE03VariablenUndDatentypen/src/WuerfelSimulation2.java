/*
 * zählt 10^9 Zufallszeilen im Bereich 1 bis 6 zusammen und gibt die Anzahl aus.
 */
public class WuerfelSimulation2{

	public static void main(String[] args) {
		int wurf = 0;
		int zahl = 0;
		//Anzahl der Punkte im Fortschrittsbalken.
		int nPunkte = 1;
		//Anzahl 1er, 2er, 3er, 4er, 5er, 6er
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;
		int n6 = 0;
		
		System.out.println("Würfelsimulation");
		System.out.println("================");
		System.out.println("Bitte Warten");
		
		//Hier wird gewürfelt
		while(wurf<1000000000) {
			//zahl = zufällige Zahl von 1 bis 6
			zahl = (int)Math.round(Math.random() * 6 + 0.5);
			//Zuordnung
			switch(zahl) {
				case 1: {
					n1++;
					break;
				}
				case 2: {
					n2++;
					break;
				}
				case 3: {
					n3++;
					break;
				}
				case 4: {
					n4++;
					break;
				}
				case 5: {
					n5++;
					break;
				}
				case 6:
					n6++;
					
			}
			wurf++;
			//Fortschrittsbalken
			if(wurf==33333333*nPunkte) {
				System.out.print(".");
				nPunkte++;
			}
		}
		
		//Ausgabe
		System.out.println();
		System.out.println();
		System.out.println("Anzahl 1: " + n1);
		System.out.println("Anzahl 2: " + n2);
		System.out.println("Anzahl 3: " + n3);
		System.out.println("Anzahl 4: " + n4);
		System.out.println("Anzahl 5: " + n5);
		System.out.println("Anzahl 6: " + n6);
		System.out.println();
		System.out.println("Anzahl Würfe: " + wurf);
		

	}

}
