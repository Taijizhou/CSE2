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

import java.util.Random;//Import Random
import java.util.Scanner; // Import Scanner Class
//define class
public class BoolaBoola 
{
	//main method
	public static void main(String[] args) 
	{
		Random r = new Random();
		boolean b1,b2,b3; // 3 diff boolean variable with random value
		char ans; // to store user choice
		b1 = r.nextBoolean();
		b2 = r.nextBoolean();
		b3 = r.nextBoolean();
		int n1 = r.nextInt(2);
		int n2 = r.nextInt(2);
		Scanner s = new Scanner(System.in); // to take input from user
		
		System.out.println("boolean b1 = "+b1); // Print value of b1
		System.out.println("boolean b2 = "+b2); // Print value of b2
		System.out.println("boolean b3 = "+b3); // Print value of b3
		
		if(n1 == 1 && n2 == 1)
		{
			System.out.print("Does b1 && b2 && b3 have the value true(t/T) or false(f/F) - ");
			ans = s.next().charAt(0); // Store single character in ans
			
			// check as per boolean value
			if(b1 && b2 && b3)
			{
				if(ans == 'T' || ans == 't')// if it is T or t
					System.out.println("Correct");
				else
					System.out.println("Wrong Answer: Try Again");// if it is not T or t then it is Wrong Answer
			}
			
			else
			{
				if(ans == 'F' || ans == 'f')
					System.out.println("Correct");// if it is F or f
				else
					System.out.println("Wrong Answer: Try Again");// if it is not F or f then it is Wrong Answer
			}
		}
		
		if(n1 == 1 && n2 == 0)
		{
			System.out.print("Does b1 && b2 || b3 have the value true(t/T) or false(f/F) - ");
			ans = s.next().charAt(0); // Store single character in ans
			
			// check as per boolean value
			if(b1 && b2 || b3)
			{
				if(ans == 'T' || ans == 't')
					System.out.println("Correct");// if it is T or t
				else
					System.out.println("Wrong Answer: Try Again");//// if it is not T or t then it is Wrong Answer
			}
			
			else
			{
				if(ans == 'F' || ans == 'f')
					System.out.println("Correct");// if it is F or f
				else
					System.out.println("Wrong Answer: Try Again");// if it is not F or f then it is Wrong Answer 
			}
		}
		
		if(n1 == 0 && n2 == 1)
		{
			System.out.print("Does b1 || b2 && b3 have the value true(t/T) or false(f/F) - ");
			ans = s.next().charAt(0); // Store single character in ans
			
			// check as per boolean value
			if(b1 || b2 && b3)
			{
				if(ans == 'T' || ans == 't')
					System.out.println("Correct");// if it is T or t
				else
					System.out.println("Wrong Answer: Try Again");// if it is not T or t then it is Wrong Answer
			}
			
			else
			{
				if(ans == 'F' || ans == 'f')
					System.out.println("Correct");//if it is F or f 
				else
					System.out.println("Wrong Answer: Try Again");// if it is not F or f then it is Wrong Answer
			}
		}
		
		if(n1 == 0 && n2 == 0)
		{
			System.out.print("Does b1 || b2 || b3 have the value true(t/T) or false(f/F) - ");
			ans = s.next().charAt(0); // Store single character in ans
			
			// check as per boolean value
			if(b1 || b2 || b3)
			{
				if(ans == 'T' || ans == 't')
					System.out.println("Correct");// if it is T or t 
				else
					System.out.println("Wrong Answer: Try Again");// else if it is not T or t then Wrong Answer
			}
			
			else
			{
				if(ans == 'F' || ans == 'f')// if it is F or f
					System.out.println("Correct");// it is correct
				else
					System.out.println("Wrong Answer: Try Again");
			}// else if it is not F or f then Wrong Answer
		}
	}// end of main method 
}// end of class