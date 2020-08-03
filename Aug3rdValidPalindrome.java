/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:
Input: "race a car"
Output: false
*/

/*Solution 1 : Simple using replaceAll function of string to remove all characters except alphanumberic, 
               Then Converting string to lowercase letters
               Reversing the string
               Comparing the 2 strings and returning true or false accoringly
*/

class Aug3rdValidPalindrome 
{
    public boolean isPalindrome(String s) 
    {
        s = s.replaceAll("[^a-zA-Z0-9]", ""); 
        s = s.toLowerCase();
        StringBuffer tp = new StringBuffer(s);
        tp.reverse();
        String sp = tp.toString();
        if(s.equals(sp))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

/*Solution 2 : Converting the string to lowercase, using a for loop to remove all chracters except alphanumeric ones using their ASCII values,
               Then as above solution using string buffer to reverse it and convert back to string using toString()

*/

class Solution 
{
    public boolean isPalindrome(String s) 
    {
        s = s.toLowerCase();
        StringBuffer tp = new StringBuffer(s);
        for(int i = 0 ; i < tp.length() ; i++)
        {
            int sa = tp.charAt(i);
            if(sa<'0' || (sa>'Z' && sa<'a') || sa>'z' || (sa>'9' && sa<'A' )  )
            {
                tp.deleteCharAt(i);
                i--;
            }
        }
        StringBuffer tp2 = new StringBuffer(tp);
        tp.reverse();
        String sp = tp.toString();
        String sp2 = tp2.toString();
        if(sp2.equals(sp))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
// P:S : Solution 3 is not mine! Learnt from other's solution 
/*Solution 3 : Start and end are used as pointers to refer starting and ending character initially, 
               if alphanumeric characters are not encountered, they are ignored by moving ahead start or by moving back end
               if alphanumeric are encountered, they are checked if they are same we proceed else return false.

*/
class Solution {
    public boolean isPalindrome(String s) {
        //two pointer
        int start = 0, end = s.length() - 1; 
        while (start < end){
            if (!Character.isLetterOrDigit(s.charAt(start))){
                start++; 
            } else if (!Character.isLetterOrDigit(s.charAt(end))){
                end--; 
            } else if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false; 
            } else {
                start++; 
                end--; 
            }
        }
        return true; 
    }
}

