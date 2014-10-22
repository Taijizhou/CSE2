/////////////////////////////////////////////
//Taiji Zhou
//Date: 10/21/14
//Professor Brian Chen 
//Class CSE 002-112
//NumberStack Java Program
//
//The purpose of this program is that prompts the user to enter a number 1-9 and then prints out image base on numbers
// Process
// Enter data to the program
//  compile the program
//      javac NumberStack.java
//  run the program
//      java NumberStack
//

//create scanner
import java.util.Scanner;
//define class
    public class NumberStack{
//main method
public static void main(String[] args){
    int x=0,y=0,z=0, k = 1;   
    int a=0,b=0,c=0;
    int m = 0;
    //open scanner
        Scanner in = new Scanner( System.in );
        //prompt user enter a number between 1 and 9
            System.out.print("Enter a number between 1 and 9- ");
        //check if there is next integer
        int num=in.nextInt();

        //for- loop
        System.out.println("Using for loops: ");//using for loops
            for(int i=1;i<=num;i++){
            for(int n=0;n<i;n++){
            for(int l=0;l<k;l++){
                System.out.print(i);
                
            }
                System.out.println(" ");
            }
            for(m=0;m<k;m++){
                System.out.print("-"); 
            }
                System.out.println(" ");
                k = k+2;
            }

        //printing with while - loop
                System.out.println("Using while loops: ");
                k = 1;
                m = 0;
             while(x<num){
                    x++;
            while(y<x){
                    y++;
            while(z<k){
                    z++;
                System.out.print(x);
            }
                z=0;
                System.out.println(" ");
            }
                m = 0;
            while(m<k){
                System.out.print("-"); 
                    m++;
            }
                System.out.println(" ");
                y=0;
                k+=2;
            }

            //do-while loop
                System.out.println("Using do-while loops: ");
                k = 1;
                m = 0;
            do{
                 a++;
            do{
                 b++;
            do{
                 c++; 
                System.out.print(a);
            }
        while(c<k);
                c=0;
                System.out.println(" ");
        }       
        while(b<a);
            m = 0;
        do{
                System.out.print("-"); 
                 m++;
          }       
        while(m<k);
                System.out.println(" ");
            b=0;
            k+=2;
        }   
        while(a<num);
}//end of main method
}//end of class

