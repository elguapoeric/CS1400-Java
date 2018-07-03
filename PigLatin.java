/***********************************************************
*PigLatin.java
*Eric Tinajero
*
*This program will Translate a word into pig latin.
***********************************************************/
import java.util.Scanner;


public class PigLatin
{
  public static void main(String[] args)
  {
    Scanner in =new Scanner (System.in);
    
    char ch;  
    String pigLatin;
    
    System.out.print("Please enter a word: ");               //User enters first word
    String word = in.nextLine();                             //variable word is initiallized 

    while(!word.equalsIgnoreCase("q"))                       //Program will keep running until user presses q
    {   
      String lowerCaseWord = word.toLowerCase();             //turns word variable to all lowercase and renames variable lowerCaseWord in case user enters a capital
      char firstLetter = lowerCaseWord.charAt(0);            //firstLetter will contain the first letter of word

      if (firstLetter=='a'||firstLetter=='e'||firstLetter=='i'||firstLetter=='o'||firstLetter=='u')         //will check if first letter is a vowel
      { 
        System.out.println("The translation is: " +word+"way");                                             //prints the word and ads "way" to end if first letter is a vowel
      }
      else
      {  
        for (int i= 0; i<word.length(); i++)                                                                //This will loop through each letter in lowerCaseWord unti                 
        {
          ch = lowerCaseWord.charAt(i);                                                                           

          if (ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')                                    //if ch is a vowel then if statement will execute 
          {    
            pigLatin = word.substring(i, word.length()) + word.substring(0, i)+("ay");                      //i is the number of iterations the for loop went through which is the location of the letter
            System.out.println(pigLatin);
            break;                                                                                          //This will break the for loop since the vowel was already found
          }
        }                   
      }
      System.out.print("Enter another word to be translated (or press Q to quit): ");                       //Will ask user to enter another word or if they want to quit 
      word = in.nextLine();                                                                                 //Will end while loop if q or Q is entered or translate another word
    }      
  }  //End mains  
}  //end class PigLatin  




