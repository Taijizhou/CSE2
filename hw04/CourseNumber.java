/////////////////////////////////////////////
//Taiji Zhou
//Date: 9/22/14
//Professor Brian Chen 
//Class CSE 002-112
//CourseNumber Java Program
//The purpose of this program is to know what year and what semester the course was offered based on the number entered
//
// Process
// Enter data to the program
//  compile the program
//      javac CourseNumber.java
//  run the program
//      java CourseNumber
//

import java.util.Scanner;
//define class
    public class CourseNumber{
   //main method required for every Java program
        public static void main(String[ ] args){
       // create new scanner
            Scanner myScanner;
            myScanner = new Scanner( System.in ); 
            
        System.out.print("Enter a six digit number giving the course semester- ");//Enter a six digit number giving the course semester
         
         if (myScanner.hasNextInt()){// next integer
         
            int CourseNumber= myScanner.nextInt();// enter CourseNumber
            
        if(CourseNumber>=186510 && CourseNumber<=201440) {// Course Number has to be in the range 186510 to 201440
                double Yr=(int)(CourseNumber/100);// year equals coursenumber/100
                double Semester=CourseNumber-(Yr*100);// semester equals coursenumber- (year*100)
                
           if (Semester==10 || Semester== 20 || Semester==30 || Semester==40){// analyze whether it is a legitimate semester 
           
           if (Semester==10) {//if semester equals 10 then this will happen
               System.out.println("The course was offered in the Spring semester of "+Yr);
           }//If 10 is entered the course was offered in Spring of the year entered (first four digits)
           
           else if (Semester==20){//if semester equals 20 then this will happen
               System.out.println("The course was offered in the Summer1 semester of "+Yr);
           }//If 20 is entered the course was offered in Spring of the year entered (first four digits)
           
           else if (Semester==30){//if semester equals 30 then this will happen
               System.out.println("The course was offered in the Summer2 semester of "+Yr);
           }//If 30 is entered the course was offered in Spring of the year entered (first four digits)
           
           else if (Semester==40){//if semester equals 40 then this will happen
               System.out.println("The course was offered in the fall semester of "+Yr);
           }//If 40 is entered the course was offered in Spring of the year entered (first four digits)
           
         }
       else{
           System.out.println( Semester+" is not a legitimate semester");// You did not entered 10, 20,30 or 40
       }// end of else
     }
    else{
        System.out.println("The number was outside the range [186510,201440]");//The program can only hold numbers 186510 to 201440
    }// end of else
}

        
        }// end main method
}//end of class