package TeamArbeitSongliste;

public class SonglisteTestprogramm {

	public static void main(String[] args) {
		Songliste musikBibliothek = new Songliste(800);
		musikBibliothek.lesenSongs();
		System.out.println("Got here");
		
		Song test = new Song("All my time is wasted", "AI-Chan", "Hyperion", 2022);
		musikBibliothek.anfuegenNeuen(test);
		musikBibliothek.schreibenSongs();
	}

}
