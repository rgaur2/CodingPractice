package com.Easy;

public class ProblemClimbStairs70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s=2;
		CountWays(s);
		System.out.println("Numbwer of ways "+s);
		
		
		
		
		

	}
	
	    public static int fib(int n)
	    {
		if(n<=1)
		
			return n;
			return fib(n-1)+ fib(n-2);
		
	}
	
	  public static int CountWays(int s)
	  {
		return fib(s+1);
	   }

}
