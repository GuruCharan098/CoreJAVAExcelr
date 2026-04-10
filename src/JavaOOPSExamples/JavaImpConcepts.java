package JavaOOPSExamples;
import java.util.*;

/// Data Hiding in Java as OOP's Concepts. '
class Account {
	private double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		
		return balance;
	}
	
   public void setBalance(double balance) {
	if(balance>0) {
		this.balance = balance;
	}else
		System.out.println("Invalid Amount");
	}
}

/// Abstraction in Java as OOP's Concepts. '
    interface ATM{
    	void withdraw();
    	void checkBalance();
    }
    class SBIATM implements ATM {
    	public void withdraw(){
    		System.out.println("Withdraw Successful");
    	}
    	public void checkBalance(){
    		System.out.println("Balance is 10,000");
    	}
    }
    
  /// Encapsulation in Java as OOP's Concepts. 
  class Student{
	  private int marks;
	  public void setMarks(int marks) {
		  if(marks>=0) {
			  this.marks = marks;
		  }
	  }  
	  public int getMarks() {
		  return marks;
	  }
  }
  
////// Inheritance in Java as OOP's Concepts(IS - A RelationShip).
    class Animal{
    	void eat() {
    		System.out.println("Eating...");
    	}
    }
    
    class Dog extends Animal{
    	void bark() {
    		System.out.println("Barking...");
    		
    	}
    }  
    class Cat extends Animal{
    	void meow() {
    		System.out.println("Meow...");
    	}
    }
    
    /// Composition or Aggregation (HAS A Relationship)
    class Engine{
    	void Start() {
    		System.out.println("Engine Started..");
    	}
    }
    class Car{
    	Engine e = new Engine();
    	
    	void drive() {
    		e.Start();
    		System.out.println("Car Running...");
    	}
    }
    /// Polymorphism in java Method over-loading (Compile Time) ( Methods name will be same, different behavior or functional code. )
    class Overloading {
    	
    	void show() {
    		System.out.println("No Arguments/Parameters");
    	}
    	void show(int a) {
    		System.out.println("Integer :" + a);
    	}
        void show(double d) {
        	System.out.println("Double :" + d);	
    	}
    }
  /// Polymorphism in java Method Over-Riding (Runtime)
   class Parent{
	   void show() {
		   System.out.println("Parent Class");
	   }
   }
   class Child extends Parent {
	   void show() {
		   System.out.println("Child Class");
	   }
	   
   }
   
   // Constructor Methods
   
   class Faculty{
	   String name;
	   
	   Faculty(String name){
		   this.name = name;
	   }
	   
	   void display() {
		   System.out.println("Name :"+ name);
	   }
   }
   
   /// Singleton Classes :
    class Singleton {
    	private static Singleton obj;
    	
    	private Singleton() {};
    	
    	public static Singleton getInstance() {
    		if(obj==null) {
    			obj = new Singleton();
    		}
    		return obj;
    		
    	}
    }
   
    

public class JavaImpConcepts {
	public static void main(String[] args) {
		
		/// List and ArrayList in Java
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("Python");
		System.out.println(list);
		
		/// Singleton Classes :
		Singleton Sng1 = Singleton.getInstance();
		Singleton Sng2 = Singleton.getInstance();
		System.out.println(Sng1==Sng2);
		
		// Constructor Methods,,,,
		Faculty F1 = new Faculty("Guru charan das");
		F1.display();
		
		
		/// Polymorphism in java Method Over-Riding (Runtime)
		Parent P = new Child();
		Parent P1 = new Parent();
		
		P.show();
		P1.show();
		
		/// Polymorphism in java (Method overloading ( Methods name will be same, different behavior or functional code. )
		Overloading obj = new Overloading();
		obj.show();
		obj.show(10);
		obj.show(5.5);
		
		
		 /// Composition or Aggregation (HAS A Relationship)
		 Car c1 = new Car();
		 c1.drive();
		 
		/// Inheritance in Java as OOP's Concepts(IS - A RelationShip).
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.eat();
		d.bark();
		
		c.meow();
		c.eat();
		
		// Encapsulation in Java as OOP's Concepts.	
		Student s1 = new Student();
		s1.setMarks(90);
		System.out.println("Marks : "+ s1.getMarks());
		
		
		/// Abstraction in Java as OOP's Concepts. '
		ATM atm = new SBIATM();
		atm.withdraw();
		atm.checkBalance();
	
		/// Data Hiding in Java OOP's Concepts. '
		Account acc = new Account(5000);
		System.out.println("Balance : " + acc.getBalance());
		acc.setBalance(9000);
		System.out.println("Updated Balance : " + acc.getBalance());
		
		
		
	}

}
