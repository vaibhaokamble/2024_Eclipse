package vaibhao.vk;

public class BoxApplication {
	public static void main(String[] args) {
		int a = 100;
		Integer b = a; // auto boxing
		System.out.printf("B is %d\n", b);
		Integer d = 200;
		int c = d;// auto unboxing
		System.out.printf("D is %d\n", d);
	}

}
