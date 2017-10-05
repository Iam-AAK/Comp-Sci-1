/**
 *Arya Kulkarni
 *Student ID
 *November 24, 2015
 */
 
 import java.util.Scanner;
 class StudentID{
 	public static void main(String[] args){
 
 System.out.println("Please type your 6 digit ID number");
 	Scanner scanner = new Scanner(System.in);
 	int a = scanner.nextInt();
 	
 	if(a > 99999 && a < 1000000){
 		
 	// Code for the third integer
 	String Str = String.valueOf(a);
 	String b = Str.substring(3,4);
 	
    // System.out.println( "--" + b + "--" );
 	int num3 = a / 1000 %10;
 	// System.out.println( "--" + num3 + "--" );
 	if( num3 == 0 ){
 		System.out.println("From East Amwell");
 	}else if( num3 == 2 ){
 		System.out.println("From Delaware");	
 	}else if( num3 == 5 ){
 		System.out.println("From Flemington");
 	}else if( num3 == 7 ){
 		System.out.println("From Readington");	
 	}else {
 		System.out.println("Transfer");
 	}
 	
 	}else {
 		System.out.println(" Error: ID must be 6 digit number. Please try again. ");
 	}
 	
 	String c = Integer.toString( a ); 
 	c = c.substring(0,2);
 	// System.out.println( c + "----");
 	int GradYear = Integer.parseInt( c ) + 2000;
 	System.out.println( (GradYear - 2015) + " years until graduation");
 	System.out.println( "Year of Birth: ~" + (GradYear - 18) );

 }
 }