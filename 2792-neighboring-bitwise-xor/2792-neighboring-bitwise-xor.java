class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int sum=0;
        int n=derived.length;
        for(int i=0;i<n;i++){
            sum=sum^derived[i];
        }
        return sum==0;
        
    }
}