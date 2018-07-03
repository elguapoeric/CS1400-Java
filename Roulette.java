/************************************************************************************************************************
*Eric Tinajero
*Roulette.java
*
*This class simulates a roulette table.  Its passed in a scanner and double and returns a double which in this case is the bet.
*It then will prompt the user how they would like to bet by either choosing low, high or a number.  If the user wins his 
*bet (which was passed in) will double or potentially even multiply by 34, if the user manages to guess the correct number. 
*If they lose the roll the bet will be lost and a 0 will be returned.
*************************************************************************************************************************/


import java.util.Scanner;
import java.util.Random;

public class Roulette
{

   double bet = 0.0; //Bet that will returned 
   
   public double betOnce (Scanner console, double userBet)
   {     
         this.bet = userBet;
         Random r = new Random();
         
         int number = 0;   
         int userChoice = 0;
         number = r.nextInt(37); //Random number used to simulate rolling the ball on the table
         
         //Prompt user for what they would like to choose
         
         System.out.print("Do you want to bet on 1) low or 2) high or 3) a Number?");
         userChoice = console.nextInt();
        
        
         
         //If user bets low
        if (userChoice == 1)
        {
            if (number<=18)
            {
               System.out.println("The number was " + number + " You win!");
               bet = bet*2.0;
            }   
            else if (number>=19)
            {
               System.out.println("The number was " + number + " You lose!");
               bet = 0;
            }
                         
        }
        
        //If user bets high 
        else if (userChoice ==2)
        {
            if (number<=18 || number == 0)
            {
               System.out.println("The number was " +number + " You lose!");
               bet = 0;
            }
            else if(number>=19)
            {
               System.out.println("The number was " + number + " You win!");
               bet = bet*2.0;
            }
           
         }
         
         //If user gets brave and decides to guess a number
         else if (userChoice ==3)
         {
            System.out.print("Pick a number between 1 & 36: ");
            int luckyNumber = console.nextInt();
               
            if (luckyNumber == number)
            {
               System.out.println("The was " + number + ". You win big money!");
               bet = bet*34;
            }
            else if( luckyNumber != number || number == 0)
            {
               System.out.println("The number was " + number + ". You lose!");
               bet = 0;
            }   
           
          }
        return bet; //returns bet 
    }
    
} //End 

