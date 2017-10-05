/**
 *Arya Kulkarni
 *November 20th, 2015
 *Unit 2 Test
 */
 
 import java.util.Scanner;
 class Unit2Test{
 	public static void main(String [] args){
 	
 	
 	
 		// Ticket Costs
 		System.out.println("******************************");
 		System.out.println("* Child Tickets:          $3 *");
 		System.out.println("* Student Tickets:        $5 *");
 		System.out.println("* Senior Citizen Tickets: $6 *");
 		System.out.println("* Adult Tickets:          $7 *");
 		System.out.println("******************************");
 		System.out.println("Please type the price of the ticket you wish to purchase.");
 		System.out.println("\n");
 			
 		
 	int i = 1;		 
	while(i <= 500){
		
		// Allow user to choose the ticket
 		Scanner scanner = new Scanner(System.in);
 		int Price_Ticket = scanner.nextInt();
 		int Total_Price = i;
 
			switch(Price_Ticket) {
    		case 3:
      		  System.out.println("Thank you for purchasing this ticket. Your total is $3.");
      		  break;
   			case 5:
     		  System.out.println("Thank you for purchasing this ticket. Your total is $5.");
        	  break;
        	case 6:
        	  System.out.println("Thank you for purchasing this ticket. Your total is $6.");
        	  break;
        	case 7: 
        	  System.out.println("Thank you for purchasing this ticket. Your total is $7.");
        	  break;      	  
}


	if( Price_Ticket == 3 ){	
 			Total_Price = 3;
 			break; 
 		}else if( Price_Ticket == 5 ){	
 			Total_Price = 5; 
 				break;
 		}else if( Price_Ticket == 6 ){	
 			Total_Price = 6; 
 				break;
 		}else if( Price_Ticket == 7 ){	
 			Total_Price = 7; 
 				break;
 		}
	// Total Price
 	System.out.println("Total Price:" + Total_Price);
 	}
 
 	
 		
 	System.out.println("\n");
 	
 	}
 }