package JavaMultiThreadsExamples;

// Thread Group : Set of Threads (Multiple Threads)

//threads : t1, t2, t3......t(n) : 1st Thread Group;
//2nd Thread Group : t0, t3, t5, ...... t(n-1);

// Company example :
// CEO => System Group ( Grand parent Group)                                            System
// Department( HR, Manager) : Parent Group;                                                 main
// Project-1 Team (Developer, Designer, tester) => Child Group                                Parent Group
// Employees : Threads                                                                           Child Group 

public class JavaMultiThraedsEnhance {
        public static void main(String[] args) {
        	
        	// current Thread Group Name : 
        	System.out.println(Thread.currentThread().getThreadGroup().getName());
        	
        	// Parent of Current Thread Groups :
        	System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        	
        	// Creating parent Group :
        	ThreadGroup pg = new ThreadGroup("Parent Group");
        	System.out.println(pg.getParent().getName());
        	
        	// creating Child Group :
        	ThreadGroup cg = new ThreadGroup(pg, "Chlid Group");
        	System.out.println(cg.getParent().getName());
        }
}

// Important Methods In Thread Group : 
// 1. String getName():  Returns the name of the thread Group;
// 2. Integer getMaxPriority() : returns maximum priority allowed in that group;

class Demo {
	public static void main(String[] args) {
		ThreadGroup g = new ThreadGroup("Group1"); // Thread Group Constructor 
		System.out.println(g.getMaxPriority()); // 10
	}
}

//3. void setMaxPriority(Integer p) : Sets maximum priority for the group
// Imp Rule : Existing Threads => not effected
//              New Threads => follow new settled priority
class Demo2 {
	public static void main(String[] args) {
		ThreadGroup g1 = new ThreadGroup("threadGroup1");
		
		Thread t1 = new Thread(g1, "Thread-1");
		Thread t2 = new Thread(g1, "Thread-2");
		
		g1.setMaxPriority(3);
		
		Thread t3 = new Thread(g1, "Thread-3");
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
		
	}
}


















