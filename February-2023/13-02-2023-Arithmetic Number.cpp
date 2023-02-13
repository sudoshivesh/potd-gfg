// User function Template for C++

class Solution{
public:
    int inSequence(int A, int B, int C){
        // code here
        if(C==0) return A==B;
        
        long double d = double(B-A)/double(C);
        
        if(d == int(d) && d>=0) return 1;
        else return false;
    }
};
