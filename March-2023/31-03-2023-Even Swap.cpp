//User function Template for C++

class Solution
{
    public:
        vector <int> lexicographicallyLargest(vector <int> &a,int n)
        {
            // Code here
            for(int i = 0; i < n; i++){
                int idx = i; vector<int> v; v.push_back(a[i]);
                while(i + 1 < n and (a[i] % 2 == a[i + 1] % 2)) v.push_back(a[i + 1]), i++;
                sort(v.begin(), v.end(), greater<>());
                for(int j = idx; j <= i; j++) a[j] = v[j - idx];
            }
            return a;
        }
};
