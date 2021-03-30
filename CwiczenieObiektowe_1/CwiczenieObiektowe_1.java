class CwiczenieObiektowe_1{
	public static void main(String[] args){
		MojeDane md = new MojeDane("Michal", "Dondajewski", "2PTN");
		System.out.println(md.imie + " "+md.nazwisko+" "+md.klasa);
		Logowanie lo = new Logowanie();
		Kolo k1 = new Kolo(4.0);
		Kolo k2 = new Kolo(20.0);
		Kwadrat kw = new Kwadrat(4);
		Prostokat prs = new Prostokat(5, 6);
		System.out.println(lo.toString());
		//System.out.println(kolo.liczba_pi);
		System.out.println("Pole kola = "+k1.pole_kola());
		System.out.println("Obwod kola = "+k1.obwod_kola());		
		System.out.println("Pole kola = "+k2.pole_kola());
		System.out.println("Obwod kola = "+k2.obwod_kola());
		System.out.println("Pole kwadratu = "+kw.p_kwadratu());
		System.out.println("Obwod kwadratu = "+kw.o_kwadratu());
		System.out.println("Pole prostokata = "+prs.p_prostakatu());
		System.out.println("Obwod prostokata = "+prs.o_prostokatu());
	}
}