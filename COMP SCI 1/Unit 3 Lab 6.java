/**
 *Arya Kulkarni
 *Pig latin
 *December 16, 2015
 */
 import java.util.Scanner;
 class PigLatin{
 	public static void main(String[] args){
 	Scanner scanner = new Scanner(System.in);

 	String PigLatin;
 	System.out.println("Type a word up to 4 letters");
 	System.out.printf("Original: ");
 	PigLatin = scanner.nextLine();
 	//Change your pig latin method to have the following specs:
	//If the word has no vowels [a,e,i,o,u] just add “ay”
	//If it begins with a vowel add “yay” at the end
	//otherwise end+start+”ay”

	char result = PigLatin.charAt(0);
	
	// System.out.println(result);
	
	String result1 = Character.toString(result);
	if(result1.equals("a") || result1.equals("e") || result1.equals("i") || result1.equals("o") || result1.equals("u")){
		System.out.println(PigLatin + "yay");
	}else {
		System.out.println(PigLatin + "ay");
	}
	// second letter --------------------------------------
		result = PigLatin.charAt(1);
	
	// System.out.println(result);
	
	String result_1 = Character.toString(result);
	if(result_1.equals("a") || result_1.equals("e") || result_1.equals("i") || result_1.equals("o") || result_1.equals("u")){
		System.out.println(PigLatin + "yay");
	}
	
	// third letter ----------------------------------------
		result = PigLatin.charAt(2);
	
	// System.out.println(result);
	
	String result2 = Character.toString(result);
	if(result2.equals("a") || result2.equals("e") || result2.equals("i") || result2.equals("o") || result2.equals("u")){
		System.out.println(PigLatin + "yay");
	}
	
	// fourth letter ----------------------------------------
		result = PigLatin.charAt(3);
	
	// System.out.println(result);
	
	String result3 = Character.toString(result);
	if(result3.equals("a") || result3.equals("e") || result3.equals("i") || result3.equals("o") || result3.equals("u")){
		System.out.println(PigLatin + "yay");
	}

System.out.println("\n");
System.out.println("Pig Latin version is the last word to appear on the console.");

}// Ends main
 	
}// Ends class