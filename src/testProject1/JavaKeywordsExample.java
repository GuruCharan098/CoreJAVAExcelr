package testProject1;

interface Car{
	void Color();
}

class Ford implements Car{
	String name;

	Ford(String name){
		this.name = name;
	}
	
	public void Color() {		
		System.out.println("Red" +" "+ this.name);
	}
}

class Parent {
	void ShowParent() {
		System.out.println("Parent Class");
	}
}

class Child extends Parent{
	void ShowChild() {
		super.ShowParent();
		System.out.println("Child Class");
	}
}

class TestThrow{
	static void checkAge(int age) throws Exception {
		if(age < 18) {
			throw new Exception("Not eligible");
		}
	}
}

public class JavaKeywordsExample {
	public static void main(String[] args) {
		 try {
		      int n = 20;
		      TestThrow.checkAge(n);
		      System.out.println("Yes, it's eligible ");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		Child ch = new Child();
		ch.ShowChild();
		
		Ford fd = new Ford("Riding_Horse");
		fd.Color();	
		
//	Data Types Keyword : 
		int age = 20;
		float price = 10.5f;
		double salary = 2400.40;
		boolean isActive = true;
		char grade = 'A';
		
		System.out.println(age+" "+ price+" "+salary+" "+isActive+" "+grade);
		
//Control flow Keywords : 
		int num = 6;
		
		if(num > 0) 
			System.out.println("Possitive");
		else if(num>1) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Negative");
		}
			
		
		switch(num) {
		case 1:
			System.out.println("One");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Other Number");
			
		}
		
		for(int i = 1; i < 3; i++) {
		System.out.println("For Loop : " + i);
		}		
		int j = 0;
         while(j < 4) {
		System.out.println("While Loop : " + j);
		j++;
		}
	
	//	int k = 1;
//		do {
//			System.out.println("Do-While Loop : " + k);
//			k++;
//		}while(k < 3);
		
// Access Modifiers..
//		public int a = 10;
//		private int b = 20;
//		protected int c = 30;
		
// Exception Handling Example : 
		
//		try {
//			int a = 10/0;
//		}catch(ArithmeticException e) {
//			System.out.println("Execption Caught");
//		}finally {
//			System.out.println("Always Executes");
//		}
//		
		
		
		
	}

}


