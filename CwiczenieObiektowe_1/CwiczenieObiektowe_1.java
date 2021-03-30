class CwiczenieObiektowe_1{
	public static void main(String[] args){
		MojeDane md = new MojeDane("Michal", "Dondajewski", "2PTN");
		Logowanie lo = new Logowanie();
		Kolo k1 = new Kolo(4.0);
		Kolo k2 = new Kolo(20.0);
		System.out.println(lo.toString());
		//System.out.println(kolo.liczba_pi);
		System.out.println("Pole kola = "+k1.pole_kola());
		System.out.println("Obwod kola = "+k1.obwod_kola());		
		System.out.println("Pole kola = "+k2.pole_kola());
		System.out.println("Obwod kola = "+k2.obwod_kola());
	}
}