/* 
 *Arya Kulkarni
 *Dic Roller - Choice Lab
 *November 18th, 2015
 */
 
class Unit2ChoiceLab { 
   public static void main(String[] args) { 
	
	System.out.println("Roll" + "\t" + "Die 1" + "\t" + "Die 2" + "\t" + "Sum");
	int i = 1;
	if( i <= 20 ){
		i++;
		
		int j = 0;
		int sum = 0;
		int random_num1;
		int random_num2;
		while( j <= 19 ){
			random_num1 = (int)(Math.random() * 5) + 1;
			random_num2 = (int)(Math.random() * 5) + 1;
			sum = random_num1 + random_num2;
			j++;
			System.out.println( j +"\t"+"\t"+ random_num1 +"\t"+"\t"+ random_num2 +"\t"+"\t"+ sum);
		}
		
		
	}
   }
}