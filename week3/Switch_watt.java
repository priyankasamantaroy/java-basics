//prac:3D
//q:6
/*Watts	Life expectancy (hours)
25	2500
40 or 60	1000
75 or 100	750
Any other value	0
*/
import java.util.Scanner;

public class Switch_watt
{
    public static void main(String args[])
    {
      //create instances of scanner class
      Scanner keyboardIn = new Scanner (System.in);
      //declair variable
      int watt;
      //Assign values for keyboard
      System.out.print("Enter the watts value:");
      watt = keyboardIn.nextInt();
      //switch case
      switch (watt)
      {
         case 25: System.out.print("You will get 2500");
         break;
         case 40:
         case 60: System.out.print("you will get 1000");
         break;
         case 75:
         case 100: System.out.print("you will get 750");
         break;
         default :System.out.print("Any other value: 0");
      }
   }
}

         
         
       

