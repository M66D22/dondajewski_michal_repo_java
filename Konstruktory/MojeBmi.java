class MojeBmi{
	public int wzrost = 0;
	public int waga = 0;
	
	//KONSTRUKTOR
	public MojeBmi(int wzrost, int waga){
		System.out.println("W konstruktorze: "+wzrost+" "+waga);
		this.wzrost = wzrost; // this - Odwołuje się do atrybutów obiektu
		this.waga = waga;
	}
	
	public double mojeBmi(){
		return waga/((double)wzrost/100*(double)wzrost/100);
	}
}