/////////////////////////////////////////////
//Taiji Zhou
//Date: 9/30/14
//Professor Brian Chen 
//Class CSE 002-112
//BoolaBoola Java Program
//The purpose of this program is to have three boolean variables and each of this will have a value of true or false randomly assigned.
//
// Process
// Enter data to the program
//  compile the program
//      javac BoolaBoola.java
//  run the program
//      java BoolaBoola
//

import java.util.Scanner; // Import Scanner Class

//define class
	public class BoolaBoola{
		//main method
		public static void main(String[] args) 
		
	{
		boolean b1=true,b2=false,b3=false; // 3 diff boolean variable with random value
		char ans; // to store user choice
		Scanner s = new Scanner(System.in); // to take input from user
		System.out.println("boolean b1 = "+b1); // Print value of b1
		System.out.println("boolean b2 = "+b2); // Print value of b2
		System.out.println("boolean b3 = "+b3); // Print value of b3
		
		// Ask user for answer
		System.out.print("Does b1 || b2 && b3 have the value true(t/T) or false(f/F) - ");
		ans = s.next().charAt(0); // Store single character in ans
		
		// check as per boolean value
		if(ans == 'T' || ans == 't')
			System.out.println("Wrong Answer: Try Again");// if answer is T or t then it is Wrong Answer: Try Again 
		else if(ans == 'F' || ans == 'f')// if answer is F or f then it is Correct 
			System.out.println("Correct");
		else
			System.out.println("Wrong Answer: Try Again");// if none of the above is entered then it is Wrong Answer try again
	}// end of main method
}// end of main class