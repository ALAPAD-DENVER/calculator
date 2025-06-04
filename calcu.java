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
			System.out.println("1. Calculator");
			System.out.println("2. Binary Calculator");
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
					System.out.print("\n<== Binary Calculator ==>");
					
					long binary1, binary2;
					char def;

					while (true) {
						System.out.print("\nEnter First Binary Number: ");
						if (input.hasNextInt()) {
							binary1 = input.nextLong();
							break;

						} else {
							System.out.print("\nEnter number only: \n");
							input.next();
						}
					}
					while (true) {
						System.out.print("\nEnter Second Binary Number: ");
						if (input.hasNextInt()) {
							binary2 = input.nextLong();
							break;

						} else {
							System.out.print("\nEnter number only, no Letter: \n");
							input.next();
						}
					}
					
					while (true) {
						System.out.println("A. Addition");
						System.out.println("B. Subraction");
						System.out.println("C. Multiplication");
						System.out.println("D. Division\n");
						System.out.print("Enter Operator (A/B/C/D): ");

						String inputOp = input.next(); // read full input
						if (inputOp.length() == 1) {
							def = Character.toUpperCase(inputOp.charAt(0));
							if (def == 'A' || def == 'B' || def == 'C' || def == 'D') {
								break; // valid operator
							}
						}
						System.out.println("Invalid operator. Please enter A, B, C, or D.\n");
						System.out.println("A. Addition");
						System.out.println("B. Subraction");
						System.out.println("C. Multiplication");
						System.out.println("D. Division\n");
					}

					
					switch (def) {
					case 'A' :
						System.out.println("\n==ADDITION==\n");
						
						binaryAddition(binary1, binary2);

				      
				        
						break;
					default: 
						
						System.out.println("Invalid input. Please enter a number.");
					
					}
					

					// Call the count method to analyze the characters in the test string
					
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

	public static void binaryAddition(long binary1, long binary2) {
		int i = 0, remainder = 0;
	    int[] sum = new int[20];

	    while (binary1 != 0 || binary2 != 0) {
	        sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
	        remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
	        binary1 = binary1 / 10;
	        binary2 = binary2 / 10;
	    }

	    if (remainder != 0) {
	        sum[i++] = remainder;
	    }

	    System.out.print("Sum of two binary numbers: ");
	    while (i > 0) {
	        System.out.print(sum[--i]);
	    }
	    System.out.println();
		
	}
	

}
