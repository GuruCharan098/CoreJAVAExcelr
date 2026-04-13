package JavaOOPSExamples;

public class JavaHighCohesion {
	
	int add( int a, int b) {
		return a+b;
	}
    int sub( int a, int b) {
    	return a-b;
	}
    int mul( int a, int b) {
    	return a*b;
    }
    int div( int a, int b) {
    	return a/b;
    }
    
    public static void main(String[] args) {
    	JavaHighCohesion JHC = new JavaHighCohesion();
    	
    	System.out.println(JHC.add(2, 4));
    	System.out.println(JHC.sub(7, 3));
    	System.out.println(JHC.mul(8, 8));
    	System.out.println(JHC.div(12, 4));
  
    }

}
