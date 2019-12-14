//Prac:4a_7
//Q:7
/*7.	Write a program using a while loop that will calculate and display 
the sum of all the numbers between 10 and 100 inclusive.*/

public class Whileloop_sum
{
   public static void main(String args[])
   {
      //Declair variables and initialising
      int counter=10;
      int sum = 0;
            
      //while loop
      while(counter<=100)
      {
      sum = sum+counter;
      counter++;
      }
      //need to show result one time only
      System.out.print("sum of all the number is:"+ sum);   
      }
   }
   
         