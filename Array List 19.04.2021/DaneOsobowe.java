import java.util.Date;

class DaneOsobowe{
	private String imie = "";
	private String nazwisko = "";
	private int wiek = 0;
	private int wzrost = 0;
	private int waga = 0;
	
	//Kontruktor
	public DaneOsobowe(String imie, String nazwisko, int wiek, int wzrost, int waga){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.wzrost = wzrost;
		this.waga = waga;
	}	
	
	public double bmi(){
		return (double)waga/(wzrost*wzrost)*10000;
	}
	
	public int rokUrodzin(){
		Date d = new Date();
		int rok = d.getYear();
		return rok+1900-wiek;
	}
	
	@Override
	public String toString(){
		return "\nimie: "+imie
		+"\nnazwisko: "+nazwisko
		+"\nwiek: "+wiek
		+"\nwzrost: "+wzrost
		+"\nwaga: "+waga; 
	}
}