public class Enigma3{
  public static void main(String [] arg){
  int  n=40,k=60;
    String out="";
    System.out.println(k%14);
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;//60%14=4
          n/=3;
          System.out.println("k first"+k);
          k-=7;
          System.out.println("k"+k);
          System.out.println("n"+n);
    }
    System.out.println(n*k%12);
    if(n*k%12< 12){
      n-=20;
      System.out.println("n second"+n);
      out+=n;
    }
    System.out.println("n*n"+n*n);
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    System.out.println("n+k"+(n+k));
    System.out.println("k before switch"+k);
    System.out.println("n before switch"+n);
    switch(n+k){
        
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98://enter here 
        n/=5;//45/5=9
        k/=9;//5.9
      default://second round on switch 
        n-=3;//9-3=6
        k-=5;//5.9-5=0.9 k is int 
    }
    System.out.println("last n"+n);
    System.out.println("last k"+k);
     out+=1/n + 1/k;   //error!!!
    System.out.println(out);
  }
}

/*
 * Error report:
 * the combination of n=40 & k=60 produce a divide by zero problem because it is keep 
decreasing until k=0 but if we changed the k or n value the code will work right 
 * 
 * 
 * 
 */
