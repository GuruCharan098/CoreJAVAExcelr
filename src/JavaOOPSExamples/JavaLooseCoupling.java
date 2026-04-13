package JavaOOPSExamples;

interface ExampleMethods{
	void start();
	
}

public class JavaLooseCoupling implements ExampleMethods {
	public void start() {
		System.out.println("Welcome to Java Loose Coupling Example");
	}
      
}

class ExampleStructure{
	
	ExampleMethods em ;
	
	ExampleStructure(ExampleMethods em){
		this.em = em;
	}
	
	void processExcecution() {
		em.start();
	}
	
	public static void main(String[] args) {
		ExampleMethods em = new JavaLooseCoupling();
		ExampleStructure es = new ExampleStructure(em);
		
		es.processExcecution();
	}
	
}

