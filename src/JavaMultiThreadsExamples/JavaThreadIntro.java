package JavaMultiThreadsExamples;

public class JavaThreadIntro {
	
	// MultiTasking : there have two types for Multitasking :
	// 1. Process based 
	// 2. Thread based 
}
// By extending Thread Class from Java : No Support for Multiple Inheritance 

class MyThread extends Thread{
	public void run() {
		System.out.println("Thread is running....");
	}
	
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();     // Start thread
	}
}

// Thread Scheduler => It's part of JVM and if multiple threads are waiting to execute then which thread will execute 1st is decided by "[Thread Scheduler]". 
// Importance of start() ( Use MultiThreading or Thread concept)
// Not Overriding run();
class TestThread extends Thread {
	public void run() {
		for(int i = 0; i<=5;i++) {
			System.out.println("Child Thread");
		}
	}
}

class TestThreadDemo{
	public static void main(String[] args) {
		TestThread td = new TestThread();
		td.start();  // create new thread
		td.run();  // Normal method calling
		for(int i = 0; i<=5; i++) {
			System.out.println("Main Thread");
		}
	}
}
//Overloading follow by Thread concept (Example)

class MyThread1 extends Thread{
	public void run() {
		System.out.println("No arg run()");
	}
    public void run(int i) {
		System.out.println("Integer arg run" + i);
	}
}
class MainThread{
	public static void main(String[] args) {
		MyThread1 td1 = new MyThread1();
		td1.start();
		td1.run(12);
	}
}

// Overriding Start() method in Thread : 
class MyThread2 extends Thread{
	public void start() {
		System.out.println("Start Method");
	}
    public void run() {
		System.out.println("Run Method");
	}
}
class MainThread2{
	public static void main(String[] args) {
		MyThread2 td2 = new MyThread2();
		td2.start();
		System.out.println("Main Method");
	}
}

// Thread Life Cycle :
// 1. New Born Thread : Object creation 
// 2. Runnable : calling of start() method
// 3. Running : start()  assign(JVM) ====> run()
// 4. Dead : run() completed 


// Re-Starting of Thread : 
class Mythread3 extends Thread{
	public void run(){
		System.out.println("Thraed is running...");
	}
}

class MainClass{
	public static void main(String[] args) {
		Mythread3 td3 = new Mythread3();		
		td3.start(); // first thread
		
		Mythread3 td4 = new Mythread3();
		td4.start(); // Second Thread
	}
}

class MyTest extends Thread{
	public void run() {
		display();  // Custom method
	}
	public void display() {
		System.out.println("Display Code..");
		execution();
	}
	public void execution(){
		System.out.println("Execution of Code..");
	}
}

class TestMainDemo{
	public static void main(String[] args) {
		MyTest mt = new MyTest();
		mt.start();
	}
}

//-------------------------------------------------------------------------------------------------------------------------------------------------------------


// By Implementing Runnable interface  : Support for Multiple Inheritance 

class MyRunnable implements Runnable{
	public void run() {
		System.out.println("Thread is running !....");
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();
	}
	 
}
// basic Example for Runnable Interface case : 
class MyThreadRunnable implements Runnable{
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Child Runnable Thread");
		}
	}
}

class MainRunnableClass {
	public static void main(String[] args) {
		
		MyThreadRunnable r = new MyThreadRunnable();
		Thread t = new Thread(r);  // Thread Constructor	
		t.start();
		
		for(int i=0; i<=5; i++) {
			System.out.println("Main Runnable Thread");
		}
	}
	
}
