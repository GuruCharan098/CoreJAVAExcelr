package JavaMultiThreadsExamples;

// Synchronization : synchronized keyword, lock concept  

class Display{
	public synchronized void wish(String name) {
	      for(int i=0; i<5; i++) {
	    	  System.out.print("Good Morning.. :");
	    	  try {
	    		  Thread.sleep(2000);
	    	  }catch(InterruptedException e){
	    		  System.out.println(e.getMessage());
	    	  }
	    	  System.out.println(name);
	      }
	}
}

class MyThreadsExample01 extends Thread{
	Display d;
	String name;
	
	MyThreadsExample01(Display d, String name){
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name); 
	}
}

public class JavaThreadsImpConcepts {
          public static void main(String[] args) {
        Display d = new Display();
        	  
        	  
// NotePoint : if you using Different objects then Synchronization fails
//        	  Display d1 = new Display();
//        	  Display d2 = new Display();
        	  
        	  
        	  MyThreadsExample01 t1 = new MyThreadsExample01(d,"Dhoni");
        	  MyThreadsExample01 t2 = new MyThreadsExample01(d,"Yuvraj");
        	  
        	  t1.start();
        	  t2.start();
          }
}
//----------------------------------------------------------------------------------------------------------

// Static Synchronization : 

class Display01{
	public static synchronized void show(String name) {
	      for(int i=0; i<3; i++){
	    	  System.out.print("Good Morning.. :");
	    	  try {
	    		  Thread.sleep(2000);
	    	  }catch(InterruptedException e){
	    		  System.out.println(e.getMessage());
	    	  }
	    	  System.out.println(name);
	      }
	}
}

class MyThreadsExecution extends Thread{
	String name;
	
	 MyThreadsExecution(String name){
		this.name = name;
	}
	
	public void run() {
		Display01.show(name);
	}
}

class TestSync {
          public static void main(String[] args) {        	  
        	  
        MyThreadsExecution t1 = new MyThreadsExecution("Dhoni");   
        MyThreadsExecution t2= new MyThreadsExecution("Yuvraj");
        	  t1.start();
        	  t2.start();
          }
}
// InterThread Communication : Methods (Wait(), notify() and notifyAll() 
// 1. wait() : releases that object's lock, Goes into waiting state, generate notification for waits
// 2. notify() : wakes up one waiting thread, lock is released after Synchronized blocks end.
// 3. notifyAll() : wakes up all waiting threads, they execute one by one(because of lock)

// Example of Wait() and Notify()
class ThreadB extends Thread {
	int total = 0;
	
	public void run() {
		synchronized (this) {
			System.out.println("Child thread starts calculation ");
			
			for(int i=0; i <=10; i++) {
				total += i ;
			}
			
			System.out.println("Child thread giving notification");
			this.notify();
		}
	}
}
class ThreadA {
    public static void main(String[] args) throws InterruptedException{
    	ThreadB b = new ThreadB();
    	
    	b.start();
    	
    	synchronized(b) {
    		System.out.println("main thread call wait()");
    		b.wait();
    		
    		System.out.println("Main Thraed got notification");
    		System.out.println("Total = " + b.total);
    	}
    	
    }
	
}

// Example for NotifyAll() : 
class SharedRes{
	synchronized void waitMethod (String name) {
		try {
			System.out.println(name+"is waiting...");
			wait();
			System.out.println(name+ "got notify and resumed");			
		}catch(InterruptedException e) {
		e.printStackTrace();
		}	
	}
	
	synchronized void notifyAllMethod () {
		System.out.println( "Notifier thread call notifyAll()");
		notifyAll();
	}
}
class MyThreadEx extends Thread{
	SharedRes shr;
	String name;
	
	MyThreadEx(SharedRes shr, String name){
		this.shr = shr;
		this.name = name;
		
	}
	
	public void run() {
		shr.waitMethod(name);
	}	
}

class NotifierThread extends Thread{
	SharedRes shr;
	String name ;
	
	NotifierThread(SharedRes shr){
		this.shr = shr;
	}
	
	public void run() {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		shr.notifyAllMethod();
	}
	
}

 class TestNotifyAll {
	public static void main(String[] args) {
		SharedRes shr = new SharedRes();
		
		MyThreadEx th1 = new MyThreadEx(shr, "Thread-1");
		MyThreadEx th2= new MyThreadEx(shr, "Thread-2");
		MyThreadEx th3= new MyThreadEx(shr, "Thread-3");
		
		NotifierThread nt = new NotifierThread(shr);
		
		th1.start();
		th2.start();
		th3.start();
		
		nt.start();
		
	}
}
