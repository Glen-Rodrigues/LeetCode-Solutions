class Solution 
{
    public int minimumPushes(String word) 
    {
        int size = word.length();
        int count = 0;
        for (int i = 0; i < size; i++)
        {
            count += (i / 8) + 1;
        }
        return count;
    }
}
