package com.calculator;

import java.util.Scanner;

public class calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int choice;
		int repeat;

		// Define a test string containing letters, numbers, spaces, and other
		// characters
		do {
			System.out.println("\n=== Simple Menu ===");
			System.out.println("1. calculator");
			System.out.println("2. sentence counter");
			System.out.println("3. ");
			System.out.println("4. ");
			System.out.println("5. ");
			System.out.println("6. Exit");
			System.out.print("\nEnter your choice (1-6): ");
			choice = input.nextInt();

			switch (choice) {

			case 1:

				do {
					input.nextLine();
					System.out.println("\ncalculator");

					// System.out.print("\nEnter First number: ");
					// int num1 = input.nextInt();
					int num1;

					while (true) {
						System.out.print("\nEnter First number: ");
						if (input.hasNextInt()) {
							num1 = input.nextInt();
							break;

						} else {
							System.out.print("\nEnter number only: \n");
							input.next();
						}
					}

					System.out.println("A. Addition");
					System.out.println("B. Subraction");
					System.out.println("C. Multiplication");
					System.out.println("D. Division");
					System.out.print("Enter Operator: ");

					// char operator = input.next().toUpperCase().charAt(0);
					char operator;

					while (true) {
						System.out.print("Enter Operator (A/B/C/D): ");

						String inputOp = input.next(); // read full input
						if (inputOp.length() == 1) {
							operator = Character.toUpperCase(inputOp.charAt(0));
							if (operator == 'A' || operator == 'B' || operator == 'C' || operator == 'D') {
								break; // valid operator
							}
						}
						System.out.println("Invalid operator. Please enter A, B, C, or D.\n");
						System.out.println("A. Addition");
						System.out.println("B. Subraction");
						System.out.println("C. Multiplication");
						System.out.println("D. Division\n");
					}

					// System.out.print("\nEnter Second number: ");
					// int num2 = input.nextInt();

					int num2;
					while (true) {
						System.out.print("\nEnter Second number: ");
						if(input.hasNextInt()) {
							num2 = input.nextInt();
							break;
						}else {
							System.out.print("\nEnter number only: \n");
							input.next();						}

					}

					switch (operator) {

					case 'A':
						System.out.println("\n==ADDITION==\n");
						int sum = num1 + num2;
						System.out.println(num1 + " + " + num2 + " = " + sum);
						break;
					case 'B':
						System.out.println("\n==SUBTRACTION==\n");
						sum = num1 - num2;
						System.out.println(num1 + " - " + num2 + " = " + sum);
						break;
					case 'C':
						System.out.println("\n==MULTIPLICATION==\n");
						long multi = num1 * num2;
						System.out.println(num1 + " x " + num2 + " = " + multi);
						break;
					case 'D':
						System.out.println("\n==DIVISION==\n");
						float vide = (float) num1 / num2;
						System.out.println(num1 + " / " + num2 + " = " + vide);
						break;
					default:
						System.out.println("Invalid choice. Please enter a number from A, B, C, or D.");

					}

					System.out.println("\nDo you want to:");
					System.out.println("1. Repeat this activity");
					System.out.println("2. Return to main menu");
					// System.out.print("Enter your choice: ");
					// repeat = input.nextInt();

					while (true) {
						System.out.print("Enter your choice: ");
						if (input.hasNextInt()) {
							repeat = input.nextInt();
							if (repeat == 1 || repeat == 2) {
								break;
							} else {
								System.out.println("Invalid choice. Please enter 1 or 2 only.");
							}
						} else {
							System.out.println("Invalid input. Please enter a number.");
							System.out.println("\nDo you want to:");
							System.out.println("1. Repeat this activity");
							System.out.println("2. Return to main menu\n");
							input.next(); // consume invalid input
						}

					}

				} while (repeat == 1);
				break;

			case 2:

				do {
					input.nextLine();
					System.out.print("Enter sentence: ");
					String test = input.nextLine();
					System.out.println("the Sentence is:" + test);

					// Call the count method to analyze the characters in the test string
					count(test);
					System.out.println("\nDo you want to:");
					System.out.println("1. Repeat this activity");
					System.out.println("2. Return to main menu");
					System.out.print("Enter your choice: ");
					// repeat = input.nextInt();
					while (true) {
						System.out.print("Enter your choice: ");
						if (input.hasNextInt()) {
							repeat = input.nextInt();
							if (repeat == 1 || repeat == 2) {
								break;
							} else {
								System.out.println("Invalid choice. Please enter 1 or 2 only.");
							}
						} else {
							System.out.println("Invalid input. Please enter a number.");
							input.next(); // consume invalid input
						}

					}

				} while (repeat == 1);

				break;

			case 6:
				System.out.print("Exiting calculator. Goodbye!");
				break;

			default:
				System.out.println("Invalid choice. Please enter a number from 1 to 6.");
			}

		} while (choice != 6);

		input.close();

	}

	public static void count(String x) {
		// Convert the input string to a character array
		char[] ch = x.toCharArray();

		// Initialize counters for letters, spaces, numbers, and other characters
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;

		// Iterate through the character array to categorize characters
		for (int i = 0; i < x.length(); i++) {
			// Check if the character is a letter
			if (Character.isLetter(ch[i])) {
				letter++;
			}
			// Check if the character is a digit (number)
			else if (Character.isDigit(ch[i])) {
				num++;
			}
			// Check if the character is a space
			else if (Character.isSpaceChar(ch[i])) {
				space++;
			}
			// Character falls into the "other" category if none of the above conditions are
			// met
			else {
				other++;
			}
		}

		// Display the original string

		// Display the counts of letters, spaces, numbers, and other characters
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
	}

}
