package vaibhao.vk;

import java.util.*;

public class IteratorFetch {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		Iterator i = v.iterator();
		while (i.hasNext()) {
			Object obj = i.next();
			System.out.println(obj);
		}
	}
}