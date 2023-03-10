/*POTD: 1 Jan 2023
Title: Count even length
Level : Medium
Link : https://practice.geeksforgeeks.org/problems/count-even-length1907/1
Category : Algorithm
Statement : Given a number n, find count of all binary sequences of length 2n such that sum of first n bits is same as sum of last n bits.
The anwer can be very large. So, you have to return answer modulo 109+7.
**/


//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.compute_value(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public long power(long x, long y, long p) {
        long res = 1l;
        x = x % p;
        while (y > 0) {
            if (y % 2 == 1)
                res = (res * x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    public long modInverse(long n, long p) {
        return power(n, p - 2, p);
    }
    public int  compute_value(int n)
    {
        long ans = 1l;
        long mod = (long)(Math.pow(10, 9) + 7l);
        long compute = 1l;
        for(int i=0;i<n;i++) {
            compute = (compute%mod * (long)(n-i)%mod) % mod;
            compute = (compute%mod * modInverse(i+1, mod)%mod) % mod;
            ans = (ans%mod + (compute%mod*compute%mod)%mod) % mod;
        }
        return (int)(ans%mod);
    }
}
