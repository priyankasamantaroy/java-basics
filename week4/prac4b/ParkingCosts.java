//prac:4b
//Q:2
/*2.	Parking costs €1. Write a program that will repeatedly allow a user
 to enter an amount of money (in cents) until they have entered €1 (100 cents). */
 
import java.util.*;
public class ParkingCosts
{
   public static void main(String args[])
   {
      //creating instance of scanner class
      Scanner keyboardIn = new Scanner(System.in);
      int money;
      int counter=0;//initialising variable
      
      do
      {
         System.out.print("Enter amount of money: ");
         money = keyboardIn.nextInt();
         counter++;
      }  while (money !=100);
   }
}

      
