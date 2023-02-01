//User function Template for Java

class Solution{
    public static long distinctColoring(int N, int[]r, int[]g, int[]b){
        //code here
         long [][] dp = new long[3][N];
        dp[0][N-1] = r[N-1];
        dp[1][N-1] = g[N-1];
        dp[2][N-1] = b[N-1];
        for(int col=N-2; col>=0; col--){
            dp[0][col] = Math.min(dp[1][col+1],dp[2][col+1]) + r[col];         
            dp[1][col] = Math.min(dp[0][col+1],dp[2][col+1]) + g[col];         
            dp[2][col] = Math.min(dp[0][col+1],dp[1][col+1]) + b[col];             
        }
        long min = dp[0][0];
        for(int i=0; i<3; i++){
            min = Math.min(min, dp[i][0]);
        }
        return min;
    }
}
