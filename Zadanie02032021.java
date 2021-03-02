public class Zadanie02032021{
	public static void main(String[] args){
		tablica2x2();
	}
	
	public static void tablica2x2(){
		int[][] tab2d = new int[3][3];
		tab2d[0][1] = 1;
		tab2d[1][1] = 2;
		tab2d[2][0] = 3;
		tab2d[2][1] = 4;
		for (int i=0; i<tab2d.length; i++){
			for (int j=0; j<tab2d[i].length; j++){
				System.out.println(tab2d[i][j]);
			}
		}
		
	}
}