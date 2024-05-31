package vaibhao.vk;
import java.util.*;
public class VectorGFetchApplication {

	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add(100);
		vector.add(200);
		vector.add(300);
		vector.add(400);
		vector.add(500);
		vector.add(600);
		for(int i=0; i<vector.size(); i++) {
			Object object=vector.get(i);
			System.out.println(object);
		}
	}

}
