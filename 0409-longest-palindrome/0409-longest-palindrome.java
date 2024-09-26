class Solution {
    public int longestPalindrome(String s) {
        int[] arr=new int[128];
        for(char ch: s.toCharArray()){
            arr[ch]++;
        }
        int c=0;
        int flag=0;
        for(int fre:arr){
            
            if(fre%2==0){
                c=c+fre;
            }
            else{
                c=(c+fre)-1;
                flag=1;
            }
        }
        if(flag==1) return c+1;
        else return c;
    }
}