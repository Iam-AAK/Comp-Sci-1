/**
 *Arya Kulkarni
 *Test Scores
 *November 10, 2015
 */
 
 import java.util.Scanner;
 class Unit02Lab9{
 	public static void main(String[] args){
 		
 		Scanner scanner = new Scanner(System.in);
 		
 		// Scores
 		System.out.println("Type Scores (%) :");
 		
 		int Scores;
 		int i = 0;
 		int tests=0;
 		int total=0;
 		double average=0;
 		boolean print_flag = true;
 		
 		while(i <= 100){	
 		Scores = scanner.nextInt();	
 			 if(Scores < 0 || Scores > 100){
 			 	System.out.println("Scores are not between 0 and 100. Try Again.");
 			 	print_flag = false;
 			 	break;
 			 }
 			 if( Scores == (-1)){
 			 	System.out.println("\n");
 			 	break;
 			 }
 			 tests++;
 			 total += Scores;
 		 	
 		}
 		
 		if(print_flag){
 		average = (double) total / (double) tests;
 		System.out.println("Tests: " + tests);
 		System.out.println("Total: " + total);
 		System.out.println("Average: " + average);
 		}
 	
 		
 					
	}	
 }