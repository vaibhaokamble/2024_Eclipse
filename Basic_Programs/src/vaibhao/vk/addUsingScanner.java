package vaibhao.vk;

import java.util.Scanner;

public class addUsingScanner {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int a,b,c;
        System.out.println("enter two value: ");
        a=v.nextInt();
        b=v.nextInt();
        c=a+b;
        System.out.println("Addition is : "+c);
    }
}
