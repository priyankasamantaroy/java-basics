//prac:3d
//Q:4
/*Character	Playing card
J or j	Jack
Q or q	Queen
K or k	King
Any other letter	No matching card
*/
import java.util.Scanner;

public class Switch_card
{
    public static void main(String args[])
    {
      //create instances of scanner class
       Scanner keyboardIn = new Scanner (System.in);
      //create variables
       char card;
      //Assign values through keyboard
       System.out.print("Enter the name of card: ");
       card = keyboardIn.next().charAt(0);
      //switch case
        switch (card)
        {
         case 'j':
         case 'J':System.out.print("Jack");
         break;
         case 'Q':
         case 'q':System.out.print("Queen");
         break;
         case 'K':
         case 'k':System.out.print("King");
         break;
         default :System.out.print("No matching card");
        }
     }
  }
         
        