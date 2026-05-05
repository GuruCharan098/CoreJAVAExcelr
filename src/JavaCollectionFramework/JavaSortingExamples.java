package JavaCollectionFramework;
import java.util.*;

//   Sorting in java has two types : 1. Comparable Interface, 2. Comparator Interface 

//1. Comparable Interface : It's used to define DNSO : Default Natural Sorting Order , java.lang package
// Method : public integer compareTo(object o);
// used internally by Collections like TreeMap, TreeSet.

// ascending A --> Z = negative value
// descending Z ---> A  =  positive value 
// A compareTo A ----> Both are equal  , Output is Zero

public class JavaSortingExamples {
	public static void main(String[]  agrs) {
		System.out.println("Z".compareTo("A"));      
		System.out.println("Z".compareTo("K"));
		System.out.println("A".compareTo("A"));
	}
}

class JavaComparableTreeSet{
	public static void main(String[]  agrs) {
		
		TreeSet<Integer> t = new TreeSet<>();
		
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(30);
		
		System.out.println(t);
		
	}
}

// 2. Comparator Interface : it's used for Custom Sorting (User-defined order), Java.utli package
// Methods :   a. public integer compare(Object obj1, Object obj2);    Mandatory when you use Comparator. 
//             b. public boolean equals(Object o)       optional when you use Comparator. 

class MyComparator implements Comparator<Integer>{
	public int compare(Integer i1, Integer i2) {
		return i2 - i1;      // descending order
	}
}
class JavaComparatorTreeSet{
	public static void main(String[]  agrs) {
		
		TreeSet<Integer> t1 = new TreeSet<>(new MyComparator());
		
		t1.add(10);
		t1.add(0);
		t1.add(15);
		t1.add(5);
		t1.add(30);
		
		System.out.println(t1);
		
	}
}

// Example of Comparator in String :

class MyComparator1 implements Comparator<String>{
	public int compare(String i1, String i2) {
		return i2.compareTo(i1);    // reverse alphabetical order. 
	}
}
class JavaComparator1TreeSet{
	public static void main(String[]  agrs) {
		
		TreeSet<String> t1 = new TreeSet<>(new MyComparator1());
		
		t1.add("Guru");
		t1.add("Anuj");
		t1.add("Ganga");
		t1.add("Sobha");
		t1.add("Zeshan");
		
		System.out.println(t1);
		
	}
}


// Employee Example for Both Comparable & Comparator
// Comparable : Sort by ID 
// Comparator : Sort by Name 

class Employee implements Comparable<Employee>{
	String EmpName;
	int EmpId;
	
	Employee(String EmpName, int EmpId){
		this.EmpName = EmpName;
		this.EmpId = EmpId;
	}
	
	public String toString() {
		return EmpName + "-----" + EmpId;
	}
	
	//default Sorting by ID 
	public int compareTo(Employee e) {
		return this.EmpId - e.EmpId;
	}
}

class MyComparatorEmp implements Comparator<Employee>{
	
	// custom sorting by Name 
	public int compare(Employee e1, Employee e2) {
		return e1.EmpName.compareTo(e2.EmpName);
	}
}

class BothDemo{
	public static void main(String[] agrs) {
		
		Employee e1 = new Employee("Kishore", 101);
		Employee e2 = new Employee("Geeta", 166);
		Employee e3 = new Employee("Ram", 100);
		Employee e4 = new Employee("Karan", 200);
		Employee e5 = new Employee("Rahul", 150);
		
		
		// Default sorting (ID)
		TreeSet<Employee> t = new TreeSet<>();
		t.add(e1); t.add(e2); t.add(e3); t.add(e4); t.add(e5);
		System.out.println(t);
		
		
		
		// Custom Sorting (Name)
		TreeSet<Employee> t1 = new TreeSet<>(new MyComparatorEmp());
		t1.add(e1); t1.add(e2); t1.add(e3); t1.add(e4); t1.add(e5);
		System.out.println(t1);
	}
}














