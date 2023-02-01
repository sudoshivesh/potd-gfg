/* POTD : 3 Jan 2023
Statement : Minimize number of Students to be removed
N Students of different heights are attending an assembly. The heights of the students are represented by an array H[]....
Link to Problem : https://practice.geeksforgeeks.org/problems/7d0fa4007b8eabadc404fcc9fa917aa52982aa96/1
Level : Medium 
Asked in: Microsoft**/

class Solution {
    public int removeStudents(int[] H, int N) {
        // code here
        return N-find(H,N);
    }
    int find(int []h,int n){
        int [] b =new int[n];
        b[0]=h[0];
        int k=1;
        for(int i=1;i<n;i++){
            if(h[i]>b[k-1]){
                b[k] = h[i];
                k++;
            }else{
                int index = binarysearch(b,0,k,h[i]);
                    b[index] = h[i];
                
            }
        }
        return k;
    }
    int binarysearch(int []b,int low,int high,int key){
        while(low<high){
            int mid = (low+high)/2;
            if(b[mid]<key){
                low =mid+1;
            }else{
                high = mid;
            }
        }
        return low;
    }
};
