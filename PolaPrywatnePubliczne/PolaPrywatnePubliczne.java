class PolaPrywatnePubliczne{
	//Definiowanie zmiennych/obbiektów globalnie
	static DaneOsobowe dos;
	
	public static void main(String[] args){
		//Stworzenie obiektu
		dos = new DaneOsobowe();
		System.out.println(dos.wzrost);
	}
}