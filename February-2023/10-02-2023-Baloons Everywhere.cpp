//User function Template for C++

class Solution{
public:
    int maxInstance(string s){
        map<char,int>mp;

        int cnt_a=0,cnt_b=0,cnt_l=0,cnt_o=0,cnt_n=0;

        vector<int>v;

         for(int i=0;i<s.length();i++)

        {

            if(s[i]=='b' || s[i]=='a' || s[i]=='l' || s[i]=='o' || s[i]=='n')

                  mp[s[i]]++;

        }

        for(auto num:mp)

        {

            if(num.second==0)

              return 0;

            if(num.first=='o' || num.first=='l')

               v.push_back(num.second/2);

            else

              v.push_back(num.second);

        }

         int mini=INT_MAX;

            for(int i=0;i<v.size();i++)

                  mini=min(mini,v[i]);

          return mini;
    }
};
