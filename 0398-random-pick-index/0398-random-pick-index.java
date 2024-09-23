class Solution {
    private int[]nums;
    private Random rand=new Random();
    public Solution(int[] nums) {
        this.nums=nums;
    }
    
    public int pick(int target) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                list.add(i);
            }
        }
            return list.get(rand.nextInt(list.size()));
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */