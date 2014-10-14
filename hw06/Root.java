/////////////////////////////////////////////
//Taiji Zhou
//Date: 10/13/14
//Professor Brian Chen 
//Class CSE 002-112
//Root Java Program
//
//The purpose of this lab is to calculate square root of a given double which is greater than 0
// Process
// Enter data to the program
//  compile the program
//      javac Root.java
//  run the program
//      java Root

//import scanner
import java.util.Scanner;
//define class
public class Root {
    
//main method 
    public static void main(String[] args){    
        // if the number entered is 0
        double enteredDouble = 0;
        System.out.print("Please Enter a valid double: ");
        Scanner scan=new Scanner(System.in);
        if(scan.hasNextDouble()){
            enteredDouble=scan.nextDouble();
        }
        
        if(enteredDouble <= 0){
            System.out.println("Please enter a valid number greater than 0\n" + 
                    "Try again by running the program again");
        }
        else{       
            Root root = new Root();
            double squareRoot = root.squareRoot(enteredDouble);
            System.out.println("*The Square Root of Entered double " + 
                    enteredDouble + " is*: " + squareRoot);
        }
    }// end main method 
    // this calculates if the number is not 0
    public double squareRoot(double x){
        double low = 0;
        double high = x+1;
        double middle = (low + high)/2;
        //while loop
        while((high-low) > ((x+1) * 0.0000001)){ 
            if((middle*middle) > x){
                high = middle;
            }else{
                low = middle;
            }
            middle = (high + low) / 2;
        }        
        return middle;
    }//end of public double  
}// end of main class
