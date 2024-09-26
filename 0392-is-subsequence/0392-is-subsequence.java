class Solution {
    public boolean isSubsequence(String s, String t) {
        int left=0;
        int right=0;
        int c=0;
        while(left<s.length() && right<t.length()){
            if(s.charAt(left)==t.charAt(right)){
                c++;
                left++;
            }
            right++;
        }
        
        return c==s.length();
        
    }
}