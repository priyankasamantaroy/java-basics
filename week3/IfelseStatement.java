import java.util.Scanner;

public class IfelseStatement
{
    public static void main(String args[])
    {
        //create instance of scanner class
        Scanner KeyboardIn = new Scanner(System.in);
        //declair variables
        int mark;
        //Assign values
        System.out.print("Enter your marks ");
        mark = KeyboardIn.nextInt();
        //apply condition for the variable that enter through keyboard
        if( mark >=40)
        {
         System.out.print("You have passed the exam");
        }
        else
        {
         System.out.print("Soryy you fail");
        }
     }
  }
               
