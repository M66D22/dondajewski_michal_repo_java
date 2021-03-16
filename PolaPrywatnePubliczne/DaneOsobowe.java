class DaneOsobowe{
	private String pesel = "12345678901";
	public int wiek = 20;
	public int wzrost = 177;
	public int waga = 88;
	
	public String miasto = "Nowa Sol";
	public String ulica = "Kosciuszki";
	public int numerDomu = 5;
	
	public double bmi(){
		return waga / ((double)wzrost/100*(double)wzrost/100);
	}
	
	public int adresZamieszkania(){
		System.out.println(miasto+" ul."+ulica);
		return numerDomu;
	}
	
}