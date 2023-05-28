class Solution {
    public boolean isPalindrome(int x) {
        int tmp=0;
        int test=x;
        if(x<0)
        return false;
        while(x!=0)
        {
            int rem=0;
            rem=x%10;
            tmp=tmp*10+rem;
            x=x/10;
        }
        if(test==tmp)
        return true;
        else 
        return false;  
    }
}