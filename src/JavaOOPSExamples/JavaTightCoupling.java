package JavaOOPSExamples;

public class JavaTightCoupling {
	void start() {
	   System.out.println("Welcome to Java Tight Coupling Example");
	}
}

class ExampleLTC{
	JavaTightCoupling LTC = new JavaTightCoupling();
	
	void process() {
		LTC.start();
	}
	
	 public static void main(String[] args) {
		 
		 ExampleLTC Ex1 = new ExampleLTC();
		 Ex1.process();
		 
	 }
}
