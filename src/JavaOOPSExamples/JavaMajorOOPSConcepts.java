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
		
		
		
		// Type Casting : 
		//1. Up-casting ( Widening): small to large  
		int a = 30;
		double b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		//2. DownCasting (Narrowing) : large to small 
		double p = 99.99;
		int q = (int) p;
		
		System.out.println(p);
		System.out.println(q);
		
		
	}
	
}



