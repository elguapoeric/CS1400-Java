/*********************************************************************************************
*RockPaperScissors.java
*Eric Tinajero
*
*This program will play rock paper scissors againsts the computer.  The user will be asked how many
*times they would like to play (an odd number), and choice of tool.
/************************************************************************************************/
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner (System.in);
      Random r = new Random();
     
      int cpuRandomNumber;                               //random number used to randomize variable cpuChoice to simulate computer choosing rock, paper, or scissors
      int numberOfGames;                                 //number of times the user wants to play
      String cpuChoice=" ";                              //variable that will change based on cpuRandomNumber representing rock, paper, or scissors 
      String userChoice;                                 //user chooses rock, paper, or scissors
      int cpuWins = 0;                                   //variable used to count computer wins
      int userWins = 0;                                  //variable used to count user wins
      
        
       System.out.println("Welcome to Rock, Paper Scissors!");
       System.out.print("Please enter the number of rounds you would like to play, to avoid a tie enter an odd number: ");
       numberOfGames = in.nextInt();
       in.nextLine();
      
       while(numberOfGames%2==0 )                                                                    //This loop will make sure the user picks an odd number
       {
            System.out.print("Please enter an odd number of rounds to play: ");
            numberOfGames= in.nextInt();
            in.nextLine();
       }
       do                                                                                              //This do loop will run until the number of games to be played are reached, ties do not count.
       {      
        System.out.print("Rock, Paper, Or Scissors?: ");
        userChoice=in.next();
        in.nextLine();                                                                                //flushing the buffer
      
        while(!userChoice.equalsIgnoreCase("rock")&& !userChoice.equalsIgnoreCase("paper") && !userChoice.equalsIgnoreCase("scissors"))   //This loop will make sure the user enters either rock, paper, or scissors 
        {
            System.out.println("Sorry \"" + userChoice + "\" is not a valid word.");
            System.out.print("Rock, Paper, Or Scissors?: ");
            userChoice=in.nextLine();
        }
              
        cpuRandomNumber = r.nextInt(3);                                                                  //Randomizes  cpuChoice to simulate compuer picking rock, paper, or scissors.
        if(cpuRandomNumber==0)
        {cpuChoice = "rock";}
        if(cpuRandomNumber==1)
        {cpuChoice="paper";}
        if(cpuRandomNumber==2)
        {cpuChoice="scissors";}
        
        
        //The next loops will determine who wins each game based on the inputs.  The variable userWins++ and cpuWins++ will only increment depending on who wins each game.
        if(userChoice.equalsIgnoreCase(cpuChoice))                                                   
        {
              System.out.println("Computer chooses " + cpuChoice + ". Its a tie. ");
        }  
        else if(userChoice.equalsIgnoreCase("rock"))
        {     
           if (cpuChoice.equalsIgnoreCase("scissors"))
           {      
               System.out.println("Computer chooses scissors. Rock crushes scissors.  You win! ");
               userWins++;
           }    
           else if(cpuChoice.equalsIgnoreCase("paper"))
           {
               System.out.println("Computer chooses paper. Paper covers rock. You lose. ");
               cpuWins++;
           }  
        
        }     
        else if(userChoice.equalsIgnoreCase("scissors"))
        {   
           if (cpuChoice.equalsIgnoreCase("paper"))
           {
               System.out.println("Computer chooses paper. Scissors cut paper.  You win! ");
               userWins++;
           }
           else if(cpuChoice.equalsIgnoreCase("rock"))
           {
               System.out.println("Computer chooses rock. Rock covers paper. You lose. ");
               cpuWins++; 
           }
              
        }
        else if(userChoice.equalsIgnoreCase("paper"))
        {     
           if (cpuChoice.equalsIgnoreCase("rock"))
           {      
               System.out.println("Computer chooses rock. Paper covers rock.  You win!");
               userWins++;
           }
           else if(cpuChoice.equalsIgnoreCase("scissors"))
           {       
               System.out.println("Computer chooses scissors. Scissors cut paper. You lose. ");
               cpuWins++;
           }
           
        } 
      }while(cpuWins + userWins != numberOfGames);                                         //Will end game when number of games is reached
      
       System.out.println("Computer wins: " + cpuWins);                                    
      System.out.println("User win: " + userWins);
      
      if(cpuWins>userWins)                                                                //Loop will determine winner of the game and declare the winner.
      {  
         System.out.print("Computer wins the game :(");
      }   
      else if(userWins>cpuWins)
      {
         System.out.print("You win the game!");
      }
      
   }//end main       
}//end class   