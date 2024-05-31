package vaibhao.vk;

public class StringToConcatApp {

	public static void main(String[] args) {
		String s = "good";
		String s1 = " bad";
		String result = myConcat(s, s1);
		System.out.println(result);
	}

	public static String myConcat(String first, String second) {
		return first + second;
	}
}
