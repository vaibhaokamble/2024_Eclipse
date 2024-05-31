package vaibhao.vk;

import java.util.*;

public class TestFinallyApp {
	static int a[]; // reference without new keyword

	public static void main(String x[]) {
		Scanner xyz = new Scanner(System.in);
		int a, b, c;
		try {
			System.out.println("Enter two values");
			a = xyz.nextInt();
			b = xyz.nextInt();
			c = a / b;
			System.out.printf("Division is %d\n", c);
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
		} finally {
			System.out.println("I can execute always");
		}
	}
}
