package vaibhao.vk;

import java.util.*;

public class SortPlayerById implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Product p1 = (Product) o1;
		Product p2 = (Product) o2;
		if (p1.getId() > p2.getId()) {
			return 1;
		} else if (p1.getId() < p2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
}