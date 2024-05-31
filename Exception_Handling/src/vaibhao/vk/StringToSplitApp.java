package vaibhao.vk;

public class StringToSplitApp {
	public static void main(String[] args) {
		 String str="good morning india i like india india is my country";
		 
		 String words[]=str.split(" ");
		 
		 for(int i=0;i<words.length;i++) {
			 System.out.println(words[i]);
		 }
		 System.out.println("Total number of words "+words.length);
	}
}

