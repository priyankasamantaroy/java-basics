//prac:4a
//Q:8
/*8.	Write a program using a while loop that will calculate and display the sum of all the numbers 
from 1 to n (inclusive), where n is determined by the user.*/


import java.util.*;
public class While_sum_scanner
{
   public static void main(String args[])
   {
      //creating instance of scanner class
      Scanner keyboardIn = new Scanner(System.in);
      //declair variables
      int inputnumber;
      int sum=0;
      //asking for keyboard input
      System.out.print("input a number:");
      inputnumber = keyboardIn.nextInt();
      //while loop condition
      while(inputnumber>=1)
      {
         sum=sum+inputnumber;//will add the inputnumber here
         //loop will asking for keyboardinput untill its <1
         System.out.print("input a number:");
         inputnumber = keyboardIn.nextInt();
      }
         System.out.print("total sum of number is:" + sum);
         
   }
}
         
      