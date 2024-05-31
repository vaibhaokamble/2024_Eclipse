package vaibhao.vk;

import java.util.*;

public class VectorApplication {

	public static void main(String[] args) {
		Vector vector = new Vector();
		System.out.println("capacity of vector: " + vector.capacity());
		
	vector.add(100);
	vector.add(200);
	vector.add(300);
	vector.add(400);
	vector.add(500);
	System.out.println("vector: "+vector );
	System.out.println("cpacity of apacity of vector: " + vector.capacity());
	}
}
