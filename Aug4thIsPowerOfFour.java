/*
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example 1:

Input: 16
Output: true
Example 2:

Input: 5
Output: false
Follow up: Could you solve it without loops/recursion?
*/

/* Solution: Attempt is made to solve it without loops and recursion
			 Any number which is power of 4 will be a integral number when its log to base 4 is calculated
			 Log to base 4 is calculated using Math.log
*/
class Aug4thIsPowerOfFour 
{
    public boolean isPowerOfFour(int num) 
    {   
        if((Math.log(num)/Math.log(4))%1==0)
            return true;
        else
            return false;
        
    }
}