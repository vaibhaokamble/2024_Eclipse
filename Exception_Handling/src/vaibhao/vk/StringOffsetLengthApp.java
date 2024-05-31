package vaibhao.vk;

public class StringOffsetLengthApp {
	public static void main(String[] args) {
		char ch[] = new char[] { 'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g', ' ', 'i', 'n', 'd', 'i',
				'a' };

		String s = new String(ch, 5, 7);
		System.out.println(s);// string offset length
	}

}
