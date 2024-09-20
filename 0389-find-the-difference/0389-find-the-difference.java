class Solution {
    public char findTheDifference(String s, String t) {
        int c=0;
        for(int i=0;i<s.length();i++){
           c=c^s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            c=c^t.charAt(i);
        }
        return (char)c;
        
    }
}