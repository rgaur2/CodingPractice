package com.Easy;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {3,2,2,3};
		
		int result = removeElemets(arr,2);
System.out.println(result);
	}
	
	
	/*Description 
	 * Given nums = [3,2,2,3], val = 3,

      Your function should return length = 2, with the first two elements of nums being 2.

       It doesn't matter what you leave beyond the returned length.
	 */

	
	
	public static int removeElemets(int[] arr, int value)
	{
		
		int i=0;
		for(int j=0;j<arr.length;j++)
		{
			if( arr[j]!=value)
			{
				
				arr[i]=arr[j];
				
						i++;
				
			}
		}
		return i;
		
		
	}
}
