import java.util.Scanner;
import java.util.Random;
public class arrayCounter {
	public static void main(String [] args){
		Random r = new Random();
		int [] freq = new int[7];
		
		for (int i = 0; i < 1000; i++ ){
			++freq[1+r.nextInt(6)];
		}
		System.out.println("Face\tFrequency");
		
		for(int i = 1; i < freq.length; i++ ){
			System.out.println(i+ "\t" + freq[i]);
		}
	}
}
