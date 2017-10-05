/*Partner Lab 1
 *Kailash Raman, Jonathan Weaver, Charles Segers, Arya Kulkarni
 *1/12/15*/
 
import java.util.*;

class ACSL2016Contest1
{
	final static int arraySize = 10;
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String input;
		String[] userClass;
		String[] convertedToBinary;
		int i;
		
		
		
		for (i = 1; i <= 5; i++)
		{
		   input = s.nextLine();
		   userClass = input.split(",");

		   if (userClass[0].length()== 1)
		   {
		   	  	//Input is octal numbers 
		   	  	convertedToBinary = octalToBinary(userClass);
		   	  	convertedToCharacter = binaryToCharacter(convertedToBinary);
		   	  	
		   	  	printConverted(convertedToBinary, true);
		   	  	printConverted(convertedToCharacter, true);
		   }
		   else if (Character.isDigit(userClass[0].charAt(0))) //HINT - you will need charAt here
		   {
		   		//Input is binary numbers 
		   	  	convertedToCharacter = binaryToCharacter(userClass);
		   	  	convertedToOctal = characterToOctal(convertedToCharacter);
		   	  	
		   	  	printConverted(convertedToOctal, false);
		   	  	printConverted(convertedToCharacter, true);
  		   }
		   else
		   {
		   		//Input is characters 
		   		convertedToOctal = characterToOctal(userClass);
		   	  	convertedToBinary = octalToBinary(userClass);
		   	  	
		   	  	printConverted(convertedToOctal, false);
		   	  	printConverted(convertedToBinary, true);
		   }

		} //End for loop over lines of input
	  
		input = s.nextLine();
		userClass = input.split(",");
		convertedToBinary = octalToBinary(userClass);
	} //End main

	//Octal to binary will take an array of strings that contain octal digits and convert them to binary digits
	static String[] octalToBinary(String[] octalDigits)
	{
	   	String[] retStrings = new String[arraySize]; //This will be fill in to pass back to the caller
	   	int digit;
   
	   	for (int i = 0; i < octalDigits.length; i++)
	   	{
	   		if (octalDigits[i] != null)  //We have declared an array of 10 but will use 3 of the array positions for our test cases
	   		{
		   		digit = Integer.parseInt(octalDigits[i]); //Take the string and convert to an integer
	             
	            retStrings[i]=""; //Initialize return strings variable
	         	
	         	if (digit/4 == 1)
	         	{
	         		retStrings[i]+="1";
	         		
	         		if ((digit-4)/2 == 1)
	         		{
	         			retStrings[i]+="1";
	         			
	         			if (digit-6 == 1)
	         			{
	         				retStrings[i]+="1";
	         			}
	         			
	         			if (digit-6 == 0)
	         			{
	         				retStrings[i]+="0";
	         			}
	         		}
	         		
	         		if ((digit-4)/2 == 0)
	         		{
	         			retStrings[i]+="0";
	         			
	         			if (digit-4 == 1)
	         			{
	         				retStrings[i]+="1";
	         			}
	         			
	         			if (digit-4 == 0)
	         			{
	         				retStrings[i]+="0";
	         			}
	         		}
	         	}
	         	
	         	if (digit/4 == 0)
	         	{
	         		retStrings[i]+="0";
	         		
	         		if (digit/2 == 1)
	         		{
	         			if (digit-2 == 1)
	         			{
	         				retStrings[i]+="1";
	         			}
	         			
	         			if (digit-2 == 0)
	         			{
	         				retStrings[i]+="0";
	         			}
	         		}
	         		
	         		if (digit-4/2 == 0)
	         		{
	         			if (digit == 1)
	         			{
	         				retStrings[i]+="1";
	         			}
	         			
	         			if (digit == 0)
	         			{
	         				retStrings[i]+="0";
	         			}
	         		}
	         	}
	         
	         	// ===> Where's the beef? ... You will need add the meat to this method yourself :)
	         
	   		}
 
	   	}
	   	return retStrings;
 	}

	//Jonathan Weaver
static String[] characterToOctal(String[] charDigits)
	{
		String[] retStrings = new String[arraySize];
		
		int octal;
		
		int digit;
		for (int i = 0; i < charDigits.length; i++)
		{
			String rwx = charDigits[i];
			if (charDigits[i] != null)
			{
				if(rwx.contains("r"))
				{
					rwx = rwx.replace("r", "1");
				}
				if(rwx.contains("w"))
				{
					rwx = rwx.replace("w", "1");
				}
				if(rwx.contains("x"))
				{
					rwx = rwx.replace("x", "1");
				}
				if(rwx.contains("-"))
				{
					rwx = rwx.replace("-", "0");
				}
					
			//finish converting character to binary
				
				digit = Integer.parseInt(rwx);
				
				System.out.println("rwx is now " + rwx);
				retStrings[i] = Integer.toOctalString(digit);
		
			}
			
		}
		return retStrings;
	}


// Arya Kulkarni
 class Binary_Character{
 	public static void main(String [] args){
 		
 	// System.out.println("Enter Binary Code: ");
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


}