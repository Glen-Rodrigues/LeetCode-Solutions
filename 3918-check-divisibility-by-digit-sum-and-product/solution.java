class Solution 
{
    public boolean checkDivisibility(int n) 
    {
        int tmp = n;
        int sum = 0, product = 1;

        while(tmp != 0)
        {
            int digit = tmp % 10;
            tmp /= 10;
            sum += digit;
            product *= digit;
        }

        return n % (sum + product) == 0;
    }
}
