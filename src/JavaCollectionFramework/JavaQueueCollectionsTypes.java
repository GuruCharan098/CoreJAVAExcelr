package JavaCollectionFramework;
import java.util.*;
import java.util.concurrent.*;
// Queue and It's Types
// HashTable In Java
// Properties In Java


// 1. Queue : (FIFO - First Input First OutPut)
// Types of Queue :
//a. LinkedList( Simple Queue)
// b. Priority Queue
// c. ArrayDeque
// d. BlockingQueue 

//A.  Simple Queue's/ LinkedList Methods :
public class JavaQueueCollectionsTypes {
       public static void main(String[] args) {
    	   
    	   Queue<Integer> q = new LinkedList<>();
    	   
    	   // offer(Object o)  it's for adding an element. 
    	   q.offer(10);
    	   q.offer(20);
    	   q.offer(30);
    	   
    	   System.out.println(q);
    	   
    	   // check first or head item from Queue...
    	   System.out.println(q.peek()); 
    	   
    	   // check first or head item from Queue...if queue is not empty, else throws NoSuchElementException
    	   System.out.println(q.element());
    	   
    	   
    	   // remove and return first/head element from Queue....if queue is empty you get null value...
    	   System.out.println(q.poll());
    	   System.out.println(q);
    	   
    	   //removes and return head item and if queue is empty, throws NoSuchElementException 
    	   System.out.println(q.remove());
    	   System.out.println(q);
    	   
       }
}

// B. PriorityQueue : Types of Constructor, Duplicate values are allowed but null not allowed. Priority based on Comparable and Comparator.  

// a. PriorityQueue Pq = new PriorityQueue();
//b. PriorityQueue Pq = new PriorityQueue(int InitialCapacity);
// c. PriorityQueue Pq = new PriorityQueue(int InitialCapacity, Comparator C);
// d. PriorityQueue Pq = new PriorityQueue(SortedSet s);
// e.  PriorityQueue Pq = new PriorityQueue(Collection c);


class JavaPQDNSODemo{
	   public static void main(String[] args) {
		   PriorityQueue<Integer> Pq = new PriorityQueue<>();
		   
		   System.out.println(Pq.peek());
		   
		   for(int i = 0; i<=10; i++) {
			   Pq.offer(i);
		   }
		   
		   System.out.println(Pq);
		   System.out.println(Pq.poll());
		   System.out.println(Pq);
		   
	   }
}
// descending order...print for PQ items. 
class JavaPQCSDemo{
	  public static void main(String[] args) {
		
	 PriorityQueue<String> pq1 = new PriorityQueue<String>(new MyComparatorDemo());
	 
	 pq1.offer("A");
	 pq1.offer("C");
	 pq1.offer("B");
	 pq1.offer("E");
	 pq1.offer("D");
	 
	 while(!pq1.isEmpty()) { 
		 System.out.print(pq1.poll());
	 }  
		
  }
	
}
class MyComparatorDemo implements Comparator<String>{
	public int compare(String s1, String s2) {
		return s2.compareTo(s1); //descending order
	}
}

// C. ArrayDeque : Double Ended Queue (DEQUE), Can insert/remove from both ends( first and last ends);

class JavaArrayDequeDemo{
	 public static void main(String[] args) {
		 ArrayDeque<Integer> dq = new ArrayDeque<>();
		 
		 dq.offer(10);
		 dq.offerFirst(20);
		 dq.offerLast(30);
		 System.out.print(dq);
		 
		 System.out.print(dq.pollLast());
		 System.out.print(dq);
		}
}


// D. BlockingQueue(Multi-threading) : java.util.concurrent package have access...
//  a. BlockingQueue<Integer> bq1 = new  ArrayBlockingQueue()     // fixed data
//  b.  BlockingQueue<Integer> bq2  = new LinkedBlockingQueue()  // grow-able data

class JavaBlockQueueDemo{
	 public static void main(String[] args) throws InterruptedException  {
		 BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(3);
		 
		 bq.add(10);
		 bq.add(20);
		 bq.add(30);
		 System.out.println(bq);
		 
		 System.out.println(bq.offer(40, 2, TimeUnit.SECONDS));
		 
		 //bq.put(50);
		 System.out.println(bq);
		
	 }
}

// example BlockingQueue with Producer and Consumer threads 



class BlockingQueueDemo {

    public static void main(String[] args) {

        BlockingQueue<Integer> bq1 = new ArrayBlockingQueue<>(3);

        // Producer Thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Producing: " + i);
                    bq1.put(i);   // adds element (waits if full)
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    int value = bq1.take();  // removes element (waits if empty)
                    System.out.println("Consuming: " + value);
                    Thread.sleep(2000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Start threads
        producer.start();
        consumer.start();
    }
}








