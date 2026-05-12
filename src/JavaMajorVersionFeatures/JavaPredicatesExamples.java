package JavaMajorVersionFeatures;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Predicate.*;
import java.util.Collection;
import java.util.*;

// Predicates in Java : It's kind of function with a single arguments and returns boolean value. 
           ///  it also known as Functional interface and it contain only a method i.e test();
   // Syntax  :
      interface Predicate<T>{
    	  public boolean test(T t);
      }
      
      
public class JavaPredicatesExamples {
          public static void main(String[] args) {
        	  
        	  Predicate<Integer> P = new Predicate<Integer>() {
        		  public boolean test(Integer i ) {
        			  if(i > 10) {
        				  return true;
        			  }
        			  else {
        				  return false;
        			  }
        		  }
        	  }; 
        	  System.out.println(P.test(100));
        	  System.out.println(P.test(7));
          }
//	 public static void main(String[] args) {
//   	  Predicate<Integer> P = i -> (i > 10);
//   	  System.out.println(P.test(100));
//   	  System.out.println(P.test(7));
//     }
}

// Check Collections in Empty or not :

    class testCollection{
    	public static void main(String[] args) {
    		
    		Predicate<Collection> p1 = (c) -> c.isEmpty();
    		
    		ArrayList<Integer> list1 = new ArrayList<>();
    		ArrayList<Integer> list2 = new ArrayList<>();
    		
    		list2.add(10);
    		
    		System.out.println(p1.test(list1));
    		System.out.println(p1.test(list2));
    	}
    }
    
    
   // Predicate Joining methods : 
 ///   1. and() : Works like logical And(&&), Both condition must be true;
 ///   2. or()  : At least one condition must be true;
 ///   3. negate () : Not gate, It's return opposite result();
 
    class TestPreMethods{
    	   public static void main(String[] args) {
    		   int[] x = {0, 5, 10, 15, 20, 25, 30, 45, 35, 55};
    		    
    		   Predicate<Integer> p1 = i -> i > 10;  // if number is Greater then 10;
    		   Predicate<Integer> p2 = i -> i % 2 == 0; // Even numbers
    		   
    		   System.out.println("number is Greater then 10 :" );
    		   m1(p1, x);
    		   System.out.println("Even numbers :");
    		   m1(p2, x);
    		   
//    		   m1(p1.and(p2), x);
//    		   
//    		   m1(p1.negate(), x);
    		   
    		   
    		   
    	   }
    	   
    	   public static void m1(
    			   Predicate<Integer> P, int[] x) {
    		   for(int x1 : x) {
    			   if(P.test(x1)) {
    				   System.out.println(x1);
    			   }
    		   }
    	   }
    }
    
/// -------------------------------------------------------------------------------------------------------------------------

    
// Function In Java :  apply(), it' s in build method for Function FI, 
//    Syntax :
//    	interface function(T, R) {
//    	public R apply(T, t);
//    }
 class FunctionInterfaceDemo{
	 public static void  main(String[] args) {
		 Function<String, Integer> f = s -> s.length();
		 
		 System.out.println(f.apply("EXCLER"));
		 System.out.println(f.apply("soft"));
	 }
 }
 
 // Example Function Functional Interface : 
         class DemoFFI{
        	 public static void main(String[] args) {
        		 
        		 
        		 Function<Integer, Integer> f = (num) -> {
        			 return num * num ;
        		 };
        		 
        		 System.out.println(f.apply(5));
        	 }
         }
 
         
// Consumer F I : 
         class DemoConumerFI{
        	 public static void main(String[] args) {
        		 
        		 Consumer<String> c = (name) -> {
        		        System.out.println(name);
        		        
        		        if(name == "Java") {
        		        	 System.out.println(name + "Developer..");
        		        }
        		        if(name == "HTML") {
        		        	 System.out.println(name + "Designer..");
        		        }
        		       
        		 };
        		 c.accept("Java");
        		 c.accept("HTML");
        	 }
        	 
         }
         
// Supplier F I : 
         
         class DemoSupplierFI{
        	 
        	 public static void main(String[] args) {
        		 
        	 Supplier<String> s = () -> "Hello, Java";
        	 
        	 System.out.println(s.get());
         }
        }
         
 