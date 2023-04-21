//Asked in Facebook
//User function Template for C++

class Solution {
  public:
    int checkCompressed(string S, string T) {
        // code here
        int j=0;

        for(int i=0;i<T.length();i++){

            if(T[i]>='0'&&T[i]<='9'){

                int sum=int(T[i]-'0');

                while(T[i+1]>='0'&&T[i+1]<='9'&&(i+1)<S.length()){sum=sum*10+int(T[i+1]-'0');i++;}

                j+=sum;

            }else if(S[j]!=T[i]){

                return 0;

            }else{j++;}

        }

        if(j!=S.length())return 0;

        return 1;
    }
};
