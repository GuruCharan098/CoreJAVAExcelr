package testProject1;
import java.util.*;
public class DSAStringProblems {
	
	static String PrintSquence(String arr[], String input) {
		
		       String Output = "";
		       
		       int n = input.length();
		       
		       for(int i=0; i<n; i++) {
		    	   if(input.charAt(i)==' ')
		    		   Output = Output + "0";
		    	   else {
		    		   int position = input.charAt(i) - 'A';
		    		   Output = Output + arr[position];
		    				   
		    	   }
		       }
		       
		       return Output;
	}
      static void printDuplicates(String s) {
    	
    	char[] arr = s.toCharArray();
    	Arrays.sort(arr);
    	
    	for(int i=0; i<arr.length;) {
    		int count = 1;
    		
    		while(i+count < arr.length && arr[i] == arr[i+count]) {
    			count++;
    		}
    		
    		if(count>1) {
    			System.out.println("['"+arr[i]+"', "+count+"],");
    		}
    		
    		i += count;
    	}
       }
    
       public static void main(String[] args) {
    	   
    	   
    	   
    	   // Mobile Numbers can print Message : 
    	   String Str[] = {
    			   "2", "22" ,"222",  "3", "33" ,"333",
    			   "4","44","444", "5","55","555",
    			   "6","66","666", "7","77","777", "7777",
    			   "8","88","888", "9","99","999", "9999",		    
    	   };
    	   
    	   String input = "HELLO WORLD";
    	   System.out.println(PrintSquence(Str, input));

       	String s = "Gurucharandasparamhansi";
       	printDuplicates(s);
       	
    	   // Reverse String : 
    	   String str = "Hello";
    	   String reversed  = "";
    	   
    	   for(int i = str.length() - 1; i>=0; i-- ) {
    		   reversed +=  str.charAt(i);
    	   }
    	   System.out.println("Original : "+ str);
    	   System.out.println("Reversed : "+ reversed);
    	   
    	   // Palindrome String :
    	   
    	   String str1 = "MADAM";
    	   String reversed1  = "";
    	   for(int i = str1.length() - 1; i>=0; i-- ) {
    		   reversed1 +=  str1.charAt(i);
    	   }
    	   
    	   if(str1.equals(reversed1)) {
    	   System.out.println(str1 + "Is Palindrome String");}
    	   else {
    	   System.out.println(str1 + "Is Not Palindrome String");}
    	   
    	   // Count Vowels in String :
    	   
    	   String VowelsString = "Hello Java Application";
    	   int count = 0;
    	   VowelsString = VowelsString.toLowerCase();
    	   
    	   for(int i = 0; i < VowelsString.length(); i++) {
    		   char ch = VowelsString.charAt(i);
    		   
    		   if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
    			   count++;
    		   }
    		   
    	   }
    	   System.out.println("Numbers of Vowels in This String :" + " " + count);
    	   
    	   // Example of String Tokenizer :
    	   
    	   String data = "Aman,23,Enginner,Married,Rental";
    	   String data1 = "10+8-7*10";
    	   
    	   StringTokenizer str3 = new StringTokenizer(data1, "+-*");
    	   while(str3.hasMoreElements()) {
    		   System.out.println(str3.nextToken());
    	   }
    	   
    	   
       }
}
