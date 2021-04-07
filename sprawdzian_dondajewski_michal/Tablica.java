import java.util.Random;

class Tablica{
	public int tab1[];
	public int tab2[];
	
	public Tablica(int dlugoscTablicy){
		tab1 = new int[dlugoscTablicy];
		tab2 = new int[dlugoscTablicy];
		
		wypelnianieTablic();
	}
	
	private void wypelnianieTablic(){
		Random r = new Random();
		for (int i = 0; i < tab1.length; i++){
			tab1[i] = r.nextInt(21) - 10;
		}
		for (int i = 0; i < tab2.length; i++){
			tab2[i] = r.nextInt(21) - 10;
		}
	}
	
	public int[] pobierzTab1(){
		return tab1;
	}
	public int[] pobierzTab2(){
		return tab2;
	}
}