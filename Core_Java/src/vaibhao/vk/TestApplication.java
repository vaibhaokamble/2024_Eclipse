package vaibhao.vk;

class Test{
	int number;
	Test(int num){
		number=num;
	}
}
public class TestApplication {

	public static void main(String[] args) {
		Test t1=new Test(100);
		Test t2=new Test(100);
		System.out.println("Hashcode of first object t1 :"+System.identityHashCode(t1));
		System.out.println("Hashcode of first object t2 :"+System.identityHashCode(t2));
		if (t1==t2) {
			System.out.println("Object is equal");
		} else {
			System.out.println("Object is not equal");
		}
	}
}
