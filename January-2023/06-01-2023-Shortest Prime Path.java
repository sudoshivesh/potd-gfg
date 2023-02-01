/* POTD: 6 Jan 2023
Title : Shortest Prime Path
Link : https://practice.geeksforgeeks.org/problems/1646a9b5169d7571cf672f2a31533af083d1f479/1
Statement : You are given two four digit prime numbers Num1 and Num2. 
Find the distance of the shortest path from Num1 to Num2 that can be attained by altering only one single digit at a time. 
Every number obtained after changing a digit should be a four digit prime number with no leading zeros.
Level : Medium
Asked in : Adobe
**/

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution
{
    int[] prime;
    Solution()
    {
        // Every index of prime stores zero or one
        // If prime[i] is zero means i is not a prime
        // If prime[i] is one means i is a prime
        prime = new int[10000];
        Arrays.fill(prime, 1);
        prime[0]=prime[1]=0;
        for(int i=2; i*i<=10000; i++){
            for(int j=2; i*j<10000; j++) {
                prime[i*j]=0;
            }
        }
        for(int i=0; i<1000; i++) {
            prime[i]=0;
            
        }
    }
    
    public int shortestPath(int Num1,int Num2){
        // Complete this function using prime array

        Queue<int[]> que = new LinkedList<>();
        int[] arr = new int[10000];
        que.add(new int[]{Num1, 0});
        arr[Num1]=1;
        
        while(!que.isEmpty()){
            int[] a = que.poll();
            if(a[0]==Num2) return a[1];
            
            for(int i=1; i<=1000; i*=10){//assume i reached 100;
                for(int j=0; j<=9; j++){//assume j reached 7
                    int k = a[0]/(i*10); //1033/(100*10) =1033/1000=>1
                    k*=(i*10);//1*(100*10)=>1000;
                    k+=(j*i);//1000+(7*100)=>1700
                    k+=a[0]%i;//1700+(1033%100)=>1733
                    if(prime[k]==1 && arr[k]==0){
                        arr[k]=1;
                        que.add(new int[]{k, a[1]+1});
                    }
                }
            }
        }
        return -1;
    }
}

//{ Driver Code Starts.
class GFG{
    public static void main(String args[]) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        Solution ob = new Solution();
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int Num1=Integer.parseInt(input_line[0]);
            int Num2=Integer.parseInt(input_line[1]);
            System.out.println(ob.shortestPath(Num1,Num2));
        }
    }
}
// } Driver Code Ends
