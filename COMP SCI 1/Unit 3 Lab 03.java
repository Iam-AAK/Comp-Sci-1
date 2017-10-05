/**
 *Arya Kulkarni
 *December 4, 2015
 *Names
 */
 
import java.util.Scanner;
 class Names{
 	public static void main(String [] args){

	Scanner scanner = new Scanner(System.in); 
	String fullname, firstname;
	int space;
	System.out.println("Enter a name: ");
 	while (true){
	
	fullname = scanner.nextLine();
	
	if(fullname.equals("")){
		break;
	}

	// System.out.println(fullname);
 	space = fullname.indexOf(' ');
 	firstname = fullname.substring(0,space);
 	// System.out.println(firstname);
 	// System.out.println(space);
 	
 	// Switch statements
 	
     switch(firstname){
 		case ("Amy"):
 			System.out.println("Name:  Mrs." + fullname.toUpperCase());
 			break;	
 		case ("Buffy"):
 			System.out.println("Name:  Mrs." + fullname.toUpperCase());
 			break;
 		case ("Cathy"):	
 			System.out.println("Name:  Mrs." + fullname.toUpperCase());
 			break;
 		case ("Dilbert"):
 			System.out.println("Name:  Mr."  + fullname.toUpperCase());
 			break;
 		case ("Elroy"):
 			System.out.println("Name:  Mr."  + fullname.toUpperCase());
 			break;
 		case ("Franklin"):
 			System.out.println("Name:  Mr."  + fullname.toUpperCase());
 			break;
 	}
	
	System.out.println("Enter a name: ");
 //	fullname = scanner.nextLine();
 	
	}	
 }	
 }