class Main{
	public static void main(String[] args){
		MyObject mo = new MyObject(100, 2);
		int tab[] = mo.getTab();
		for (int i = 0; i<tab.length; i++){
			System.out.println(tab[i]);
		}
	}
}