class Solution {
  public:
    string removePair(string s) {
        // code here
        string a="";

        for(char ch:s){

            if(!a.empty()&&a[a.size()-1]==ch)

            a.pop_back();

            else a+=ch;

        }

        return a.size()==0?"-1":a;
    }
};
