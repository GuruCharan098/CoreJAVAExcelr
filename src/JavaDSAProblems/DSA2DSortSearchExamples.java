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
    	  
    	  // Sorting as Selection Sort :
    	  int[] arr2 = {64, 25, 23, 12, 21, 22 };
    	  for(int i = 0; i < arr2.length -1 ; i++) {
    		  int minIndex = i;
    		  
    		  for(int j = i + 1; j <arr2.length; j++ ) {
    			  if(arr2[j] < arr2[minIndex]) {
    				  minIndex = j;
    			  }
    		  }
    		  
    		  int temp1 = arr2[i];
    		  arr2[i] = arr2[minIndex];
    		  arr2[minIndex]  = temp1;
    	  }
    	  
    	  for(int num1 : arr2) {
    		  System.out.println(num1 + " ");
    	  }
    	  
    	  // Insertion Sort In Sorting : 
    	  
    	  int[] array1 = {5,4, 3, 2, 1};
    	  
    	  for(int i = 1; i < array1.length; i++) {
    		  int key = array1[i];
    		  int j = i - 1;
    		  
    		  while(j >= 0 && array1[j] > key) {
    			  array1[j+1] = array1[j];
    			  j--;
    		  }
    		  
    		  array1[j+1] = key;
    	  }
    	  
    	  for(int items: array1) {
    		  System.out.println(items + " ");
    	  }
    	  
    	  
    	  // Anagram String Check :    	  
    	  String St1 = "listen";
    	  String St2 = "silent";
    	  
    	  if(St1.length() != St2.length()) {
    		  System.out.println("Not Anagram String...");
    		  return;
    	  }
    	  
    	  int[] count = new int[256];
    	  
    	  for(int i = 0; i < St1.length(); i++) {
    		  count[St1.charAt(i)]++;
    		  count[St2.charAt(i)]--;
    	  }
    	  
    	  for(int c : count) {
    		  if(c!=0) {
    			  System.out.println("Not Anagram String...");
    			  return;
    		  }
    	  }
    	  System.out.println("Yes, It's Anagram String..."); 
      }
}
