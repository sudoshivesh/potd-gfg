/* POTD: 9 Jan 2023
Title: Last Modified Ball
Category: Mathematical Algorithm
statement: Samwell laid out N bowls in a straight line and put a few marbles randomly in each bowl, ith bowl has A[i] marbles. 
A bowl can never have more than 9 marbles at a time. A bowl can have zero marbles. 
Now Samwells friend adds one more marble to the last bowl, after this addition all the bowls must still be aligned with the rules mentioned above. 
**/

class Solution {
    int solve(int N, int[] A) {
        for (int i = N - 1; i >= 0; i--)
            if (A[i] != 9)
                return i + 1;
        return 0;
    }
};
