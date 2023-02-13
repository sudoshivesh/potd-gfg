//User function Template for Java

class Solution{
	int minCost(int [][] colors, int N){
        //Write your code here
        for(int i=1;i<N;i++){

            colors[i][0] += Math.min(colors[i-1][1],colors[i-1][2]);

            colors[i][1] += Math.min(colors[i-1][0],colors[i-1][2]);

            colors[i][2] += Math.min(colors[i-1][0],colors[i-1][1]);

        }

        int minCost = Math.min(colors[N-1][0],Math.min(colors[N-1][1],colors[N-1][2]));

        return minCost;
    }
}
