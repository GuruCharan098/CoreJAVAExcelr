package JavaMultiThreadsExamples;

//Deadlock in Threads : (with Synchronized )
	class A {
		synchronized void methodA(B b){
			System.out.println("Thread 1 holds A and waiting for B");
			b.last();
			}
		synchronized void last() {
    		System.out.println("Inside A last()");
    	}
	}
	
    class B {
    	synchronized void methodB(A a){
			System.out.println("Thread 2 holds B and waiting for A");
			a.last();
			}
    	synchronized void last() {
    		System.out.println("Inside B last()");
    	}
	}

public class JavaDeadLockProcess {
    public static void main(String[] args) {
    	A a = new A();
    	B b = new B();
    	
    	new Thread(() -> a.methodA(b)).start();
    	new Thread(() -> b.methodB(a)).start();
    }
}

// Daemon Threads : it is a background thread that supports non-daemon threads (like main thread); it take Boolean value/Status ( True/ False)
// real examples : GC (Garbage Collector) , Auto Save service, Background monitoring. 

class MyDaemonThread extends Thread{
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("Deamon Thread is Running....");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException  e) {
				e.printStackTrace();
			}
		}
	}
}

   class DaemonThreadDemo {
	   public static void main(String[] args) {
		   System.out.println(Thread.currentThread().isDaemon());
		   
		   MyDaemonThread mdt = new MyDaemonThread();
		   
		   //mdt.setDaemon(true);     lazy threads (behavior)
		   mdt.start();
		   
		   System.out.println(mdt.isDaemon()+ " " + "End of Main Thread");
		   	  
		   
	   }
   }

// Green Thread :  Java MultiThreading concepts is implementing by using the 2 methods :
// 1. Green Thread Model : Managed completely by JVM without Support OS. 
    
   // Exceptional Case : SunSolaries(OS)  provide support for Green Thread Model
   
// 2. Native OS Model : managed completely by OS. 
