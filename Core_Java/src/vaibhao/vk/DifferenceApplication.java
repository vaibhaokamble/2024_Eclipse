package vaibhao.vk;

import java.util.*;

class ArrayDifference {
	private int[] array;

	// Method to set the array
	void setArray(int[] a) {
		array = a;
	}

	// Method to find pair of elements with the given difference
	int[] getPair(int n) {
		int[] pair = new int[2];

		// Create a HashSet to store elements of the array
		HashSet<Integer> set = new HashSet<>();
		for (int num : array) {
			set.add(num);
		}

		// Iterate through the array elements
		for (int num : array) {
			int complement = num + n;
			if (set.contains(complement)) {
				pair[0] = num;
				pair[1] = complement;
				break;
			}
		}
		return pair;
	}
}

public class DifferenceApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input array size
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		// Input array elements
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		// Input difference
		System.out.print("Enter the difference: ");
		int difference = scanner.nextInt();

		// Create an object of ArrayDifference class
		ArrayDifference arrayDifference = new ArrayDifference();

		// Set the array
		arrayDifference.setArray(arr);

		// Find and print the pair of elements with the given difference
		int[] pair = arrayDifference.getPair(difference);
		if (pair[0] != 0 && pair[1] != 0) {
			System.out.println("Pair found: {" + pair[0] + "," + pair[1] + "}");
		} else {
			System.out.println("No pair found with the given difference.");
		}
	}
}
