package JavaOOPSExamples;

public class JavaLowCohesion {
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void login(String user, String password) {
		System.out.println("User"+ " "+ user + " "+ "logged in..");
		
	}
	
	public static void main(String[] args) {
		JavaLowCohesion JLC = new JavaLowCohesion();
		
		JLC.add(23, 43);
		JLC.login("Admin", "Admin@123");
  
    }

}
