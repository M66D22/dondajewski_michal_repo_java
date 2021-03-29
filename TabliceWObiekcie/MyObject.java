import java.util.Random;

class MyObject{
	private int tab[];
	
	public MyObject(int length_of_table, int choose_number_type){
		tab = new int[length_of_table];
		switch(choose_number_type){
			case 0: fillTab(); break;
			case 1: fillTabWitchOdd(); break;
			case 2: fillTabWitchEven(); break;
		}
		fillTab();
	}
	
	private void fillTab(){
		Random r = new Random();
		for (int i = 0; i < tab.length; i++){
			tab[i] = r.nextInt(1000);
		}
	}	
	private void fillTabWitchOdd(){
		Random r = new Random();
		for (int i = 0; i < tab.length; i++){
			int nr = r.nextInt(1000);
			if (nr % 2 != 0){
				tab[i] = nr;
			}else{
				tab[i] = nr+1;
			}
		}
	}	
	private void fillTabWitchEven(){
		Random r = new Random();
		for (int i = 0; i < tab.length; i++){
			int nr = r.nextInt(1000);
			if (nr % 2 == 0){
				tab[i] = nr;
			}else{
				tab[i] = nr+1;
			}
		}
	}
	
	public int[] getTab(){
		return tab;
	}
	
	@Override
	public String toString(){
		return "Array has length: "+tab.length;
	}
}