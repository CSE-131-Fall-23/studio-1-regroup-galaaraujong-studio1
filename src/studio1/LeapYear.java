package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner yearInput = new Scanner(System.in);
		
		int year = yearInput.nextInt();
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		System.out.println(isLeapYear);
	}

}
