package testProject1;

public class JavaLoopStatements {
	// ArmsStrong Number : 153 --> 1*1*1 + 5*5*5 + 3*3*3 = 153;
	public static int powerNums(int x, int y){
		if(y==0)
			return 1;
		if(y%2 ==0) 
			return powerNums(x,y/2)* powerNums(x,y/2);
		
		return x * powerNums(x,y/2)* powerNums(x,y/2);
	}
	public static int orderDigit(int n){
		int t = 0;
		while(n!=0) {
			t++;
			n = n/10;
		}
		return t;
	}
	public static boolean checkArmsStrongNum(int n){
		int x = orderDigit(n);
		int temp = n , sum = 0;
		
		while(temp!=0) {
			int r = temp % 10;
			sum += powerNums(r, x);	
			temp = temp /10;
					
		}
		return sum == n;
		
	}
	
	public static void main(String[] args) {	
		
		int n = 121;
		if(checkArmsStrongNum(n)) {
			System.out.println("true");
		}else
			System.out.println("false");

		
		for(int i=1; i<=5; i++) {
			for(int j= 1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j= 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5; i>=1; i--) {
			for(int j= 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<i; k++) {
				System.out.print("*");
			}
			for(int l=1; l<=i; l++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		
		
		
//		for(int i=0; i<=5; i++) {
//			for(int j = 0; j<=3;j++) {
//				
//				if(i==j) {
//					
//				}
//				System.out.println("Number I:"+ i + "Number J " + j);
//			}
//			
//		}
//		
//		int k = 1;
//		while(k<=5) {
//			System.out.println("Value: "+ k);
//			k++;
//		}
//		
//		int j =10;
//		 do {
//			 System.out.println("Hello :" + j);
//			 j++;
//		 }while(j<=5);
		
// Reverse Number : Number = 345;  output : 543	
//		
//		int num = 45673;
//		int rev = 0;
//		
//		while(num>0) {
//			int res = num % 10;
//			rev = (rev * 10) + res;
//			num = num / 10;
//		}
//		System.out.println("Hello :" + rev);
		
// Palindrome Numbers : 121, 151, 111, 00200200200
//		
//		int number = 121;
//	    int original = number;
//	    int reverse = 0;
//	    
//	    while(number >0 ) {
//	    	int result = number % 10;
//	    	reverse = (reverse * 10) + result;
//	    	number = number / 10;
//	    }
//	    if(original == reverse) {
//	    	System.out.println("Palindrome Number...");
//	    }else
//	    	System.out.println("Not Palindrome Number...");
	    
	    
	   
	    

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}	

}


