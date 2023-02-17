#User function Template for python3

class Solution():
    def solve(self, N, K, GeekNum):
        #your code goes here
        if N<K:

            return GeekNum[N-1]

        s=0

        arr=[]

        for i in GeekNum:

            arr.append(i)

            

        for i in range(N):

            if i<K:

                s+=arr[i]

            else:

                arr.append(s)

                s=s*2-(arr[i-K])

        # print(arr)    

        return arr[-1]
