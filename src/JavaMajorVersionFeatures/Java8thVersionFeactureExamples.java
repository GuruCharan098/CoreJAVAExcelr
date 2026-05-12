package JavaMajorVersionFeatures;
import java.util.concurrent.*;
 import java.awt.*;
 import java.awt.event.*;

// Java 6 : Scripting support. 
// Java 7 : <> Diamond Operator, Switch Case. 

//	Java 8  New Features : 
///    A.  Lambda Expression : it also known as anonymous functions or closures. The main objective of it's to bring benefits of functional programming into java.  
///                                     anonymous(nameless) function, no return type and access modifiers.
///  Imp Rule for Lambda Expression required Functional interfaces. 
 
interface Addtion{
	   void add(int a, int b);
}
interface S1{
	public void  get(String S1);
}

public class Java8thVersionFeactureExamples {
	 public static void main(String[] args) {
			 
		//Lambda Expression :
		 Addtion obj = (a,b) -> {
			 System.out.println("Addition = "+ (a+b));
		 };
			obj.add(10, 20);
			
		S1 s = (str) -> {
				System.out.println(str);
		};
		s.get("Hello");
			
	 } 
	 
}

///   B.  Functional Interfaces : Single abstract method syntax SAM, non-overriding abstract methods.
/// 
// FUNCTIONAL INTERFACES  methods : 
// Example :-

interface Interf{
	void m1();

	static void m3() {
		System.out.println("Static Method");
	}
	default void m2() {
		System.out.println("Default Method");
	}
}

class JavaFuntionalInterfaceDemo{
	
	public static void main(String[] args) {
		
		Interf i = () -> {
			System.out.println("Abstract Method");
		};
		
		i.m1();  // abstract method 
		i.m2(); // default method 
		Interf.m3(); // static method 
	}
}



//Anonymous Inner Class Vs Lambda Expression :
// 1. Extends Class, Extend abstract class, Implement interface with multiple methods 
// 2. Functional Interface (One Abstract Method required.)

//example this keyword in lambda Vs Anonymous inner 
interface DemoInterf{
	void m1();
}

class TestDemo{
	int x = 777;
	
	public void m2() {;
		DemoInterf di = () ->{
			int x = 888;
			
			System.out.println(x);
			System.out.println(this.x);
		};
		di.m1();
	}
	
	public static void main(String[] agrs) {
		TestDemo td = new TestDemo();
		
		td.m2();
	}
}
//  1.  Runnable  run() :  java.lang package. 

class MyRunnableDemo implements Runnable{
	public void run() {
		  for(int i = 0; i<5 ; i++) {
		  System.out.println("Thread Running"+ i);
		 }
	}
}
class RunnableFIDemo{
	
      public static void main(String[] args) {
//    		  Runnable r = () -> {
//    			  System.out.println("Thread Running...");
//    		  };
    	  
    	  MyRunnableDemo mrd = new MyRunnableDemo(); 
    	  
    	  //  Thread t = new Thread(new Runnable());  anonymous class for Runnable Interface. 
    		  Thread t = new Thread(mrd);
    		  
                  t.start();
                  
                  for(int i = 0; i<5; i++) {
                	  System.out.println("Main Thread running.."+ i);
                  }
    		  
    	  }
      }
// call() : call-able Interface used to perform tasks like Returns values, May throw exception. java.util.concurrent package. 

class CallableDemo{
	public static void main(String[] args) throws Exception {
		
		Callable<Integer> c = () ->{
			int sum = 10 + 20;
			return sum;
		};
		
		ExecutorService sr = Executors.newSingleThreadExecutor();
		
		Future<Integer> result = sr.submit(c);
		
		System.out.println(result.get());
		sr.shutdown();
	}
}

// Action listener actionPerformed() : java.awt.event package 
       class ActionListenerDemo{
    	   public static void main(String[] args)  {
    		   
    		   Frame f = new Frame();
    		   
    		   Button b = new Button("Click Me");
    		   
    		   b.setBounds(100, 100, 100, 40);
    		   
    		   b.addActionListener(new ActionListener(){
    			   public void actionPerformed(ActionEvent e) {
    				   System.out.println("Button Clicked...");
    			   }	   
    		   });	
    		   
    		   f.add(b);
    		   
    		   f.setSize(300, 300);
    		   f.setLayout(null);
    		   f.setVisible(true);
    	   }
       }
// Method Reference : 
       interface Sayable{
    	   void say();

       }   
       class MethodRefDemo{
    	   
    	   public static void hello() {
    		   System.out.println("Hello Java");
    	   }
    	   public static void main(String[] args) {
    		   
    		   Sayable s = MethodRefDemo :: hello;
    		   
    		   System.out.println(s);
    		   s.say();
    	   }
       }
    
       
 //  Lambda Expression VS Functional Interface
//       1. Lambda Expression works only with FI,
//          Whenever FI exists, lambda can be used. 
       
       
       // Without Lambda Expression : 
       interface Interf1 {
    	   void methodOne();
    	   
       }
       class DiffClass implements Interf1{
    	   
    	   public void methodOne() {
    		   System.out.println("Method One Execution...");
    	   }
       }
       class DemoResult{
    	   public static void main(String[] args) {
    		   
    		   Interf1 i = new DiffClass();
    		   i.methodOne();
    	   }
       }
   
       // With Lambda Expression :
       interface Interf2{
    	   void methodTwo(int a , int b );
       }
       
       class Test{
    	   public static void main(String[] args) {
    		   Interf2 f2 = (a, b) -> System.out.println("Method Two execution...."+ (a+b));
    		   
    		   f2.methodTwo(23 , 77);
    	   }
       }

// Differences Interface with Default methods and abstract class.
                         ///  Interface With default Method  !=  Abstract Class
       
 //      1. variable behavior is public, static and final , No chance of Instance. 
              // may be a chance of instance variables. 
       
   //    2. can not declare Constructors,  
                 //Can declare constructors. 
       
   //   3. FI with Default Method can refer Lambda Expression, 
                // Can't refer Lambda Expression. 
       
    // 4.   Can't Override Methods , 
           // Can Override Methods 
       