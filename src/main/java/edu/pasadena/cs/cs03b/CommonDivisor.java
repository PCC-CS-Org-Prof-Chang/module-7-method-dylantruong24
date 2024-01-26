package edu.pasadena.cs.cs03b;
import java.util.Scanner;

public class CommonDivisor {

	public static void main(String[] args) {
		int num1, num2, num3, digitNum, gcd;
		Scanner scanner = new Scanner (System.in);

		System.out.println("---------------------------");
		System.out.print("Will you enter (2) or (3) digits?: ");
		digitNum = scanner.nextInt();

		if (digitNum == 2) {
			System.out.print("Enter the first number: ");
			num1 = scanner.nextInt();
			System.out.print("Enter the second number: ");
			num2 = scanner.nextInt();

			gcd = gcd(num1, num2);
			System.out.println("GCD: " + gcd);
		} 
		else if (digitNum == 3) {
			System.out.print("Enter the first number: ");
			num1 = scanner.nextInt();
			System.out.print("Enter the second number: ");
			num2 = scanner.nextInt();
			System.out.print("Enter the third number: ");
			num3 = scanner.nextInt();

			gcd = gcd3(num1, num2, num3);
			System.out.println("GCD: " + gcd);
		}
		else {
			System.out.print("Invalid number.");
		}
		System.out.print("---------------------------");
	}

	public static int gcd(int num1, int num2) {
		int gcd = 1;
		int temp, temp2;

		if (num2 > num1) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		do {
			if (num1 == 0) {
				gcd = num2;
				break;
			}
			else if (num2 == 0) {
				gcd = num1;
				break;
			}
			else {
				temp2 = num2;
				num2 = (num1%num2);
				num1 = temp2;
				System.out.println("NUM1:" + num1 + " NUM2: " + num2);
			}
	 	} while (num1 != 0);

		return gcd;
	}

	public static int gcd3(int a, int b, int c) {
		return gcd(a, gcd (b, c));
	}
}
