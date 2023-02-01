/* POTD: 8 Jan 2023
Title: Absolute difference divisible by K
Asked In: GoldMan Sachs
Category: Arrays Hash
level: Easy
Discription: Given an array of integers of size n and an integer k, find all the pairs in the array whose absolute difference is divisible by k
**/

class Solution {
	static long countPairs(int n, int[] arr, int k) {
		HashMap<Integer, Integer>hmap=new HashMap<>();
		long pairCount=0l;
		for(int i=0;i<n;i++){
		    if(hmap.containsKey(arr[i]%k)){
		        pairCount+=hmap.get(arr[i]%k);
		        hmap.put(arr[i]%k,hmap.get(arr[i]%k)+1);
		    }else{
		        hmap.put(arr[i]%k,1);
		    }
		}
		return pairCount;
	}
}
