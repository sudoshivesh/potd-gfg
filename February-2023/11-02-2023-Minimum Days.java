

class Solution {
    public static int getMinimumDays(int N, String S, int[] P) {
        // code here
        int total_dep = 0;
        
        for(int i=0; i<N; i++)
        {
            if(i-1>=0)
            {
                if(S.charAt(i)==S.charAt(i-1)){
                    total_dep++;
                }
            }
            if(i+1<N)
            {
                if(S.charAt(i)==S.charAt(i+1)){
                    total_dep++;
                }
            }
        }
        
        if(total_dep==0) return 0;
        
        char arr[] = S.toCharArray();
        
        for(int day=0; day<N; day++)
        {
            int i = P[day];
            
            if(i-1>=0 && arr[i]==arr[i-1])
            {
                total_dep-=2;
            }
            
            if(i+1<N && arr[i]==arr[i+1])
            {
                total_dep-=2;
            }
            
            arr[i] = '?';
            
            if(total_dep==0) return day+1;
            
        }
        
        return N;
    }
}
        
