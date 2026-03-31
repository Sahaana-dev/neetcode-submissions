class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int n = nums.length;
        int count = 0;
        for(int i: nums)
        {
            if(i == 0)
            {
                count++;
            }
            else
            {
                product *= i;
            }
        }
        int copy = product;
        int resArr[] = new int[n];
        if(count == 0)
        {
            for(int i=0; i<n; i++)
            {
                product = copy;
                resArr[i] = product/nums[i];
            }
        }
        else if(count > 1)
        {
            for(int i=0; i<n; i++)
            {
                resArr[i] = 0;
            }
        }
        else if( count == 1)
        {
            for(int i=0; i<n; i++)
            {
                product = copy;
                if(nums[i] == 0)
                {
                    resArr[i] = product;
                }
                else
                {
                    resArr[i] = 0;
                }
            }
        }
        return resArr;
    }
}  
