/////////////////////////////////////////////
//Taiji Zhou
//Date: 9/30/14
//Professor Brian Chen 
//Class CSE 002-112
//BurgerKing Java Program
//The purpose of this program is to prompt choices from an order at Burger King. From choices of a burger, a soda or fries and then details about what kind of soda and the fixins.
//
// Process
// Enter data to the program
//  compile the program
//      javac BurgerKing.java
//  run the program
//      java BurgerKing
//


import java.util.Scanner; // import scanner class
//define class
public class BurgerKing {
	//main method 
	public static void main(String[] args) {
	    
		String mainChoice,subChoice; // to store user main choice and sub choice
		Scanner s = new Scanner(System.in); // Create Object of class scanner
		
		// Ask user for main choice
		System.out.println("Enter a letter to indicate a choice of");// Enter a choice 
		System.out.println("Burger (B or b)");// B or b are for Burger
		System.out.println("Soda (S or s)");// S or s are for Soda
		System.out.print("Fries (F or f): ");// F or f are for fries
		mainChoice = s.next(); // store main choice
		// check as per the user answer
		if(mainChoice.charAt(0) == 'B' || mainChoice.charAt(0) == 'b' && mainChoice.length() == 1){
			// ask for sub choice
		
			System.out.println("Enter A or a for \"all the fixins\" ");// A or a for all fixins
			System.out.println("C or c for cheese");//C or c for cheese
			System.out.print("N or n for none of the above: ");// N or n for no fixins
			subChoice = s.next(); // store sub choice
			// check as per the user answer
			if(subChoice.charAt(0) == 'A' || subChoice.charAt(0) == 'a'){// A or a for a burger with all fixins
				
				System.out.println("You ordered a burger with \"all the fixins\" ");
			}
			else if(subChoice.charAt(0) == 'C' || subChoice.charAt(0) == 'c'){// C or c for a burger with cheese
				
				System.out.println("You ordered a burger with cheese");// You ordered a burger with cheese
			}
			else if(subChoice.charAt(0) == 'N' || subChoice.charAt(0) == 'n'){// N or n for a  burger with a nothing just burger
			
				System.out.println("You ordered a burger");// you ordered a burger
			}
			else{
			
				if(mainChoice.length() > 1){
					
					System.out.println("a single character expected");// a single character expected
				}
				else{
					System.out.println("You did not enter any of A, a, C, c, N, or n");
				}// you did not enter any of A,a,C,c,N or n
			}
		}
		else if(mainChoice.charAt(0) == 'S' || mainChoice.charAt(0) == 's' && mainChoice.length() == 1){
			
			System.out.println("Do you want Pepsi (p or P), "); // Ask if the customer wants beverage
			System.out.print("Coke (c or C), Sprite (s or S) or Mountain Dew (M or m) - ");
			subChoice = s.next();
			if(subChoice.charAt(0) == 'P' || subChoice.charAt(0) == 'p')// P or p for pepsi
			{
				System.out.println("You ordered a Pepsi");// You ordered a Pepsi
			}
			else if(subChoice.charAt(0) == 'C' || subChoice.charAt(0) == 'c')// C or c for Coke
			{
				System.out.println("You ordered a Coke");// You ordered a Coke
			}
			else if(subChoice.charAt(0) == 'S' || subChoice.charAt(0) == 's')// S or s for Sprite
			{
				System.out.println("You ordered a Sprite");// You ordered a Sprite
			}
			else if(subChoice.charAt(0) == 'M' || subChoice.charAt(0) == 'm')// M or m for Mountain Dew
			{
				System.out.println("You ordered a Mountain Dew");// You ordered a Mountain Dew
			}
			else
			{
				if(mainChoice.length() > 1)
				{
					System.out.println("a single character expected");// if more than one character is entered
				}
				else
				{
					System.out.println("You did not enter any of P, p, C, c, S, s, M, or m");
				}// if non of the characters above is entered  P, p, C, c, S, s, M, or m
			}//end of else
			
		}
		else if(mainChoice.charAt(0) == 'F' || mainChoice.charAt(0) == 'f' && mainChoice.length() == 1)
		{
			System.out.println("Do you want a large or small order of fries (l,L,s, or S) - ");// Ask if you want an order of large or small order of fries
			subChoice = s.next();
			if(subChoice.charAt(0) == 'L' || subChoice.charAt(0) == 'l')
			{
				System.out.println("You ordered large fries");// L or l for a large fries
			}
			else if(subChoice.charAt(0) == 'S' || subChoice.charAt(0) == 's')// S or s for a small fries
			{
				System.out.println("You ordered small fries");// You ordered small fries
			}
			else
			{
				if(mainChoice.length() > 1)
				{
					System.out.println("a single character expected");// if more than one character is entered
				}
				else
				{
					System.out.println("You did not enter any of L, l, S, or s");// if non of the characters above is entered L, l, S, or s
				}
			}
		}
		else
		{
			if(mainChoice.length() > 1)
			{
				System.out.println("a single character expected");// enter only one single character
			}
			else
			{
				System.out.println("You did not enter any of B, b, S, s, F, or f");
			}// if the character entered is not any from  B, b, S, s, F, or f 
		}
	}// end of main method
}// end of main class