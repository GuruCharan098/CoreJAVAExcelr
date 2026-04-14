package JavaOOPSExamples;

public class JavaDefaultConstructor {
	
	int id;
	String name;
	
	// User Define 
//	JavaDefaultConstructor(){
//		id = 101;
//		name = "GuruCharan";
//	}
	void display() {
		System.out.println("Id : " + id + " " + "Name : " + name);
	}
	
	public static void main(String[] args) {
		JavaDefaultConstructor S1 = new  JavaDefaultConstructor();  // Default Constructor
		S1.display();
	}

}
