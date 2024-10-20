class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int left=0;
        int right=nums.size()-1;
        int c=0;
        while(left<right){
            if(nums.get(left)+nums.get(right)<target){
                c=c+(right-left);
                left++;
            }
            else right--;
        }
        return c;
    }
}