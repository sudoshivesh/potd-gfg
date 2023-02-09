#User function Template for python3

class Solution():
    def countZero(self, n, k ,arr):
        #your code here
        total, visit_row, visit_col, ans = n*n, set(), set(), []
        for r,c in arr:
            visit_row.add(r)
            visit_col.add(c)
            ans.append(total - len(visit_row)*n - len(visit_col)*(n-(len(visit_row))))
        return ans
