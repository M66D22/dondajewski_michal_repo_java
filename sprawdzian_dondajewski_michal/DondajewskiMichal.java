class DondajewskiMichal{
	public static void main(String[] args){
		Sprawdzian spr = new Sprawdzian();
		
		System.out.println("------------Zad 1 ------------------");
		System.out.println("");
		System.out.println("Data: "+spr.data);
		System.out.println("Ocena: "+spr.ocena);
		System.out.println("Przedmiot: "+spr.przedmiot);
		System.out.println("");
		System.out.println("------------Konstruktor w pliku Dane---------------------");
		System.out.println("");
		Dane dn = new Dane("Michal", "Dondajewski", "14.06.2005");
		System.out.println(""+dn.toString());
		System.out.println("");
		System.out.println("------------Tablice---------------------");
		System.out.println("");
		Tablica tablica = new Tablica(10);
		int tab1[] = tablica.pobierzTab1();
		int tab2[] = tablica.pobierzTab2();
		for (int i = 0; i < tab1.length; i++){
			System.out.println(tab1[i] + "    " + tab2[i]);
		}
	}
}