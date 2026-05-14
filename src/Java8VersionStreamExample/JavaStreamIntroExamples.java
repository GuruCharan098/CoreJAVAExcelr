package Java8VersionStreamExample;

import java.util.*;
import java.util.stream.*;

// Java Streams J8 : java.util.stream packages. 


//Difference B/w IO stream and Java Stream :
/// Syntax of stream  : 

//  List<Integer> list = Arrays.asList(10,20,30);
//  list.stream()
//         .forEach(System.out::println);

/// Syntax of i.o Streams :
    
  //  FileInputStream fis = new FileInputStream("abc.text");

 
public class JavaStreamIntroExamples {
                   public static void main(String[] args) {
                	   
                	   ArrayList<Integer> list = new ArrayList<>();
                	   
                	   list.add(10);
                	   list.add(20);
                	   
                	   Stream<Integer> stream = list.stream();
                	   
                	   stream.forEach(System.out::println);
                	   
                   }
}

/// Two Phases of Java 8Th Stream : 


// 1. Configuration Phase :  filter() , map();
     //mean preparing data before final processing. 

///example filter() : 
  class  JavaConfigFilter {
	  public static void main(String[] args) {
		  ArrayList<Integer> list = new ArrayList<>();
		  
		  for(int i =1; i<=10 ; i++) {
			  list.add(i);
		  }
		  
		  List<Integer> eventList = list.stream()
				                       .filter( i -> i%2 ==0 )
				                       .collect(Collectors.toList());
		  
		  System.out.println(list);
		  System.out.println(eventList);
	  }
  }
	
// example Map() : 
    class JavaConfigMap{
    	  public static void main(String[] args) {
    		  
    		  ArrayList<String> list1 = new ArrayList<>();
    		  
    		  list1.add("Java");
    		  list1.add("python");
    		  
    		  List<String> resultString = list1.stream()
	                     .map(s -> s.toUpperCase())
	                     .collect(Collectors.toList());
    		  
    		  List<Integer> list = Arrays.asList(10,20,30);
    		  
    		  List<Integer> result = list.stream()
    				                     .map(i -> i+10)
    				                     .collect(Collectors.toList());
    		  System.out.println(list1);
    		  System.out.println(list);
    		  System.out.println(result);
    		  System.out.println(resultString);
    	  }
    }
    
    
// 2. Processing Phase : 
  //  (A) Collect method : Stream data into a collection. 
         // Syntax .collect(Collectors.toList());
    
  // (B) Count() Method : Returns number of elements in Stream. 
         //  long count()
    
    class JavaProcessCount{
    	public static void main(String[] args) {
    		
    		List<String> list = Arrays.asList(
    				"Java",
    				"Python",
    				"Spring",
    				"C"
    			);
    		
    		long count = list.stream()
    				.filter(s -> s.length() == 1)
    				.count();
    		
    		System.out.println(count);
    	}
    }
    
 // (C) Sorted() Method : it's have two types 
      /// 1. Natural Sort : 
          class JavaProcessNaturalSort{
        	   public static void main(String[] args) {
        		   List<Integer> list =  Arrays.asList(40, 20, 10, 30);
        		   
        		   List<Integer> Sortedlist = list.stream()
        				   .sorted().collect(Collectors.toList());
        		   
        		   
        		   System.out.println(list);
        			System.out.println(Sortedlist);
        	   }
          }
    	   
       ///2. Custom Sort : 
        
       class JavaProcessCustomSort{
       	   public static void main(String[] args) {
       		   List<Integer> list =  Arrays.asList(40, 20, 10, 30);
       		   
       		   List<Integer> Sortedlist = list.stream()
       				   .sorted( (i1, i2) -> 
       				          i2.compareTo(i1))
       				   .collect(Collectors.toList());
       		   
       		   
       		   System.out.println(list);
       			System.out.println(Sortedlist);
       	   }
         }
       
  // (D)  min() and max() Methods :
        class JavaProcessMinMax{
        	public static void main(String[] args) {
        	List<Integer> list = Arrays.asList(50,20,80,30);
        	
        	int min = list.stream()
        			    .min((a,b) -> a.compareTo(b))
        			    .get();
        	
        	int max = list.stream()
    			    .max((a,b) -> a.compareTo(b))
    			    .get();
        	
        	   System.out.println(min);
      			System.out.println(max);
        }
      }
        
   // (E) forEach() Method : 
        class JavaProcessforEach{
        	public static void main(String[] args) {
        		List<String> list = Arrays.asList(
        				"Java",
        				"Python",
        				"Spring",
        				"C"
        			);
        		
        		list.stream()
        		    .forEach(s -> System.out.println(s));
        	}
        }
        
     // (F) toArray() method :
         class JavaProcessToArray{
        	 public static void main(String[] args) {
        		 List<Integer> list = Arrays.asList(
         			10, 20, 30, 40
         			);
        		 
        		 Integer[] arr = list.stream()
        				    .toArray(size -> new Integer[size]);
        		 
        		 for(Integer i : arr) {
        			 System.out.println(i);
        		 }
        	 } 
         }
     // (G) Stream.of() Method : Used to create stream directly from values or Arrays. 
         // Stream From Values :
          class JavaProcessStreamOfValues{
        	     public static void main(String[] args) {
        	    	 Stream<Integer> s = Stream.of(10, 20, 30, 40);
        	    	 
        	    	 s.forEach(  x -> System.out.println(x));
        	     }
          }
         // Stream from Array :
          
          class JavaProcessStreamOfArray{
        	  public static void main(String[] args) {
        		  
        		  Double[] arr = {10.01, 20.02, 30.03};
        		  Stream<Double> s = Stream.of(arr);
        		  
        		  s.forEach( x-> System.out.println(x));
        	  }
          }