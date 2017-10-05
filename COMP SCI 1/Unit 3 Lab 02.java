/**
 *Arya Kulkarni
 *Verbs Lab
 *December 02, 2015
 */
 
 import java.util.Scanner;
 class VerbsLab{
 
 	public static void main(String [] args){
 	
 	System.out.println("Verb: ");
 	Scanner scanner = new Scanner(System.in); 		
	String verb = scanner.nextLine();
	int verb_length;
	verb_length = verb.length();
	String last_char = verb.substring((verb_length - 1));
	// last_char = last_char + "d";
	//System.out.println("--" + last_char + "--");	
	
	if(last_char.trim().equals("e")){
		System.out.println(verb + "d");
		System.out.println(verb.substring(0, (verb_length - 1)) + "ing");
	}else {
		System.out.println(verb + "ed");
		System.out.println(verb + "ing");
	}

 	}
 }