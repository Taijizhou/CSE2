/////////////////////////////////////////////
//Taiji Zhou
//Date: 9/22/14
//Professor Brian Chen 
//Class CSE 002-112
//IncomeTax Java Program
//The purpose of this program is to calculate the IncomeTax of a person depending on their income
//
// Process
// Enter data to the program
//  compile the program
//      javac IncomeTax.java
//  run the program
//      java IncomeTax
//

import java.util.Scanner;
//define class
    public class IncomeTax{
   //main method required for every Java program
        public static void main(String[] args){
           //create new scanner
            Scanner myScanner;
            myScanner = new Scanner( System.in ); 
       
        System.out.print("Enter an int giving the number of thousands- ");// type in an integer in thousands
   
        if (myScanner.hasNextInt()){// analyze whether is an integer
       
            int IncomeTax = myScanner.nextInt();// Input IncomeTax
       
        if (0<IncomeTax && IncomeTax<20){
               System.out.println(" The tax rate on $ " +(IncomeTax*1000)+ " is 5%, and the tax is $ "+ 0.05*IncomeTax*1000 );
               
           }// It calculates the tax rate on the number of IncomeTax for income less than 20000$ which is 5%
        else if (20<=IncomeTax && IncomeTax<40){
               System.out.println(" The tax rate on $ " +(IncomeTax*1000)+ " is 7%, and the tax is $ "+ 0.07*IncomeTax*1000 );
               
           }// It calculates the tax rate on the number of IncomeTax for income from 20000$ to 40000$ which is 7%
        else if (40<=IncomeTax&& IncomeTax<78){   
               System.out.println(" The tax rate on $ " +(IncomeTax*1000)+ " is 12%, and the tax is $ "+ 0.12*IncomeTax*1000 );
               
           }// It calculates the tax rate on the number of IncomeTax for 40000$ to 78000$ which is 12% 
          else if (IncomeTax>=78){
               System.out.println(" The tax rate on $ " +(IncomeTax*1000)+ " is 14%, and the tax is $ "+ 0.14*IncomeTax*1000 );
               
           }// It calculates the tax rate on the number of IncomeTax for 78000$ or more which is 14% 
            else{
                System.out.println("You did not enter a positive int");
      }
   }
            else{
                System.out.println("You did not enter an int");
                 return;
        }
}
}