class Solution {
    public int jump(int[] nums) {
        int near=0,far=0,jump=0;
        while(far<nums.length-1){
            int f=0;
            for(int i=near;i<=far;i++){
                f=Math.max(f,i+nums[i]);
            }
            near=far+1;
            far=f;
            jump++;
        }
        return jump;
        
    }
}