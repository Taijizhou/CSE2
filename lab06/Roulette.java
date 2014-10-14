/////////////////////////////////////////////
//Taiji Zhou
//Date: 10/13/14
//Professor Brian Chen 
//Class CSE 002-112
//Root Java Program
//
/*The purpose of this program is to simulate the given 100 times roulette system 1000 times,
calculates results and prints the results to console is to calculate square root of a given 
double which is greater than 0
*/
// Process
// Enter data to the program
//  compile the program
//      javac Roulette.java
//  run the program
//      java Roulette

//define class
public class Roulette {
     
    //Total wins in 1000 times simulation 
    private int totalWins = 0;
    // times lose every thing in a 100 times betting system
    private int loseEveryThing = 0;
    // times won some money in a 100 times betting system
    private int wonInOneSystem = 0;
    //main method
    
    // main method
    public static void main(String args[]){
        
        Roulette roulette = new Roulette();
        roulette.simulateRouletteSystem(20);
        
        System.out.println("*Number of times, the gambler lose everything*: " + 
                roulette.loseEveryThing);
        System.out.println("*Total winnings of all simulation*: " +
                ((roulette.totalWins*36) - 100000));
        System.out.println("*Number of times, the gambler profited in a" + 
                " single 100 times system*: " + roulette.wonInOneSystem);
    }// end of main method 
    
    
    public void simulateRouletteSystem(int myNumber){
        
        //Wins in a sigle 100 times betting system
        int wins = 0;
        
        for(int index=0 ; index<1000 ; index++){
            wins = rouletteSystem(myNumber);
            if(wins == 0){
                loseEveryThing++;
            } 
            if(wins >= 3){
                wonInOneSystem++;
            }
            totalWins += wins;
        }
    }
    
    public int rouletteSystem(int myNumber){
        int random = 0; 
        int wins = 0;
        
        for(int index=0 ; index<99 ; index++){
            random = (int)(Math.random() * 38 + 1);
            if(myNumber == random){
                wins++;
            }
        }
        return wins; 
    }
}// end of class