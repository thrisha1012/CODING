class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int c=0;
        int flag=0;
        for(int fre:map.values()){
            
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