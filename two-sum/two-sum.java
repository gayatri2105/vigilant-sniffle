class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] out= new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int f=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                if(f+nums[j]==target)
                {
                    out[0]=i;
                    out[1]=j;
                }
            }
        }
        return(out);
    }
}