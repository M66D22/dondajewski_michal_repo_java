import java.io.File;
import java.io.FileWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class FileUtils{
	/*
	*Save ToDo to filename allToDo.csv in format:
	* title;content;author;add_date
	*@paran ToDo - out note
	*/
	
	public void saveToFile(ToDo td){
		try{
			File f = new File("allToDo.csv");
			FileWriter fw = new FileWriter(f, true);
			fw.write(td.getTitle()+";"+td.getContent()+";"+td.getAuthor()+";"+td.getDate()+"\n");
			fw.close();
		}catch(IOException ex){
			System.out.println("error: "+ex.toString());
		}
	}
	
	public ArrayList<ToDo> readFromFile(){
		ArrayList<ToDo> list = new ArrayList<>();
		
		try{
			File f = new File("allToDo.csv");
			Scanner sc = new Scanner(f);
			while (sc.hasNext()){
				String temp = sc.nextLine();
				String [] ttemp = temp.split(";");
				for (int i = 0; i <ttemp.length; i++){
					System.out.println(ttemp[i]);
				}
			}
		}catch(FileNotFoundException ex){
			System.out.println("error: "+ex.toString());
		}
		return list;
	}
}