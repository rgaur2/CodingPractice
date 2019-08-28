package com.Easy;

public class Problem53MaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Integer.MIN_VALUE;
		System.out.println(x);

        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        System.out.println("Maximum contiguous sum is " + 
                                       maxSubArraySum(a)); 
	

	}

	
	
	static int maxSubArraySum(int a[]) 
    { 
        int size = a.length; 
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0; 
  
        for (int i = 0; i < size; i++) 
        { 
            max_ending_here = max_ending_here + a[i]; 
            
            if (max_so_far < max_ending_here) 
            	
                max_so_far = max_ending_here; 
            
            if (max_ending_here < 0) 
            	
                max_ending_here = 0; 
        } 
        return max_so_far; 
    } 

}
