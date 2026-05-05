package JavaCollectionFramework;
import java.util.*;

public class JavaCursorsExample {
// Cursors Have 3 Types : Enumeration, Iterator, ListIterator 
	
}
//1. Enumeration : legacy classes like Vector, Stack , HashTable  
class JavaEnumerationExample {
	public static void main(String[] args) {
		
		Vector<Integer> vc = new Vector<>();
		
           //add Elements 
		for(int i= 0; i<=10; i++) {
			vc.add(i);
		}
		System.out.println("original Vector :" + vc);
		
		//Get Enumeration :
		Enumeration<Integer> e = vc.elements();
		System.out.println("Even Numbers : ");
		
		while(e.hasMoreElements()) {
			int val = e.nextElement();
			if(val%2 ==0) {
				System.out.println(val+" ");
			}
		}
		
		//vector remains unchanged 
		System.out.println("After Traversal :" + vc);
		
	}
}
//2. Iterator : classes like ArrayList, HashSet, LinkedList etc... 
class JavaIteratorExample {
	public static void main(String[] args) {
		     ArrayList<Integer>  list = new ArrayList<>();
		     
		     //add Elements 
			 for(int i= 0; i<=10; i++) {
					list.add(i);
			}
			 System.out.println("original list :" + list);
			 
			 //get Iterator 
			 Iterator<Integer> itr = list.iterator();
			 
			 while(itr.hasNext()) {
				 int val1 = itr.next();
			     
				if(val1 % 2 != 0) {
					itr.remove();
				}
			 }
			 
			 System.out.println("After removing odd Numbers  :" + list);
	
	}
}
// 3. ListIterator : Traverse data forward/backward, Replace elements, Add new element, 

class JavaListIteratorExample{
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		
		//add elements....
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		 System.out.println(list1);
		 
		 // get listIterator : 
		 ListIterator<Integer> litr = list1.listIterator();	
		 
		 //forward + modification case : 
		 while(litr.hasNext()) {
			 int value = litr.next();
			 
			 if(value == 2) {
				 litr.set(20);
			 }
			 
			 if(value == 3) {
				 litr.add(99);
			 }
		 }
		 System.out.println("After modification " + list1);
		 
		 //Backward case : 
		 System.out.println("Backward Traversal");
		 while(litr.hasPrevious()) {
			 System.out.println(litr.previous()+ " ");
		 }
		 
	}
}
	
