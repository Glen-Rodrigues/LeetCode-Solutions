class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        
        for (int num : nums1)
        {
            s1.add(num);
        }

        for (int num : nums2)
        {
            if (s1.contains(num))
            {
                res.add(num);
            }
        }

        int output[] = new int[res.size()];
        int index = 0;
        for (int num : res)
        {
            output[index++] = num;
        }

        return output;
    }
}
