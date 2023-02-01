//It is a array graph problem asked in Juspay
//User function Template for C++
class Solution
{
  public:
  int maxWeightCell(int N, vector<int> Edge)
  {
      // code here
      vector<int> A(N,0);

      for(int i=0; i<N; i++){

          if(Edge[i]!=-1){

              A[Edge[i]] += i;

          }

          else 

          continue;

      }

      

      int maxe = INT_MIN;

      int ans = 0;

      for(int i=0; i<N; i++){

          if(maxe<A[i]){

              maxe = A[i];

              ans = i;

          }

      }

      return ans;
  }
};
