class Solution {
    public int numDecodings(String s) {
      
        char[] a = s.toCharArray();
        int n = a.length;
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) dp[i] = -1;
        if (a[0] == '0' || (a[0] == '0' && n > 1 && a[1] == '0')) return 0;
        return get(0, a, n, dp);
    }

    static int get(int i, char[] a, int n, int[] dp) {
        if ((i == n - 1 && a[n - 1] != '0') || i >= n) return 1;
        if (a[i] == '0') {
            return dp[i] = 0;
        }
        if (dp[i] != -1) return dp[i];
        int pickone = get(i + 1, a, n, dp);
        int picktwo = 0;
        int k1 = (int) (a[i] - '0');
        int k2 = (int) (a[i + 1] - '0');
        k1 *= 10;
        if (k1 + k2 <= 26) {
            picktwo = get(i + 2, a, n, dp);
        }
        return dp[i] = pickone + picktwo;
    }
}