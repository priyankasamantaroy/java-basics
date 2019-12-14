//prac:3d
//q:3
/*Category	Type of ship
B , b	Battleship
C, c	Cruiser
D, d	Destroyer
E, e	Frigate
Any other letter	No such ship found
*/
 import java.util.Scanner;

public class Switch_category
{
    public static void main(String args[])
    {
      //create instances of scanner class
       Scanner keyboardIn = new Scanner (System.in);
       //declair variables
       char category;
       //assign values for keyboard
       System.out.print("Enter the category:");
       category = keyboardIn.next().charAt(0);
       //switch case
       switch(category)
       {
         case 'B': 
         case 'b': System.out.print("Battleship");
         break;
         case 'C': 
         case 'c': System.out.print("Cruiser");
         break;
         case 'D': 
         case 'd': System.out.print("Destroyer");
         break;
         case 'E': 
         case 'e': System.out.print("Frigrate");
         break;
         default:System.out.print("No such ship found");
      }
   }
}


       
