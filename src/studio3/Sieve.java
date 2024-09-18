package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter an integer greater than 1: ");
			int n = in.nextInt();
			
			for(int i = 1; i<=n; i++) {
				System.out.print(i);
			}
	}
}
			
	        
	       