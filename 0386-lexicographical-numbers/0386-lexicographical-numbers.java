import java.util.*;

class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();

        // Start from 1 and go up to n
        int current = 1;

        // Loop to generate numbers in lexical order
        for (int i = 1; i <= n; i++) {
            list.add(current);
            // If we can go deeper, multiply by 10
            if (current * 10 <= n) {
                current *= 10;
            } else {
                // Move to the next sibling
                if (current >= n) {
                    current /= 10;
                }
                current++; // Increment to get the next number

                // Skip trailing zeros
                while (current % 10 == 0) {
                    current /= 10;
                }
            }
        }

        return list;
    }
}
