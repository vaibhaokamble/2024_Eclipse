package vaibhao.vk;

import java.util.Scanner;

public class Swapping_Program {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a=v.nextInt();
		System.out.println("Enter the second number : ");
		int b=v.nextInt();
		
		System.out.println("Before swapping the number");
		System.out.println("first number is : "+a);
		System.out.println("second number is : "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping the number");
		System.out.println("first number is : "+a);
		System.out.println("second number is : "+b);
	}
}
