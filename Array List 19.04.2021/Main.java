import java.util.ArrayList;

class Main{
	public static void main(String[] args){	
		//Zmienne i obiekty
			//ArrayListVsTable.arrayList();
		ArrayList<DaneOsobowe> listOfDaneOsobowe = new ArrayList();
		DaneOsobowe dos1 = new DaneOsobowe("Anna", "Kowalska", 20, 150, 59);
		DaneOsobowe dos2 = new DaneOsobowe("Karol", "Nowak", 24, 180,89);
		listOfDaneOsobowe.add(dos1);
		listOfDaneOsobowe.add(dos2);
		for (int i = 0; i<listOfDaneOsobowe.size(); i++){
			System.out.print("\n-------Osoba: "+i+"-------");
			System.out.println(listOfDaneOsobowe.get(i)+"\nbmi: "+listOfDaneOsobowe.get(i).bmi()
			+"\nrok urodzenia: "+listOfDaneOsobowe.get(i).rokUrodzin());
		}
	}
}