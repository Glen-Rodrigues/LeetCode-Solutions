class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int index = 0;
        int length = nums.length;

        for (int i = 1; i < length; i++)
        {
            if (nums[index] != nums[i])
            {
                nums[++index] = nums[i];
            }
        }

        return ++index;
    }
}
