package testProject1;


//Extends (Inheritance and Abstraction) Vs Implements (Interface)
interface A {
	void show();
	void display();
}
interface B extends A {
	void display();
}

class Test implements B {
	public void show() {
		System.out.println("Show Method");
	}
    public void display() {
    	System.out.println("Display Method (Resolve Confict)");
	}
    public void display(int a) {
    	System.out.println("Display Method (Confict) " + a);
	}
    public static void main(String[] args) {
    	Test t = new Test();
    	t.show();
    	t.display();
    	t.display(1);
    }
}


// Interface : Implementation and Declaration (Method and variable)
interface Animal{
	int x = 20;
	void sound();
}

class Dog implements Animal{
	public void sound() {
		System.out.println("Dogs barks..");
	}
	
    public static void main(String[] args) {
    	Dog d = new Dog();
    	d.sound();
    	System.out.println("data" + x);
    }
}


public class JavaInterfaceExamples {

}
