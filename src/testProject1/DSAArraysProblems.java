package testProject1;
import java.util.*;
public class DSAArraysProblems {

		    public static ArrayList<Integer> findMinMax(int[] arr) {
		    	ArrayList<Integer> sortedArr = new ArrayList<>();
		    	for(int num : arr) {
		    		sortedArr.add(num);
		    	}
		    	Collections.sort(sortedArr);
		    	ArrayList<Integer> result = new ArrayList<>();
		    	result.add(sortedArr.get(0));
		    	result.add(sortedArr.get(sortedArr.size() - 1));
		    	
		    	return result;
		    }
		    static void resversArray(int[] arr) {
		    	   int n = arr.length;
		    	   int [] tempArray = new int[n];
		    	   
		    	   for(int i=0; i<n; i++)
		    		   tempArray[i] = arr[n-i-1];
		    	   
		    	   for(int i=0; i<n; i++)
		    		   arr[i] = tempArray[i];	    	   
		    }
		    
		    static int findMinDiff(int[] ArrayPacks, int m ) {
		    	int n = ArrayPacks.length;
		    	Arrays.sort(ArrayPacks);
		    	
		    	int minDiff = Integer.MAX_VALUE;
		    	
		    	for(int i=0; i+m-1 <n; i++) {
		    		
		    		int diff = ArrayPacks[i + m - 1] - ArrayPacks[i];
		    		if(diff < minDiff)
		    			minDiff = diff;
		    	}
		    	return minDiff;
		    }
		    static int maxSubArray(int[] nums) {
		    	int maxSum = nums[0];
		    	int CurrentSum = nums[0];
		    	
		    	for(int i = 1; i<nums.length; i++ ) {
		    		CurrentSum = Math.max(nums[i], CurrentSum + nums[i] );
		    		maxSum  = Math.max(maxSum, CurrentSum);
		    	}
		    	return maxSum;
		    
		    } 
		    
		    static boolean pairInSortedArray(int[] arr1, int target) {
		    	HashSet<Integer> set = new HashSet<>();
		    	for (int i = 0; i<arr1.length; i++) {
		    		int complement = target - arr1[i];
		    		if(set.contains(complement)) {
		    		 return true;
		    		}
		    		set.add(arr1[i]);
		    		
		    	}
		      return false;	
		    }
		    //---------------
		    
		    static boolean myCompare(String s1, String s2) {
		    	return (s1+s2).compareTo(s2+s1)>0;
		    }
		    static String findLargest(int[] arr1) {
		    	ArrayList<String> numbers = new ArrayList<>();
		    	
		    	for(int ele : arr1) {
		    		numbers.add(Integer.toString(ele));
		    	}
		    	
		    	Collections.sort(numbers, (s1,s2)-> myCompare(s1,s2)? -1:1);
		    	
		    	if(numbers.get(0).equals("0")) {
		    		return "0";
		    	}
		    	
		    	StringBuilder res = new StringBuilder();
		    	for(String num : numbers) {
		    		res.append(num);
		    	}
		    	return res.toString();
		    }
		    
		
		    
		    
		    
	        public static void main(String[] args) {
	        	
	        	
	        	
	        	
	        	int[] arr1 = {11,15,6,8,9,10};  // 986151110
	        	System.out.println(findLargest(arr1));
	        	
	        	int target = 110;
	        	
	        	if(pairInSortedArray(arr1, target))
	        		System.out.println("true");
	        	else
	        		System.out.println("false");
	        	
	        	
	        	
	        	  int[] ArrayPacks = {7,2,5,9,12,45};
	        	  int m = 2;
	        	  System.out.println(findMinDiff(ArrayPacks, m));
	        	
	        	  int[] arr = {3,5,4,8,1,7,9};
	        	  ArrayList<Integer> result =  findMinMax(arr);
	        	  System.out.println(result.get(0)+ " " + result.get(1));
	        		
	      		resversArray(arr);
	    		for(int i = 0; i<arr.length; i++) {
	    			System.out.print(arr[i] + " ");
	    		}
	    		
	             int[] nums = {-7,-2,9}; 
	             int resultSum = maxSubArray(nums);
	             System.out.println("Maximum SubArray Sum : "+ resultSum);
	        }
	}

