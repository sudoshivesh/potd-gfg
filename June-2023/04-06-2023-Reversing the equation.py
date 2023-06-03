#User function Template for python3

class Solution:
    def reverseEqn(self, s):
        # code here
        acc = ""
        stack = []
        for e in s:
            if e in "+-*/":
                stack.extend([acc, e])
                acc = ""
            else:
                acc += e
        else:
            stack.append(acc)
        return "".join(stack[::-1])
