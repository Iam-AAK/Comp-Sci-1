/**
 *Arya Kulkarni
 *October 19, 2015
 *Unit 2 Lab 01
 */
 
 import java.util.Scanner;
 class Unit2Lab01{
 	public static void main (String [] args){
 		
 		// Start Value
 		System.out.println("Start: ");
		Scanner scanner = new Scanner(System.in);
 		int Start_Number = scanner.nextInt();
 		
 		// End Value
 		System.out.println("End:   ");
 		int End_Number = scanner.nextInt();
 		
 		System.out.println("\n");
 		
 		if( End_Number >= Start_Number ){
 			System.out.println(" X 		X Squared		X Cubed");
 			int x = Start_Number;
 			while (x <= End_Number){
 				System.out.println(x + "			" + (x*x) + "		" + (x*x*x));
 				x++;
 			}
 				x = Start_Number;
 				int remainder;
 				
 				System.out.println("\n");
 				
 				System.out.println(" Multiples of 3 ");
 				
 				System.out.println(" X 		X Squared		X Cubed");
 				
 				while (x <= End_Number){
 				remainder = x%3;
 				if ( remainder == 0 ){
 				System.out.println(x + "			" + (x*x) + "		" + (x*x*x));
 				}
 			
 				x++;
 			}
 		} else {
 			
 			System.out.println(" End Number must be greater than Start Number");
 		}
 		
 		
 		
}
}