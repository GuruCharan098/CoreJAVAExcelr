package JavaOOPSExamples;

class ParentOfSuper{
	int xy = 100;
	
	void parentExecution() {
		System.out.println("Parent method");
	}
}

public class JavaSuperKeyword extends ParentOfSuper {
	
	int xy = 200;
	
	void show() {
		super.parentExecution();
		System.out.println(this.xy);
		System.out.println(super.xy);
	}
	
	public static void main(String[] args) {
		new JavaSuperKeyword().show();
	}

}
