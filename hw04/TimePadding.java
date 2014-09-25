/////////////////////////////////////////////
//Taiji Zhou
//Date: 9/22/14
//Professor Brian Chen 
//Class CSE 002-112
//TimePadding Java Program
//The purpose of this program is to be able to calculate time padding
//
// Process
// Enter data to the program
//  compile the program
//      javac TimePadding.java
//  run the program
//      java TimePadding
//

import java.util.Scanner;
//define class
    public class TimePadding{
   //main method required for every Java program
        public static void main(String[] args){
       //create scanner
            Scanner myScanner;
            myScanner = new Scanner( System.in ); 
            
        System.out.print("Enter the time in seconds: ");// enter the time in seconds 
          if (myScanner.hasNextInt()){// analyze whether is a integer
                int seconds=myScanner.nextInt();// seconds has next integer
                int Hours=(int)(seconds/3600);// hours equal to seconds/3600
                int Minutes=(int)(seconds/60)%60;// minutes equal to (seconds/60)%60
                int Seconds=(int)(seconds-Hours*3600-Minutes*60);// seconds-Hour*3600-Minutes*60
        
        if (Minutes<10 || Seconds<10){// analyze whether it needs to add a x or zero
            
           if (Minutes<10 && Seconds<10){// If minute is less than 10 && seconds less than 10
             System.out.println("The time is "+Hours+":0"+Minutes+":0"+Seconds);
               
           }// If minutes is less to 10 && seconds less than 10 then this is the formula to calculate the time 
            else if (Minutes>=10 && Seconds<10){// If minutes is greater or equal to 10 && seconds less than equal 10
                System.out.println("The time is "+Hours+":"+Minutes+":0"+Seconds);
           
            }// If minutes is greater or equal to 10 && seconds less than equal 10 then this is the formula to calculate the time
            else if (Minutes<10 && Seconds>=10){// If seconds is greater or equal to 10 && minutes less than 10 
                System.out.println("The time is "+Hours+":0"+Minutes+":"+Seconds);
                    
            }// If seconds is greater or equal to 10 && minutes less than 10 then this is the formula to calculate the time
              
        }
       else{
        System.out.println("The time is "+Hours+":"+Minutes+":"+Seconds);
       }// if no 0 is needed then this the formula
   }
}// end of main method
}//end of class