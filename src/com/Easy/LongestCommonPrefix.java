package com.Easy;

public class LongestCommonPrefix {

	
	public static void main(String[] args) {
		
		String str []= {"fl" ,"flo", "flow"};
		
		 LongestCommonPrefix ob = new  LongestCommonPrefix();
		 
				
	String result = 	 ob.longestCommonprefix1(str);
		 System.out.println(result);
	}
	
	
	
	
	
	public String longestCommonprefix1(String[] str)
	{
		if( str.length ==0)//If string length zero
			
			return "";
		
		String prefix = str[0];
		
		for(int i =0;i<str.length; i++)
		{
			
			
			while (str[i].indexOf(prefix)  != 0)
			{
				prefix = prefix.substring(0, prefix.length() -1);
				
				if(prefix.isEmpty())
					return "";
			}
		}
		
		
		
		return prefix;
		
		
		
	}


}
