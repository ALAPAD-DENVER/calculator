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
			System.out.println("3. Convertion");
			System.out.println("4. ");
			System.out.println("5. ");
			System.out.println("6. Exit");
			System.out.print("\nEnter your choice (1-6): ");
			choice = input.nextInt();

			switch (choice) {

			case 1:

				do {
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
						if (input.hasNextInt()) {
							num2 = input.nextInt();
							break;
						} else {
							System.out.print("\nEnter number only: \n");
							input.next();
						}

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

					System.out.print("\n<== Binary Calculator ==>");

					long binary1, binary2;
					char binaryOperator;

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
							binaryOperator = Character.toUpperCase(inputOp.charAt(0));
							if (binaryOperator == 'A' || binaryOperator == 'B' || binaryOperator == 'C'
									|| binaryOperator == 'D') {
								break; // valid operator
							}
						}
						System.out.println("Invalid operator. Please enter A, B, C, or D.\n");
						System.out.println("A. Addition");
						System.out.println("B. Subraction");
						System.out.println("C. Multiplication");
						System.out.println("D. Division\n");
					}

					switch (binaryOperator) {
					case 'A':
						System.out.println("\n==ADDITION==\n");

						binaryAddition(binary1, binary2);

						break;
					case 'B':
						System.out.println("\n==SUBTRACTION==\n");
						break;

					case 'C':
						System.out.println("\n==MULTIPLICATION==\n");

						binaryMultiplication(binary1, binary2);
						break;

					case 'D':
						System.out.println("\n==DIVISION==\n");
						break;
					default:

						System.out.println("Invalid input. Please enter a number.");

					}

					// Call the count method to analyze the characters in the test string

					System.out.println("\nDo you want to:");
					System.out.println("1. Repeat this activity");
					System.out.println("2. Return to main menu");
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
// Convertion
			case 3:
				long binary1, decimal = 0, j = 1, remainder;
				char convertionType, convertionTo;
				

				System.out.print("\n <== CONVERTION ==>");

				do {
					while (true) {
						System.out.println("\nA. Binary");
						System.out.println("B. Decimal");
						System.out.println("C. Hexadecimal");
						System.out.println("D. Octal\n");
						System.out.print("Enter Converter Type (A/B/C/D): ");

						String inputOp = input.next(); // read full input
						if (inputOp.length() == 1) {
							convertionType = Character.toUpperCase(inputOp.charAt(0));
							if (convertionType == 'A' || convertionType == 'B' || convertionType == 'C'
									|| convertionType == 'D') {
								break; // valid operator
							}
						}
						System.out.println("Invalid operator. Please enter A, B, C, or D.\n");
					}

					switch (convertionType) {

//convertiontype
					case 'A':
						System.out.println("\n <== Binary to ==>");

						while (true) {

							System.out.println("A. Decimal");
							System.out.println("B. Hexadecimal");
							System.out.println("C. Octal\n");
							System.out.print("Enter Converter Type (A/B/C): ");

							String inputOp = input.next(); // read full input
							if (inputOp.length() == 1) {
								convertionTo = Character.toUpperCase(inputOp.charAt(0));
								if (convertionTo == 'A' || convertionTo == 'B' || convertionTo == 'C'
										|| convertionTo == 'D') {
									break; // valid operator
								}
							}
							System.out.println("Invalid operator. Please enter A, B, or C.\n");

						}

						switch (convertionTo) {

//Convertion to
						case 'A':
							
							long binary2;

							while (true) {
								System.out.print("\nEnter Binary Number: ");
								if (input.hasNextInt()) {
									binary2 = input.nextLong();
									binary1 = binary2;
									break;

								} else {
									System.out.print("\nEnter number only: \n");
									input.next();
								}
							}

							while (binary1 != 0) {
								remainder = binary1 % 10;
								decimal = decimal + remainder * j;
								j = j * 2;
								binary1 = binary1 / 10;
							}

							// Display the decimal representation of the binary number
							System.out.println("Equivalent Decimal Number of " + binary2 + " is :  " + decimal);

							break;
							
						case 'B':
							int[] hex = new int[1000];
					        int i = 1, h = 0, rem, dec = 0, bin, bin1;
							
					        
					        System.out.print("Enter Binary Number: ");
					        bin1 = input.nextInt();
					        bin = bin1;

					        // Convert the binary number to decimal
					        while (bin > 0) {
					            rem = bin % 2;
					            dec = dec + rem * i;
					            i = i * 2;
					            bin = bin / 10;
					        }
					        i = 0;

					        // Convert the decimal number to hexadecimal
					        while (dec != 0) {
					            hex[i] = dec % 16;
					            dec = dec / 16;
					            i++;
					        }

					        // Display the hexadecimal value
					        System.out.print("Equivalent Hexadecimal value of " + bin1 + " is : ");
					        for (h = i - 1; h >= 0; h--) {
					            if (hex[h] > 9) {
					                System.out.print((char)(hex[h] + 55));
					            } else {
					                System.out.print(hex[h]);
					            }
					        }
					        System.out.print("\n");
					        
							break;
						case 'C' :
							int binnum, binnum1, decnum = 0, quot, d;
							i = 1;
					        int octnum[] = new int[100];

					        // Create a Scanner object to read input from the user
					       

					        // Prompt the user to input a binary number
					        System.out.print("Enter Binary Number : ");
					        binnum = input.nextInt();
					        binnum1 = binnum;

					        // Convert the binary number to decimal
					        while (binnum > 0) {
					            rem = binnum % 10;
					            decnum = decnum + rem * i;
					            i = i * 2;
					            binnum = binnum / 10;
					        }

					        i = 1;
					        quot = decnum;

					        // Convert the decimal number to octal
					        while (quot > 0) {
					            octnum[i++] = quot % 8;
					            quot = quot / 8;
					        }

					        // Display the equivalent octal value of the original binary number
					        System.out.print("Equivalent Octal Value of " + binnum1 + " is : ");
					        for (d = i - 1; d > 0; d--) {
					            System.out.print(octnum[d]);
					        }
					        System.out.print("\n");
							break;
							
						default:
							System.out.println("Invalid Conver to. Please Enter A, B, or C.\n");

						}

						break;

					default:
						System.out.println("Invalid input. Please enter a number.");

					}

//					while (true) {
//						System.out.print("\nEnter First Binary Number: ");
//						if (input.hasNextInt()) {
//							binary1 = input.nextLong();
//							break;
//
//						} else {
//							System.out.print("\nEnter number only: \n");
//							input.next();
//						}
//					}
//					while (true) {
//						System.out.print("\nEnter Second Binary Number: ");
//						if (input.hasNextInt()) {
//							binary2 = input.nextLong();
//							break;
//
//						} else {
//							System.out.print("\nEnter number only, no Letter: \n");
//							input.next();
//						}
//					}

					System.out.println("\nDo you want to:");
					System.out.println("1. Repeat this activity");
					System.out.println("2. Return to main menu");

					while (true) {
						System.out.print("\nEnter your choice: ");
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
			sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
			remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
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

	public static void binaryMultiplication(long binary1, long binary2) {

		long multiply = 0;
		int digit;
		long factor = 1;
		long tempBinary1 = binary1;

		// Process binary2 to calculate the product
		while (binary2 != 0) {
			digit = (int) (binary2 % 10);
			if (digit == 1) {
				long shiftedBinary1 = tempBinary1 * factor;
				multiply = binaryProduct(shiftedBinary1, multiply);
			}
			binary2 = binary2 / 10;
			factor *= 10;
		}

		System.out.println("Product of two binary numbers: " + multiply);
	}

	// Method to add two binary numbers (used in multiplication)
	public static long binaryProduct(long binary1, long binary2) {
		int i = 0, remainder = 0;
		int[] sum = new int[40]; // Buffer size
		long result = 0;

		while (binary1 != 0 || binary2 != 0) {
			sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
			remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
			binary1 /= 10;
			binary2 /= 10;
		}

		if (remainder != 0) {
			sum[i++] = remainder;
		}

		while (--i >= 0) {
			result = result * 10 + sum[i];
		}

		return result;
	}

}
