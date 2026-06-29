class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        char ch[] = s.toCharArray();
        int max = 0;
        while(right < s.length())
        {
            while(set.contains(ch[right]))
            {
                set.remove(ch[left]);
                left++;
            }
            set.add(ch[right]);
            max = Math.max(max, (right-left)+1);
            right++;
        }
        return max;
    }
}
