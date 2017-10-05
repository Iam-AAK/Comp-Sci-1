/**
 *Arya Kulkarni
 *Unit 2 Lab 02
 *10/19/15
 */
 
 import java.util.Scanner;
 class OddSums {
 	public static void main(String [] args){
 		
 		// Start Value
 		System.out.println("Start: ");
		Scanner scanner = new Scanner(System.in);
 		int Start_Number = scanner.nextInt();
 		
 		// End Value
 		System.out.println("End:   ");
 		int End_Number = scanner.nextInt();
 		
 		System.out.println("\n");
 		int x , i;
 		 i = 0;
 		int sum = 0;
 		if( End_Number >= Start_Number ){
 			
 			for (x = Start_Number; x <= End_Number; x++) {
 	   	    if ((x%2) == 0){
 		  	// do nothing
 		  } else {
 		  	sum += x;
 		  	i++;
 		  }
 			}
 		double Average = (sum / i);
 		System.out.println("Sum:     " + sum);
 		System.out.println("Average: " + Average);
 	}
 	}
 }