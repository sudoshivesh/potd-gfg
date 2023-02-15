#User function Template for python3

class Solution:
    def goodStones(self, n, arr) -> int:
        #code here
        def good(arr,n,dp,i,ans,vis):

            if i>=n or i<0:

                return True

            if dp[i]==True:

                return True

            if dp[i]==2000:

                return False

            if i in vis:

                dp[i]=2000

                return False

            vis.add(i)

            if good(arr,n,dp,i+arr[i],ans,vis):

                ans[0]+=1

                dp[i]=True

                return True

            else:

                dp[i]=2000

                return False

 

        dp=[False for i in range(n)]

        vis=set()

        ans=[0]

        for i in range(n):

            if i in vis:

                continue

            vis.add(i)

            if good(arr,n,dp,i+arr[i],ans,vis):

                ans[0]+=1

                dp[i]=True

            else:

                dp[i]=2000

        return ans[0]
