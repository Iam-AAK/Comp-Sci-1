/**
 *Arya Kulkarni
 *January 8, 2016
 *Unit 3 Test
 */
 
 import java.util.Scanner;
 class Box{
 	
 	int length;
 	int width;
 	int height;
 	int lateralArea;
 	int totalArea;
 	int volume;
 	
 	
 	// Constructor
 	Box(int length, int width, int height){
 		setLength(length);
 		setWidth(width);
 		setHeight(height);
 	}
 	
 	// method for length
 	public void setLength( int length){
 		this.length = length;
 	}
 	
 	public int getLength(){
 		return this.length;
 	}
 	
 	// method for width
 	 	public void setWidth( int width){
 		this.width = width;
 	}
 	
 	public int getWidth(){
 		return this.width;
 	}
 	// method for height
 	 public void setHeight( int height){
 		this.height = height;
 	}
 	
 	public int getHeight(){
 		return this.height;
 	}
 	
 	// Method Lateral Area
 	public int Lateral_Area(){
 		lateralArea = ( (2*width) + (2*length)) * height;
 		return lateralArea;
 	}
 	
 		
 	// Method for totalArea
 	public int TotalArea(){
 		totalArea = (lateralArea + (2 * length * width));
 		return totalArea;
 	}
 	
 	// Method for volume
 	public int Volume(){
 	volume = (length * width * height);
 		return volume;
 	}
 		
 
 }
 
 class TesterBox{
 	public static void main(String [] args){
 		
 		Scanner sc = new Scanner(System.in);
 		
 		System.out.println("\n");
 		System.out.println("All mesurements will be in feet");
 		System.out.println("Please enter an integer value for all measurements");
 		System.out.println("------------------------------------------------------------");
 		System.out.println("\n");
 		
 	int length;
 	int width;
 	int height;
 	
 	// Ask user
 	System.out.println("Length: ");
 	length = sc.nextInt();
 	System.out.println("Width: ");
 	width = sc.nextInt();
 	System.out.println("Height: ");
 	height = sc.nextInt();
 	
 	
 	// Constructor to Object
 	Box newBox = new Box(length, height, width);
 	System.out.println("Lateral Area: " + Integer.toString(newBox.Lateral_Area()) + " feet squared");
 	System.out.println("Total Area: " + Integer.toString(newBox.TotalArea()) + " feet squared");
 	System.out.println("Volume: " + Integer.toString(newBox.Volume()) + " feet cubed");
 		
 	}
 }