import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GrandMaster { //tester
    //This method clears the terminal screen
    //Source: Adi's PARTAY project, Adi's Battleship project, Mr. Twyford, and Geeks for Geeks
	public static void clear() { 
        System.out.print("\033[H\033[2J");
    }

    //This method pauses the program for a certain period of time
	//Source: Adi's PARTAY project, Adi's Battleship project and https://www.geeksforgeeks.org/wait-method-in-java-with-examples/
    public static void wait(int ms) { 
        try {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static File info;
    public static Scanner fileBot;

    public static void main(String[] args) {

        clear();

        try {
            info = new File("SrSeminar_RawData.csv");
            fileBot = new Scanner(new File("SrSeminar_RawData.csv"));
        }
        catch (FileNotFoundException e) {
            System.out.println("There was an error so try to fix it or something");
            e.printStackTrace();
        }

        SrSem srsem = new SrSem();
        srsem.read();

        //System.out.println("Choice " + s1.sort("choice") + " with " + s1.sort("max") + " people");

        //System.out.println(srsem.mostPopular());
        
        //System.out.println();
        System.out.println("");
        srsem.fileBot.close();
    }
}