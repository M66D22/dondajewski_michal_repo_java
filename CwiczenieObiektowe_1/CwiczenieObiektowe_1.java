class CwiczenieObiektowe_1{
	public static void main(String[] args){
		MojeDane md = new MojeDane();
		Logowanie lo = new Logowanie();
		System.out.println("Imie: "+md.imie);
		System.out.println("Nazwisko: "+md.nazwisko);
		System.out.println("Klasa: "+md.klasa);
		System.out.println(lo.toString());
	}
}