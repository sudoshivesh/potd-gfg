#User function Template for python3

class Solution:
    def appleSequences(self, n, m, arr):
        # code here 
        left, ans = 0, 0
        for right in range(n):
            if arr[right] == 'O':
                m -= 1
                
            while left <= right and m < 0:
                if arr[left] == 'O':
                    m += 1
                left += 1
            ans = max(ans, right-left+1)
        return ans
