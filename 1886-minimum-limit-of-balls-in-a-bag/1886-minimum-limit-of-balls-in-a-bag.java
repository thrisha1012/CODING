class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 0, right = 0;
        for (int i : nums) {
            right = Math.max(right, i);
        }
        int ans = right;
        while (left <= right) {
            int mid = (left + right) / 2; 
            if (valid(mid, nums, maxOperations)) {
                ans = mid;       
                right = mid - 1; 
            } else {
                left = mid + 1;  
            }
        }
        return ans; 
    }
    private boolean valid(int mid, int[] nums, int maxo) {
        int o = 0; 
        for (int num : nums) {
            o += (int) Math.ceil(num / (double) mid) - 1;
            if (o > maxo) return false;
        }
        return true; 
    }
}