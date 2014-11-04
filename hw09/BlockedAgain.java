/////////////////////////////////////////////
//Taiji Zhou
//Date: 11/03/14
//Professor Brian Chen 
//Class CSE 002-112
//BlockedAgain Java Program
//The purpose of this program is to be able to process information from a scanner using different methods
//
// Process
// Enter data to the program
//  compile the program
//      javac BlockedAgain.java
//  run the program
//      java BlockedAgain
//

//open scanner 
import java.util.Scanner;
//main class
public class BlockedAgain{
	//main method
	public static void main(String s[]){
		//declare integer
		int m; 
		//force user to enter int in range 1-9, inclusive. 
		m = getInt();
		//generating blocks according to user input
		allBlocks(m);
	}
	//method 
	public static void allBlocks(int x){
		int lineCount = 1; //keep track of number of lines printed
		int charCount = 1; //keeps trach of number of characters printed
		int indent = x; //controlls the indentation
		for(int i=0; i<x; i++){
			char ch = intToChar(i+1);
			block(ch,lineCount,charCount,indent); //calling the block() method to print block of numbers
			block('-',1,charCount,indent); //calling block() to print block of -
			charCount+=2;
			lineCount++;
			indent--;
		}
	}
	//method
	public static char intToChar(int i){
		//define character
		char ch;
		switch(i){
			case 1: ch='1';
			break;
			case 2: ch='2';
			break;
			case 3: ch='3';
			break;
			case 4: ch='4';
			break;
			case 5: ch='5';
			break;
			case 6: ch='6';
			break;
			case 7: ch='7';
			break;
			case 8: ch='8';
			break;
			case 9: ch='9';
			break;
			default : ch=' ';
		}
		return ch;
	}
	//method
	public static void block(char ch, int lineCount, int charCount, int indent){
		for(int i=0; i<lineCount; i++){
			line(ch,charCount,indent); //calling line() to print the block 1 line at a time
		}
		
	}
	//method
	public static void line(char ch, int charCount, int indent){
		//creating proper indentation
		for(int i=0; i<indent; i++){
			System.out.print(" ");
		}
		
		//printing the line
		for(int i=0; i<charCount; i++){
			System.out.print(ch);
		}
		System.out.println();
	}
	//method
	public static int getInt(){
		Scanner input = new Scanner(System.in);
		boolean isValid = false;
		int out = -1;
		while(!isValid){
			
			System.out.print("Enter a value between 1 and 9, inclusive : ");
			if(checkInt(input)){ //check whether the input is an int
				out = input.nextInt();
				if(checkRange(out)){ // if the input is an int check whether it's within the range
					isValid = true;
				}
			}
		}
		return out;
	}
	
	public static boolean checkInt(Scanner input){
		if(input.hasNextInt()){
			return true;
		}//end of if
		else{
			System.out.println("You did not enter an int; try again");
			input.next();
			return false;
		}//end of else 		
	}//end of static boolean 
	
	//Takes an int as a argument and return true if it lies within [1,9]. 
	//If not return false		
	
	public static boolean checkRange(int x){
		if(x>0 && x<10){
			return true;
		}//end of if
		else{
			System.out.println("You did not enter an int in [1,9]; try again");
			return false;
		}//end of else
	}//end of static boolean
	
}// end of main class

