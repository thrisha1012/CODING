class Solution {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        int currsum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                currsum=currsum+nums[i];
            }
            else{
                currsum=nums[i];
            }
            maxsum=Math.max(currsum,maxsum);
            
        }
        
        return maxsum;
    }
}