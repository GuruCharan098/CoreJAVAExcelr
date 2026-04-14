package JavaOOPSExamples;


 class ParentTypeCasting {
	void show() {
		System.out.println("Parent method");
	}
}
 class ChildTypeCasting extends ParentTypeCasting {
	void display() {
		System.out.println("Child method");
	}
}
public class JavaObjectTypeCasting {
  public static void main(String[] args) {
	  ParentTypeCasting p = new ChildTypeCasting(); // Up casting 
	  p.show();
	  
	  ChildTypeCasting c1 = (ChildTypeCasting) p; // Down Casting 
	  c1.display();
  }
}
