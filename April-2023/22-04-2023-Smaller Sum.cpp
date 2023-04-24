//User function Template for C++
class Solution{
public:
    vector<long long> smallerSum(int n,vector<int> &arr){
        // Code here
        vector<int>temp = arr;
        sort(temp.begin(),temp.end());
        stack<int>st;
        vector<long long>ans(n);
        unordered_map<int,long>mp;
        mp[temp[0]] = 0;
        long long last = temp[0];
        for(int i=1;i<n;i++){
            long long sum = 0;
            while(!st.empty() && temp[i]>st.top()){
                sum += st.top();
                st.pop();
            }
            if(mp.find(temp[i])==mp.end()) {
                last = last+sum;
                mp[temp[i]] = last;
            }
            st.push(temp[i]);
        }
      for(int i=0;i<n;i++) ans[i] = mp[arr[i]];
      
      return ans;
    }
};
