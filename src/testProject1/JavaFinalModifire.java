package testProject1;
import java.io.Serializable;
public class JavaFinalModifire {
	
	//Final Modifier : Applicable for Classes, Methods and Variables;
	// Final variables : Once Assigned and value can not change.  

	//Final with Instance variable;
	final int x = 100;
    final void display() {
    	System.out.println("Display : "+ x);
    }
    
    //Final with Instance Scope;
    final int y;
    {
    	y = 200;
    }
    
    //Final with Class Constructor;
    final int z ;
    JavaFinalModifire(){
    	z = 300;
    }
	public static void main(String[] args) {
		JavaFinalModifire obj = new JavaFinalModifire();
		obj.display();		
		System.out.println(new JavaFinalModifire().y);
	}
}


// final variables : for Static variable and Scope;  
class StaticFinalModifier{
	//Final with Static variable;
	static final int x ;
	
	//Final with Static Scope;
	static {
		x = 50;
	}
	
	//Final parameter : 
	void show(final int a) {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		final int y = 10;
		System.out.println(y);
		
		new StaticFinalModifier().show(5);
		System.out.println(x);
	} 
}


// Static Demo class and check Static Modifiers;
        class StaticDemo{
        	static int count = 0;
        	StaticDemo(){
        		count++;
        	}
        	public static void main(String[] args) {
        		
        		new StaticDemo();
        		System.out.println("Count" + count);
        		
        		new StaticDemo();
        		System.out.println("Count" + count);
        		
        		new StaticDemo();
        		System.out.println("Count" + count);
        	}
        }
        
// Native Modifier :  JNI (Java Native Interface)    
        
        class NativeDemo{
        	native void show();    // No body
        	
        	public static void main(String[] args) {
        		System.out.println("Native Example");
        	}
        }
        
// Synchronized Keyword/Modifier :
        class SyncDemo{
         synchronized void show() {
        		System.out.println("Execution : " +Thread.currentThread().getName());
        		try {
            		Thread.sleep(1000);
            	}catch(InterruptedException e) {
            		e.printStackTrace();
            	}
        	}  
        }
        class MyThread extends Thread {
        	SyncDemo obj ;
        	
        	MyThread(SyncDemo obj){
        		this.obj = obj;
        	}
        	
        	public void run() {
        		obj.show();
        	}
        }
        
        class MainClass {
        	public static void main(String[] args) {
        		SyncDemo obj = new SyncDemo();
        		
        		MyThread t1 = new MyThread(obj);
        		MyThread t2 = new MyThread(obj);
        		MyThread t3 = new MyThread(obj);
        		
        		t1.setName("Thread-1");
        		t2.setName("Thread-2");
        		t3.setName("Thread-3");
        		
        		t1.start();
        		//t1.join();
        		
        		t2.start();
        		//t2.join();
        		
        		t3.start();
        		//t3.join();
        	}
        }
        
// Transient keyword :
        class TransientDemo implements Serializable{
        	transient int x = 100;
        	public static void main(String[] args) {
        		TransientDemo obj = new TransientDemo();
        		System.out.print(obj.x);
        	}
        }
        
// Volatile keyword :
        class VolatileDemo{
        	volatile int count = 0;
        	
        	void showVolatile() {
        		count++;
        		System.out.println(count);
        	}
        	public static void main(String[] args) {
        		VolatileDemo obj = new VolatileDemo();
        		obj.showVolatile();
        	}
        	
        }
        