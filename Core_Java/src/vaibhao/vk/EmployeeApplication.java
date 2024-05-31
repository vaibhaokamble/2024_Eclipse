package vaibhao.vk;

import java.util.*;

class Employee {
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	String name;
	int salary;
}

public class EmployeeApplication {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		System.out.println("enter the id: ");
		int id = v.nextInt();
		System.out.println("enter the name: ");
		String name = v.next();
		System.out.println("enter the salary: ");
		int salary = v.nextInt();

		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);

		System.out.println(employee.getId() + "\t" + employee.getName() + "\t" + employee.getSalary());
	}
}
