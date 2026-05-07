package JavaCollectionFramework;
import java.util.concurrent.*;

// Concurrent Collections : Advantages 
// a. Thread-safe
// b. Better performance 
// c. No need for manual synchronization 
// d . Works efficiently in Multi-threading.

// Important Concurrent Classes :

//1. ConcurrentHashMap  : thread-safe Hash Map, read/write simultaneously, uses internal locking mechanism4

// Real-life Uses : 
//Banking System
// Web Servers
// Caching 
// Multi-threading application 


// multiple threads ------>  ConcurrentHashMap -----> thread safe op. 
public class JavaConcurrentCollections {
                 public static void main(String[] args) throws Exception  {

                	 ConcurrentHashMap<Integer, String> CHmap = new ConcurrentHashMap<>();
                	 
                	 
                	 Thread t1 = new Thread(()->{
                		 for(int i = 1; i<=5; i++) {
                			 CHmap.put(i, "A" + i);
                			 System.out.println("Thread-1 Added"+ i);
                		 }
                	 });
                	 
                	 
                	 Thread t2 = new Thread(()->{
                		 for(int i = 6; i<=10; i++) {
                			 CHmap.put(i, "B" + i);
                			 System.out.println("Thread-2 Added" + i);
                		 }
                	 });
                	 
                	 
                	 t1.start();
                	 t2.start();
                	 
                	 
                	 t1.join();
                	 t2.join();
                	 System.out.println("Final Collection as Map :"+  CHmap);
                	 
//                	 CHmap.put(101, "A");
//                	 CHmap.put(102, "B");
//                	 CHmap.put(103, "C");
                	 
//                	 System.out.println(CHmap);
//                	 
//                	 CHmap.putIfAbsent(104, "D");
//                	 CHmap.putIfAbsent(103, "C");
//                	 
//                	 System.out.println(CHmap);
                	 
                 }
}

// 2. ConcurrentMap interface : 
// multiple threads ------> ConcurrentMap ----->  ConcurrentHashMap -----> thread safe op. 

class JavaConcurrentMapI{
	 public static void main(String[] args) throws Exception  {
    	 ConcurrentMap<Integer, String> Cmap = new ConcurrentHashMap<>();
    	 
    	 
    	 Thread t1 = new Thread(()->{
    		 for(int i = 1; i<=5; i++) {
    			 Cmap.put(i, "A" + i);
    			 System.out.println("Thread-1 Added"+ i);
    		 }
    	 });
    	 
    	 
    	 Thread t2 = new Thread(()->{
    		 for(int i = 6; i<=10; i++) {
    			 Cmap.put(i, "B" + i);
    			 System.out.println("Thread-2 Added" + i);
    		 }
    	 });
    	 
    	 
    	 t1.start();
    	 t2.start();
    	 
    	 
    	 t1.join();
    	 t2.join();
    	 
    	 System.out.println("Final Collection as ConcurrentMap :"+  Cmap);
    	 

     }
}

// 3. CopyOnWriteArrayList : thread- safe version of ArrayList, multi-thread environments;

class Demo{
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		
		list.add("A");
		list.add("B");
		
		for(String s: list) {
			System.out.println(s);
			
			list.add("new");
		}
		System.out.println();
		System.out.println(list);
	}
}

// MultiThread Example for CopyOnWriteArrayList:

class Demo1{
	public static void main(String[] args) throws Exception {
		
	CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		 
   	 Thread t3 = new Thread(()->{
   		 for(int i = 1; i<=5; i++) {
   			list.add(i);
   			System.out.println("Thread-1 Added"+ i);
   		 }
   	 });
   	 
   	 
   	 Thread t4 = new Thread(()->{
   		 for(int i = 6; i<=10; i++) {
   			list.add(i);
   			System.out.println("Thread-2 Added" + i);
   		 }
   	 });
   	 
	 t3.start();
	 t4.start();
	 
	 
	 t3.join();
	 t4.join();
	 
	 System.out.println("Final Collection list as CopyOnWriteArrayList :"+  list);
	}
}
















