class Solution {
    public static int findMoves(int n, int[] chairs, int[] passengers) {
        // code here
        Arrays.sort(chairs);
       Arrays.sort(passengers);
       int i=0,j=0;
       int moves=0;
       while(i<n && j<n){
               int temp=Math.abs(chairs[i]-passengers[j]);
            //   System.out.println(temp);
               i++;
               j++;
               moves+=temp;
       }
       return moves;
    }
}
        
