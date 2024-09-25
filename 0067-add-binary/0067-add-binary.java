import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger a1 = new BigInteger(a, 2);
        BigInteger b1 = new BigInteger(b, 2);
        BigInteger sum = a1.add(b1);
        return sum.toString(2); // Convert the sum back to a binary string
    }
}
