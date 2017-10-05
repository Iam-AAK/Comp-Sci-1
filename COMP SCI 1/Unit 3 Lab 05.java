/**
 *Arya Kulkarni
 *December 10, 2015
 *Unit 3 Lab 05
 */
 
 import java.util.Scanner;
 class QuadrticEquation{
 	public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
 	
 	System.out.printf("A: ");   
    int a = sc.nextInt();
    
    int b;
    int c;
        
    // loop
    if (a > 0){
 		// System.out.println(a);
 		System.out.printf("B: ");
 		b = sc.nextInt();
 		
 		System.out.printf("C: ");	
 		c = sc.nextInt();
	
 	double root1;
 	double root2;
    
    
 		
 		if (root1 == root2){
 			System.out.println("1 solution");
 			System.out.println(root1);
 		}else {
 			System.out.println("2 solutions");
 			System.out.println(root1 + " " + "&" + " " + root2);
 		}	
 		
    }else {
    	System.out.println("Error: A must be greater than 0.");
    }	
 	
 }
 
 static void root1(a,b,c){
 	double root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
 }
 
 static void root2(a,b,c){
 	double root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
 }
 }