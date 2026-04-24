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
//4. Thread Group getParent() : returns parent thread group. 
// 5. void list() : prints complete details/ metadata of thread group and it's threads. 

class Demo5{
	public static void main(String[] args) {
		ThreadGroup g = new ThreadGroup("Group");
		
		Thread t1 = new Thread(g,"T1");
		Thread t2 = new Thread(g,"T2");
		
		g.list();
	}
}

//6. integer activeCount() : check number count for active thread in Group

class Demo6{
	public static void main(String[] args) {
		ThreadGroup g = new ThreadGroup("Group");
		Thread t1  = new Thread(g, () -> {
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				
			}
		});
		
		Thread t2  = new Thread(g,"T2" );
		
		t1.start();
		t2.start();
		
		System.out.println(g.activeCount());
	}
}
//7. Integer activeGroupCount() : check number of active sub thread groups. 

class Demo7{
	public static void main(String[] args) {
		ThreadGroup g = new ThreadGroup("Parent");
		
		ThreadGroup g1 = new ThreadGroup(g, "Group1");
		ThreadGroup g2 = new ThreadGroup(g, "Group2");
		
		System.out.println(g.activeGroupCount());
		
		Thread t1 = new Thread(g2, "T1");
		t1.start();
		
		System.out.println(g2.activeCount());
	}
}

//8. Integer enumerate(Thread[] t) : Copies active threads into Array

class Demo8{
	public static void main(String[] args) {
		
	      ThreadGroup g = new ThreadGroup("Parent");
	      
	        Thread t1 = new Thread(g,"T1");
			Thread t2 = new Thread(g,"T2");
			
			t1.start();
			//t2.start();
			
			Thread[] thArray = new Thread[g.activeCount()];
			g.enumerate(thArray);
			
			for(Thread t : thArray) {
				System.out.println(t.getName());
			}
	}
}

//9. Integer enumerate(ThreadGroup[] g) : copies sub thread groups into array
class Demo9{
	public static void main(String[] args) {
		
	      ThreadGroup g = new ThreadGroup("Parent");
	      
	      ThreadGroup t1 = new ThreadGroup(g,"Group-T1");
	      ThreadGroup t2 = new ThreadGroup(g,"Group-T2");
					
	      ThreadGroup[] groups = new ThreadGroup[g.activeGroupCount()];
			g.enumerate(groups);
			
			for(ThreadGroup groupArray : groups) {
				System.out.println(groupArray.getName());
			}
	}
}

// 10. Boolean isDaemon() and void setDaemon(boolean b)
class Demo10{
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		ThreadGroup thg = new ThreadGroup("Group");
		thg.setDaemon(true);
		System.out.println(thg.isDaemon());
			
	}
}

//11. void interrupt() : 
class Demo11{
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Thread-MainGroup");
		
		Thread t1 = new Thread(tg,() ->{
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		t1.start();
		
		tg.interrupt();
	}
}

// 12. Void destroy() : destroys or delete or remove thread group and subgroups

class Demo12{
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Thread-MainGroup");
		
		tg.destroy();
		System.out.println("Destroyed");
	}
}

















