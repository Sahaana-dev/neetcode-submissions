class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        char ch[] = s.toCharArray();
        int maxLen = 0;
        int maxCount = 0; 
        while(right < n)
        {
            map.put(ch[right], map.getOrDefault(ch[right], 0)+1);
            maxCount = Math.max(maxCount, map.get(ch[right]));
            while(((right - left + 1) - maxCount) > k)
            {
                map.put(ch[left], map.get(ch[left])-1);
                left++;
            }
            maxLen = Math.max((right - left + 1), maxLen);
            right++;
        }
        return maxLen;
    }
}
