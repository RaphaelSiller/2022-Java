
public class TestMasterMindMethoden {

	public static void main(String[] args) {
		System.out.println(MasterMindMethoden.erzeugeCode(5,6));
		System.out.println(MasterMindMethoden.erzeugeCode(3,2));
		System.out.println(MasterMindMethoden.erzeugeCode(1,6) + "\n");
		
		System.out.println(MasterMindMethoden.enthaeltDoppelte("ABBA"));
		System.out.println(MasterMindMethoden.enthaeltDoppelte("ABCDE"));
		System.out.println(MasterMindMethoden.enthaeltDoppelte("AJKLMNJ") + "\n");
		
		//System.out.println(MasterMindMethoden.eingabeTipp(5) + "\n");
		
		System.out.println(MasterMindMethoden.ermittleSchwarz("ABDF", "ABFD"));
		System.out.println(MasterMindMethoden.ermittleSchwarz("ABBA", "ABAB"));
		System.out.println(MasterMindMethoden.ermittleSchwarz("ALIB", "ILAB") + "\n");
		
		System.out.println(MasterMindMethoden.ermittleWeiss("ABDF", "ABFD"));
		System.out.println(MasterMindMethoden.ermittleWeiss("NACL", "NAT"));
		System.out.println(MasterMindMethoden.ermittleWeiss("DUCK", "JUMP"));
	}

}
