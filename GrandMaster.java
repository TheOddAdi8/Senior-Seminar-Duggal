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


    public static void main(String[] args) {
        clear();

        SrSem srsem = new SrSem();
        srsem.read();

        //System.out.println("Choice " + s1.sort("choice") + " with " + s1.sort("max") + " people");
        System.out.println(srsem.mostPopular());
        //System.out.println();
        System.out.println("");
    }
}