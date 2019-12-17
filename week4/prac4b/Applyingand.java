//Pract:4b
//Q:5
/*5.	Write a program that will allow a user to repeatedly enter a number until they enter 20 
OR the total of the numbers exceeds 50 */

import java.util.*;
public class Applyingand
{
   public static void main(String args[])
   {
      //creating instance of scanner class
      Scanner keyboardIn = new Scanner(System.in);
      //declair variables
      int number;
      int total = 0;
      int counter = 1;
      do
      {
         System.out.print("Enter any number: ");
         number = keyboardIn.nextInt(); 
         total = total+number;
         counter++;
      }  while (number!=20 && total<50);
         System.out.println("your number exceeds 50 or may you have entered number 20");
   }
}
     
         
