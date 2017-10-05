/**
 *Arya Kulkarni
 *Unit 2 Lab 07
 *November 4, 2015
 */
 class Interest{
 	public static void main(String [] args){
 		
 		// Deposit
 		double Deposit = 2500.00;
 		System.out.println("Deposit: " + "$" + Deposit);
 		
 		// Interest Rate
 		double Interest_Rate = .075;
 		System.out.println("Interest rate: " + (Interest_Rate*100) + "%");
 		
 		// Target Value
 		double Target_Value = 5000.00;
 		System.out.println("Target Value: " + "$" + Target_Value);
 		
 		// Years to target
 		int year = 0;
 		for (int i = 1; i <= 10; i++) {
				
				Deposit = Deposit + (Deposit * Interest_Rate);
				if (Deposit >= Target_Value){
				
					year = i;
					
				}
			}
		System.out.println("Years to target: " + year);
		
 	}
 }