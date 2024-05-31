package vaibhao.vk;

import java.util.*;

public class AccendingOfVectorApp {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(100);
		v.add(20);
		v.add(300);
		v.add(40);
		v.add(500);
		System.out.println("Before sorting data");
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + "\t");
		}
		int len = v.size();
		for (int i = 0; i < len; i++) {
			for (int j = (i + 1); j < len; j++) {

				Object prev = v.get(i);
				Object next = v.get(j);
				if ((int) prev > (int) next) {
					v.set(i, next);
					v.set(j, prev);
				}
			}
		}
		System.out.println("\nAfter sorting");
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + "\t");
		}
	}
}