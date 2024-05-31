package vaibhao.vk;

public class BoxingApplication {
	public static void main(String[] args) {
		Double d = 5.4;
		int b = d.intValue(); // Convert double Numeric reference into primitive integer
		System.out.printf("B is %d\n", b);
		Float f = 6.5f;
		long l = f.longValue();// convert Float reference to long type
		System.out.printf("Long l is %d\n", l);
	}
}
