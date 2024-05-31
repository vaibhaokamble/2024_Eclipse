package vaibhao.vk;

import java.util.*;

class FindCommon {
	private int[] arr1;
	private int[] arr2;
	private int[] arr3;

	// Method to set the arrays
	void setArrays(int[] a1, int[] a2, int[] a3) {
		arr1 = a1;
		arr2 = a2;
		arr3 = a3;
	}

	// Method to find common elements in three sorted arrays
	int[] getCommonElements() {
		List<Integer> commonList = new ArrayList<>();
		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				commonList.add(arr1[i]);
				i++;
				j++;
				k++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr2[j] < arr3[k]) {
				j++;
			} else {
				k++;
			}
		}

		// Convert List to array
		int[] commonArray = new int[commonList.size()];
		for (int index = 0; index < commonList.size(); index++) {
			commonArray[index] = commonList.get(index);
		}

		return commonArray;
	}
}

public class FindingCommanApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input arrays
		System.out.println("Enter the size of array 1:");
		int size1 = scanner.nextInt();
		int[] arr1 = new int[size1];
		System.out.println("Enter elements of array 1 (sorted):");
		for (int i = 0; i < size1; i++) {
			arr1[i] = scanner.nextInt();
		}

		System.out.println("Enter the size of array 2:");
		int size2 = scanner.nextInt();
		int[] arr2 = new int[size2];
		System.out.println("Enter elements of array 2 (sorted):");
		for (int i = 0; i < size2; i++) {
			arr2[i] = scanner.nextInt();
		}

		System.out.println("Enter the size of array 3:");
		int size3 = scanner.nextInt();
		int[] arr3 = new int[size3];
		System.out.println("Enter elements of array 3 (sorted):");
		for (int i = 0; i < size3; i++) {
			arr3[i] = scanner.nextInt();
		}

		// Create an object of FindCommon class
		FindCommon findCommon = new FindCommon();

		// Set the arrays
		findCommon.setArrays(arr1, arr2, arr3);

		// Find and print common elements
		int[] commonElements = findCommon.getCommonElements();
		System.out.print("Common elements in three sorted arrays: ");
		for (int element : commonElements) {
			System.out.print(element + " ");
		}

	}
}
