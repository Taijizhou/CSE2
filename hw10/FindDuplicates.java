/////////////////////////////////////////////
//Taiji Zhou
//Date: 11/17/14
//Professor Brian Chen 
//Class CSE 002-112
//FindDuplicates Java Program
//The purpose of this program is to be able to process information from a scanner using different methods
//
// Process
// Enter data to the program
//  compile the program
//      javac FindDuplicates.java
//  run the program
//      java FindDuplicates
//

//open scanner 
import java.util.Scanner;
//define class
public class FindDuplicates{
	//main method
	public static void main(String [] arg){
		Scanner scan=new Scanner(System.in);
		int num[]=new int[10];
		String answer="";
		do{
			System.out.print("Enter 10 ints- ");//Enter 10 ints-
			for(int j=0;j<10;j++){
				num[j]=scan.nextInt();//find if scanner has next 
			}
			String out="The array ";
			out+=listArray(num); //return a string of the form "{2, 3, -9}" 
			if(hasDups(num)){
				out+="has ";
			}
			else{
				out+="does not have ";// print if it does not have 
			}
			out+="duplicates.";
			System.out.println(out);//prints out
			out="The array ";
			out+=listArray(num);
			if(exactlyOneDup(num)){
				out+="has ";
			}
			else{
				out+="does not have ";
			}
			out+="exactly one duplicate.";
			System.out.println(out);
			System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");// Go again?
			answer=scan.next();
		}while(answer.equals("Y") || answer.equals("y"));
	}
	
	//Converts a given array into a string of format {2,3,4}
	 
	public static String listArray(int num[]){
		String out="{";
		for(int j=0;j<num.length;j++){
			if(j>0){
				out+=", ";
			}
			out+=num[j];
		}
		out+="} ";
		return out;
	}

	// Check whether a given array has duplicates and return true 
	// if there are one or more duplicates.						  
	
	public static boolean hasDups(int[] nums){
		boolean hasDups = false;
		for(int i=0; i<nums.length-1;i++){
			int key = nums[i];
			for(int j=i+1;j<nums.length;j++){
				if(key == nums[j]){ //see whether there are duplicates
					hasDups = true;
				}
			}
		}
		return hasDups;
	}
	
	// Check whether a given array has exacly one duplicate.
	
	public static boolean exactlyOneDup(int[] nums){
		int dupCount=0;
		for(int i=0; i<nums.length-1;i++){
			int key = nums[i];
			for(int j=i+1;j<nums.length;j++){
				if(key == nums[j]){ //see whether there are duplicates
					dupCount++; //count number of duplicates
				}
			}
		}
		return dupCount == 1; //return true only there is one duplicate
	}

}
