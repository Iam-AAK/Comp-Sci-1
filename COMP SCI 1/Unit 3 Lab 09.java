/**
 *Arya Kulkarni
 *January 6, 2016
 *Lab 09
 */
 
 import java.util.Scanner;
 class Concrete{
 	
 	int length;
 	int width;
 	double depth;
 	double volume;
 	double slab;
 	
 	// Constuctor
 	Concrete(int length, int width, double depth){
 		setLength(length);
 		setWidth(width);
 		setDepth(depth);
 	}
 	
 	// Method for length
 	public void setLength(int length){
 		this.length = length;
 	}
 	
 	public int getLength(){
 		return this.length;
 	}
 	
 	// Method for width
 	public void setWidth(int width){
 		this.width = width;
 	}
 	
 	public int getWidth()
 	{
 		return this.width;
 	}
 	
 	// Method for depth
 	public void setDepth(double depth){
 		this.depth = depth;
 	}
 	public double getDepth(){
 		return this.depth;
 	}
 	
 	// Method for volume
 	public double Volume(){
 	volume = (length * width * (depth/12)) / 27;
 		return volume;
 	}
 	
 	// Method for slab
 	public double Slab(){
 		slab = (108 / (depth/12)) / 3;
 		return slab;
 	}
  	
 }
 
 
class Tester{
	public static void main(String [] args){
		
	int length;
 	int width;
 	double depth;
 	double volume;
 	double slab;
 	
 	Scanner sc = new Scanner(System.in);
 	
 	System.out.println("Enter length   ");
 	length = sc.nextInt();
 	System.out.println("Enter width:   ");
 	width = sc.nextInt();
 	System.out.println("Enter depth:   ");
 	depth = sc.nextInt();
	
	// Create Concrete object using constuctor
	Concrete newConcrete = new Concrete(length, width, depth);
	System.out.println("Volume: " + Double.toString(newConcrete.Volume()) + " yards cubed");
	System.out.println("Concrete Needed: " + Double.toString(newConcrete.Slab()) + " yards cubed");
	System.out.println("Dimensions: " + Integer.toString(newConcrete.getLength()) + "ft x " + Integer.toString(newConcrete.getWidth()) + "ft x " + Double.toString(newConcrete.getDepth()) + "in");
		
	}
}