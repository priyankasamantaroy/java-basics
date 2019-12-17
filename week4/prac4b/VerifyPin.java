//prac:4b
//Q:3
/*3.	Write a program that will repeatedly allow a user to enter a PIN number 
for their bankcard until they enter the correct number. (Create your own PIN number for this program).*/

import java.util.*;
public class VerifyPin
{
   public static void main(String args[])
   {
      //creating instance of scanner class
      Scanner keyboardIn = new Scanner(System.in);
     
      //declair variables
      int counter = 1;
      int pin = 3819;

      do 
      {
         System.out.print("Enter PIN number: ");
         pin = keyboardIn.nextInt();
         counter++;
       } while (pin != 3819);
    }
 }
       
       
       
        
      
    