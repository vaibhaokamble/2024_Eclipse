package vaibhao.vk;

class Sums {
	int arr[];

	void setValue(int x[]) {
		arr = x;
		System.out.println("Address of reference variable x is " + System.identityHashCode(x));
	}

	void show() {
		System.out.println("Address of reference variable arr is " + System.identityHashCode(arr));

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d\n", arr[i]);
		}
	}
}

public class PerApplication {

	public static void main(String[] args) {
		int a[] = new int[] { 60, 60, 60, 60, 60, 60 };
		System.out.println("Address of array variable a is  " + System.identityHashCode(a));
		Sums s = new Sums();
		s.setValue(a);
		s.show();

	}
}
