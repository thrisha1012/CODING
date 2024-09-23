class Solution {
    public int numSquares(int n) {
        // Create an array to store the minimum number of squares required for each value up to n
        int[] dp = new int[n + 1];

        // Initialize dp[0] to 0 since 0 can be formed with 0 squares
        // Initialize other dp values with a high value (since we're finding the minimum)
        for (int i = 1; i <= n; i++) {
            dp[i] = i; // Maximum squares required is 'i' (1^2 used 'i' times)
        }

        // Start filling dp[] by considering all perfect squares
        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            for (int j = square; j <= n; j++) {
                dp[j] = Math.min(dp[j], dp[j - square] + 1);
            }
        }

        return dp[n]; // Minimum number of squares required to sum up to 'n'
    }
}
