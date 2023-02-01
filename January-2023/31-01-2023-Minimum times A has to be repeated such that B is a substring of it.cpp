//User function Template for C++
class Solution {
  public:
    int minRepeats(string A, string B) {
        // code here
        int count=1;
        string s=A;
        unordered_map<char,int>mp1,mp2;       
        for(auto&i:s)
        {
            mp1[i]++;
        }       
        for(auto&i:B)
        {
            mp2[i]++;
        }    
        if(mp1.size()!=mp2.size())
        return -1;
        auto x=A.find(B);
        if(x!=string::npos)
        return count;
        // int j=x+A.size();
        while(s.find(B)==string::npos and s.size()<=B.size())
        {
            s+=A;
            count++;
        }
        if(s.find(B)==string::npos)
        return -1;
        return count;
    }
};
