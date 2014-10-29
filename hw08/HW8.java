/////////////////////////////////////////////
//Taiji Zhou
//Date: 10/23/14
//Professor Brian Chen 
//Class CSE 002-112
//HW8 Java Program
//The purpose of this program is to be able to process information from a scanner
//
// Process
// Enter data to the program
//  compile the program
//      javac HW8.java
//  run the program
//      java HW8
//

//open scanner
import java.util.Scanner;
//define class
public class HW8{
	//main method 
	public static void main(String []arg){
		
		char input;	//variable to hold the return value of methods
		
			Scanner scan=new Scanner(System.in);	//creating new Scanner object
		
			System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");	//prompting user for the input
			input=getInput(scan,"Cc");	//passing parameters to the method
			System.out.println("You entered '"+input+"'");	//displaying output
		
			System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");	//prompting user for the input
			input=getInput(scan,"yYnN",5); //passing parameters to the method, Give up after 5 attempts
		
		if(input!=' '){
			System.out.println("You entered '"+input+"'");	//displaying output if user entered the correct input
		}
		
			input=getInput(scan,"Choose a digit.","0123456789");	//passing parameters to the method
			System.out.println("You entered '"+input+"'");	//displaying output
	}
	 
	public static char getInput(Scanner scan, String text){
		char out=' ';	//character variable to hold return value
		String in;	//String variable to take user input
		while(out==' '){	//looping until user enters a valid character
			in = scan.next();	//reading user input
			
			if(in.length()==1){
				char token = in.charAt(0);
				
				//cheking users input against the passed String
				for(int i=0; i<text.length(); i++){
					if(token == text.charAt(i)){
						out = text.charAt(i);
						break;
					}
				}
				if(out==' '){
					System.out.print("You did not enter a character from the list '"+text+"' . Try again: ");
				} 
			}
				else{
					System.out.print("You should enter exactly one character :");
			}
		}
		return out;
	}
	
	public static char getInput(Scanner scan, String text, int limit){
		char out=' ';
		String in;
		int count=0;
		while(count<=limit){ //looping until limit is reached
			in = scan.next();	//reading user input
			
			if(in.length()==1){	//checking user input for length
				char token = in.charAt(0);
			
				for(int i=0; i<text.length(); i++){	//checking user input against each character in passed String
					if(token == text.charAt(i)){
						out = text.charAt(i);
						count=limit;
					}
				}
				if(out==' ' && count!=limit){
					System.out.print("You did not enter a character from the list '"+text+"' . Try again: ");
				} 
			}else{
				System.out.print("You should enter exactly one character :");
				count--;
			}
			count++;
			if(count>limit && out==' '){
				System.out.println("You failed after "+limit+" tries.");
			}
		}
		return out;
	}
	
	public static char getInput(Scanner scan, String prompt, String text){
		char out=' ';
		String in;
		while(out==' '){//looping until user enter a valid character
			
			System.out.println(prompt);	//displaying the string 'prompt' to the user
			System.out.print("Enter one of: ");
			
			for(int i=0;i<text.length();i++){	//displaying the set of characters in the string 'text'
				System.out.print("'"+text.charAt(i)+"',");
			}
			System.out.print("\b :");
			
			in = scan.next();	//reading user input.
			
			if(in.length()==1){	//checking length of input
				char token = in.charAt(0);
				
				for(int i=0; i<text.length(); i++){	//checking input against each character in 'text'
					if(token == text.charAt(i)){	//setting return value if character is valid
						out = text.charAt(i);
						break;
					}
				}
				if(out==' '){
					System.out.println("You did not enter an acceptable character");
				} 
			}
			 else{
				System.out.println("Enter exactly one character:");
			}
		}
		return out;
	}  
}