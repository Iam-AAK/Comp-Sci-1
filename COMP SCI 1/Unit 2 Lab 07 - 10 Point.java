/**
 *Arya Kulkarni
 *Unit 2 Lab 07
 *November 4, 2015
 */
 
 import java.text.DecimalFormat;
 import java.util.Scanner;
 class Interest{
 	public static void main(String [] args){
 		
 		String pattern = "###,###.##";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
 		
 		
 		
 		// Deposit	
 		System.out.println("Type in Deposit Value: ");
 		Scanner scanner = new Scanner(System.in);
 		double Deposit = scanner.nextDouble();
 		String format = decimalFormat.format(Deposit);
 		System.out.println("Deposit: " + "$" + format);
 		format = "";
 		
 		System.out.println("\n");
 		
 		// Interest Rate
		System.out.println("Type in Interest Rate: ");
 		double Interest_Rate = scanner.nextDouble();
 		format = decimalFormat.format(Interest_Rate);
 		System.out.println("Interest rate: " + (format) + "%");
 		format = "";
 		
 		System.out.println("\n");
 		
 		// Target Value
 		System.out.println("Type in Target Value: ");
 		double Target_Value = scanner.nextDouble();
 		format = decimalFormat.format(Target_Value);
 		System.out.println("Target Value: " + "$" + format);
 		format = "";
 		
 			if(Target_Value > Deposit){
 					// Years to target
 			int year = 0;
 			while (Deposit < Target_Value) {	
				Deposit = Deposit + (Deposit * (Interest_Rate / 100));
				year++;
			}
			System.out.println("\n");
 			System.out.println("Years to target: " + year);
 			}else {
 				System.out.println("\n");
 				System.out.println("Target Value must be less than Deposit. Please try again.");
 			}
 	
		
		
 	}
 }