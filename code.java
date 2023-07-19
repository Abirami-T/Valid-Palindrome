/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
*/


class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        str=str.replaceAll("[^a-zA-Z0-9]","");
 StringBuilder sb=new StringBuilder(str);
        String st= sb.reverse().toString();
        if(st.equals(str)){
            return true;
        }
        return false;
    }
}
