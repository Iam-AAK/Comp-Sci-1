/**
 *Arya Kulkarni
 *November 9, 2015
 *Unit 2 Lab 08
 */
 
 import java.util.Scanner;
 class MathSequence{
 	public static void main(String [] args){
 	
 	System.out.println("Number: ");
 	Scanner scanner = new Scanner(System.in);
 	
 	int num = scanner.nextInt();
 	int i = 0;
 	int sum = num;
 	System.out.printf("Pattern: " + num);
 	while (num != 1) {
 		i++;
 		if (num % 2 == 0) {
 			
 			// even number
 			num = num / 2;

 		} else {
 			// odd number
 			num = 3 * num + 1;
 			
 		}
 		System.out.printf(", " + num);
 		sum += num;
 	}
 	System.out.println("\n");
 	System.out.println("Terms: " + i); 	
 	System.out.println("Sum:   " + sum);		 		
 	}
 }