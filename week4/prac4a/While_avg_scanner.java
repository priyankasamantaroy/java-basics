//Prac:4a
//Q:8
/*9.	Write a program using a while loop that will ask a user to enter any 10 numbers and 
which will then calculate and display the average of the 10 numbers*/

import java.util.*;
public class While_avg_scanner
{
   public static void main(String args[])
   {
      //creating instance of scanner class
      Scanner keyboardIn = new Scanner(System.in);
      //creating variales
      int inputnumber;
      int sum=0;//initialising value
      double avg;
      int counter=1;//initialising value
      //assign values for keyboard
      //System.out.print("Enter any number:");
      //inputnumber = keyboardIn.nextInt();
      //applying while loop
      while(counter<=9)
      {
         //sum = sum + inputnumber;         
         System.out.println("Enter any number:" + counter);
         inputnumber = keyboardIn.nextInt();
         sum = sum + inputnumber;
         counter++;
      }
         
         avg = sum/counter;
         System.out.print("Average is:"+ avg +" Sum is:"+sum + " times you added:" + counter);
    }
 }
 
 
 


         
      
   
