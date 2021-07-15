package CounterStrike;
 
import java.util.Scanner;

//check with to string methods 
public class Driver implements  mainMenu , Display{ //multi inheritance 

	
	 public static void New_Game() {
			System.out.println("new game started");
	 }     
	 
	 
	 public static void Quit_Game() {
			System.out.println("game ended");
	 }
	
	 //main method
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		Driver ob = new Driver(); //creating object to access the methods
		try (Scanner input = new Scanner(System.in)) {
			CT_Forces ct = new CT_Forces();  //object of ct forces class
			 TForces t = new TForces(); //object of tforces class
			 
			 
			System.out.println("displaying the server");
			System.out.println("choose an option");
			System.out.println("1: for new game");
			System.out.println("2: for finding server");
			System.out.println("3: for options");
			System.out.println("4: for quit");
			int choice3 = input.nextInt();  // Read user input

//incase of invalid entries
 while (choice3 > 4 || choice3 < 1)
  {
			System.out.print ("enter a number 1-4 ");
			    choice3 = input.nextInt();
			    }//end of while
			 
			
			 //switch case for the option selected
			 switch (choice3) {
			  case 1: {
			  ob.newgame();  //method called
			 ob.selectTeam(); //method called
			// int team =  ob.selectTeam();  
			// System.out.println("choice4 = " +ob.selectTeam());
			 if (ob.selectTeam() == 0) {  //if ct forces are selected
				 System.out.println("enter the name for the player for ct force");
				String playername= input.nextLine();
				ct.setName(playername);
				System.out.println("enter the bot name prefix");
				String botprefix= input.nextLine();
				ct.setBotnamePrefix(botprefix);
				System.out.println("select appearance for the counter terrorist");
				System.out.println("0 for Seal Team 6");
				System.out.println("1 for GSG-9");
				System.out.println("2 for SAS");
				System.out.println("3 for GIGN ");
				int choice1 = input.nextInt();
				//incase of invalid entries
				 while (choice1 > 3 || choice1 < 0)
				    {
				        System.out.print ("enter a number 1-3 ");
				        choice1 = input.nextInt();
				    }//end of while
				 
				 ct.setAppearance(choice1);  //public set method for appearance
				 switch (choice1) {
				 case 0:
			       System.out.println("you chose seal team 6");
					 break;
				 case 1:
				 System.out.println("you chose GSG-9");
				 break;
				 case 2:
				 System.out.println("you chose SAS"); 
				 break;
				 case 3:
			     System.out.println("you chose GIGN"); 
				 break;
				 }//end of switch case		 
			 }//end of if statement
			 
			 
			 else if  (ob.selectTeam() == 1)   {//if terrosirst team is selected
				 System.out.println("enter the name for the player for terrorist team");
					String playername= input.nextLine();
					t.setName(playername);
					System.out.println("enter the bot name prefix for terrosrist team");
					String botprefix= input.nextLine();
					t.setBotnamePrefix(botprefix);
					System.out.println("select appearance for the terrorist");
					System.out.println("0 for phoenix connex");
					System.out.println("1 for elite crew");
					System.out.println("2 for arctic avengers");
					System.out.println("3 for guerilla warfare ");
					int choice5 = input.nextInt();
					//incase of invalid entries
					 while (choice5 > 3 || choice5 < 0)
					    {
					        System.out.print ("enter a number 1-3 ");
					        choice5 = input.nextInt();
			 		    }//end of while
					 
					 t.setAppearance(choice5);  //public set method for appearance
					 switch (choice5) {
					 case 0:
				     System.out.println("you chose phoenix connex");
						 break;
					 case 1:
					 System.out.println("you chose elite crew");
					 break;
					 
					 case 2:
					 System.out.println("you chose arctic avengers"); 
					 break;
					 
					 case 3:
				     System.out.println("you chose  guerilla warfare"); 
				     break; 	     
					 }
			 }
					 
				System.out.println("GAME HAS STARTED");
				ob.displayActvity();  //methods being called through driver class object 
				ob.displayHealth();
				ob.displayMap();
				ob.displayTime();
				ob.displayWinningTeam();
				ob.displayScores();
				ob.dislpayListofPlayers();
					 			 
					 break;
					 }//end of case 1
			
			
			   
 case 2:
				  System.out.println("displaying server");
			    break;
			     
  case 3:
			    System.out.println("setting mouse and keyboard controls");
			    break;
			
  case 4:
			  Driver.Quit_Game(); //static method called
			    break;
			
			}//end of switch case	 
		}
		 
		
	} //end of main


	@Override
	public void displayHealth() {
		System.out.println("display players health");
	}


	@Override
	public void displayWinningTeam() {
		if (ScoreBoard.tforces_score >  ScoreBoard.ctforces_score )
			System.out.println("terrorists win");
		else if  (ScoreBoard.tforces_score <  ScoreBoard.ctforces_score )
			System.out.println(" counter terrorists win");
		else 
			System.out.println("no winner");
		
	}


	@Override
	public void displayMap() {
		System.out.println("display the map");
		
	}


	@Override
	public void displayTime() {
		System.out.println("display the time");
		
	}


	@Override
	public void displayActvity() {
		System.out.println("displaying activity of other bots ");
	}


	@Override
	public void displayScores() {
		System.out.println("terrorists score= "+ScoreBoard.tforces_score );
		System.out.println("counter terrorists score =" + ScoreBoard.ctforces_score  );
		
	}


	@Override
	public void dislpayListofPlayers() {
		System.out.println("displays list of players");
		
	}

} //end of class
