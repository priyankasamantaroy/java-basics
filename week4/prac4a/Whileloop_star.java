//prac:4a
//Q:4
//4.	Write a program, using a while loop, that will display 35 stars (*) on screen.

public class Whileloop_star
{
   public static void main(String args[])
   {
      //declair variable
      int counter=1; //initialise variable
      
      //creating while loop
      while (counter<=35)//while the condition is true
      {
         //will display
         System.out.println(counter + ": *");
         //checking the counter and go back to loop again till meet the condition
         counter++;
      }  //terminate loop
   }
}