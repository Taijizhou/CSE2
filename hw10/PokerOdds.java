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



import java.util.Random;
//open scanner 
import java.util.Scanner;

public class PokerOdds{

	static int[] deck = new int[52]; //deck of cards
	static String[] cards = {"A","K","Q","J","10","9","8","7","6","5","4","3","2"}; //array to keep track of rank of cards
	static Random random;
	
	//main method
	public static void main(String [] arg){
		random = new Random();

		showHands();
		simulateOdds();
	}
	
	public static int[] generateHand(){
		int[] hand = {-1,-1,-1,-1,-1};
		//populate the deck
		for(int i=0; i<52; i++){
			deck[i]=i;
		}
		int card;
		int deckSize = 52;
		for(int i=0;i<hand.length;i++){
			card = random.nextInt(deckSize); //generating random int for the card
			
			//inserting a card from the deck to the hand
			//reduces deck size by 1
			hand[i] = deck[card];
			deck[card] = deck[deckSize-1];
			deck[deckSize-1]=-1;
			deckSize--;
		}
		
		return hand;
	}
	
	//Generates a random hand of cards and display it 
	public static void showHands(){
		boolean isYes = true;
		while(isYes){
			int[] hand = generateHand(); //generate a random hand
			String[] output = {"Clubs	: ","Diamonds: ","Hearts	: ","Spades	: "};
			for(int i=0;i<hand.length;i++){
				int suite = hand[i]/13;
				int rank = hand[i]%13;
				output[suite]+=cards[rank]+" ";
			}
			for(String line : output){
				System.out.println(line);
			}
			Scanner input = new Scanner(System.in);
			System.out.print("\nGo again (Enter \'y\' or \'Y\' anything else to quit : ");
			String response = input.next();
			isYes = (response.equals("y") || response.equals("Y"));
		}
	}
	
	public static void simulateOdds(){
		int[] pairCounts = new int[13];
		int notOnePair = 0;
		for(int i=0;i<10000;i++){
			int[] hand = generateHand();
			for(int l=0;l<hand.length;l++){
				hand[l]=hand[l]%13;
			} 
			if(FindDuplicates.exactlyOneDup(hand)){
				for(int j=0;j<cards.length;j++){
					int count=0;
					for(int k=0;k<hand.length;k++){
						if(cards[j].equals(cards[hand[k]])){
							count++;
						}
					}
					if(count==2){
						pairCounts[j]+=1;
					}
				}
			}else{
				notOnePair++;
			}
		}
		System.out.println("Rank	Freq. of exactly one pair");
		for(int i=0;i<cards.length;i++){
			System.out.println(cards[i]+"\t"+pairCounts[i]);
		}
		System.out.println("Total not one pair : "+notOnePair);
	}			
}
