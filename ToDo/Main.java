class Main{
	public static void main(String[] args){
		testSaveToFile();
	}
	
	//Testowanie zapisu i odczytu do pliku
	private static void testSaveToFile(){
		FileUtils fu = new FileUtils();
		fu.saveToFile(new ToDo("Pierwszy zapis", "Zapisanie do pliku"));
		
		fu.readFromFile();
	}
	
	//Testowanie poprwności pobieranie danych z kalwiatury
	private static void testReadFromKeyboard(){
		ReadFromKeyboard rfk = new ReadFromKeyboard();
		ToDo td = rfk.readOneToDo();
		System.out.println(td);
	}
	
	//Testowanie poprawności napisania obiektu ToDo
	private static void test(){
		ToDo td1 = new ToDo("Pierwsza", "To jest pierwsza notatka");
		ToDo td2 = new ToDo("Druga", "To jest Druga notatka", "Michal Dondajewski");
		System.out.println("\n"+td1);
		System.out.println("\n"+td2);
	}
}