/////////////////////////////////////////////
//Taiji Zhou
//Date: 12/05/14
//Professor Brian Chen 
//Class CSE 002-112
//MatrixSorter Java Program
//The purpose is to write a program that returns a ragged 3D array, where the first slab has three rows, the second slab five rows, and the third slab seven rows. 
//The ragged 3D array should be initialized with random numbers in the range 1..99, inclusive. 
//
//The method show() should print out the array (all slabs). 
//The method findMin() should find the smallest entry in the array. 
//The method sort() should take as input a ragged 2D array. 
//
// Process
// Enter data to the program
//  compile the program
//      javac MatrixSorter.java
//  run the program
//      java MatrixSorter
//

//import scanner
import java.util.Random;

//public class
public class MatrixSorter{
	//main method
	public static void main(String args[]){
		int[][][] mat3d;
		mat3d = buildMat3d();
		show(mat3d);
		System.out.println("The smallest entry in the 3D matrix is "+findMin(mat3d));
		System.out.println("After sorting the 3rd matrix we get");
		sort(mat3d[2]);
		show(mat3d);
	}
	
	//builds and return a randomly populated 3D array			
	
	public static int[][][] buildMat3d(){
		int[][][] mat3d = new int[3][][];
		for(int s=0; s<mat3d.length;s++){
			mat3d[s] = new int[3+(2*s)][];
		}
		for(int s=0;s<mat3d.length;s++){
			for(int j=0;j<mat3d[s].length;j++){
				mat3d[s][j] = new int[s+j+1];
			}
		}
		
		//populating the array
		Random randomGenarator = new Random();
		for(int s=0;s<mat3d.length;s++){
			for(int j=0;j<mat3d[s].length;j++){
				for(int i=0;i<mat3d[s][j].length;i++){
					mat3d[s][j][i] = randomGenarator.nextInt(98)+1;
				}
			}
		}
		return mat3d;
	}
	
	//Prints the elements in a 3-D array.						
	
	public static void show(int[][][] mat3d){
		for(int s=0;s<mat3d.length;s++){
			System.out.println("---------------------Slab "+(s+1));
			for(int j=0;j<mat3d[s].length;j++){
				for(int i=0;i<mat3d[s][j].length;i++){
					System.out.print(mat3d[s][j][i]+" ");
				}
				System.out.println("\b");
			}
		}
		System.out.println("------------------------");
	}
	
	// Returns the minimum value in s 3D array		
	
	public static int findMin(int[][][] mat3d){
		int min = mat3d[0][0][0];
		for(int s=0;s<mat3d.length;s++){
			for(int j=0;j<mat3d[s].length;j++){
				for(int i=0;i<mat3d[s][j].length;i++){
					if(mat3d[s][j][i]<min){
						min=mat3d[s][j][i];
					}
				}
			}
		}
		return min;
	}
	
	public static void sort(int values[][]){
		for(int i=0;i<values.length;i++){
			selectionSort(values[i]);
		}
		
		//Sorting the rows using insertion sort
		
		int j;					// the number of items sorted so far
		int key;                // the item to be inserted
		int i; 

		for (j = 1; j < values.length; j++){    // Start with 1 
           key = values[j][0];
			for(i= j-1; (i >= 0) && (values[i][0] > key); i--){   // Smaller values are moving up
               int[] temp = values[i+1];
               values[i+1] = values[i];
               values[i] = temp;
			}
			values[i+1][0] = key;    // Put the key in its proper location	
		}
	}//end of method
	
	private static void selectionSort(int[] numArray){
		int temp;
		for(int i=0;i<numArray.length;i++){
			for(int j=i+1;j<numArray.length;j++){
				if(numArray[i]>numArray[j]){
					temp = numArray[i];
					numArray[i]=numArray[j];
					numArray[j]=temp;
				}
			}
		}
	}//end of method
	
}//end of main class
