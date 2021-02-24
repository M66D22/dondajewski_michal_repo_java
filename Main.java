import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        int ocena, i;
        Random r = new Random();
        System.out.println("Test");

        int tab[] = new int[10];
        for (i=0;i<tab.length;i++){
            tab[i] = r.nextInt(6)+1;
            //System.out.println(tab[i]);
        }
        FileReader fr = new FileReader("Uczniowie.txt");
        Scanner fs = new Scanner(fr);

        System.out.println("<--------------------------------Oceny----------------------------------->");

        String tabU[] = new String[10];
        for(i=0;i<10;i++){
            tabU[i] = fs.nextLine();
            System.out.println(i + " : "+tabU[i] + " - " + tab[i]);
        }
    }
}
