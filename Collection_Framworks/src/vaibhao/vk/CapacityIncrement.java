package vaibhao.vk;
import java.util.*;
public class CapacityIncrement {

	public static void main(String[] args) {
		Vector vector = new Vector(3,1);
		System.out.println("Capacity of vector: " +vector.capacity());
		vector.add(100);
		vector.add(200);
		vector.add(300);
		vector.add(400);
		vector.add(500);
		
		System.out.println("data in vector: " +vector);
		System.out.println("now capacity of vector is: "+vector.capacity());
	}

}
