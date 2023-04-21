//User function Template for C++

class Solution{
public:
    int prefixSuffixString(vector<string> &s1,vector<string> s2){
        // Code here
        unordered_set<string> hash;
        
        for(int i = 0; i < s1.size(); i++)
        {
            string word = s1[i];
            int n = (int)word.length();
            for(int j = 0; j < n; j++)
            {
                string pref = word.substr(0, j + 1);
                string suff = word.substr(j + 1, n - j);
                hash.insert(pref);
                hash.insert(suff);
            }
        }
        
        int ans = 0;
        for(string word: s2)
            if(hash.find(word) != hash.end())
                ans++;
    
        return ans;
    }
};
