//Prac:4b
//Q:4
/*4.	The winning bonus ball number in this week’s Lotto was 19.  Write a program that 
will repeatedly allow a user to enter a number to guess the bonus ball until they guess
 the number correctly.  Get the program to count how many guesses the user made.*/
 
import java.util.*;
public class Lottobonus
{
   public static void main(String args[])
   {
      //creating instance of scanner class
      Scanner keyboardIn = new Scanner(System.in);
      //declair variables
      int bonus;
      int counter = 1;
      
      do
      {
         System.out.println("Enter Bonus number of Lotto: ");
         bonus = keyboardIn.nextInt();        
         counter++;
      }  while(bonus!=19);
         System.out.println("you have guessed :" +counter +"times");
   }
}
         

     
      