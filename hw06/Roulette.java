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
    int totalWins = 0;
    //times lost every thing in a 100 times betting system
    int lostEveryThing = 0;
    //times won some money in a 100 times betting system
    int wonInOneSystem = 0;
    
    //main method
    public static void main(String args[]){
        Roulette roulette = new Roulette();
        roulette.simulateRouletteSystem(20);
        System.out.println("*Number of times, the gambler lost every thing*: " + 
                roulette.lostEveryThing);
        System.out.println("*Total winnings of all simulation*: " +
                ((roulette.totalWins*36) - 100000));
        System.out.println("*Number of times, the gambler profited in a" + 
                " single 100 times system*: " + roulette.wonInOneSystem);
    }
    

    /**
     * This method simulates the roulette system 1000 times and calculate the desired results 
     */
    
    public void simulateRouletteSystem(int myNumber){
        
        //Wins in a sigle 100 times betting system
        int wins = 0;
        
        for(int index=0 ; index<1000 ; index++){
            wins = rouletteSystem(myNumber);
            if(wins == 0){
                lostEveryThing++;
            } 
            if(wins >= 3){
                wonInOneSystem++;
            }
            totalWins += wins;
        }
    }// end of main method
    
    //Method that uses the given method of playing roulette
     
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
}//end of class
