package testProject1;


// Without Exception Handling Program....
public class JavaExceptionExample {

	public static void main(String[] args) {
		System.out.println("Start");
		int result = 10/0; // Not define value. 
		System.out.println("End" + result);
	}
}
// Exception Handling Program....
class DemoException {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			int result1 = 10/0;	
		}catch(ArithmeticException e) {
			System.out.println("Handled division by Zero");
		}
		System.out.println("End");
	}
}

// Runtime Stack Mechanism : Default exception handling
 class TestStack {
	 void m1() {
		 System.out.println("Start");
		 m2();
	 }
	 void m2(){
		 m3();
	 }
	 void m3() {
		 System.out.println(10/0);
		 System.out.println("End");
	 }
	 public static void main(String[] args) {
		 new TestStack().m1();
	 }
	 
 }
 // Customized Handling (Try-Catch);
 
 class Custom {
	public static void main(String[] args) {
		 try {
			 String s = null;
			 System.out.println(s.length());
			 
		 }catch(ArithmeticException e) {
			 System.out.println("Null Value detected");
		 }
		 System.out.println("End Custom");
	 }
 }
// Printing Exception Info/Metadata;
 class TestPrintInfo{
	 public static void main(String[] args) {
		 try {
			 int a = 10/0;
			 System.out.println("Hello");
			 
		 }catch(Exception e) {
			 System.out.println("1. Println(e)");
			 System.out.println(e);
			 
			 System.out.println("2. ToString Converts");
			 System.out.println(e.toString());
			 
			 System.out.println("3. Print Message");
			 System.out.println(e.getMessage());
			 
			 System.out.println("4. Print Stack trace");
			 e.printStackTrace();
		 }
	 }
 }
 
 // multiple Catch bodies : 
 
 class MulCatch{
	 public static void main(String[] args) {
		 try {
			 int result = 10/0;
		 }catch(ArithmeticException e) {
			 System.out.println("Arithemetic");
			 
		 }
		 try {
			 int arr[] = new int[3];
			 arr[5] = 10; 
		 }
		 catch(ArrayIndexOutOfBoundsException e){
			 System.out.println("Array Error");
		 } 
		 System.out.println("End");
	 }
 }
 
 // Finally Block in Java :
 class FinallyCheck{
	 public static void main(String[] args) {
		 try {
			 // integer result = 10/0;
			 System.exit(0);
			 System.out.println("Try Block");
		
		 }finally {
			 System.out.println("Finally Block"); 
		 }
	 }
 }
 // Finally scope behavior for Return keyword:
 class FinallyReturn{
	 public static void main(String[] args) {
		 System.out.println(test());
	 }
	 static int test() {
		 try {
			 return 10; 
		 }
		 finally {
			System.out.println("Finally Scope");
			//return 20; 	
		 }
	 }
	 
 }
 
 // Finally(Scope) VS Final(Keyword) Vs Finalize(Method)....
 //finalize Method :
// class TestFinalize {
//	 @SuppressWarnings("deprecation")
//	 protected void finalize() {
//		 System.out.println("Finalize Called");
//	 }
//	 public static void main(String[] args) {
//		 TestFinalize t1 = new TestFinalize();
//		 
//		 t1 = null;  // object eligible for GC (garbage Collection)
//		 System.gc();
//		 System.out.println("End of main method");
//	 }
// }
 
 // Nested Try-catch 
 
 class NestedTryCatch{
	 public static void main(String[] args) {
		 try {
			 int arr[] = {1,2,3};
			 arr[5] = 10; 
			 try {
				 int a = 10/0;
			 }catch(ArithmeticException e){
				 System.out.println("Inner Handled "+ e.getMessage());
			 }
		 }catch(ArrayIndexOutOfBoundsException e){
			 System.out.println("Array Error");
		 }
	 }
 }
 
 // Throw keyword :
 class ThrowDemo{
	 static void checkAge(int age) {
		 if(age < 18) {
			 throw new ArithmeticException("Not Eligible for Vote");
		 }else {
			 System.out.println("Yes..! Eligible for Vote");
		 }
	 }
	 
	 public static void main(String[] args) {
		 checkAge(18);
	 }
 }
 
 // Throws Keyword : 
 class ThrowsDemo {
	    // Method that delays execution
	    static void waitForTask() throws InterruptedException {
	        System.out.println("Task started...");
	        Thread.sleep(2000); // may cause InterruptedException  
	        System.out.println("Task completed after 2 seconds");
	    }

	    public static void main(String[] args) {
	        try {
	            waitForTask();  // calling method
	        } catch (InterruptedException e) {
	            System.out.println("Exception handled in main method");
	        }

	        System.out.println("Program continues...");
	    }
	}
 
 // Exception handling Keywords : Try, Catch, Finally, Throw and Throws
 //Try : wrap risk code / exceptional code
 // Catch : handle exception 
 // finally : always executes
 // throw :  manually throw exception 
 // throws : declare exception
 
 class DemoExceptionKeywords{
	    static void checkAge(int age) {
	    	if(age < 18) {
	    		throw new ArithmeticException("Not Eligible");
	    	}else {
	    		System.out.println("Eligible");	   
	    	}	
	    }
	    public static void main(String[] args) {
    		try {
    			checkAge(15);
    		}catch(ArithmeticException e){
    			System.out.println(e.getMessage());
    		}finally {
    			System.out.println("Execution Completed");
    		}
    	}
 }
 
 // Customized exception :  User defined exceptions 
  class InvalidAgeException1 extends Exception {
	  InvalidAgeException1(String msg){
		  super(msg);
	  }
  }
  
  class TestExample{
	  static void checkAge(int age) throws InvalidAgeException1 {
		  if(age < 18) {
			  throw new InvalidAgeException1("Too young");
		  }
	  }
	  
	  public static void main(String[] args) {
		  try {
			  checkAge(15);
		  }catch(InvalidAgeException1 e) {
			  System.out.println(e.getMessage());
		  }
	  }
  }
  
// Top 10 Common Exceptions in Java : 
//  1. ArithmeticException : Divide by zero;
// 2. NullPointerException : Null object access;
// 3. ArrayIndexOutOfBoundException : Invalid index;
// 4. NumberFormatException : wrong number format; 
// 5. ClassCastException : Invalid Casting ;
// 6. IllegalArgumentException : Invalid Argument ; 
  
  class demo {
	  public static void main(String[] args) {
		  Thread t = new Thread();
		  t.setPriority(15); // valid ( 1 to 10)
	  }
  }
  
// 7. IOException : Input output issues. 
// 8. Interrupted Exception : thread interruption; 
// 9. FileNotFoundException : file missing ;
// 10. SQLException : Database Error ;
  
// Exception Propagation : if a method does not handle an exception, it passes it to it's caller;
  
  class DemoTest{
	  static void m1() {
		  int x = 10/0;
	  }
	  static void m2(){
		  m1();
	  }
	  public static void main(String[] args) {
		  try {
			  m2();
		  }catch(Exception e) {
			  System.out.println("Handled by main" + e.getMessage());
		 }
	  }
  }
        
// Re throwing an Exception : 
  class Demos{
	  static void m1() {
		  try {
			  int x= 10/0;
		  }catch(ArithmeticException e) {
			  System.out.println("Logging");
			  throw e;  // Re-throwing Exception
		  }
	  }
	  
	  public static void main(String[] args) {
		  try {
			  m1();
		  }catch(Exception e) {
			  System.out.println("handled Again");
		  }
		  
	  }
  }
  