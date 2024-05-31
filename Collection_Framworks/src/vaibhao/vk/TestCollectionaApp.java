package vaibhao.vk;

import java.util.*;

public class TestCollectionaApp {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);
		System.out.println("Before Sorting");
		for (Object obj : al) {
			System.out.print(obj + "\t");
		}
		System.out.println("\nAfter Sorting\n");
		Collections.sort(al);
		for (Object obj : al) {
			System.out.print(obj + "\t");
		}
	}
}
