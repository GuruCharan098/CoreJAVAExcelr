package testProject1;


//4. protected members :

class ProtectedMembers {
	protected int a = 40;
}

public class JavaMembersModifiers extends ProtectedMembers {
	
	
	void displayProtectedMember() {
		System.out.println("Protected Value : "+ a);
	}
	
	// In Java Members Modifiers/ Access Modifiers :  Public, Protected , Default and Private 
	//1. Public Members : Purpose : data/method use as Globally...
	
	public int x = 20;
	
	public void show() {
		System.out.println("Public Values" + x);	
	}
	
	//2. Default Members : No-Modifier :  
	int y = 30;
	
	void display() {
		System.out.println("Default Values" + y);
	}
	
	//3. Private Members : Used for Security and It accessible only inside the same class. 
	
	private int z = 30;
	
	private void show1() {
		System.out.println("Default Values" + z);
	}
	
	 
	public static void main(String[] args) {
		JavaMembersModifiers obj = new JavaMembersModifiers();
		obj.show();
		obj.display();
		obj.show1();
		obj.displayProtectedMember();
	}
		
}
