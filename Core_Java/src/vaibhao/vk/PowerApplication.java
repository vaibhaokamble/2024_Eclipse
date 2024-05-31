package vaibhao.vk;
import java.util.*;

class Power{
	int index,base;
	void setValue(int x, int y) {
		base=x;
		index=y;
	}
	int getPower() {
		int result=1;
		for (int i = 0; i < index; i++) {
			result=result*base;
		}
		return result;
	}
}
public class PowerApplication {
	public static void main(String [] args) {
		Scanner v= new Scanner(System.in);
		Power power=new Power();
		System.out.println("Enter the index and base: ");
		int base=v.nextInt();
		int index=v.nextInt();
		power.setValue(base,index);
		power.getPower();
		System.out.println("result of power: "+power.getPower());
	}
}
