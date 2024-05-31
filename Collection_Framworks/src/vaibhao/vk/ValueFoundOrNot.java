package vaibhao.vk;
import java.util.*; 
public class ValueFoundOrNot {

	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		System.out.println("enter value for search");
		int value=v.nextInt();
		Vector vector=new Vector();
		vector.add(100);
		vector.add(200);
		vector.add(300);
		boolean b = vector.contains(value);
		if (b) {
			System.out.println("Value is found");
		}
		else {
			System.out.println("Value not found");
		}
	}
}
