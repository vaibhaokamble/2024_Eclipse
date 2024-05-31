package vaibhao.vk;
import java.util.*;
public class SumOfVectorApp {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		Iterator i = v.iterator();
		int sum = 0;
		while (i.hasNext()) {
			Object obj = i.next();
			sum = sum + (int) obj;
		}
		System.out.println("Sum of all value is: " + sum);
	}
}