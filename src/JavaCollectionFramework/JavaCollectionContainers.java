package JavaCollectionFramework;
import java.util.*;
// 1. Collection :  
// 2. List :  ArrayList, LinkedList ,  Vector -->  Stack 
// 3. Set : HashSet, LinkedHashSet, SortedSet , TreeSet
// 4. Map : HashMap, LinkedHashMap, WeakHashMap , IdentityHashMap


//1. Collection : 
public class JavaCollectionContainers {
	   public static void main(String[] args) {
		   
		   Collection<String> C1 = new ArrayList<>();
		   
//		   C1.add("A");
//		   C1.add("B");
//		   System.out.println(C1);
		   
		   Collection<String> C2 = new ArrayList<>();
		   
//		   C2.add("C");
//		   C2.add("D");
//		   System.out.println(C2);
//		   
//		   // Merge Two Collection....
//		   C1.addAll(C2);
//		   
//		   System.out.println(C1);
//		   
//		   // Remove all....
//		   C1.removeAll(C2);
//		   System.out.println(C1);
		   
		   // retainAll()....
		   C1.add("X");
		   C1.add("Y");
		   C2.add("Y");
		   C2.add("Z");
		   
		   C1.addAll(C2);
//		   System.out.println(C1);
//		   System.out.println(C1.contains("Y"));
//		   System.out.println(C1.containsAll(C2));
		   
		   //System.out.println(C1.isEmpty());
		   //C1.retainAll(C2);
		   //System.out.println(C2);   
		   //C1.clear();
		   //System.out.println(C1);
		   
		   Object[] arr = C1.toArray();
		   
		   for(Object val : arr) {
			   System.out.println(val);
		   }
		   
	   }
          
}

// 2.  List : Imp Methods 
 class JavaListMethodsDemo {
	 public static void main(String[] args) {
		 
		 List<String> list = new ArrayList<>();
		 
		 list.add("A");
		 list.add("B");
		 list.add("C");
		 
		 //System.out.println(list);
		 
		 // void add(index , element)
//		 list.add(1,"X");
//		 System.out.println(list);
		 
		 // addAll(index, Collection)
		 List<String> list2 = Arrays.asList("Y", "Z");
		 list.addAll(1,list2);
		 //System.out.println(list);
		 
		 //remove(index)
		 list.remove(2);
		// System.out.println(list);
		 
		 //set(index, element)
		 list.set(2, "Z");
		 System.out.println(list);
		 
		 // indexOf()
		 System.out.println(list.indexOf("Z"));
		 
		 // lastIndexOf()
		 System.out.println(list.lastIndexOf("C"));
	 }
 }
 
 // 2.(a)  ArrayList Class :
 class JavaArrayListDemo{
	 public static void main(String[] args) {
		 
	     // Default Constructor
		 ArrayList<Object> l1 = new ArrayList<>();
		 
		 l1.add("A");
		 l1.add(10);
		 l1.add(null);
		 l1.add("A");
		 
		 System.out.print(l1);
		  
		 // Custom Capacity
//		 ArrayList<Integer> l2 = new ArrayList<>(20);
		 
		 // From another Collection 
//		 List<String> list2 = Arrays.asList("Y", "Z");
//		 ArrayList<String> l3 = new ArrayList<>(list2);

	 }
 }
 
 //2.(b) LinkedList  :  Imp Methods 
 class JavaLinkedListDemo{
	 public static void main(String[] args) {
		 
		// Default Constructor
		 LinkedList<Object> ll1 = new LinkedList<>();
		 
		 ll1.add("B");
		 ll1.add("C");
		 
		 System.out.println(ll1);
		 
		 ll1.addFirst("A");
		 ll1.addLast("D");
		 
		 System.out.println(ll1);
		 
		 System.out.println(ll1.getFirst());
		 System.out.println(ll1.getLast());
		 
		 System.out.println(ll1.removeFirst());
		 System.out.println(ll1.removeLast());
		 
		 System.out.println(ll1);
		 
		 
		// with collection 
//		 Collection<String> C1 = new ArrayList<>();
//		 LinkedList<Object> ll2 = new LinkedList<>(C1);
	 }
 }
 
 // 2.(c) Vector :
 class JavaVectorDemo{
	 public static void main(String[] args) {
         // Default Constructor 
		 Vector<Object> vc = new Vector<>();
		 
		 vc.add("A");
		 vc.add("B");
		 vc.add(0,"Z");
		 vc.addElement("C");
		 
		// vc.removeAllElements();
		 //vc.removeElementAt(0);
		 //vc.removeElement("C");
		
		 
//		 System.out.println(vc.get(2));
//		 System.out.println(vc.elementAt(2));
		 
		 System.out.println(vc.firstElement());
		 System.out.println(vc.lastElement());
		 
		 System.out.println(vc);
		 
		 System.out.println(vc.capacity());
		 // with Collection 
//		 Collection<String> C1 = new ArrayList<>();
//		 Vector<Object> vc2 = new Vector<>(C1);
	 }
 }

 // 2.(d) Stack :  LIFO : last In first Out 
 class JavaStackDemo{
	 public static void main(String[] args) {
		 Stack<Object> st = new Stack<>();
		 
		 st.push("A");         
		 st.push(10);
		 st.push("B");
		 st.push(20);
		 
		 System.out.println(st);
		 
		 System.out.println(st.pop());
		 System.out.println(st);
	 }
 }
 
