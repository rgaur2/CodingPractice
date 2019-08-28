package com.Easy;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum of two 
		 int x = Integer.MAX_VALUE/10;
		 int y = Integer.MIN_VALUE/10;
		 System.out.println(x);
		 System.out.println(y);

	}
//suppose x = 110
	
	public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
        	
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)
            		) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
	
	
	
	public int[] twoSum(int [] nums ,int target )
	 {
		 for(int i =0;i<nums.length;i++)
		 {
			 for(int j=i+1;j<nums.length;j++)
			 {
				 if(nums[j]== target - nums[i])
				 {
					  return new int[] {i,j};
					 
				 }
			 }
				 
		 }
		 throw new IllegalArgumentException("No two sum solution ");
         
	 }
}
