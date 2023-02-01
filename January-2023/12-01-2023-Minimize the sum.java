class Solution {
    long minimizeSum(int N, int arr[]) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long ans = 0;
        for(int x : arr) pq.add(x * 1l);
        while(pq.size() > 1){
            long a = pq.poll(), b = pq.poll();
            long sum = a + b;
            pq.add(sum);
            ans += sum;
        }
        return ans;
    }
}
