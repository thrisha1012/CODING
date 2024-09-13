class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
        String word=words[i];
        boolean isconst=true;
        for(int j=0;j<word.length();j++){
            if(!allowed.contains(String.valueOf(word.charAt(j))))
            {
                 isconst=false;
                 break;
            }
        }
        if(isconst) c++;
        }
        return c;
          
    }
}