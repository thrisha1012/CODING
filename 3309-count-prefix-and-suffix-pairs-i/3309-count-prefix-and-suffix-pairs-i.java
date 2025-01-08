class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n=words.length;
        int pair=0;
        for(int i=0;i<n;i++){
            String curr=words[i];
            for(int j=i+1;j<n;j++){
                String comp=words[j];
                if(comp.startsWith(curr) && comp.endsWith(curr))
                pair++;
            }
        }
        return pair;
        
    }
}