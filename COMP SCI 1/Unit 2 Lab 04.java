/**
 *Unit 2 Lab 04
 *Arya Kulkarni
 *10/23/15
 */
 import java.util.Scanner;
 class Unit4Lab02{
 	public static void main(String [] args){
 		
 		System.out.println("*** This program calculates factors of a number ****");
 		System.out.println("Please enter any #: ");
 		Scanner scanner = new Scanner(System.in);
 		int input_number = scanner.nextInt();
 		if (input_number < 0) {
 			System.out.println("Please enter a positive integer!");
 		} else
 		{
 			int i = 1;
	 		int remainder = 0;
	 		String output_msg = "Factors: ";
	 		boolean is_prime = true; 
	 		while ( i <= input_number){
	 			remainder = input_number % i;
	 			if (remainder == 0) {
	 				
	 				// set prime flag
	 				if( i == 1 || i == input_number ) {
	 					// do nothing
	 				} else {
	 					is_prime = false;
	 				}
	 				
	 				// write factors to output msg
	 				if (i < input_number) {
	 					output_msg = output_msg + i + ", ";
	 				} else {
	 					output_msg = output_msg + i;	
	 				}
	 				
	 			}
	 			i++;
	 		}
	 		System.out.println(output_msg);
	 		if ( is_prime ){
	 			System.out.println( input_number + " is a prime number. ");
	 		}
 		}
 		
 	
 		
 	}
 }