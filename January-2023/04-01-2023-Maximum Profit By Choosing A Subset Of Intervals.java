/* POTD : 4 Jan 2023
Name : Maximum Profit By Choosing A Subset Of Intervals
Level : Medium
Problem Statement : iven a list intervals of n intervals, the ith element [s, e, p] denotes the starting point s, ending point e, and the profit p earned by 
choosing the ith interval. Find the maximum profit one can achieve by choosing a subset of non-overlapping intervals.
Two intervals [s1, e1, p1] and [s2, e2, p2] are said to be non-overlapping if [e1 <= s2] and [s1 < s2].
**/


class Solution {
    public static int maximum_profit(int n, int[][] intervals) {
        // code here
         Arrays.sort(intervals,(a,b) -> (a[0]-b[0]));
         
        int[] dp = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            int idx = searchGreaterOrEqualTo(intervals,intervals[i][1]);
            if(idx>=dp.length) 
            {
                dp[i]=intervals[i][2];
            }
            else
            {
                dp[i] = intervals[i][2]+dp[idx];
            }
            if(i!=n-1) dp[i] = Math.max(dp[i],dp[i+1]);
        }
        return dp[0];
        
    }
    // using binary search
    public static int searchGreaterOrEqualTo(int[][] a,int val)
    {
        int lo=0,hi=a.length-1,ans=a.length;
        while(lo <= hi)
        {
            int mid = lo+(hi-lo)/2;
            if(a[mid][0] < val)
            {
                lo=mid+1;
            }
            else
            {
                hi = mid-1;
                ans = Math.min(ans,mid);
            }
        }
        return ans;
    }
}
