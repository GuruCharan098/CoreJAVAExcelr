package JavaMultiThreadsExamples;

// Thread local : every thread keeps its private value into variables. 
// Thread local Constructor : ThreadLocal tl = new ThreadLocal();

public class JavaThreadLocal {
	public static void main(String[] args) {
		
		ThreadLocal<Object> tl = new ThreadLocal<>();
		
		// get current thread local value
		System.out.println(tl.get());
		
		// set current thread local value
		tl.set("Excelr");
		System.out.println(tl.get());
		
		// remove current thread local value
		tl.remove();
		System.out.println(tl.get());
	}

}

// use of IntialValue() : ThreadLocal.withInitial(()-> value)
class Demo1 {
	public static void main(String[] args) {
		ThreadLocal<String> t1 = ThreadLocal.withInitial(()->  "ABC");
		System.out.println(t1.get());
		
		t1.set("EXCELR");
		System.out.println(t1.get());
		
		t1.remove();
		System.out.println(t1.get());
	}
}

// ThreadLocal vs InheritableThreadLocal :
// example of InheritableThreadLocal : 

class ParentThread extends Thread{
	public static InheritableThreadLocal<String> itl = new InheritableThreadLocal<String>();
//if childValue() not overridden
	
//	{
//		public String childValue(String p) {
//			return "cc";
//		}
//	};
	
	public void run() {
		itl.set("PP");
		System.out.println("parent Thread --" + itl.get());
		
		ChildThread ct = new ChildThread();
		ct.start();
	}
}

class ChildThread extends Thread{
	public void run() {
		System.out.println("Child Thread --" + ParentThread.itl.get());	
	}
}

class ThreadLocalDemo {
	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();
	}
}

