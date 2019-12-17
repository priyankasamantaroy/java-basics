//prac:4b
//Q:1
/*1.	Write a program that will repeatedly let a user enter any number until they enter the number 0.*/

import java.util.*;
public class Dowhileloop_zero
{
   public static void main(String args[])
   {
      //creating instance of scanner class
      Scanner keyboardIn = new Scanner(System.in);
      int number;
      int counter=0;
                   
      do 
      {
         System.out.print("Enter any Number: ");
         number = keyboardIn.nextInt();
         counter++;
      }  while (number!=0);
   }
}
