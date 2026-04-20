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

// Thread Scheduler : 

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
		td.run();
		for(int i = 0; i<=5; i++) {
			System.out.println("Main Thread");
		}
	}
}


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