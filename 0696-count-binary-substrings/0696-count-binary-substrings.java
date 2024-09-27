class Solution {
    public int countBinarySubstrings(String s) {
        int n=s.length();
        int one=0,zero=0,c=0;
        int currcount=1,prevcount=0;
        for(int i=1;i<n;i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    currcount++;
                }
                else{
                    if(s.charAt(i-1)=='1'){
                        one=currcount;
                    }
                    if(s.charAt(i-1)=='0'){
                        zero=currcount;
                    }
                    c=c+Math.min(zero,one);
                    prevcount=currcount;
                    currcount=1;
                }
            
        }
        if(s.charAt(n-1)=='1'){
            one=currcount;
        }
        else{
            zero=currcount;
        }
        c=c+Math.min(zero,one);
        return c;
        
    }
}