

// User function Template for Java


/*
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
*/

class Solution {
    Node w1 = null, w2 = null;
    public Node correctBST(Node root) {
        // code here.
        inorder(root);

        // System.out.println(w1.data+" "+w2.data);

        int temp = w1.data;

        w1.data = w2.data;

        w2.data = temp;

        return root;

    }

    Node prev = null;

    public void inorder(Node root) {

        if(root == null) return;

        // last = root;

        inorder(root.left);

        if(prev!=null){

            if(prev.data > root.data){

                if(w1 == null) w1 = prev;

                 w2 = root;

            }

        }

        prev = root;

        inorder(root.right);
    }
}
