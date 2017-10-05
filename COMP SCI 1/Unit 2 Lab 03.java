/*
 *Arya Kulkarni
 *Factorials Lab
 *10/22/15
 */
 
 import java.util.Scanner;
 
 class FactorialsLab {
 	public static void main(String [] args){
 	   Scanner scanner = new Scanner(System.in);
 
 		// get N
 	   System.out.println("Value for N:");
	   int number = scanner.nextInt();
	   if (number > 0) {
	   		   // find n!
	   int factor = 1;
	   for (int i = 1; i <= number; i++){
      	 	factor = factor*i;
       }
    // Factorial
    System.out.println("N! = " + factor);
    
    System.out.println("\n");
    
    // R!
    
    System.out.println("Value for R: ");
    
    int r = scanner.nextInt();
    if (r < number && r!=0){
    	    int factor_r = 1;
    for (int i = 1; i <= (number-r); i++){
    	factor_r = factor_r*i;
    }
    System.out.println("R! = " + factor_r);
    
    // Permutation
   // int Permutation = factor / (number - r);
    //int Denominator = number - r;
    //for (int i = 1; i <= ; i++){
   // 	Denominator = Denominator*i;
    //}
   
	System.out.println("\n");   
   
	System.out.println("Permutations: ");   
    int Permutation = factor / factor_r;
    System.out.println(Permutation);
    } else {
    	System.out.println("Cannot compute permutations. R must be smaller than N and cannot be zero.");
    }

	   } else {
	   	System.out.println("N must be greater than zero.");
	   }

}
}