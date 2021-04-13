import static java.lang.Math.*;

class Trojkat{
	/*
	Było kilka kontruktorów bo mamy różne rodzaje trójkątów
	w zależności od rodzaju trójąta będą w kontruktorze odpowiednie
	obliczenia POLA
	zobacz tablice matematyczne strona 10 i 11
	
	Rodzaje trójkątów: 
	równoboczny, równoramienny, różnoboczny, prostokątny, ostrokątny, rozwartokątny
	*/
	
	//Pole trójkątu równobocznego
	public Trojkat(int a, int h){
		System.out.println(a*h/2);
	}	
	public Trojkat(int a, int b, int c, int r){
		System.out.println("\n"+a*b*c/4*r);
	}	
	public Trojkat(double r, double p){
		System.out.println("\n"+r*p);
	}	
	public Trojkat(double p, int a, int b, int c){
		System.out.println("\n"+sqrt(p*(p-a)*(p-b)*(p-c)));
	}

}