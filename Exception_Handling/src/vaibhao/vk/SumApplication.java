package vaibhao.vk;

public class SumApplication {
	public static void main(String[] args) {
		 String s="abc123mno456stv";
		 int l=s.length();
		 int sum=0;
		 for(int i=0;i<l;i++) {
			 char ch=s.charAt(i);
			 if(ch>=48 && ch<=57) {
				 sum=sum+(ch-48);
			 }
		 }
		 System.out.printf("Sum of all values %d\n",sum);
	}
}