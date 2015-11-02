import java.util.Scanner;


public class TestArray {
public int add3Integers(int a, int b, int c){
	return a + b + c;
}
	public void myRun(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1st number: ");
		int x = input.nextInt();
		
		System.out.println("Enter 2nd number: ");
		int y = input.nextInt();
		
		System.out.println("Enter 3rd number: ");
		int z = input.nextInt();
		
		System.out.println(add3Integers(x,y,z));
	}
	
	public static void main(String [] args){
		TestArray app = new TestArray();
		
		app.myRun();
	}
	
}
		
		
