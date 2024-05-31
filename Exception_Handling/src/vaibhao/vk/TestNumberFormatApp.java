package vaibhao.vk;

public class TestNumberFormatApp
{   static int a[]; //reference without new keyword
    public static void main(String x[])
    {  
       try
       {
         String s="12345 ";
	 int a= Integer.parseInt(s);
	 System.out.println(a);
       }
       catch(NumberFormatException ex)
       { System.out.println("Error is "+ex);
       }
    }
}
