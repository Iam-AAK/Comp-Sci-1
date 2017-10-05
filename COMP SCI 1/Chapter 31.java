/**
 *Arya Kulkarni
 *Baseball Player
 *January 4, 2016
 */
 
 import java.util.Scanner;
 class BaseballPlayer{
 	
 	String name;
 	int hits;
 	int atbats;
 	double BattingAverage;	

 	
 // Methods for name
 	public void setName(String name){
 		this.name = name;
 	}
 	public String getName(){
 		return this.name;
 	}
 // Methods for hits
 
 	public void setHits(int hits){
 		this.hits = hits;
 	}
 	public int getHits(){
 		return this.hits;
 	}
 // Methods for atbats
 	public void setAtBats(int atbats){
 		this.atbats = atbats;
 	}
 	public int getAtBats(){
 		return this.atbats;
 	}
 	
 	// Constructor
 	BaseballPlayer(String name, int atbats, int hits){
 		setName(name);
 		setAtBats(atbats);
 		setHits (hits);
 	}
 	
 }
 
 class TesterBaseball{
 	public static void main(String [] args){
 	
 	String name;
 	int hits;
 	int atbats;
 	
 	Scanner sc = new Scanner(System.in);
 	
 	System.out.println("Enter a name:         ");
 	name = sc.nextLine();
 	System.out.println("Enter number of hits: ");
 	hits = sc.nextInt();
 	System.out.println("Enter number at bat:  ");
 	atbats = sc.nextInt();
	double BattingAverage = hits / atbats;
	
	
 	// Create BaseballPlayer object using constuctor
 	BaseballPlayer NewBaseballPlayer = new BaseballPlayer(name, atbats, hits);
 	System.out.println(NewBaseballPlayer.getName() + "'s number of hits is "+ Integer.toString(NewBaseballPlayer.getHits()) + " and number of at bats is " + Integer.toString(NewBaseballPlayer.getAtBats()) + ". Also this person's batting average is " +BattingAverage);
 
 	}
 
 }