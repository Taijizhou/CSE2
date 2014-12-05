/////////////////////////////////////////////
//Taiji Zhou
//Date: 12/05/14
//Professor Brian Chen 
//Class CSE 002-112
//PokerHands Java Program
//The purpose of this program is to prompt the user to enter a five card poker hand, prints out the hand, and then prints out the rank of the hand. 
//
// Process
// Enter data to the program
//  compile the program
//      javac PokerHands.java
//  run the program
//      java PokerHands
//

//import scanner
import java.util.Scanner;
//main class
	public class PokerHands{
		static int hand[];
		static String[] cards = {"A","K","Q","J","10","9","8","7","6","5","4","3","2"}; //array to keep track of rank of cards
		static int[] suite_freq;
		static int[] rank_occurences;
//main method
	public static void main(String args[]){
		hand = new int[5]; // array to store the entered hand
	
		int suite =0,card=0;
		String suite_s,card_s; //track the suite and the card enterd by the user
		Scanner input = new Scanner(System.in);
		boolean isRunning = true;
		
		while(isRunning){
			suite_freq = new int[4];
			rank_occurences = new int[13];
			
			for(int i=0;i<5;i++){
				System.out.print("Enter the suite : 'c', 'd', 'h' or 's' -");
				
				boolean isSuiteOK = false;
				
				//Force the user to enter a valid suite
				//Convert the enterd string value to the corresponding integer that represents the suite
				while(!isSuiteOK){
					suite_s = input.next();
					switch(suite_s){
						case "c" : 	{
										suite = 0;
										isSuiteOK = true;
									}
						break;
						case "d" : 	{
										suite = 13;
										isSuiteOK = true;
									}
						break;
						case "h" : 	{
										suite = 26;
										isSuiteOK = true;
									}
						break;
						case "s" : 	{
										suite = 39;
										isSuiteOK = true;
									}
						break;
						default : 	{
										System.out.println("You did not enter a valid response");
										System.out.print("Enter the suite : 'c', 'd', 'h' or 's' -");
									}
					}
					if(isSuiteOK){
						suite_freq[suite/13]+=1; //keep the frequency of suites entered
					}		
				}
				
				//Allow the user to input the card rank
				System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'-");
				boolean isCardOK = false;
				
				//Force the user to enter a valid rank
				//Convert the entered string to the relevant integer representing the card
				while(!isCardOK){
					isCardOK = true;
					card_s = input.next();
					switch(card_s){
						case "a" : card = 0; 
						break;
						case "A" : card = 0; 
						break;
						case "k" : card = 1; 
						break;
						case "K" : card = 1; 
						break;
						case "q" : card = 2; 
						break;
						case "Q" : card = 2; 
						break;
						case "j" : card = 3; 
						break;
						case "J" : card = 3; 
						break;
						case "10" : card = 4; 
						break;
						case "9" : card = 5; 
						break;
						case "8" : card = 6; 
						break;
						case "7" : card = 7; 
						break;
						case "6" : card = 8; 
						break;
						case "5" : card = 9; 
						break;
						case "4" : card = 10; 
						break;
						case "3" : card = 11; 
						break;
						case "2" : card = 12;
						break;
						default : 	{
										isCardOK = false;
										System.out.println("There is no such card.");
										System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'-");
									}
					}
					
					//Check whether the user has already entered the card
					boolean isDuplicate = false;
					for(int j=0;j<i;j++){
						if((suite+card) == hand[j]){
							isDuplicate = true;
						}
					}
					//If not duplicated enter the card to the hand
					if(!isDuplicate){
						hand[i] = suite+card;
						rank_occurences[(suite+card)%13]+=1; //record the frequency of the rank of the cards enterd
					}else{
						System.out.println("You already entered that card");
						i--;
					}
				}
				
			}
			System.out.println();
			showOneHand(hand); // print the entered hand
			System.out.println();
			printHandRank(); //  print the rank of the hand
			
			//Allows the user to quit or continue
			System.out.print("Enter 'y' or 'Y' to enter a(nother) hand-");
			String response = input.next();
			isRunning = (response.equals("y") || response.equals("Y"));
		}
				
	}
	
	public static void showOneHand(int hand[]){
		String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ","Spades:   "};
		String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
		String out="";
		for(int s=0;s<4;s++){
			out+=suit[s];
			for(int rank=0;rank<13;rank++)
				for(int card=0;card<5;card++)
					if(hand[card]/13==s && hand[card]%13==rank)
										out+=face[rank];
			out+='\n';
		}
		System.out.println(out);
	}
	

	public static void printHandRank(){
		for(int a : suite_freq){
			System.out.print(a+",");
		}
		System.out.println();
		for(int a : rank_occurences){
			System.out.print(a+",");
		}
		System.out.println();
		String out;
		if(sumOfArray(suite_freq)==5 && getNumberOfValues(suite_freq,0)==3){
			out = "Flush";
			if(getNumberOfValues(rank_occurences,0)==8 && countSuccessive(rank_occurences,1)==5){
				if(hand[0]%13==0){
					out = "Royal "+out;
				}else{
					out = "Straight "+out;
				}
			}
		}else{
			if(getNumberOfValues(rank_occurences,0)==11 && getNumberOfValues(rank_occurences,4)==1){
				out = "Four of a Kind";
			}else if(getNumberOfValues(rank_occurences,0)==11 && getNumberOfValues(rank_occurences,2)==1){
				out = "Full House";
			}else if(getNumberOfValues(rank_occurences,0)==8 && countSuccessive(rank_occurences,1)==5){
				out = "Straight";
			}else if(getNumberOfValues(rank_occurences,2)==2){
				out = "Two Pair";
			}else if(getNumberOfValues(rank_occurences,2)==1){
				out = "One Pair";
			}else{
				out = "High Card";
			}
		}
		System.out.println("This is a "+out);
	}
	
	
	public static int sumOfArray(int array[]){
		int total=0;
		for(int i=0;i<array.length;i++){
			total+=array[i];
		}
		return total;
	}
	
	//Return the number of occurences of the 'value' in the given array 

	public static int getNumberOfValues(int[] array,int value){
		int count=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==value){
				count++;
			}
		}
		return count;
	}
	
	//Calculate and return the maximum no. of successive occurences of the key with in the given array.													
	 
	public static int countSuccessive(int[] values, int key){
		int tempCount=0;
		int maxCount=0;
		
		for(int i=0;i<values.length;i++){
			if(values[i]==key){
				tempCount++;
				if(tempCount>maxCount){
					maxCount=tempCount;
				}
			}else{
				tempCount=0;
			}
		}
		return maxCount;
	}
}//end of main class
