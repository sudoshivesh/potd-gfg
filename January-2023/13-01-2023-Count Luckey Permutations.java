class Solution {
    long luckyPermutations(int N, int M, int arr[], int[][] graph) {
        long dp[][] = new long[N][1 << N];
        int adj[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            dp[i][1 << i] = 1;
        }

        for (int i = 0; i < M; i++) {
            adj[graph[i][0] - 1][graph[i][1] - 1] = 1;
            adj[graph[i][1] - 1][graph[i][0] - 1] = 1;
        }
        for (int bitmask = 1; bitmask < (1 << N); bitmask++) {
            for (int i = 0; i < N; i++) {
                if ((1 & (bitmask >> i)) > 0) {
                    for (int j = 0; j < N; j++) {
                        if (j != i && arr[j] != arr[i] &&
                            ((1 & (bitmask >> j)) > 0) && adj[arr[i]-1][arr[j] - 1]==1) {
                            dp[i][bitmask] += dp[j][bitmask ^ (1 << i)];
                        }
                    }
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += dp[i][(1 << N) - 1];
        }
        return ans;
    }
}
