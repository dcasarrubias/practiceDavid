import java.util.Random;


public class Physics{
	public static final int numbers = 11;
	public static final int times = 20;
	
	public static void main(String [] args){
		int [] arr = new int[numbers + 1];
	/*	
		for (int j = 0; j < arr.length; j++){
			arr[j] = 0;
		}
		*/ // unecessary since by default arrays are initialized to 0. 
		Random ran = new Random();
		
		for (int j = 0; j < times; j++){
			arr[ran.nextInt(numbers) + 1]++;
		}
			for(int j = 1; j < numbers; j++){
				System.out.println(j + " Appears " + arr[j] + " Times");
			}
	}
}
