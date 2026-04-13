package JavaOOPSExamples;


public class JavaMajorOOPSConcepts {
	

	int x = 0;
	static int a = 0;
	
	JavaMajorOOPSConcepts(int x){
		System.out.println("First Constructor Method");
		
	}
	JavaMajorOOPSConcepts(int x , int a){
		System.out.println(" Second Constructor Method");
	}
	
	static {
		System.out.println("Static Block...");
	}
	
	{
		System.out.println("Instance Block...");	
	}


	public static void main(String[] args) {
	
		System.out.println("Main Method Block...");
		JavaMajorOOPSConcepts C1 = new JavaMajorOOPSConcepts(100);
		JavaMajorOOPSConcepts C2 = new JavaMajorOOPSConcepts(100, 200);
	}
	
}



