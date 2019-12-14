//prac:3a
//Q:4
/*4.	Write a program that will read in the price of 3 different books from 
the user and will calculate and display the total amount owing. 
  If the total price is greater than 50.00 a 10% discount will be given. 
  */
   
import java.util.*;
public class BookonDisc
{
   public static void main(String args[])
   {
      //create instance of scanner class
      Scanner KeyboardIn = new Scanner(System.in);
      //declair variables
      double book1,book2,book3,total,disc;
      //assign values for keyboard
      System.out.print("enter price of book1:");
      book1 = KeyboardIn.nextDouble();
      System.out.print("enter price of book2:");
      book2 = KeyboardIn.nextDouble();
      System.out.print("enter price of book3:");
      book3 = KeyboardIn.nextDouble();
      total = book1+book2+book3 ;
      //condition applied
      if(total>50.00)
      {
         disc = total * .1;
         total = total - disc;
         System.out.print("you have to pay dicounted price :" + total);
      }
      else
      {
         System.out.print("No dicsount for you.You have to pay:"+ total);
      }
   }
}


         



