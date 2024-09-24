class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0,n=nums.length;
        for(i=0;i<n;i++){
            if(nums[i]!=i) {
                return i;
            }
        }
            return n;
        
        
    }
}