/**
 *Arya Kulkarni
 *Binary to Character Method
 */
 
 // Goal: to convert Binary into characters
 
 
 import java.util.Scanner;
 class Binary_Character{
 	public static void main(String [] args){
 		
 	System.out.println("Enter Binary Code: ");
 	Scanner sc = new Scanner(System.in);
	
	int r = sc.nextInt();
	int w = sc.nextInt();
	int x = sc.nextInt();
	
	
	
	if(r == 1 && w == 1 && x == 1){
		System.out.println("r w x");
	}
	 
	if(r == 1 && w == 1 && x == 0){
		System.out.println("r w -");
	}
	
	
	if(r == 1 && w == 0 && x == 1){
		System.out.println("r - x");
	}
	
	
	if(r == 0 && w == 1 && x == 1){
		System.out.println("- w x");
	}
	
	
	if(r == 0 && w == 1 && x == 0){
		System.out.println("- w -");
	}
	
	if(r == 1 && w == 0 && x == 0){
		System.out.println("r - -");
	}
	
	
	if(r == 0 && w == 0 && x == 1){
		System.out.println("- - x");
	}
	
	if(r == 0 && w == 0 && x == 0){
		System.out.println("- - -");
	}
	
	
	
			
}
}