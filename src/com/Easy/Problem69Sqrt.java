package com.Easy;

public class Problem69Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int result = floorSqrt(16);
		System.out.println(result);

	}
	
	
	
	 static int floorSqrt(int x) 
	    { 
	        // Base cases 
	        if (x == 0 || x == 1) 
	            return x; 
	  
	        
	        int i = 1, result = 1; 
	          
	        while (result <= x) { 
	            i++; 
	            result = i * i; 
	        } 
	        return i - 1; 
	    } 
}
