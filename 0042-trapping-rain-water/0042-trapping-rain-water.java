class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int sum=0;
        int l[]=new int[n];
        int r[]=new int[n];
        l[0]=height[0];
        r[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            l[i]=Math.max(height[i],l[i-1]);
        }
        for(int j=n-2;j>=0;j--){
            r[j]=Math.max(height[j],r[j+1]);
        }
        for(int i=0;i<n;i++){
            sum=sum+Math.min(l[i],r[i])-height[i];
        }
        return sum;
        
    }
}