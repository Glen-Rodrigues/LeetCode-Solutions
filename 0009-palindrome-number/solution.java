class Solution 
{
    public boolean isPalindrome(int x) 
    {
        if (x < 0)
        {
            return false;
        }

        int reverse = 0, temp = x;

        while (x != 0)
        {
            int d = x % 10;
            x = x / 10;
            reverse = (reverse * 10) + d;
        }

        return reverse == temp;
    }
}
