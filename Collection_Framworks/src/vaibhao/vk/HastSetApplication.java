package vaibhao.vk;

import java.util.*;

public class HastSetApplication {
	public static void main(String[] args) {
		TreeSet hs = new TreeSet();
		hs.add(55);
		hs.add(223);
		hs.add(456);
		hs.add(2345);
		hs.add(1);
		hs.add(229);
		hs.add(435);
		hs.add(20);
		hs.add(55);
		hs.add(223);
		for (Object obj : hs) {
			System.out.println(obj);
		}
	}
}