package vaibhao.vk;

import java.util.*;

public class TestCollectionApplication {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Employee emp[] = new Employee[5];
		for (int i = 0; i < emp.length; i++) {
			Scanner xyz = new Scanner(System.in);
			System.out.println("Enter name id and salary of employee");
			String name = xyz.nextLine();
			int id = xyz.nextInt();
			int sal = xyz.nextInt();
			emp[i] = new Employee(name, id, sal);
			al.add(emp[i]);
		}
		System.out.println("Before Sorting Employee Data");
		for (Object obj : al) {
			Employee e = (Employee) obj;
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
		}
		Collections.sort(al);
		System.out.println("After sorting employee data");
		for (Object obj : al) {
			Employee e = (Employee) obj;
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
		}
	}
}