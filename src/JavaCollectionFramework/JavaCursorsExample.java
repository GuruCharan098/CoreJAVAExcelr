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
//1. Iterator : classes like ArrayList, HashSet, LinkedList etc... 
class JavaIteratorExample {
	public static void main(String[] args) {
		     ArrayList<Integer>  list = new ArrayList<>();
		     
		     //add Elements 
			 for(int i= 0; i<=10; i++) {
					list.add(i);
			}
			 System.out.println("original Vector :" + list);
			 
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
	
