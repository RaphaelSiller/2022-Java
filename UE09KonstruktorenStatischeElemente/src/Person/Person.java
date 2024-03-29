package Person;

public class Person {
	private String vorname = "";
	private String nachname = "";
	private boolean isWeiblich = true;
	
	private static int nextNewPersonID = 0;
	private final int ID = nextNewPersonID;
	
	Person mutter = null;
	Person vater = null;
	
	public Person(String vorname, String nachname, boolean isWeiblich) {
		this.vorname = vorname;
		this.nachname= nachname;
		this.isWeiblich = isWeiblich;
		nextNewPersonID++;
	}
	
	public Person(String vorname, String nachname, boolean isWeiblich, Person vater, Person mutter) {
		this.vorname = vorname;
		this.nachname= nachname;
		this.isWeiblich = isWeiblich;
		if(vater != null && !vater.isWeiblich())
			this.vater = vater;
		if(mutter != null && mutter.isWeiblich())
			this.mutter = mutter;
		nextNewPersonID++;
	}
	
	public Person(Person original) {
		this.vorname = original.vorname;
		this.nachname= original.nachname;
		this.isWeiblich = original.isWeiblich;
		nextNewPersonID++;
	}
	
	/**
	 * @return die ID, welcher der naechsten neuen Person gegeben wird
	 */
	public int getNextPersonID() {
		return nextNewPersonID;
	}

	/**
	 * @return den vorname der Person
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * @param den zu setzenden vorname der Person
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	/**
	 * @return den nachname der Person
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * @param den zu setzenden nachname der Person
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	
	public String getName() {
		return vorname + " " + nachname;
	}
	/**
	 * @return true, wenn das biologische Geschlecht weiblich ist
	 */
	public boolean isWeiblich() {
		return isWeiblich;
	}

	/**
	 * @param ob das biologische Geschlecht weiblich ist
	 */
	public void setWeiblich(boolean isWeiblich) {
		this.isWeiblich = isWeiblich;
	}
	
	/**
	 * @return String in der Form:
	 * 		ID: vorname nachname w = isWeiblich m = mutter.getName() v = vater.getName()
	 */
	public String toString() {
		return ID + ": " + vorname + " " + nachname + " w = " + isWeiblich + 
				" m = " + ((this.mutter != null) ? this.mutter.getName() : "") + 
				" v = " + ((this.vater != null) ? this.vater.getName(): "");
	}

	
	
	/**
	 * @return mutter
	 */
	public Person getMutter() {
		return mutter;
	}

	/**
	 * @param mutter
	 */
	public void setMutter(Person mutter) {
		if(mutter != null && mutter.isWeiblich)
			this.mutter = mutter;
	}

	/**
	 * @return vater
	 */
	public Person getVater() {
		return vater;
	}

	/**
	 * @param vater
	 */
	public void setVater(Person vater) {
		if(vater != null && !vater.isWeiblich)
			this.vater = vater;
	}
	
	/**
	 * Gibt Klone von Mutter und Vater in einem Array zurueck
	 * @return index 0 = Vater
	 * 		   index 1 = Mutter
	 */
	public Person[] getEltern() {
		Person eltern[] = new Person[2];
		if(this.getVater() != null)
			eltern[0] = new Person(this.getVater());
		else
			eltern[0] = null;
		
		if(this.getMutter() != null)
			eltern[1] = new Person(this.getMutter());
		else
			eltern[1] = null;
		
		return eltern;
	}
	/**
	 * Gibt Klone von allen vier Großeltern falls vorhanden zurueck
	 * @return index [0][0] = Grossvater  vaeterlicherseits
	 * 		   index [0][1] = Grossmutter vaeterlicherseits
	 * 		   index [1][0] = Grossvater  mutterlicherseits
	 * 		   index [1][1] = Grossmutter mutterlicherseits
	 */
	public Person[][] getGrossEltern() {
		//TODO an GrossEltern anpassen
		Person grossEltern[][] = new Person[2][2];
		grossEltern[0][0] = new Person("placeholder", "placeholder", true);
		if(this.getVater() != null)
			grossEltern[0] = this.getVater().getEltern();
		else
			grossEltern[0] = null;
		
		if(this.getMutter() != null)
			grossEltern[1] = this.getMutter().getEltern();
		else
			grossEltern[1] = null;
		
		return grossEltern;
	}
	
	public String getListe() {
		String vorfahren = "";
		
		vorfahren = this.toString()  + 
		((this.mutter != null) ? ("\n" + this.mutter.getListe()) : "") + 
		((this.vater != null) ? ("\n" + this.vater.getListe()) : "");
		
		return vorfahren;
	}
	
}
