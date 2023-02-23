#User function Template for python3


'''
:param root: root of the given tree
:return: none, just connect accordingly.
{
    # Node Class:
    class Node:
        def __init__(self,val):
            self.data = val
            self.left = None
            self.right = None
            self.nextRight = None
}
'''

class Solution:
    def connect(self, root):
        # code here
        q=deque()

        q.append(root)

        while q:

            temp=None

            for i in range(len(q)):

                p=q.pop()

                p.nextRight=temp

                temp=p

                if p.right:

                    q.appendleft(p.right)

                if p.left:

                    q.appendleft(p.left)

        return root

