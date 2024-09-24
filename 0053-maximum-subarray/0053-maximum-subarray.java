class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>max)
                 max=sum;
                 b=i;
            if(sum<=0) 
                 sum=0;
                 a=i+1;
            
        }
        
        for(int i=a;i<b;i++){
            System.out.println(nums[i]);
        }
        return max;
        
    }
}