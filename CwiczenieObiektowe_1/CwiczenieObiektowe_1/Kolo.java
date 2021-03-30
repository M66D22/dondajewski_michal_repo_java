class Kolo{
	private double liczba_pi = 3.1415;
	private double r;
	
	public Kolo(double r){
		this.r = r;
	}
	
	public double pole_kola(){
		double pole_kola = (r*r)*liczba_pi;
		return pole_kola;
	}
	
	public double obwod_kola(){
		double pole_kola = (r*2)*liczba_pi;
		return pole_kola;
	}
}