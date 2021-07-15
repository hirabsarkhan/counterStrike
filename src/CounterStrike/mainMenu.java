package CounterStrike;

import java.util.Scanner;
import java.util.Random;

interface mainMenu {

	 Scanner input1 = new Scanner(System.in);
	 
	 //default
	public default void  newgame() {
		System.out.println("selecting map");
		System.out.println("no of players selected");
		System.out.println("check the boxes for weapons required");		
	}//end of default method
	
	//default method
	public default int selectTeam() {
		
	System.out.println("select Team");
	System.out.println("0: for counter Terrorists");
	System.out.println("1: for Terrorists");
	System.out.println("2 for random select");	
	int entry = input1.nextInt();
	 
	
	//incase of invalid entry
 while (entry > 2 || entry < 0)
    {
        System.out.print ("enter a number 0-2");
	        entry = input1.nextInt();
    }//end of while
	 
	//for randomly selecting the team
	if(entry == 2) {
		 Random rand = new Random(); //instance of random class
	      int upperbound = 2;
	      entry = rand.nextInt(upperbound);  //0 or 1
	}
	 
	 if (entry == 0) {
		 System.out.println("you chose CT forces");}
	 
	 
	 else if(entry == 1) {
		 System.out.println("you chose Tforces");}
	
	System.out.println("entry "+entry);
	
	return entry; // }
	 
	} //end of method

	
	
}

