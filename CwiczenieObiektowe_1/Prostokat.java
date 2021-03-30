class Prostokat{
	private int a;
	private int b;
	
	public Prostokat(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int p_prostakatu(){
		int wynik = (a*2)+(b*2);
		return wynik;
	}
	
	public int o_prostokatu(){
		int wynik = a*b;
		return wynik;
	}
}