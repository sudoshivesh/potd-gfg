//User function Template for Java
class Solution
{   Node dfs(Node root, int target) {
    if(root == null)
        return null;      
    if(root.data == target)
        return root;    
    if(root.data > target)
        return dfs(root.left, target);      
    return dfs(root.right, target);
}
int vertical(Node root, int hd) {
    if(root == null)
        return 0;        
    if(hd == 0)
        return root.data + vertical(root.left, hd - 1) + vertical(root.right, hd + 1);  
    return vertical(root.left, hd - 1) + vertical(root.right, hd + 1);
}
    long verticallyDownBST(Node root,int target)
    {
       Node node = dfs(root, target);
    if(node == null)
        return -1;       
    return vertical(node, 0) - node.data; 
    }
}
