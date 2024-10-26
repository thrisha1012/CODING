class Solution {
    int count = 0;
    String str1 = "";
    public String getPermutation(int n, int k) {
        getPermutationHelper(n, k, 0, new StringBuilder(""));
        return str1;
    }

    public boolean getPermutationHelper(int n, int k, int level, StringBuilder sb) {
        //Base Case
        if(level == n) {
            // System.out.println(sb.toString());
            str1 = sb.toString();
            return true;
        }
        
        
        //Recursive calls
        int fact = factorial(n-1-level);
        boolean check;

        for(int i=1; i<=n; i++) {
            char ch = (char)('0'+i);
            String str = Character.toString(ch);
    
            if(sb.indexOf(str) == -1) {
                if(k > fact) {
                    k = k-fact;
                    continue;
                }

                sb.append(ch);
                check = getPermutationHelper(n, k, level+1, sb);
                sb.deleteCharAt(sb.length()-1);

                if(check == true)
                    return true;
            }
        }

        return false;
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}