/*POTD : % Jan 2023
Title : Find the longest string
Asked in : Flipkart
Level : Medium
Statement : Given an array of strings arr[]. 
You have to find the longest string which is lexicographically smallest and also all of its prefix strings are already present in the array.
Link : https://practice.geeksforgeeks.org/problems/8d157f11af5416087251513cfc38ffc4d23be308/1
**/

//User function Template for C++

class Solution
{
public:
    string longestString(vector<string> &words)
    {
        unordered_map<string,int> m;
        sort(words.begin(),words.end());
        for(auto i:words) m[i]++;
        string ans;
        int size=INT_MIN;
        for(auto i:words){
            string temp;
            int c=0,n=i.size();
            for(int j=0;j<n;j++){
                temp+=i[j];
                if(m[temp]) c++;
            }
            if(c==n && n>size){
                size=n;
                ans=i;
            }
        }
        return ans;
    }
};
