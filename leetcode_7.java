class Solution {
    public int reverse(int x)
    {
        boolean isNegative=x<0;
        
        if (isNegative)
            x=x*(-1);
        
        long riverse=0;
        int LastDigit;
        while(x>0)
        {
            LastDigit=x%10;
            riverse=riverse*10+LastDigit;
            x=x/10;
        }
        if(riverse>2147483647)
            return 0;
     return isNegative? (int)riverse*(-1):(int)riverse;    
    }
}
