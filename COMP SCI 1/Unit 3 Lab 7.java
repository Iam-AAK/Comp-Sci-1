/**
 *Arya Kulkarni
 *December 18, 2015
 *Persons
 */
 import java.util.Scanner;
 
 // Person class with properties and methods
 class Person{
 	 		
 		// declare variables
 		String name;
 		int age;
 
 // Getter and Setter methods for name
 
 	public void setName(String name){
 		this.name = name;
 	}
 	public String getName(){
 		return this.name;
 	}
 	

 // Getter and Setter methods for age
 	
 	public void setAge(int age){
 		this.age = age;
 	}
 	
 	public int getAge(){
 		return this.age;
 	}
 	
 	// Constructor
 	Person(String name, int age){
 		setName(name);
 		setAge(age);
 	}
 		
 	}
 
	
 
 
// Tester class to test Person class
 class TestPerson{
 	public static void main(String [] args){
 		Scanner sc = new Scanner(System.in);
 			
 			String name;
 			int age;
 			
 			System.out.println("Name: ");
 			name = sc.nextLine();
 			System.out.println("Age: ");
 			age = sc.nextInt();
 			
 			// Create Person object using constructor
 			Person NewPerson = new Person(name, age);
 			System.out.println(NewPerson.getName() + "'s age is " + Integer.toString(NewPerson.getAge()));	
 				
 			
 	}		
 }