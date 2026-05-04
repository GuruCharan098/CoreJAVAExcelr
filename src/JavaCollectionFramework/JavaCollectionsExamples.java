package JavaCollectionFramework;

import java.util.*;

//// Limitations of An Array :  fixed size, homogeneous data type elements, No built in method, insertion/ deletion difficult. 
//integer[] numbers = {10,20,30,40}; 
//
//System.out.println(numbers[0]);
//System.out.println(numbers[2]);
//
//numbers[1] = 99;
//numbers[4] = 10;
//
//for(integer num : numbers) {
//	System.out.println(num);
//}


public class JavaCollectionsExamples {
	
	public static void main(String[] args) {
		// Collection In Java : Grow-able / dynamic size, hold both Homogeneous and heterogeneous elements, supported in build methods
		// ArrayList example : 
		
		// Constructor calling of ArrayList Collection. 
		ArrayList<String> names = new ArrayList<>();
		
		ArrayList<Object> Student = new ArrayList<>();
		
		// Heterogeneous data type elements 
		Student.add(10);
		Student.add("Ravi");
		Student.add("Ravi@SchoolKid.com");
		Student.add("Pune");
		
		System.out.println(Student);
		
		// Add method :  Add item for ArrayList. 
		names.add("Ram");
		names.add("Shyam");
		names.add("Shiva");
		
		System.out.println(names);
		
		// Remove method : remove item from ArrayList. 
		names.remove("Shiva");
		
		System.out.println(names);
		
		// Contains Method : check item existing or not, 
		System.out.println(names.contains("Ram"));
		
		System.out.println(names.contains("Shiva"));
		

	}

}


// 9 Key Interfaces of Java Collection Framework : 

//1. Collection Interface :   in build methods like add(), remove(), size(), contains(); 
 class DemoCollectionInf{
	 public static void main(String[] args) {
		 
		 Collection<String> collect = new ArrayList<>();
		 
		 collect.add("Java");
		 collect.add("Python");
		 
		 System.out.println(collect);
		 System.out.println(collect.size());		 
	 } 
	 
 }
 
// 2. List Interface : Ordered Collection, Allows Duplicates, follow index based access for example : get(); 
 class DemoListInf{
	 public static void main(String[] args) {
		 
		 List<String> list = new ArrayList<>();
		 
		 list.add("A");
		 list.add("B");
		 list.add("A");
		 list.add("D");
		 
		 System.out.println(list);
		 System.out.println(list.size());	
		 System.out.println(list.get(2));
	 } 
	 
 }
 
 // 3. Set Interface : No duplicate values allowed,  Ordered not matter, 
 
 class DemoSetInf{
	 public static void main(String[] args) {
		 
		 Set<Integer> set = new HashSet<>();
		 
		 set.add(10);
		 set.add(20);
		 set.add(30);
		 set.add(10);
		 
		 System.out.println(set);
		 System.out.println(set.size());		 
	 } 
	 
 }
 
// 4. SortedSet Interface : Ordered Collection, Duplicate items are not allowed. 
 
 class DemoSortedSetInf{
	 public static void main(String[] args) {
		 
		 SortedSet<Integer> sortedSet = new TreeSet<>();

		 sortedSet.add(30);
		 sortedSet.add(10);
		 sortedSet.add(10);
		 sortedSet.add(20);
		 
		 System.out.println(sortedSet);
		 System.out.println(sortedSet.size());		 
	 } 
	 
 }
 
// 5. NavigableSet Interface : it's similar like ShortedSet but there have some navigation methods like lower(), higher(), floor(), ceiling(). 
 
 class DemoNavigableSetInf{
	 public static void main(String[] args) {
		 
		 NavigableSet<Integer> naviSet = new TreeSet<>();

		 naviSet.add(10);
		 naviSet.add(20);
		 naviSet.add(30);
		 naviSet.add(40);
		 naviSet.add(50);
		 
		 
		 System.out.println(naviSet);
		 System.out.println(naviSet.size());
		 
		 System.out.println(naviSet.lower(30));
		 System.out.println(naviSet.higher(30));
		 
		 System.out.println(naviSet.floor(35));
		 System.out.println(naviSet.ceiling(35));
	 
	 } 
	 
 }
 
// 6. Queue Interface : FIFO (First In First Out)
 
 class DemoQueueInf{
	 public static void main(String[] args) {
		 Queue<String> q = new LinkedList<>();
		 
		 q.offer("A");
		 q.offer("B");
		 q.offer("C");
		 
		 System.out.println(q);
		 System.out.println(q.poll());
		 System.out.println(q);
		 System.out.println(q.poll());
		 }
	 }
// 7. Deque Interface : Double Ended Queue, Insert/ delete from both side. LIFO and FILO, Stack + Queue both 
 
 class DemoDequeInf{
	 public static void main(String[] args) {
		 Deque<Integer> dq = new ArrayDeque<>();
		 
		 dq.addFirst(10);
		 dq.add(20);
		 dq.addLast(30);
		 
		 System.out.println(dq);
		 
		 dq.removeFirst();
		 dq.removeLast();
		 
		 System.out.println(dq);
	 }
 }
 
 // 8. Map Interface : Store data in Key-value pairs, No duplicate keys, 
 class DemoMapInf{
	 public static void main(String[] args) {
		 
		 Map<Integer,String> map = new HashMap<>();
		 
		 map.put(101, "Ram Kumar");
		 map.put(102, "Hari Krishna");
		 
		 System.out.println(map);
		 System.out.println(map.get(101));
	 }
 }
 
 // 9. SortedMap / NavigableMap : Stored key lookup  
 class DemoSortedNaviMapInf{
	 public static void main(String[] args) {
		 
		 NavigableMap<Integer, String> Nm = new TreeMap<>();
		 
		Nm.put(3, "C");
		Nm.put(2, "B");
		Nm.put(1, "A");
		Nm.put(4, "D");
		 
		 System.out.println(Nm);
		 System.out.println(Nm.higherKey(3));
		 System.out.println(Nm.lowerKey(4));
	 }
}
 
 
 

 
 