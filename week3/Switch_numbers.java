//prac:d3
//switch case
//9th dec
/*2.	Write a program that reads in a single digit from the keyboard (digits 0 – 9)
 and displays the value as a word, for example an input of 5 will display the word five.
 */
 
 import java.util.Scanner;

public class Switch_numbers
{
    public static void main(String args[])
    {
      //create instances of scanner class
       Scanner keyboardIn = new Scanner (System.in);
       //declair variable
       int digit;
       //assign values for keyboard
       System.out.print("put the numberthat you want to convert in words: ");
       digit = keyboardIn.nextInt();
       //create switch case
       switch(digit)
       {
         case 0: System.out.print("zero");
                 break;
         case 1: System.out.print("One");
                  break;
         case 2: System.out.print("two");
                  break;
         case 3: System.out.print("three");
                  break;
         case 4: System.out.print("four");
                  break;
         case 5: System.out.print("five");
                  break;
        default: System.out.print("you have entered wrong number");
        }
     }
  }




     
       
