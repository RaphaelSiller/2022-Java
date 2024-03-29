package Person;

public class PersonTest {
	
	/**
	 * Testprogramm fuer die Objektklasse Person
	 */
	public static void main(String[] args) {
		//Erstellt Stammbaum
//		Person AdamAmonn = new Person("Adam", "Amonn", false);
//		Person AnnaSeeber = new Person("Anna", "Seeber", true, AdamAmonn, null);
//		Person RudiAmonn = new Person("Rudi", "Amonn", false, AdamAmonn, null);
//		Person BertaGreif = new Person("Berta", "Greif", true, null, AnnaSeeber);
//		Person HansSeeber = new Person("Hans", "Seeber", false, null, AnnaSeeber);
//		Person ElsaPircher = new Person("Elsa", "Pircher", true, RudiAmonn, null);
//		Person SeppAmonn = new Person("Sepp", "Amonn", false, RudiAmonn, null);
//		Person AnnaHuber = new Person("Anna", "Huber", true, null, BertaGreif);
//		Person EdiGreif = new Person("Edi", "Greif", false, null, BertaGreif);
//		Person ResiRuepel = new Person("Resi", "Ruepel", false, HansSeeber, null);
//		Person MarinSeeber = new Person("Martin", "Seeber", false, HansSeeber, null);
//		Person EddaHuber = new Person("Edda", "Huber", true, null, ElsaPircher);
//		Person ErwinPircher = new Person("Erwin", "Pircher", false, null, ElsaPircher);
//		Person AstridPrenn = new Person("Astrid", "Prenn", true, SeppAmonn, null);
//		Person FranzAmonn = new Person("Franz", "Amonn", false, SeppAmonn, null);
		
		Person FranzAmonn = new Person("Franz", "Amonn", false, null, null);
		Person AstridPrenn = new Person("Astrid", "Prenn", true, null, null);
		Person ErwinPircher = new Person("Erwin", "Pircher", false, null, null);
		Person EddaHuber = new Person("Edda", "Huber", true, null, null);
		Person MartinSeeber = new Person("Martin", "Seeber", false, null, null);
		Person ResiRuepel = new Person("Resi", "Ruepel", true, null, null);
		Person EdiGreif = new Person("Edi", "Greif", false, null, null);
		Person AnnaHuber = new Person("Anna", "Huber", true, null, null);
		Person SeppAmonn = new Person("Sepp", "Amonn", false, FranzAmonn, AstridPrenn);
		Person ElsaPircher = new Person("Elsa", "Pircher", true, ErwinPircher, EddaHuber);
		Person HansSeeber = new Person("Hans", "Seeber", false, MartinSeeber, ResiRuepel);
		Person BertaGreif = new Person("Berta", "Greif", true, EdiGreif, AnnaHuber );
		Person RudiAmonn = new Person("Rudi", "Amonn", false, SeppAmonn, ElsaPircher );
		Person AnnaSeeber = new Person("Anna", "Seeber", true, HansSeeber, BertaGreif);
		Person AdamAmonn = new Person("Adam", "Amonn", false, RudiAmonn, AnnaSeeber);
		
		
		
		//Sucht Vater von Adam Amonn
		Person elternteilVonGesuchter;
		if((elternteilVonGesuchter = AdamAmonn.getVater()) != null)
			System.out.println("Der Vater ist " + elternteilVonGesuchter.getName());
		else
			System.out.println("Der Vater ist immer noch Zigaretten kaufen");
		
		//Sucht den Namen des Grossvater muetterlicherseits von Rudi Amonn
		if((elternteilVonGesuchter = RudiAmonn.getMutter()) != null) {
			if((elternteilVonGesuchter = elternteilVonGesuchter.getVater()) != null)
				System.out.println("Der Grossvater muetterlicherseits ist " + elternteilVonGesuchter.getName());
			else
				System.out.println("Der Grossvater muetterlicherseits konnte nicht gefunden werden");
		} else {
			System.out.println("Mutter konnte nicht gefunden werden");
		}
		
		
		//Gibt Eltern und Großeltern von AdamAmonn aus
		System.out.println();
		Person grossEltern[][] = AdamAmonn.getGrossEltern();
		System.out.println("Der Grossvater  vaeterlicherseits ist " + grossEltern[0][0].toString());
		System.out.println("Die Grossmutter vaeterlicherseits ist " + grossEltern[0][1].toString());
		System.out.println("Der Grossvater  mutterlicherseits ist " + grossEltern[1][0].toString());
		System.out.println("Die Grossmutter mutterlicherseits ist " + grossEltern[1][1].toString());
		
		//Gibt Liste der Vorfahren von Anna Seeber aus
		System.out.println();
		System.out.println(AnnaSeeber.getListe());
	}

}
