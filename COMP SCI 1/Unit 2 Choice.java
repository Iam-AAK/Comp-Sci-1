/**
 *Arya Kulkarni
 *November 15, 2015
 *Unit 2 Choice Lab
 */
 import java.util.Scanner;
 class DieSums{
 	public static void main(String [] args){
 		
 		System.out.println("Enter the # of times dice shall be rolled. You must enter a number between 1 and 100:");
		Scanner scanner = new Scanner(System.in);
	
		int i = scanner.nextInt();
		if (i >=1 && i<100) {
			// calculate average
			int j=1;
			int sum=0;
			int random_num;
			// loop to generate random number representing dice rolls
			while (j <= i) {
				random_num = (int) (Math.random()*5)+1;
				System.out.println("Roll # " + j + " is: " + random_num);
				sum += random_num;
				j++;
			}
			double average=0.0;
			average = (double)sum / (double)i;
			int average_for_printing = (int) Math.round(average);
			System.out.println("Average is: " + average_for_printing);
		}
		else {
			System.out.println("Input number must be between 1 and 100! Please try again.");
		}
 		
 	}
 }