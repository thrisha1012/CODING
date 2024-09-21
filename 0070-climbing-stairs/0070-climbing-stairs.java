class Solution {
    public int climbStairs(int n) {
        int a=0,b=1,c=0;
        while(n!=0){
            c=a+b;
            a=b;
            b=c;
            n--;
        }
        return c;
    }
}