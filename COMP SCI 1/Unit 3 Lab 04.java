/**
 *Arya Kulkarni
 *Checking Account
 *December 14, 2015
 */
 
 import java.util.Scanner;
 class CheckingAccount{
 	
 	// declare static var called balance
 	public static int balance;
 	
 	// main method
 	public static void main (String [] args){
 		
 	// set balance to $1,200
 	balance = 1200;
 	
 	// initiate scanner to read input from console
 	Scanner scanner = new Scanner(System.in);
 		
  	System.out.println("Balance: $1200");
 	System.out.println("Would you like to withdraw money, deposit money, or exit?"); 
 		System.out.println("*********************");
 		System.out.println("*     withdraw      *");
 		System.out.println("*      deposit      *");
 		System.out.println("*       exit        *");
 		System.out.println("*********************");
	System.out.println("\n");
 	String amount_totalString = ("");
	int amount = 0;
	
	// loop through options and process until user exits
	while(true){
		
		System.out.println("Option");
 		amount_totalString = scanner.next();
 		
		if(amount_totalString.equals("exit")){
			break;
		}else if(amount_totalString.equals("withdraw")){
			// *** W I T H D R A W ***
			System.out.printf("Amount: ");
			amount = scanner.nextInt();	
			withdraw(amount);
			System.out.println("Current: " + "$" + balance);
		}else if(amount_totalString.equals("deposit")){
			// *** D E P O S I T ***
		//	System.out.println("deposit");	
			System.out.printf("Amount: ");
			amount = scanner.nextInt();
			deposit(amount);
			System.out.println("Current: " + "$" + balance);
			
		}else {
			System.out.println("Invalid option.");
		}
		

		
	}	
 		// Final Amount
 		System.out.println("\n");
 		System.out.println("Final: " + "$" + balance);
 		
 	}// End Main
 	
 	// Method for Withdrawal
 	static void withdraw(int amount){
 		balance = (balance - amount);
 	}
 	// Method for Deposit
 	static void deposit(int amount){
 		balance = (balance + amount);
 	}
 	
 }