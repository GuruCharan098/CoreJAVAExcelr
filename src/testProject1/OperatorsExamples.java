package testProject1;

public class OperatorsExamples {
        public static void main(String[] args) {
        	System.out.println("Java Operators Examples");
// Arithmetical operators : 
        	int a = 10, b = 3;
        	System.out.println("Addition :" + (a + b));
        	System.out.println("Substraction :" + (a - b));
        	System.out.println("Multiplication :" + (a * b));
        	System.out.println("Division :" + (a / b));
        	System.out.println("Modulus :" + (a % b));
        	
        	
//Relational Operators :
//        	int x = 10, y = 20;
//        	System.out.println(x == y);
//        	System.out.println(x != y);
//        	System.out.println(x > y);
//        	System.out.println(x < y);
//        	System.out.println(x >= y);
//        	System.out.println(x <= y);  
       
// Logical Operators : 
        	
        	int k = 20, j = 30;
        	System.out.println(k < 25 && j > 25);
        	System.out.println(k < 25 || j > 25);
        	System.out.println(!(k == j));
        	
// Assignment Operators : 
        	 k += 5;
        	 System.out.println(k);	 
        	j *= 2;
        	 System.out.println(j);
        	 
// Increment & Decrement Operators :
        	 // Increment Op : ++
        	 // Decrement Op : --
        	 
        	 int ab = 5;
        	 System.out.println(++ab);	
        	 System.out.println(ab++); 
        	 System.out.println(ab);
        	 
        	 System.out.println(--ab);
        	 System.out.println(ab--); 
        	 System.out.println(ab);

// Conditional operators (Ternary Op) :  
        	 int xy = 10, zx = 20;  	 
        	 int max = (xy > zx) ? xy : zx; 
        	 System.out.println(max);
        	 
// Operators Precedence : 
        	 int x=10, y=5, z=3;
        	 int res = x+y*z;
        	 System.out.println("Result : "+res);
        }
}
