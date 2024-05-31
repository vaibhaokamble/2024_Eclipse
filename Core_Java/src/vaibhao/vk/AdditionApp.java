package vaibhao.vk;

import java.util.*;

class Add {
	int a, b;

	void setvalue(int x, int y) {
		a = x;
		b = y;
	}

	void showAdd() {
		System.out.println("Addition is: " + (a + b));
	}
}

public class AdditionApp {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first = v.nextInt();
		System.out.println("Enter the second number: ");
		int second = v.nextInt();
		Add add = new Add();
		add.setvalue(first, second);
		add.showAdd();
	}
}
