/***********************************************************************************************
*TheGuessingGame.java
*Eric Tinajero
*
*This program will ask the user to guess a number between 1 and 100, and after guessing
the correct number it will show the number of tries it took the user.
************************************************************************************************/
import java.util.Scanner;
import java.util.Random;

public class TheGuessingGame
{
   public static void main(String[] args)
   {
     
      Scanner stdIn = new Scanner (System.in);
      Random r = new Random();
      
      int usersGuess;                                                                                   //This variable will be the number the user guesses
      int theAnswer= r.nextInt(100) + 1;                                                                //Number the user must guess to win
      int count = 1;                                                                                    //Initializing count to 1 
   
      System.out.println("Welcome to the Higher/ Lower game!  Try to guess the number between 1 " +
         '\n' + "and 100.");
      System.out.print("Enter your guess: ");
      usersGuess = stdIn.nextInt();                                                                     //User enters his first guess
     
      while (usersGuess != theAnswer)                                                                   //Loop will keep running until the users guess is equal to the random number generated,  
      {
                                                                                                //This will keep track of the number of tries
         if (usersGuess > 100 || usersGuess < 1)                                                        //Program will alert the user if the number enter is out of the 1 to 100 range.
         {   System.out.println("Sorry, the guess needs to be between 1 and 100. Please try " +
               '\n' + "again: ");
             System.out.println("Enter your guess: ");
             usersGuess = stdIn.nextInt();
         }   
         else if (usersGuess>theAnswer)                                                                 //This will tell the user if there guess needs to be lower.
         {  System.out.println("The number is lower");
            System.out.println("Enter your guess: ");
            usersGuess = stdIn.nextInt();
            count++;
         }
         else if (usersGuess < theAnswer)                                                               //This will tell the user if there guess needs to be higher.
         {  System.out.println("The number is higher");
            System.out.println("Enter your guess: ");
            usersGuess = stdIn.nextInt();
            count++;
         }
      }
        
     System.out.println("The number was " + theAnswer + " You guessed correctly! It took you " +       //This tell show the user the random number generated and number of tries it took to guess.
         count +  " tries.");
                         

     

   }  //end main 
}//end class TheGuessingGame