package JavaMultiThreadsExamples;
import java.util.Collection;
import java.util.concurrent.locks.*;
import java.util.concurrent.TimeUnit;

//java.util.concurrent.locks -:   In-Build Package In Java and Uses ;

//Synchronized Keyword : Improve issues like Dead-Lock.
//No control over which waiting thread gets lock next.
//Cannot specify waiting time.
//Cannot try lock without waiting.
//Cannot see waiting threads list.
//Lock scope mostly inside method/block only.
//Less flexible than modern locking APIs.

public class JavaInbuildLockPackage {
	
	// Lock Interface (l) :  In Java Lock l = new ReentrantLock();
	static Lock l = new ReentrantLock();
	
	public static void main(String[] args) {
		
		Runnable task = () -> {
			l.lock();
			try {
				System.out.println(Thread.currentThread().getName() + " "+ "Got lock");
				Thread.sleep(2000);
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				l.unlock();
				System.out.println(Thread.currentThread().getName()+" "+ "Got Unlock");
			}
			
		};
		
		Thread.ofPlatform().name("T1").start(task);
		Thread.ofPlatform().name("T2").start(task);
		 
	}

}
// boolean tryLock(); :


 class MainDemo1 {
	static Lock l = new ReentrantLock();
	
	public static void main(String[] args) {
		if(!l.tryLock()) {
			try {
				System.out.println("Lock acquired");
				
			}finally {
				l.unlock();
			}
		}else {
			System.out.println("Lock busy");
		}
	}
 }

 //boolean tryLock(long time, TimeUnit unit) : 
 
 class MainDemo2  {
	
	public static void main(String[] args) throws Exception {
		ReentrantLock rlock = new ReentrantLock();
		
		rlock.lock();
		
		Thread t = Thread.ofPlatform().start(()-> {
			try {
				if(rlock.tryLock(2, TimeUnit.SECONDS)) {
					try {
					System.out.println("Thread got lock.....");
					}finally{
						rlock.unlock();
					}
				}else {
					System.out.println("Could not get lock.....");
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});	
		
		Thread.sleep(3000);
		rlock.unlock();
	  }
	}
 
 // Void lockInerruptibly() :
 
 class MainDemo3  {
		
	public static void main(String[] args) throws Exception {
		ReentrantLock rlock = new ReentrantLock();
		
		rlock.lock();
		
		Thread t = Thread.ofPlatform().start(()-> {
			try {
				rlock.lockInterruptibly();
				try {
					System.out.println("Got Lock...");
				}finally {
					rlock.unlock();
			 }
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});	
		
		Thread.sleep(1000);
		t.interrupt();
		rlock.unlock();
	  }
	}
 
 // integer getHoldCount() :   // boolean isHeldByCurrentThread() : 
 class MainDemo4{
	 public static void main(String[] args) {
		 ReentrantLock rlock = new ReentrantLock();
				 
		 rlock.lock();
		 rlock.lock();
		 
		 // integer getHoldCount() :
		 System.out.println(rlock.getHoldCount());
		 
		 //boolean isHeldByCurrentThread()
		 System.out.println(rlock.isHeldByCurrentThread());
		 
		 rlock.unlock();
		 rlock.unlock();
		 
	   }
	 }
 
 
 // integer getQueueLength() :
 
 class MainDemo5{
	 static ReentrantLock rlock = new ReentrantLock();
	 
	 public static void main(String[] args) throws Exception  {
		 
		 rlock.lock();
		 
		 Runnable task = () ->{
			 rlock.lock();
			 try {
				 System.out.println(Thread.currentThread().getName());
				 
			 }finally {
				 rlock.unlock();
			 }
		 };
		 
		 Thread t1 = new Thread(task, "T1");
		 Thread t2 = new Thread(task,"T2");
		 
		 t1.start();
		 t2.start();
		 
		 Thread.sleep(1000);
		 System.out.println(rlock.getQueueLength());
		 rlock.unlock();
		 
		 
	 }
 }
 // Collection<Thread> getQueuedThreads() :
 
 class MyLock extends ReentrantLock{
	 public Collection<Thread> waitingThreads(){
		 return getQueuedThreads();
	 }
 }
 
 class MainDemo6{
	 public static void main(String[] args) throws Exception  {
		 MyLock myLock = new MyLock();
		 
		 Runnable task = () -> {
			 myLock.lock();
			 try {
				 System.out.println(Thread.currentThread().getName() + " acquired lock");
				 Thread.sleep(2000);
			 }catch(InterruptedException e) {
				 Thread.currentThread().interrupt();
			 }finally {
				 myLock.unlock();
			 }
		 };
		 
		 Thread t1 = new Thread(task, "Thread-Name-1");
		 Thread t2 = new Thread(task, "Thread-Name-2");
		 Thread t3 = new Thread(task, "Thread-Name-3");
		 
		 t1.start();
		 Thread.sleep(200);
		 
		 t2.start();
		 t3.start();
		 
		 Thread.sleep(500);
		 
		 System.out.println("Waiting Threads :" + myLock.waitingThreads());
	 }
 }
 
 // boolean hasQueuedThreads() : 
 
 class MainDemo7 {
	 static ReentrantLock  rlock = new ReentrantLock();
	 public static void main(String[] args) throws Exception {
		    rlock.lock();
		    
		    Thread t = new Thread(()->{
		    	rlock.lock();
		    	rlock.unlock();
		   });
		    
		    t.start();
		    Thread.sleep(500);
		    
		  
		    
		    rlock.unlock();
		    System.out.println(rlock.hasQueuedThread(t));
		    
	 }
	 
 }
 
 // boolean isLocked();    //boolean isFair(); FIFO :
 
 class MainDemo8{
	 public static void main(String[] args) {
		 ReentrantLock  rlock = new ReentrantLock();
		 
		 System.out.println(rlock.isFair());
		 
		 rlock.lock();
		 System.out.println(rlock.isLocked());
		 
		 rlock.unlock();
		 
	 }
 }
 
 // Thread getOwner() : 
 
 class Mylock2 extends ReentrantLock {
	 public Thread ownerThread() {
		 return getOwner();
	 }
 }
 
 class MainDemo9{
	      public static void main(String[] args) {
	    	  Mylock2 ml =  new Mylock2();
	    	  
	    	  ml.lock();
	    	  System.out.println(ml.ownerThread().getName());
	    	  ml.unlock();
	      }
 }