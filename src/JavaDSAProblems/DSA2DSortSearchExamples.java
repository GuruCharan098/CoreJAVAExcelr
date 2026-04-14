package JavaDSAProblems;

public class DSA2DSortSearchExamples {
      static int factorial(int n ) {
    	  if(n==0||n==1) return n;
    	  return n* factorial(n-1);
      }
      
      static int sumOfDigit(int digit) {
    	  if(digit == 0) return digit;
    	  return (digit % 10) + sumOfDigit(digit/10);
    			  
      }
      
      public static void main(String[] args) {
    	  
    	  System.out.println("Sum Of Digit : " + sumOfDigit(53211));
    	      
    	  System.out.println("Factorial :" + factorial(5));
    	  
    	  // Fibonacci Series with loop from 0 to 15;
    	  
    	  int num = 15;
    	  int a = 0, b = 1;
    	  
    	  System.out.println("Fibonacci Series : ");
    	  
    	  for(int i = 0; i<=num; i++) {
    		  System.out.print(a + " ");
    		  int next = a+b;
    		  a = b ; 
    		  b = next;
    	  }
    	  
    	  // Transpose of Matrix 
    	  int[][] arr = {{1,2,3},{4,5,6}};
    	  
    	  int rows = arr.length;
    	  int cols = arr[0].length;
    	  
    	  int[][] transpose = new int[cols][rows];
    	  
    	  for(int i = 0; i < rows; i++) {
    		  for(int j = 0; j<cols; j++) {
    			  transpose[j][i] = arr[i][j];
    		  }
    	  }
    	  System.out.println("Transpose Matrix : ");
    	  
    	  for(int[] row: transpose) {
    		  for(int val : row) {
    			  System.out.print(val + " ");
    		  }
    		  System.out.println();
    	  }
    	  // Row wise sum of matrix 
    	  int[][] array = {{1,2},{3,4}};
    	  
    	  for(int i = 0 ; i < arr.length; i++) {
    		  int sum = 0;
    		  for(int j = 0 ; j<arr[i].length; j++) {
    			  sum += arr[i][j];
    		  }
    		  
    		  System.out.println("Row :" + (i + 1)+ "sum :" + sum);
    	  }
    	  
    	  // Sorting as Bubble Sort : 
    	  
    	  int[] isSortArray = {5, 9, 3, 7, 4, 1};

    	  for(int i = 0 ; i<isSortArray.length-1; i++) {
    		  for(int j = 0; j<isSortArray.length-1; j++) {
    			  
    			  if(isSortArray[j] > isSortArray[j+1]) {
    				  int temp = isSortArray[j];
    				  isSortArray[j] = isSortArray[j+1];
    				  isSortArray[j+1] = temp;
    			  }
    		  }
    	  }
    	  
    	  System.out.println("Sorted Array : ");
    	  for(int num1 : isSortArray) {
    		  System.out.print( num1 + " ");
    	  }
    	  
      }
}
