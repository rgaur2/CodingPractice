package com.Easy;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("This is my First program  in Mobile Automation In Mac ");
		
	 String s[] = {"fl","flo"};
	 String prefix = s[0];
	 
	  
	  System.out.println(s[1].indexOf(prefix));
	 
	}
	
	
	
	public static void StringReverse(String str)
	{
		
	   for(int i=str.length()-1;i>0;i--)
	   {
		   System.out.println(str.charAt(i));
	   }
		
		
	}

	
	public static int   Occurance(String s)
	{
		int countc = 0;
		char c = s.charAt(0);
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == c)
			{
				countc++;
				
			}
		}
		
		
		
		return countc;
		
		
		
	}
	
	
	
	
}
