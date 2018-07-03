/*****************************************************************************
*DateOfRetirement.java
*Eric Tinajero
*
*This program will ask the user to enter there date of birth, and then show
*the date they will retire. This is assuming they retire at age 67.
*****************************************************************************/
import java.util.Scanner;

public class DateOfRetirement                                     
{
   
   public static void main(String[] args) 
   {
      Scanner stdIn= new Scanner (System.in);
      
      String monthBorn;     //Delcaring variables
      int dayBorn;
      int yearBorn;
      int retireYear;
      
      System.out.print("Enter the month you were born (spell out the month please): ");   
      monthBorn = stdIn.next();                                                           //The user enters the month born, and is then assigned to "monthBorn"
      System.out.print("Enther the day you were born (DD): ");
      dayBorn = stdIn.nextInt();                                                          //The user enters the day born and is then assigned to "dayBorn"
      System.out.print("Enter the year you were born (YYYY): ");
      yearBorn = stdIn.nextInt();                                                         //The user enters the year born and is then assigned to "yearBorn"      
      
      retireYear = 67 + yearBorn;                                                         //This calcualtes the year of retirement which is just the year they were born plus 67.  
      
      System.out.println("You will retire on " + monthBorn +                              //This will display the date of retirement for the user.
         " " + dayBorn + ", " + retireYear + ".");
      
      
      
    }  //end main


}  //end class MyNameAndFavoriteMovie
