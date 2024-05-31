package vaibhao.vk;

import java.util.*;

public class LinkedListApplication {
	public static void main(String[] args) {
		Stack s = new Stack();
		Scanner xyz = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1:PUSH");
			System.out.println("2:View");
			System.out.println("3:Delete top value");
			System.out.println("Enter your choice");
			choice = xyz.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter value in stack");
				int value = xyz.nextInt();
				s.push(value);
				break;
			case 2:
				ListIterator li = s.listIterator(s.size());
				while (li.hasPrevious()) {
					Object obj = li.previous();
					System.out.println(obj);
				}
				break;
			case 3:
				boolean b = s.isEmpty();
				if (b) {
					System.out.println("Data not present in stack");
				} else {
					Object obj = s.pop();
					System.out.println("Deleted value is " + obj);
				}
				break;
			default:
				System.out.println("Wrong choice");
			}
		} while (true);
	}
}