/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+x+"%");
  //  System.out.println("You entered "+(1-(x/100))+"%");
   //print out the proportion remaining for select percentages
    percent=(1-(x/100));
    System.out.println("The proportion remaining is "+percent);
  /* if(1-(x/100)==0.9299999999999999)  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    else if(1-x/100==0.59)//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    else if(1-x/100==0.86)//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    else if(1-x/100==0.67)//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    else if(1-x/100==0.4)//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);*/
   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
if we used (==)operation we will use a sperate case for each number from 0->99
so we have this option or to chage the code design to fit all input types 
and there is another problem that the numbers written in the right of equal sign are exactally 0.93
but the compier compare with 0.9299999999999999
so the solution is to cancel the if-else conditions and use the percent var
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
 * 
 * 
 * 
 */
