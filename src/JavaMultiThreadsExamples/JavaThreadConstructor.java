package JavaMultiThreadsExamples;

// Thread Constructor With Task execution :
class MyThreads1 implements Runnable{
	public void run() {
		System.out.println("Running Method :" + Thread.currentThread().getName());
	}
}

public class JavaThreadConstructor {
  public static void main(String[] args) {
	  MyThreads1 mt = new MyThreads1();
	  Thread t = new Thread(mt, "MyThread");
	  t.start();
	  
	  //System.out.println("Thread Name : " + t.getName());
  }
}


// Thread Naming : 
class Test {
	  public static void main(String[] args) {
		  // Getting Current Thread name : 
		  System.out.println(Thread.currentThread().getName());
		  	  
		  // changing current thread name 
		 Thread.currentThread().setName("CustomThread");
		 
		 // Print updated thread name : 
		 System.out.println(Thread.currentThread().getName());
	  }
}

// Multiple Threading :

class MyMulThread extends Thread {
	public void run() {
		System.out.println("Running : "+ Thread.currentThread().getName());
	}
}

class TestMulThreads{
	  public static void main(String[] args) {
		  MyMulThread t1 = new MyMulThread();
		  MyMulThread t2 = new MyMulThread();
		  
		  t1.setName("Worker-1");
		  t2.setName("Worker-2");
		  
		  t1.start();
		  t2.start();
	  }
}
// Thread Priority : 

class TestThreadPriority{
	 public static void main(String[] args) {
		 Thread t = new Thread(); 
		 t.setPriority(8);
		 System.out.println(t.getPriority());
	 }
}
// Prevent Thread Execution : (Control flow of Thread Execution);
// yield(); : give chance to other threads 
// join(); : wait for another thread 
// sleep(); : pause for some time 

//1. yield()  : static method, no guarantee of pause, used rarely in real application. (I'm ready to pause, let other threads run)
class MyThread5 extends Thread{
	public void run() {
		for(int i = 0; i<=3; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}

class DemoMyThread5{
	 public static void main(String[] args) {
		 MyThread5 t5 = new MyThread5();
		 t5.start();
			for(int i = 0; i<=3; i++) {
				System.out.println("Main Thread");
			}
	 }
}

//2. join() : You finish first, Then I continue (non -static method, Guarantees execution order , Throws Interrupted Exception)
 
class MyThread6 extends Thread{
	public void run() {
			System.out.println("Child Thread");
		}
}

class DemoMyThread6{
	 public static void main(String[] args) throws Exception {
		 MyThread6 t6 = new MyThread6();
		 t6.start();
		 t6.join();
		 System.out.println("Main Thread");		
	 }
} 

// 3. sleep(): pause me for sometimes  ( static method , time in mili-sec, always throws Interrupted exception, Guarantees delay)

class Test1 {
	 public static void main(String[] args) throws Exception {
		 System.out.println("Start");
		 Thread.sleep(4000);
		 System.out.println("End");
	 }
}


// Interrupting Thread : (Interrupt(), Interrupted() and isInterrupted())
// 1. Interrupt() Method : Used to Send interrupt signal to a thread. 
class MyThreads01 extends Thread{
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("Start...");
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

class Test01{
	public static void main(String[] args) {
		MyThreads01 t01 = new MyThreads01();
		
		t01.start();  // start thread
		t01.interrupt();  //calling Interrupt() 
	}
}

//2. Interrupted() Method : checks weather current thread is interrupted, Clears interrupt flag after checking.  
class MyThreads011 extends Thread{
	public void run() {
		for(int i =0; i<=3; i++) {
			if(Thread.interrupted()) { // interruption signal checks 
				System.out.println("Stopped due to interrupt...");
				break;
			}
			System.out.println("Working...");
		}
	}
}

class Test011{
	public static void main(String[] args) {
		MyThreads011 t011 = new MyThreads011();
		t011.start();
		t011.interrupt(); // interruption signal passed 
	}
}

//3. isInterrupted() Method :  checks interrupt status and it's does not clear signal/flag. 
 class MyThread0111 extends Thread{
	 public void run() {
		 while(true) {
			 if(this.isInterrupted()) { 
				 System.out.println("Thread stopped..." + this.isInterrupted());
				 break;
			 }
			 System.out.println("Running....");
		 }
	 }
 }
 
 class Test0111{
	 public static void main(String[] args) {
		 MyThread0111 t = new MyThread0111();
		 t.start();
		 
		 t.interrupt();
	 }
 }









