package JavaMultiThreadsExamples;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;

public class JavaThreadPoolExamples {
	// Thread Pool :   using Executor Framework (java.util.concurrent).
	// It's a group of pre-created worker threads that are ready to execute tasks. 
	//  Previous example :
//	  public void task (){
//		  System.out.println();
//	  }
//	public static void main(String[] args ) {
//	
//		 new Thread(task).start(); // 1
//		 new Thread(task).start();  // 2
//		 new Thread(task).start(); // 3
//		 
//	}
	 
	// Upcoming or Thread Pool example :
	
	//ExecutorService service = Executors.newFixedThreadPool(3) ;
           
}

//Callable (Interface) and Future (class Object) : 

class MyCallableDemo implements Callable<Integer>{
	
	int num;
	
	MyCallableDemo(int num){
		this.num = num;
	}
	
	public Integer call() {
		int sum = 0;
		
		for(int i = 0; i<num; i++) {
			sum += i;
		}
		return sum;
	}		
}

class MainCallDemo{
	public static void main(String[] args) throws Exception {
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		Future<Integer> f1 = service.submit(new MyCallableDemo(10));  // 0+1+2+....+9 = 45;
		
		Future<Integer> f2 = service.submit(new MyCallableDemo(30)); //addition of this series 0 to 29 =  435;
		
		System.out.println(f1.get());
		System.out.println(f2.get());
		
		service.shutdown();
		
	}
	
}
//-----------------------------------------------------------------------------------------------------------------------------------------------------
// All Types of Thread Pool : 

// 1. Fixed Thread Pool : newFixedThreadPool(integer countThread)

class MyJob implements Runnable{
	String name;
	
	MyJob(String name){
		this.name = name ; 
	}
	
	public void run() {
		System.out.println(name + "Job Started by Thread :" + Thread.currentThread().getName());
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + "Job Completed by Thread :" + Thread.currentThread().getName());
		
	}
}

class ThreadPoolDemo{
	public static void main(String[] args) {
		  
		MyJob[] jobs = {
				new MyJob("Excelr"),
				new MyJob("Nagendra"),
				new MyJob("Java"),
				new MyJob("Python"),
				new MyJob("Spring-Boot"),
				new MyJob("React UI")
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(MyJob job : jobs) {
			service.submit(job);    // start execution each thread for each job
		}
		
		service.shutdown(); // Terminate your execution of threads...
	
	}
}

// 2. Cached Thread Pool : newCachedThreadPool();

class MyCachedPool {
	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		
		for(int i=0; i<=5; i++) {
			int task = i;
			
			service.submit(() -> {
				System.out.println("Task" + task + "by"+ Thread.currentThread().getName());
			});
		}
		
		service.shutdown();
	}
}
// 3. Single Thread Executor  : newSingleThreadExecutor();
class MySingleThreadExecutor {
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		for(int i=0; i<=5; i++) {
			int task = i;
			
			service.submit(() -> {
				System.out.println("Task" + task + "by"+ Thread.currentThread().getName());
			});
		}
		
		service.shutdown();
	}
}

// 4. Scheduled Thread Pool : Delay, Repeated and Background timer ( related execution) 

class MyScheduledExample{
	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(2); 		
		
		service.schedule(()->{
			System.out.println("Executed after delay");
		}, 3, TimeUnit.SECONDS);
		
		
		service.shutdown();
		
	}
}

// 5. virtual Thread Pool : JDK 21 updated rule.

class MyVirtualThreadPool {
	public static void main(String[] args) throws Exception {
		try (ExecutorService service = Executors.newVirtualThreadPerTaskExecutor()){
			for(int i = 1; i<=5; i++) {
				int task = i;
				
				service.submit(()->{
					System.out.println("Task" + task + " Running in "+ Thread.currentThread());
					Thread.sleep(2000);
					return null;
				});
			}
		}
	}
}
