package vaibhao.vk;
import java.util.*;
class Circle{
	float radius,pi=3.14f,area;
	void setRadius(float r) {
		radius=r;
	}
	void showArea() {
		area=radius*radius*pi;
		System.out.println("The radius is: "+area);
	}
}
public class CircleApplication {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		System.out.println("Enter the radius of circle :");
		float radius=v.nextFloat();
		Circle c = new Circle();
		c.setRadius(radius);
		c.showArea();
	}

}
