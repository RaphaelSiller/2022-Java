package TeamArbeitSonglisteV2;

public class SonglisteHauptprogramm
{
	
	public static void main(String[] args) {
		Songliste songliste = new Songliste(1000);
		SonglisteGUI gui = new SonglisteGUI(songliste);
		Song aktuellerSong = null;
//		songliste.setPfad("C:\\Users\\unico\\Info\\Work\\TeamArbeitSongliste\\src\\TeamArbeitSongliste\\tracklist.csv");
		songliste.setPfad("D:\\Songliste.csv");
		songliste.lesenSongs();
		aktuellerSong = songliste.getAktueller();
		gui.songAnzeigen(aktuellerSong);
		
	}
}
