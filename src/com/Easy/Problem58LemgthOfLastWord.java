package com.Easy;

public class Problem58LemgthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String a = "ssn";
		String result = a.trim();
		// Trim mrthod remove the spaced before and after the string
		System.out.println(result);
		String name = "Rishabh Gaur";
		int  res = lengthOfLastword(name);
		System.out.println(res);
		
		
	}
	
	
	
	public static int lengthOfLastword(final String a)

	{
		
		
		int len=0;
		
	   String x = a.trim();
	   for(int i=0;i<x.length();i++)
	   {
		   if (x.charAt(i) == ' ') 
			   len=0;
		   else
			   len++;
			   
	   }
	   
	   return len;
	   
		
	}

}
