class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int start=1;
        int end=position[n-1]-position[0];
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(canplace(position,mid,m)) start=mid+1;
            else end=mid-1;
        }
        return end;
    }
    public boolean canplace(int[]position,int mid,int m){
        int lastpos=position[0];
        int c=1;
        for(int i=1;i<position.length;i++){
            if(position[i]-lastpos>=mid){
                lastpos=position[i];
                c++;
            }
            if(c>=m) return true;

        }
        return false;
    }
    
}