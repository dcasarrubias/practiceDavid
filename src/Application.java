import java.util.Scanner;
import java.util.Random;

public class Application {
	
	public static void printMatrix(int [][] m){
		for(int i = 0; i < m.length; i++){
			if(m[i] == null){
				System.out.println("(null)");
			}
			else {
				for(int j = 0; j < m[i].length; j++){
					System.out.println(m[i][j] + " ");
					System.out.println();
				}
			}
		}
	}
	public static void main(String [] args){
		int [] twitter;
		twitter = new int[4];
		
			int [][] a = { {1,2}, {3,4}, {5,6}};
			int [][] b = { {1,2}, null, {5,6}};
			int [][] c = { {1,2}, {3,4,5} , {6}};
			
			System.out.println(); printMatrix(a);
			System.out.println(); printMatrix(b);
			System.out.println(); printMatrix(c);
			

		}
	}

