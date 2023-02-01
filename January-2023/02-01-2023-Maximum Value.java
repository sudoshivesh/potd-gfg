/* POTD: 02 Jan 2023
Title: Maximum Value
Statement : Given a binary tree, find the largest value in each level.
Category :  Tree , DFS
Asked In : Amazon
Link : https://practice.geeksforgeeks.org/problems/ec277982aea7239b550b28421e00acbb1ea03d2c/1
**/

class Solution {
    ArrayList<Integer> res;
    
    ArrayList<Integer> maximumValue(Node node) {
       //code here
       res = new ArrayList<>();
       preorderTraversal(node, 0);
       return res;
    }
    
    void preorderTraversal(Node node, int depth) {
        if(node == null) return;
        if(res.size() <= depth) {
            res.add(node.data);
        } else {
            int stored = res.get(depth);
            if(node.data > stored) {
                res.remove(depth);
                res.add(depth, node.data);
            }
        }
        preorderTraversal(node.left, depth+1);
        preorderTraversal(node.right, depth+1);
    }
}
