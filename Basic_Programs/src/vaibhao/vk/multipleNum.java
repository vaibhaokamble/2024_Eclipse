package vaibhao.vk;

import java.util.*;

public class multipleNum {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		System.out.println("Enter the first number");
		int first=v.nextInt();
		System.out.println("Enter the second number");
		int second=v.nextInt();
		int mul=first*second;
		System.out.println("Multiplication is: " +mul);
		int add=first+second;
		System.out.println("Addition is: " +add);
		int sub=first-second;
		System.out.println("Substration is: " +sub);
		int div=first/second;
		System.out.println("Division is: " +div);

	}

}
