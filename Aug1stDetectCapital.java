/*Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.

Example 1:
Input: "USA"
Output: True
 
Example 2:
Input: "FlaG"
Output: False
*/

/*
O(n) Time Complexity
Constant Space Complexity
n : Length of String 
*/
//Here ASCII value is used, alternatively isUpperCase() & isLowerCase() would also be used!
class Aug1stDetectCapital 
{
    public boolean detectCapitalUse(String word) 
    {
        boolean flag = true;
        if(word.length()==1)
        {
            return true;
        }
        if((int)word.charAt(0) <= 90 && (int)word.charAt(1) <= 90 )//1st and 2nd capital
        {
            for(int i = 2 ; i < word.length() ; i++)
            {
                if((int)word.charAt(i) > 90)//All should be capital, turn flag to false if not the case
                {
                    flag = false;
                    break;
                }
            }
        }
        else if((int)word.charAt(0) <= 90 && (int)word.charAt(1) > 90)//1st capital 2nd small
        {
            for(int i = 2 ; i < word.length() ; i++)
            {
                if((int)word.charAt(i) <= 90)//All should be small, turn flag to false if not the case
                {
                    flag = false;
                    break;
                }
            }
        }
        else if((int)word.charAt(0) > 90 && (int)word.charAt(1) > 90)// 1st and 2nd both small
        {
            for(int i = 2 ; i < word.length() ; i++)
            {
                if((int)word.charAt(i) <= 90)//All should be small, turn flag to false if not the case
                {
                    flag = false;
                    break;
                }
            }
        }
        else//other cases
        {
            flag = false;
        }
        
        return flag;
    }
}
