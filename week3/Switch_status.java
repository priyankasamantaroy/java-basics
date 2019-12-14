//Prac:3
//prac:3d
//Using swutch structure
//8th dec

import java.util.Scanner;

public class Switch_status
{
        public static void main(String args[])
    {
        Scanner keyboardIn = new Scanner (System.in);
        //declair variables
        /*always char string or in in switch case cant use decimel and 
         values in range*/
          char status;
          //assign chars for keyboard
          System.out.print ("Enter your status:");
          status = keyboardIn.next().charAt(0);
          //check your status and display the appropriate one
          switch (status)
          {
          case 's':
          case 'S':  System.out.print("single");//ststus for s
                     break;
          case 'm':
          case 'M': System.out.print("married");
                    break;
          case 'w':
          case 'W': System.out.print("widowd");
                    break;
          case 'd':
          case 'D': System.out.print("Divorced");
                    break;
          default : System.out.print("You have entered worng char");
         }
      }
   }


           
          
          
               
