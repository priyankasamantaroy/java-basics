//Prac:4a-5
//Q:5
//5.	Write a program, using a while loop, that will display the text “I must practise my programming skills” 50 times on screen.

public class Whileloop_practise
{
   public static void main(String args[])
   {
      //declair and intialising variables
      int counter=1;
      
      //while loop condition
      while (counter<=50)//while condition if true
      {
         //loop body will show
         System.out.println(counter + ":I must practise my programming skills");
         counter++;
      }
   }
}
