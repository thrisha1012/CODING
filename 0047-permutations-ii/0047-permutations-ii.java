import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array to handle duplicates
        boolean[] freq = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), ans, freq);
        return ans;
    }

    private void backtrack(int[] nums, List<Integer> current, List<List<Integer>> ans, boolean[] freq) {
        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (freq[i] || (i > 0 && nums[i] == nums[i - 1] && !freq[i - 1])) {
                continue;
            }
            freq[i] = true;
            current.add(nums[i]);
            backtrack(nums, current, ans, freq);
            current.remove(current.size() - 1);
            freq[i] = false;
        }
    }
}