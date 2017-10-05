/**
 *Arya Kulkarni
 *Unit 2 Lab 02
 *10/19/15
 */
 
 class OddSums {
 	public static void main(String [] args){
 		
 		int x;
 		int sum = 0;
 		for (x = 0; x <= 50; x++) {
 		  if ((x%2) == 0){
 		  	// do nothing
 		  } else {
 		  	sum += x;
 		  }
 			}
 	System.out.println("Sum: " + sum);
 	}
 }