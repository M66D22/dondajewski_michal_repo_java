import java.util.Scanner;

class PierwszyKonstruktor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		/*
		MojeBmi mb = new MojeBmi(190, 86);
		mb.wzrost = 160;
		mb.waga = 80;
		*/
		
		//Zmiana atrybutów obiektu przez konstruktor
		MojeBmi mb = new MojeBmi(190, 86);
		double wynik = mb.mojeBmi();
		System.out.println("BMI: "+wynik);
		//System.out.println("Pola w obiekcie: "+mb.wzrost+" "+mb.waga);
		
		//ImieNazwisko im = new ImieNazwisko("Michal", "Dondajewski");
		//System.out.println("Imie: "+im.imie+"\nNazwisko: "+im.nazwisko);
	}
}