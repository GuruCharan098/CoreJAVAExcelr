package testProject1;

public class JavaStatements {
	
	static void check() {
		System.out.println("Start");
		
		if(true) {
			return;
		}
//		System.out.println("End");
	}
	
	public static void main(String[] args) {
		
		check();
		
		int num = 12;
		
		if(num % 2 == 0) {
			System.out.println("Even");
		}else
			System.out.println("Odd");
		
		
		//int a = 10,  b= 20, c = 15;
		
//		if(a>b && a>c) {
//			System.out.println(a);
//		}else if(b > c)
//			System.out.println(b);
//		else
//			System.out.println(c);
//		
		
		char ch = '*';
		
		if(ch>= 'a' && ch<='z') {
			System.out.println("LowerCase....");
		}else if(ch>= 'A'&& ch<='Z') {
			System.out.println("UpperCase....");
		}else if(ch>= '0' && ch <= '9') {
			System.out.println("Digit....");
		}else {
			System.out.println("Special Symbol....");
		}
		
	   int x = 10, y = 5; 
	   
//	   int temp = x; 
//	   x = y;
//	   y = temp; 
//	   
	   x = x + y ; // 10 + 5 = X = 15;
	   y = x - y ; // 15 - 5 = y = 10;
	   x = x - y ; // 15 - 10 = X = 5;
	   System.out.println(x+ " "+ y);
	   
		
		
		
		
		
		
		
		
		
		
		
		
		//-------------------------------------------
		// Types of Java Statements 
		
		//1. Simple Statements : 
		//a. Input Statement : 
//		   int a = 10;
//		   int b = 20;
		   
	   //b. Output Statement : 
		  // System.out.println(a);
		   
	  // 2. Conditional Statements : 
		 // a. Simple If or If Statement : 
//		   if(a > 2) 
//			   System.out.println("Positive Number");  
		 // b. If-else Statement :
//            if(a > b) {
//            	System.out.println("a is big");
//            } else {
//            	System.out.println("b is big");
//            }
         // c. if-else-if Ladder (Statements) 
            //int marks = 85;
            
//            if(marks > 90){
//            	System.out.println("A");
//            }else if(marks > 80) {
//            	System.out.println("B");
//            }else if(marks > 70) {
//            	System.out.println("C");
//            }else {
//            	System.out.println("Fail");
//            }
		   
        // d. Multiple If statement : 
//            if(marks > 90){
//            	System.out.println("A");
//            }
//            if(marks > 80) {
//            	System.out.println("B");
//            } 
//            if(marks > 70) {
//            	System.out.println("C");
//            }   
          
        // e. Nested if Statements :
//            if(marks > 80 ){
//            	char grade = 'A';
//            	if(grade == 'A') {
//            		System.out.println(" First Division.." + grade);
//            	}
//            }
            
        // f. Switch Statement :
            int day = 4;
            switch(day) {
            case 1 : 
            	System.out.println("Monday");
            	break;
            case 2 : 
            	System.out.println("Tuesday");
            	break;
            case 3 : 
            	System.out.println("Wednesday");
            	break;
            default  : 
            	System.out.println("Invalid");
            }
            
            
            
     // 3.  Looping Statements : 
            
            //a. for loop : 
//            for(int i=10; i>=1; i--) {
//            	System.out.println(i);
//            }
            
            //b. While loop :
//            int j = 2;
//           
//            while(j <=20) {
//            	System.out.println(j);
//            	j += 2;   	
//            }
            //c. Do while loop :
//            int a = 1;
//            do {
//            	System.out.println(a);
//            	a++;
//            }while(a<=5);
            
            
            //4. Jumping Statements : 
            //a. break Statement :
            for (int k = 1; k<=5; k++) {
            	if(k==2) {
            		continue;
            	}
            	if(k==4) {
            		break;
            	}
            	System.out.println(k);
            }
	}

}
