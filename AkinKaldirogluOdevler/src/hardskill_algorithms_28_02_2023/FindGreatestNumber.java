package hardskill_algorithms_28_02_2023;

import java.util.Scanner;

public class FindGreatestNumber {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		int result = 1;

		System.out.println("Enter 5 numbers: ");

		int number = scanner.nextInt();
		int greatest = number;

		for (int i = 0; i < 4; i++) {
			number = scanner.nextInt();
			if (number > greatest)
				greatest = number;
		}

		//System.out.println("The greatest number: " + greatest);

	}

	public static void greatestNumber(int number) {
		//
	}
}