// 3. (a) HashSet : Store unique elements only, No order guarantee, fast operation performance, only One Null element, you can store here
 class JavaHashSetExample {
	 public static void main(String[] args) {
		 
		 HashSet<Object> Hset = new HashSet<>();
		 
		 Hset.add("Java");
		 Hset.add("C++");
		// In build Methods : contains(), remove(), size(), isEmpty();
		 
		 System.out.println(Hset);
		 
	 }
 }
 
 // 3. (b) : LinkedHashSet : order guarantee, Slightly Slower than Hash set, Hash-table + linked list \
 
 class JavaLinkedHashSetExample {
	 public static void main(String[] args) {
		 
		 LinkedHashSet<Object> LHset = new  LinkedHashSet<>();
		 
		 LHset.add("JavaScript");
		 LHset.add("Java");
		 LHset.add("C++");
		 LHset.add("Python");
		 LHset.add("C++");
		 
		// In build Methods : contains(), remove(), size(), isEmpty();
		 
		 System.out.println( LHset);
		 
	 }
 }
 
 // 3. (c) SortedSet Interface : Ordered Collection, Duplicate items are not allowed. 
 
 class JavaSortedSet{
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
 
// 3.(d) Tree set () : 
 class JavaTreeSetExample{
	 public static void main(String[] args) {
		 
		 SortedSet<Integer> tSet = new TreeSet<>();

		 tSet.add(30);
		 tSet.add(10);
		 tSet.add(10);
		 tSet.add(20);
		 
		 System.out.println(tSet);
		 System.out.println(tSet.size());		 
	 } 
	 
 }
 
 //4.(a) Hash Map : Key-value pairs, No. Multiple null values allowed but One null key allowed. 
 
 class JavaHashMapExample{
	 public static void main(String[] args) {
		 
		 HashMap<Integer, String> map = new HashMap<>(); 
		 map.put(101, "User1");
		 map.put(102, "User2");
		 map.put(103, null);
		 map.put(null, "User4");
		 map.put(105, null);
		 
		 System.out.println(map);
		 
		 
	 }
	   
 }
 
 // 4 (b) LinkedHashMap :  order maintained by default
 
 class JavaLinkedHashMapExample{
	 public static void main(String[] args) {
		 
		 LinkedHashMap<Integer, String> map = new LinkedHashMap<>(); 
		 
		 map.put(101, "User1");
		 map.put(102, "User2");
		 map.put(103, null);
		 map.put(null, "User4");
		 map.put(105, null);
		 
		 System.out.println(map);
		 
		 
	 }
	   
 }
 
 // 4.(c)  WeakHashMap : weak Reference , if key has not strong reference --> removed by garbage collector 
 class JavaWeakHashMapExample{
	 @SuppressWarnings("removal")
	public static void main(String[] args) {
		 WeakHashMap<Integer, String> Wmap = new WeakHashMap<>();
		 
		 Integer Key = new Integer(200);
		 Wmap.put(Key, "Java");
		 
		 System.out.println("Before GC : "+ Wmap);
		 
		 Key = null; // remove strong reference 
		 System.gc();
		 try {
			 Thread.sleep(2000);
		 }catch(Exception e){
			
		 }
		 System.out.println("After GC : "+ Wmap );
		 
	 }
}
 
// 4 (d) IdentityHashMap() : 
 class JavaIdentityHashMapExample{
	public static void main(String[] args) {
		IdentityHashMap<Integer, String> Imap = new IdentityHashMap<>();
		
		@SuppressWarnings("removal")
		Integer I1 = new Integer(10);
		@SuppressWarnings("removal")
		Integer I2 = new Integer(20);
		
		Imap.put(I1, "Python");
		Imap.put(I2, "Java");
		System.out.println(Imap);
	}

	}