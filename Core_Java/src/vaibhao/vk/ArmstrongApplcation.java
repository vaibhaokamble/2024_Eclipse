package vaibhao.vk;

import java.util.*;

class Armstrong {
	int number;

	void setValue(int num) {
		number = num;
	}

	boolean isArmstrong() {
		int originalNumber = number;
		int result = 0;
		int n = String.valueOf(number).length();

		while (originalNumber != 0) {
			int remainder = originalNumber % 10;
			result += Math.pow(remainder, n);
			originalNumber /= 10;
		}

		return result == number;
	}
}

public class ArmstrongApplcation {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		Armstrong a = new Armstrong();
		System.out.println("Enter the number: ");
		int number = v.nextInt();
		a.setValue(number);
		boolean isArmstrong = a.isArmstrong();
		if (isArmstrong) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is not ArmStrong");
		}
	}
}
