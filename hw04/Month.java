/////////////////////////////////////////////
//Taiji Zhou
//Date: 9/22/14
//Professor Brian Chen 
//Class CSE 002-112
//Month Java Program
//The purpose of this program is to know what year has 30 days and what years have 31 days.Also, know if it is a leap year.
//
// Process
// Enter data to the program
//  compile the program
//      javac Month.java
//  run the program
//      java Month
//
//

import java.util.Scanner;
    //define class
    public class Month{
   //main method required for every Java program
        public static void main(String[] args){
       // create new scanner
            Scanner myScanner;
            myScanner = new Scanner( System.in ); 
       
        System.out.print("Enter an int giving the number of the month (1-12)- ");// enter an integer giving the number of the month (1-12)
   
        if (myScanner.hasNextInt()){// analyze whether is an integer
       
       int Month = myScanner.nextInt();// insert input Month 
       
       if (Month==1 || Month==3 || Month==5|| Month==7|| Month==8|| Month==10|| Month==12){
           System.out.println("The month has 31 days");// the month has 31 days if it is one of the above
       }
       else if(Month==4 || Month==6 || Month==9|| Month==11){
          
           System.out.println("The month has 30 days");
       }// the month has 30 days if it is one of the above
       
       else if(Month==2){// if the month is february 
           System.out.print("Enter an int giving the year ");//enter a year to see if it is a leap year 
       int Year=myScanner.nextInt();// input year 
        boolean isLeapYear =((Year%4 == 0 && Year % 100 != 0) || (Year % 400 == 0));{// boolean for leap year
        if (isLeapYear){
            System.out.println("The month has 29 days");// The month has 29 days
        }// the month has 29 days if it is a leap year
        
        else {
            System.out.println("The month has 28 days");// The month has 28 days
             }//end of else
        }//end of boolean
    }// end of else if
    
       
   else {
       System.out.println("You did not enter an int between 1 and 12");// You did not enter an int between 1 and 12
   }//end of else
   
        }   
    }//end of main method
}// end of class