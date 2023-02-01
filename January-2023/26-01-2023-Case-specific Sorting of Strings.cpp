//User function Template for C++

class Solution
{
    public:
    //Function to perform case-specific sorting of strings.
    string caseSort(string str, int n)
    {
        // your code here
        string sm="";
        string cap="";
        for(int i=0;i<n;i++){
            if(str[i]>='A' && str[i]<='Z'){
                cap+=str[i];
            }
            else{
                sm+=str[i];
            }
        }
        sort(sm.begin(),sm.end());
        sort(cap.begin(),cap.end());
        int i=0;
        int j=0;
        for(int k=0;k<n;k++){
            if(str[k]>='A' && str[k]<='Z'){
                str[k]=cap[j++];
            }
            else{
                str[k]=sm[i++];
            }
        }
        return str;
    }
};
