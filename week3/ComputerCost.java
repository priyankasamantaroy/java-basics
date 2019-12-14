//w3
//Prac3a
//Q:5
/*5.	The price of a computer is 550 euro.  If an order of 30 or more is placed the computers will cost 500 euro each. 
 Write a program to ask the user how many computers they want to buy.  The program should then calculate and display 
 the total cost of the order.
	(total cost = quantity * price)*/
   
import java.util.*;
public class ComputerCost
{
   public static void main(String args[])
   {
      //create instance of scanner class
      Scanner KeyboardIn = new Scanner(System.in);
      //declair variable
      double cost;
      int quantity;
      //assign values
      System.out.print("How many computers you want to buy?:");
      quantity = KeyboardIn.nextInt();
      
      //condition applies
      if (quantity>=30)
      {
         cost = quantity * 500 ;    
         System.out.print("Your total cost is :"+ cost);
      }
      else
      {
         cost = quantity * 550;
         System.out.print("Your total cost is :" + cost);
      }
   }
}
         
