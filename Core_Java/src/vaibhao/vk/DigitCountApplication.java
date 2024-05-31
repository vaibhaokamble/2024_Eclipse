package vaibhao.vk;
import java.lang.annotation.Retention;
import java.util.*;
class DigitCount{
	int number;
	void setValue(int num){
		number=num;
		
	}
	int getDigitCount() {
		int count=0;
		int temp=number;
		while (temp !=0) {
			temp=temp/10;
			count++;
		}
		return count;
	}
}
public class DigitCountApplication {

	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=v.nextInt();
		DigitCount gc= new DigitCount();
		gc.setValue(number);
		gc.getDigitCount();
		System.out.println("Total number is: "+gc.getDigitCount());
	}
}
