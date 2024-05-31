package vaibhao.vk;

public class StringDataApp {
	public class WrapperClassApplication {
		public static void main(String[] args) {
			String str = "good morning india";
			int index = str.indexOf("morning");
			if (index != -1) {
				System.out.println("Data Found ");
			} else {
				System.out.println("Data not found");
			}
		}
	}

}
