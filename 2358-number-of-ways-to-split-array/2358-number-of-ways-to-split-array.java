class Solution {
    public int waysToSplitArray(int[] nums) {
        long rightsum=0,leftsum=0;
        for(int num:nums){
            rightsum=rightsum+num;
        }
        int validsum=0;
        for(int i=0;i<nums.length-1;i++){
            leftsum=leftsum+nums[i];
            rightsum=rightsum-nums[i];
            if(leftsum>=rightsum){
                validsum++;
            }
        }
        return validsum;
    }
}