import java.util.Scanner;


public class GreatestNumber {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.println("Enter an integer: ");
		
		if(input.hasNextInt()){
			x = input.nextInt();
			System.out.println("Half of x is "+ (x/2));
		}
		else 
		{System.out.println("Integer was not entered");}
	}
		
	
}
