package vaibhao.vk;

class A {
	A() {
		System.out.println("This is A class:");
	}
}

class B extends A {
	B() {
		System.out.println("This is B class:");
	}
}

class C extends A {
	C() {
		System.out.println("This is C class:");
	}
}

public class InheritananceApp {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		
	}

}
