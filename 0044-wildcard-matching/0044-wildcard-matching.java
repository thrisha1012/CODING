class Solution {
    public boolean isMatch(String s, String p) {
        int n=p.length();
        int m=s.length();

        boolean prev[]=new boolean[m+1];
        boolean curr[]=new boolean[m+1];
        prev[0]=true;
        for(int i=1;i<=n;i++){
            curr[0]=ismatch(p,i);
            for(int j=1;j<=m;j++){
                if(p.charAt(i-1) == s.charAt(j-1) || p.charAt(i-1)=='?'){
                    curr[j]=prev[j-1];
                }
                else{
                    if(p.charAt(i-1)=='*'){
                        curr[j]=prev[j]||curr[j-1];
                    }
                    else{
                        curr[j]=false;
                    }
                }
            }
            prev=curr.clone();

        }
        return prev[m];
        
    }
    public static boolean ismatch(String p,int i){
        for(int j=1;j<=i;j++){
            if(p.charAt(j-1)!='*') return false;
        }
        return true;
    }
}