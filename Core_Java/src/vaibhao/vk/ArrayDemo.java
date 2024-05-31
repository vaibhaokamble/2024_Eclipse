package vaibhao.vk;
import java.util.*;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		int a[];
		a=new int[5];
		System.out.println("enter the value of array");
		for (int i = 0; i < a.length; i++) {
			a[i]=v.nextInt();
		}
		System.out.println("Display the array");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%d]-->%d\n",i,a[i]);
		}
	}
}
