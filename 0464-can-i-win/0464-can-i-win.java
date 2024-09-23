import java.util.HashMap;

class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        // If desiredTotal is 0, the first player wins automatically
        if (desiredTotal <= 0) return true;

        // If the total sum of numbers is less than desiredTotal, return false
        int sum = maxChoosableInteger * (maxChoosableInteger + 1) / 2;
        if (sum < desiredTotal) return false;

        // Use a HashMap for memoization
        HashMap<Integer, Boolean> memo = new HashMap<>();
        return canWin(0, maxChoosableInteger, desiredTotal, memo);
    }

    private boolean canWin(int used, int max, int total, HashMap<Integer, Boolean> memo) {
        // Check if this state has already been computed
        if (memo.containsKey(used)) {
            return memo.get(used);
        }

        // Iterate through all possible choices
        for (int i = 1; i <= max; i++) {
            // Check if this number has already been used
            if ((used & (1 << i)) == 0) {
                // If picking this number results in a win, return true
                if (total <= i || !canWin(used | (1 << i), max, total - i, memo)) {
                    memo.put(used, true);
                    return true;
                }
            }
        }

        // If no winning move is found, store and return false
        memo.put(used, false);
        return false;
    }
}
