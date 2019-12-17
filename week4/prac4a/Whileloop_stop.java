//prac:4A
//Q:10
/*10.	Write a program using a while loop which will ask the user to enter any character from the keyboard. 
 However when the user enters a ‘.’ (full stop) the program must terminate.  Get the program to count how
  many characters the user entered */
  
import java.util.*;
public class Whileloop_stop
{
   public static void main(String args[])
   {
      //creating instance of scanner class
      Scanner keyboardIn = new Scanner(System.in);
      
      //declair variable
      int counter = 1;//initialising variable
      char Charecter;
      
      //asking char from keyboard
      System.out.print("Enter any charecter: ");
      Charecter = keyboardIn.next().charAt(0);
      
      //creating while condition
      while(Charecter != '.')
      {
         System.out.print("Enter any charecter: ");
         Charecter = keyboardIn.next().charAt(0);
         counter++;
      }
         System.out.print("You have entered " + counter +" charecters");
   }
}
        
      
      