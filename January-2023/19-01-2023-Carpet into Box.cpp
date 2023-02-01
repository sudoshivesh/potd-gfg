//User function Template for C++
//It is a mathematical algorithm problem asked in Nutanix
class Solution{
    public:
    int carpetBox(int A, int B, int C, int D){
        int x = A;
        int y = B;
        int movesA = 0;
        while(x > C || y > D){
            if(x > C){
                movesA++;
                x /= 2;
            }
            if(y > D){
                movesA++;
                y /= 2;
            }
        }
        int movesB = 0;
        x = A;
        y = B;
        while(x > D || y > C){
            if(x > D){
                movesB++;
                x /= 2;
            }
            if(y > C){
                movesB++;
                y /= 2;
            }
        }
        return min(movesA, movesB);
    }
};
