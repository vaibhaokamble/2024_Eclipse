package vaibhao.vk;

import java.util.*;

class FindMaxs {
	int arr[], max;

	void setArray(int arr[]) {
		this.arr = arr;
	}

	int getMax() {
		max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}

public class FindMaxApp {
	public static void main(String[] args) {
		int a[] = new int[5];
		System.out.println("Enter five values in arrray");
		Scanner xyz = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = xyz.nextInt();
		}
		FindMaxs fm = new FindMaxs();
		fm.setArray(a);
		System.out.println("Maximum value is: " + fm.getMax());
	}
}
