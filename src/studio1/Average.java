package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numberOne = new Scanner(System.in);
		System.out.println("");
		Scanner numberTwo = new Scanner(System.in);
		
		int n1 = numberOne.nextInt();
		int n2 = numberTwo.nextInt();
		double average = (n1 + n2) / 2.0;
		
		System.out.println("Average of " + n1 + " and " + n2 + " is " + average + ".");
	}
}
