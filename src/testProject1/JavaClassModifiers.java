package testProject1;

public class JavaClassModifiers {

}

class Ab{
	final void show() {
		System.out.println("Hello");
	}
}

abstract class A{
	abstract void show();
}

class B extends A{
	void show() {
		System.out.println("Implemented");
	}
	public static void main(String[] args) {
		B b = new B();
		b.show();
	}
}

class test{
	public static void main(String[] args) {
		double num = 10.0/3;
		System.out.println(num);
	}
}