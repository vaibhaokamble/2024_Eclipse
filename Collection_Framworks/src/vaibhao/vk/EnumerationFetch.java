package vaibhao.vk;

import java.util.*;

public class EnumerationFetch {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		Enumeration enm = v.elements();
		while (enm.hasMoreElements()) {
			Object obj = enm.nextElement();
			System.out.println(obj);
		}
	}
}