package JavaOOPSExamples;

public class JavaThisKeyWord{
//	  int id ;
	  
//	  JavaThisKeyWord(int id){
//		  this.id = id;
//		  
//	  }
	  
//	  void display() {
//		  System.out.println(this.id);
//	  }
	  
	JavaThisKeyWord(){
		this(10);
		System.out.println("Default");
	}
	JavaThisKeyWord(int x ){
		System.out.println("Parameterized : " + x);
	}
	
	void show(JavaThisKeyWord JTK) {
		System.out.println("Method Called");
	}
	
	void display() {
		show(this);
	}
	  
	  
	 public static void main(String[] args) {
		 // JavaThisKeyWord St = new JavaThisKeyWord(101);
		//  St.display();
		 //new JavaThisKeyWord();
		 
		 new JavaThisKeyWord().display();
	  }
}