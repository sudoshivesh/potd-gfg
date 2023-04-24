

class Solution {
    public static int minimumNumber(int n, int[] arr) {
        // code here
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i]%arr[i-1];
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]==0)
               continue;
            else{
                ans = Math.min(arr[i],ans);
            }
        }
        return ans;
    }
}
        
