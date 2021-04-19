import java.util.ArrayList;

class ArrayListVsTable{
	public static void arrayList(){
		int[] tab = new int[10];
		//Do array list można wpisywać tylko obiekty
		//int - oznacza typ zmiennej
		ArrayList<Integer> lista = new ArrayList();
		
		//Zapełnienie tablicy liczbami od 10 do 19
		for (int i=0; i<10; i++){
			tab[i] = i+10;
		}
		System.out.println(tab);
		//Dodanie do lisry liczby od 10 do 19
		for (int i=0; i<10; i++){
			lista.add(i+10);
		}
		lista.add(100);
		for (int i=0; i<lista.size(); i++){
			System.out.println("Element["+i+"] = "+lista.get(i));
		}
	}
}