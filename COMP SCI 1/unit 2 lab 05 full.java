/**
 *Arya Kulkarni
 *Star Triangles
 *10 / 27 / 15
 */
 import java.util.Scanner; 
 class StarTriangle2{
 	public static void main (String [] args){
 		
 		System.out.println("Please enter any #: ");
 		Scanner scanner = new Scanner(System.in);
 		int i = scanner.nextInt();

		if (i >1 ){
			 		i--;
			 		int star_count=1;
			 		while ( i >= 0 ){
			 			
			 			// print spaces
			 			for (int j=0;j<=i;j++) {
			 				System.out.printf(" ");
			 			}
			 			
			 			// print stars
			 			for (int j=1;j<=star_count;j++) {
			 				System.out.printf("*");
			 			}
			 			
			 			star_count = star_count+2;
			 			// print newline
			 			System.out.printf("\n");
			 			i--;
			 			}			
		} else {
			System.out.println("Please enter a # greater than 1!");
		}

 		}		
 	}