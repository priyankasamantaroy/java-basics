//prac:4a-6
//Q:6
//6.	Write a program using a while loop which will display the following on screen 
  /* 10
  	  9
	  8
	  7
	  6
	  5
	  4
	  3
	  2
	  1
	BLASTOFF!!!!
   */
   
   
public class Whileloop_blastoff
{
   public static void main(String args[])
   {
      //declair and initilising variable
      int counter = 10;
      
      //while loop
      while(counter>=1)//if the while condition is true
      {
        System.out.println(counter);
        counter= counter-1;// counter--;
      }
      //while terimante loop will display
      System.out.println("BLASTOFF!!!");
   }
   
}
