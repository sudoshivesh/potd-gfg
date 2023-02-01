

// User function Template for Java

class Solution {
    public static int minVal(int a, int b) {
        // code here
        int setBits = Integer.bitCount(b);
        int setBits1 = Integer.bitCount(a);
        int ans = 0;

        for (int i = 0; i <= 31; i++) {
            int mask = 1 << i;
            int set = a & mask;

            // If i'th bit is set also set the
            // same bit in the required number
            if (set == 0 && setBits > setBits1) {
                ans |= (mask);
                setBits--;
            } else if (set != 0 && setBits1 > setBits) {
                setBits1--;
            } else {
                ans |= set;
            }
        }

        return ans;
    }
}
