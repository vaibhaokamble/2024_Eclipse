package vaibhao.vk;
import java.util.*;
class Sum{
	int s=0;
	void claSum(int ...x) {
		for (int i = 0; i < x.length; i++) {
			s=s+x[i];
		}
		System.out.println("addition of variable argument: "+s);
	}
}
public class VariableArgument {
	public static void main(String[] args) {
		Sum s = new Sum();
		s.claSum(10,20,30,40,50,60,70,80,90,100);
	}
}
