package testProject1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class DSAProblems {
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
	    
        public static void main(String[] args) {
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
