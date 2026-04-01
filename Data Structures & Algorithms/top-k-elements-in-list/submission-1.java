class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int res[] = new int[k];
        int p = 0;
        for(int i=0; i<k; i++)
        {
            int max = Integer.MIN_VALUE;
            int element = -1;
            for(Map.Entry<Integer, Integer> entry : map.entrySet())
            {
                if(entry.getValue() > max)
                {
                    max = entry.getValue();
                    element = entry.getKey();
                }
            }
            res[p++] = element;
            map.remove(element);
        }
        return res;
    }
}
