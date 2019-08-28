package com.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    }
	    
	
	
	
	
	static Map<Character, Character> mappings = new HashMap<>();
    static {
        mappings.put('(', ')');
        mappings.put('[', ']');
        mappings.put('{', '}');

	}
    
    
    
    public boolean isValid(String s)
    {
    	Stack<Character>  parenthsis = new Stack<>();
    	for(int i=0;i<s.length();i++)
    	{
    		char c = s.charAt(i);
    		if(mappings.containsKey(c))
    		{
    			parenthsis.push(mappings.get(c));
    		}
    		
    		else if (mappings.containsValue(c))
    		{
    			
    			if(parenthsis.isEmpty() || parenthsis.pop()!=c)
    				return false;
    		}
    	}
    return	parenthsis.empty();
    	
    }
    
    
}

    

