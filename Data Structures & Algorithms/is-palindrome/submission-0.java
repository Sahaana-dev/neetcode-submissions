class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().trim();
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ' || !Character.isLetterOrDigit(str.charAt(i)))
            {
                str = str.replace(String.valueOf(str.charAt(i)), "");
            }
        }
        //Use two pointers
        int start =0, end = str.length()-1;
        while(start < end)
        {
            if(str.charAt(start) != str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
