*/
/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
    public class Enigma0{
        public static void main(String arg []){
    System.out.print("Enter an int- ");
    int N=0;
    Scanner scan=new Scanner(System.in);
     
    if(scan.hasNextInt()){
     int n=scan.nextInt();
      System.out.println("You entered "+n);
    N=n;
    }
    else{
    int n=4;
      System.out.println("You entered "+n);
      N=n;
    }
    
    int k=4,p=6,q=7,r=8;
           
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("Again, you entered "+N);
    }
  }
}

