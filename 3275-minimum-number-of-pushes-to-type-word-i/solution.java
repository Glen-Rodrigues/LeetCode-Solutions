class Solution 
{
    public int minimumPushes(String word) 
    {
        int size = word.length();
        int count = 0;
        for (int i = 1; i <= size; i++)
        {
            if (i <= 8)
            {
                count++;
            }
            else if (i <= 16)
            {
                count += 2;
            }
            else if (i <= 24)
            {
                count += 3;
            }
            else if (i <= 26)
            {
                count += 4;
            }
        }
        return count;
    }
}
